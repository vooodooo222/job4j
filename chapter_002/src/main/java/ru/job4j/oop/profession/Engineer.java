package ru.job4j.oop.profession;

public class Engineer extends Profession {
    /**
     * Текущее общее количество проектов
     */
    private int projectsCount;

    /**
     * Список текущих проектов
     * //todo: создать отдельный класс списка проектов со всеми их данными: заказчики, требования, задачи/подзадачи, текущие задачи/подзадачи и т.д.
     */
    private String[] projectsList;

    /**
     * Просмотр текущих проектов
     * @return Возвращает данные по текущим проектам
     */
    public String[] getProjectsList() {
        return this.projectsList;
    }

    /**
     * Просмотр одного из текущих проектов
     * @return Возвращает данные по выбранному проекту
     */
    public String getFromProjectList(String project) {
        return new String();
    }

    /**
     * Добавить проект в список текущих проектов
     */
    public void setToProjectList(String project) {
    }

    /**
     * Удалить проект из списка текущих проектов
     */
    public void deleteFromProjectList(String project) {
    }

    /**
     * Получить текущее общее количество проектов
     * @return Возвращает текущее общее количество проектов
     */
    public int getProjectsCount() {
        return this.projectsCount;
    }
}
