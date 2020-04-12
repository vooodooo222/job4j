package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод вставляет в нужную позицию элемент.
     * Чем больше число приоритета, тем приоритет ниже.
     * Если приоритет задачи из списка больше (ниже), то он сдвигается по списку выше.
     * @param task добавляемая задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() >= task.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }

    @Override
    public String toString() {
        return "PriorityQueue{"
                + "tasks=" + tasks
                + '}';
    }
}