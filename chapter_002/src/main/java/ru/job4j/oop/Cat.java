package ru.job4j.oop;

public class Cat {

    private String name;
    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name + " eaten " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        String nickName = "gav";
        System.out.println("There are " + nickName + "'s food.");
        Cat gav = new Cat();
        gav.giveNick(nickName);
        gav.eat("kotleta");
        gav.show();
        nickName = "black";
        System.out.println("There are " + nickName + "'s food.");
        Cat black = new Cat();
        black.giveNick(nickName);
        black.eat("fish");
        black.show();
    }
}
