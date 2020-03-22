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
     * Описание жалоб пациента
     */
    private String complaints;

    /**
     * Описание общего состояния пациента
     */
    private String condition;

    /**
     * Описание текущих болезней пациента
     */
    private String diseases;

    /**
     * Описание лечения (режим приема лекарств)
     */
    private String therapy;

    /**
     * Направление на диагностику
     */
    private String referralForDiagnosis;

    /**
     * Результаты диагностики
     */
    private String diagnosticResults;

    /**
     * Направление на сдачу анализов
     */
    private String referralForTesting;

    /**
     * Результаты анализов
     */
    private String testingResults;

    /**
     * Дата выдачи диагноза
     */
    private String dataTime;

    /**
     * Отправка на печать
     */
    public void sendingForPrinting() {
    }

    public String getFullNamePatient() {
        return fullNamePatient;
    }

    public String getComplaints() {
        return complaints;
    }

    public String getCondition() {
        return condition;
    }

    public String getDiseases() {
        return diseases;
    }

    public String getTherapy() {
        return therapy;
    }

    public String getReferralForDiagnosis() {
        return referralForDiagnosis;
    }

    public String getDiagnosticResults() {
        return diagnosticResults;
    }

    public String getReferralForTesting() {
        return referralForTesting;
    }

    public String getTestingResults() {
        return testingResults;
    }

    public String getDataTime() {
        return dataTime;
    }
}
