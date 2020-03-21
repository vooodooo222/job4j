package ru.job4j.oop.profession;

public class Patient {

    private String fullName;

    /**
     * Согласие пациента с диагнозом (и лечением)
     * @param diagnose - диагноз пациента
     * @return
     */
    public boolean agrees(Diagnose diagnose) {
        return true;
    }

    public boolean payTherapy(Doctor doctor) {
        return true;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
