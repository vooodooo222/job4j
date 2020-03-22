package ru.job4j.oop.profession;

public class Patient {

    private String name;

    private String surname;

    private String birthday;

    private String[] contactsData;

    private String[] paymentHistory;

    /**
     * Оплата посещения доктора
     * @param doctor - врач, производивший осмотр
     * @return Возвращает true в случае успешной оплаты, иначе false
     */
    public boolean payExamination(Doctor doctor) {
        return true;
    }

    /**
     * Оплата лечения согласно диагнозу
     * @param diagnose - диагноз пациента
     * @return Возвращает true в случае успешной оплаты, иначе false
     */
    public boolean payTherapy(Diagnose diagnose) {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String[] getContactsData() {
        return contactsData;
    }

    public String[] getPaymentHistory() {
        return paymentHistory;
    }
}
