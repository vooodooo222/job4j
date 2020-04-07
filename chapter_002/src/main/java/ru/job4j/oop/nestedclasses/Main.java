package ru.job4j.oop.nestedclasses;

public class Main {

    public interface Mouth {
    }

    public Mouth getSayYes() {
        class MouthSayYes implements Mouth {
            String sayYes = "No";  // почему без final работает?
            @Override
            public String toString() {
                sayYes = "Yes";  // даже если мы изменям значение!
                return sayYes;
            }
        }
        return new MouthSayYes();
    }

    public static void main(String[] args) {
        // пример работы вложенных нестатических (Inner) классов:
        Bicycle peugeot = new Bicycle("Peugeot", 120, 10);
        Bicycle.SteeringWheel wheel = peugeot.new SteeringWheel();
        Bicycle.Seat seat = peugeot.new Seat(20);
        // без объекта внешнего класса нельзя создать объект внутреннего класса
        //Bicycle.SteeringWheel wheel2 = new Bicycle.SteeringWheel(); // error!
        seat.getSeatParam();
        seat.up();
        seat.getSeatParam();
        peugeot.getSeatParam();
        peugeot.up();
        peugeot.getSeatParam();
        peugeot.start();
        wheel.left();
        wheel.right();

        // пример работы вложенных статических классов:
        Building buildingPlatform1 = new Building.Platform("1", "1");
        System.out.println(buildingPlatform1);
        Building buildingPlatform2 = new Building.Platform("2", "2");
        System.out.println(buildingPlatform2);
        System.out.println(buildingPlatform1);
        // результат:
        // Building{name='1', address='1', type='Platform'}
        // Building{name='2', address='2', type='Platform'}
        // Building{name='1', address='1', type='Platform'}

        // ЛОКАЛЬНЫЕ классы - создаются внутри методов:
        System.out.println(new Main().getSayYes());
        // результат:
        // Yes

        // АНОНИМНЫЕ классы:
        Anon anonInner = new Anon() {
            int a = 0;

            // инициализатор
            {
                a = 2;
            }

            @Override
            public String toString() {
                return "Override " + a;
            }

            public void doSomething() {
                System.out.println("Blah");
            }
        };
        System.out.println(anonInner.toString());
        // результат:
        // Override 2

        //anonInner.doSomething(); // Не скомпилируется, если не "var anonInner = new Anon() { " - добавлено в Java 10
        // т.к. объект подкласса с ссылкой на тип базового класса не имеет
        // доступа к членам подкласса через эту ссылку на базовый класс.

        // но...
        new Anon() {
            public void foo() {
                System.out.println("Woah");
            }
        }.foo();
        // результат:
        // Woah

        // до Java 10 можно делать так:
        Anon anonInner2 = new Anon() {
            public void hello() {
                System.out.println("Woah2! ");
            }
        };
        try {
            anonInner2.getClass().getMethod("hello").invoke(anonInner2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // результат:
        // Woah2!
    }
}
