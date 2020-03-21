package ru.job4j.oop.profession;

public class Dentist extends Doctor {

    /**
     * Имеющиеся степени стоматолога (регалии)
     */
    private String[] dentistDegrees;

    /**
     * Диагноз текущего пациента на приеме
     */
    private DentistDiagnose diagnoseCurrentPatient;

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

    /**
     * Услуга - Лечение
     * @param patient - пациент
     * @return Возвращает true в случае успешного выполнения услуги, иначе false
     */
    @Override
    public boolean heal(Patient patient) {
        for (int service:this.getDiagnoseCurrentPatient().getServices()) {
            switch (service) {
                case DentistServices.TOOTH_CLEANING:
                    this.toothCleaning(patient);
                    break;
                case DentistServices.INSTALLING_ONE_SEAL:
                    this.installingOneSeal(patient);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + service);
            }
        }
        return true;
    }

    /**
     * Услуга - Осмотр
     * @param patient - пациент
     * @return Возвращает диагноз пациента
     */
    @Override
    public Diagnose examination(Patient patient) {
        Diagnose diagnose = new Diagnose();
        diagnose.setFullNamePatient(patient.getFullName());
        // ввод пользователем количества требуемых услуг (для выделения памяти diagnose.services)
        // ожидание ввода пользователем номера услуги согласно списку услуг DentistServices
        return diagnose;
    }

    /**
     * Получает имеющиеся степени стоматолога (регалии)
     * @return Возвращает имеющиеся степени стоматолога (регалии)
     */
    public String[] getDentistDegrees() {
        return dentistDegrees;
    }

    /**
     * Устанавливает имеющиеся степени стоматолога (регалии)
     * @param dentistDegrees - имеющиеся степени стоматолога (регалии)
     */
    public void setDentistDegrees(String[] dentistDegrees) {
        this.dentistDegrees = dentistDegrees;
    }

    /**
     * Получает диагноз текущего пациента на приеме
     * @return Возвращает диагноз текущего пациента на приеме
     */
    public Diagnose getDiagnoseCurrentPatient() {
        return diagnoseCurrentPatient;
    }

    /**
     * Устанавливает диагноз текущего пациента на приеме
     * @param diagnoseCurrentPatient - диагноз текущего пациента на приеме
     */
    public void setDiagnoseCurrentPatient(Diagnose diagnoseCurrentPatient) {
        this.diagnoseCurrentPatient = diagnoseCurrentPatient;
    }
}
