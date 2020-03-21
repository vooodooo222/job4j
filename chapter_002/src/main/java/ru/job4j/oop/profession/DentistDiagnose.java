package ru.job4j.oop.profession;

/**
 * Диагноз дантиста
 */
public class DentistDiagnose extends Diagnose {
    /**
     * Требуемые услуги для лечения пациента
     */
    private DentistServices dentistServices;

    public DentistServices getDentistServices() {
        return this.dentistServices;
    }
}
