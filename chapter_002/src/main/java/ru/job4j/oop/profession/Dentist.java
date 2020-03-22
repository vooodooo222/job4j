package ru.job4j.oop.profession;

public class Dentist extends Doctor {
    /**
     * Чистка зубов
     * @param patient - пациент
     * @return Возвращает true в случае успешного выполнения услуги, иначе false
     */
    public boolean toothCleaning(Patient patient) {
        return true;
    }

    /**
     * Установка одной пломбы
     * @param patient - пациент
     * @return Возвращает true в случае успешного выполнения услуги, иначе false
     */
    public boolean installingOneSeal(Patient patient) {
        return true;
    }
}
