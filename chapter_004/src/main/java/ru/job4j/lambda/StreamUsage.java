package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")  // лямбда -выражение "Predicate"
        ).collect(Collectors.toList()); // полученные результат сохранить в коллекции типа List.
        bugs.forEach(System.out::println);
        // аналогия с for-each
        List<Task> container = new ArrayList<>();
        for (Task task : tasks) {
            if ("BUG".equals(task.name)) {
                container.add(task);
            }
        }
        // Если провести аналогию, то
        //   for это stream()
        //   if  это Predicate
        container.forEach(System.out::println);
        // если нам нужно получить только имена задач
        List<String> names = tasks.stream().map(
                task -> task.name                   // лямбда -выражение "Function"
        ).collect(Collectors.toList());
        names.forEach(System.out::println);
        // аналогия с for-each
        List<String> taskNames = new ArrayList<>();
        for (Task task : tasks) {
            taskNames.add(task.name);
        }
        names.forEach(System.out::println);
    }

    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{"
                    + "name='" + name + '\''
                    + ", spent=" + spent
                    + '}';
        }
    }
}
