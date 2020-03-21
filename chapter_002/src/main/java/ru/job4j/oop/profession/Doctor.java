package ru.job4j.oop.profession;

public class Doctor extends Profession {
    /**
     * Имеющиеся докторские степени (регалии)
     */
    public String[] doctorsDegrees;

    /**
     * Список пациентов (todo: отдельный класс PatientList)
     * Индекс - ID, Строка - ФИО
     */
    private String[] patientList;

    /**
     * Идентификатор текущего пациента
     * Индекс patientList
     */
    private int patientId;

    /**
     * Рейтинг доктора по 5-ти бальной шкале среди пациентов
     */
    private int rating;

    /**
     * Общее количество принятых пациентов (уникальных) за все время работы для подсчета рейтинга доктора
     */
    private int acceptedUniquePatientCount;

    public Doctor() {
        super();
        this.rating = 0;
        this.acceptedUniquePatientCount = 0;
    }

    /**
     * Запись на прием к доктору
     * Ведет подсчет количества пациентов по уникальному ID каждого пациента в случае успеха записи на прием
     * @param patient - пациент
     * @return Возвращает true в случае успеной записи на прием, иначе false
     */
    public boolean makeAnAppointment(Patient patient) {
        return true;
    }

    /**
     * Проверка возможен ли прием пациента
     * @param patient - пациент
     * @return Возвращает true в случае успешной проверки приема пациента (правильные данные пациента, текущее время и т.д.), иначе false
     */
    public boolean checkingAnAppointment(Patient patient) {
        return true;
    }

    /**
     * Услуга - Осмотр
     * @param patient - пациент
     * @return Возвращает диагноз пациента
     */
    public Diagnose examination(Patient patient) {
        return new Diagnose();
    }

    /**
     * Услуга - Лечение
     * @param patient - пациент
     * @return Возвращает true в случае успешного выполнения услуги, иначе false
     */
    public boolean heal(Patient patient) {
        return true;
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

    /**
     * Статиситка - Получает общее количество принятых пациентов (уникальных) за все время работы для подсчета рейтинга доктора
     * @return Возвращает общее количество принятых пациентов (уникальных) за все время работы для подсчета рейтинга доктора
     */
    public int getAcceptedUniquePatientCount() {
        return this.acceptedUniquePatientCount;
    }
}
