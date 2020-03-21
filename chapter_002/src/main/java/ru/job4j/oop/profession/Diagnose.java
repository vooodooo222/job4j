package ru.job4j.oop.profession;

/**
 * Диагоноз пациента.
 */
public class Diagnose {
    /**
     * ФИО пациента
     */
    private String fullNamePatient;

    /**
     * Описание болезни
     */
    private String descriptionOfDisease;

    /**
     * Описание лечения
     */
    private String descriptionOfTherapy;

    /**
     * Отправка на печать
     */
    public void sendingForPrinting() {
    }

    public void setFullNamePatient(String fullNamePatient) {
        this.fullNamePatient = fullNamePatient;
    }

    public String getFullNamePatient() {
        return fullNamePatient;
    }
}
