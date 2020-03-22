package ru.job4j.oop.profession;

public class Profession {
    private String name;

    private String surname;

    private String birthday;

    private String education;

    private String workingHours;

    private String[] contactsData;

    private String workClothes;

    private String workingTools;

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

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String[] getContactsData() {
        return contactsData;
    }

    public void setContactsData(String[] contactsData) {
        this.contactsData = contactsData;
    }

    public String getWorkClothes() {
        return workClothes;
    }

    public void setWorkClothes(String workClothes) {
        this.workClothes = workClothes;
    }

    public String getWorkingTools() {
        return workingTools;
    }

    public void setWorkingTools(String workingTools) {
        this.workingTools = workingTools;
    }
}
