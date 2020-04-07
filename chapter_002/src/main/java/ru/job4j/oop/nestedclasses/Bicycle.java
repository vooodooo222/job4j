package ru.job4j.oop.nestedclasses;

public class Bicycle {

    private Seat seat;
    private String model;
    private int weight;

    public void up() {
        this.seat.seatPostDiameter++;
        System.out.println("сиденье поднято выше!");
    }

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seat = new Seat(seatPostDiameter);
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public void getSeatParam() {
        System.out.println("Параметр сиденья: диаметр подседельного штыря = " + this.seat.seatPostDiameter);
    }

    public class SteeringWheel {

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {
            System.out.println("Руль влево!");
        }
    }

    public class Seat {

        //inner class cannot have static declarations
        //private static int seatPostDiameter;  // compilation error!

        private int seatPostDiameter;

        public Seat(int seatPostDiameter) {
            this.seatPostDiameter = seatPostDiameter;
        }

        public void getSeatParam() {
            System.out.println("Параметр сиденья: диаметр подседельного штыря = " + this.seatPostDiameter);
        }

        public void up() {
            seatPostDiameter++;
            System.out.println("сиденье поднято выше!");
        }

        public void down() {
            System.out.println("сиденье опущено ниже!");
        }
    }
}
