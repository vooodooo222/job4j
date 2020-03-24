package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Хранилище для заявок
 * Умеет: добавлять, заменять, искать по имени, читать все сохраненные данные
 */
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     * @return Новую заявку.
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Получение списка всех заявок
     * @return Список всех заявок.
     */
    public Item[] findAll() {
        int size = 0;
        Item[] itemsWithoutNull = new Item[position];
        for (int index = 0; index < position; index++) {
            Item item = this.items[index];
            if (item != null) {
                itemsWithoutNull[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }

    /**
     * Получение списка по имени
     * @param key - имя-ключ
     * @return Списка всех заявок соответствующих имени
     */
    public Item[] findByName(String key) {
        int size = 0;
        Item[] itemsWithKey = new Item[position];
        for (int index = 0; index < position; index++) {
            Item item = this.items[index];
            if (item.getName().equals(key)) {
                itemsWithKey[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(itemsWithKey, size);
    }

    /**
     * Получение заявки по id
     * @param id - id элемента в списке заявок
     * @return Возвращает найденный Item по id. Если Item не найден - возвращает null.
     */
    public Item findById(String id) {
        Item item = null;
        for (int index = 0; index < position; index++) {
            if (this.items[index].getId().equals(id)) {
                item = this.items[index];
                break;
            }
        }
        return item;
    }
}
