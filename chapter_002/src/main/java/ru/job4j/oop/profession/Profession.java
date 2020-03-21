package ru.job4j.oop.profession;

public class Profession {
    private final int higherCategory = 0;

    private final int firstCategory = 1;

    private final int secondCategory = 2;

    private final int thirdCategory = 3;

    private final int withoutCategory = 4;

    private String name;

    private String surname;

    private String education;

    private String birthday;

    private String qualification;

    private int qualificationCategory;

    public Profession() {
        this.qualificationCategory = withoutCategory;
    }

    public Profession(String name, String surname, String education, String birthday, 
                      String qualification, int qualificationCategory) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.qualification = qualification;
        this.qualificationCategory = qualificationCategory;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getQualification() {
        return qualification;
    }

    public int getQualificationCategory() {
        return qualificationCategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setQualificationCategory(int qualificationCategory) {
        this.qualificationCategory = qualificationCategory;
    }
}
