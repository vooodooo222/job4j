package ru.job4j.oop.profession;

public class Surgeon extends Doctor {
    /**
     * Наложить шов
     * @param patient - пациент
     * @return Возвращает true в случае успешного выполнения услуги, иначе false
     */
    public boolean imposeSeam(Patient patient) {
        return true;
    }
}
