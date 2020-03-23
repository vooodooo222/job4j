package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Aleksandrov Vladimir");
        student.setGroup("#241286");
        student.setDateOfReceipt(new Date());
        System.out.println(student.getFullName() + " entered the group " + student.getGroup() + " on the " + student.getDateOfReceipt());
    }
}
