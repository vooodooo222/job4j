package ru.job4j.oop.profession;

public class Doctor extends Profession {

    /**
     * Текущее общее количество пациентов
     */
    private int patientsCount;

    /**
     * Список пациентов
     * //todo: создать отдельный класс списка пациентов со всеми их данными: об их диагнозах, датах приема и т.д.
     */
    private String[] patientList;

    /**
     * Идентификатор текущего пациента на приеме
     */
    private int patientId;

    /**
     * Рейтинг доктора по 5-ти бальной шкале среди пациентов
     */
    private int rating;

    /**
     * Проверка возможен ли прием пациента
     * @param patient - пациент
     * @return Возвращает true в случае успешной проверки приема пациента (правильные данные пациента, текущее время и т.д.), иначе false
     */
    public boolean checkingAnAppointment(Patient patient) {
        return true;
    }

    /**
     * Оформление пациента
     * @param patient - пациент
     * @return Возвращает true в случае успешной регистрации, иначе false
     */
    public boolean registrationOfPatient(Patient patient) {
        return true;
    }

    /**
     * Осмотр пациента
     * @param patient - пациент
     * @return Возвращает диагноз пациента
     */
    public Diagnose examination(Patient patient) {
        return new Diagnose();
    }

    /**
     * Сохраняет в базу данных диагноз для текущего пациента
     * @param diagnose - диагноз пациента
     * @param patient - пациент
     * @return Возвращает true в случае успешной
     */
    public boolean saveDiagnoseToDataBase(Diagnose diagnose, Patient patient) {
        return true;
    }

    /**
     * Получает диагноз из базы данных для текущего пациента
     * @param diagnose - диагноз пациента
     * @param patient - пациент
     * @return Возвращает диагноз пациента
     */
    public Diagnose getDiagnoseFromDataBase(Diagnose diagnose, Patient patient) {
        return new Diagnose();
    }

    /**
     * Статиситка - Получает рейтинг дантиста по 5-ти бальной шкале
     * @return Возвращает рейтинг дантиста по 5-ти бальной шкале
     */
    public int getRating() {
        return rating;
    }

    /**
     * Статиситка - Установка среднего рейтинга дантиста по 5-ти бальной шкале среди уникальных пациентов
     * @param rating - Рейтинг дантиста по 5-ти бальной шкале
     */
    public void setRating(int rating) {
    }

    public int getPatientsCount() {
        return patientsCount;
    }

    public String[] getPatientList() {
        return patientList;
    }

    public int getPatientId() {
        return patientId;
    }
}
