package ru.job4j.oop.profession;

public class Surgeon extends Doctor {

    /**
     * Имеющиеся степени хирурга (регалии)
     */
    private String[] surgeonDegrees;

    /**
     * Диагноз текущего пациента
     */
    private Diagnose diagnoseCurrentPatient;

    /**
     * Услуга - Чистка зубов
     * @param patient - пациент
     * @return Возвращает true в случае успешного выполнения услуги, иначе false
     */
    public boolean toothCleaning(Patient patient) {
        return true;
    }

    /**
     * Услуга - Установка одной пломбы
     * @param patient - пациент
     * @return Возвращает true в случае успешного выполнения услуги, иначе false
     */
    public boolean installingOneSeal(Patient patient) {
        return true;
    }

}
