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
        return Arrays.copyOf(this.items, position);
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
        int index = this.indexOf(id);
        return index != -1 ? this.items[index] : null;
    }

    /**
     * Получение индекса заявки по id
     * @param id - id элемента в списке заявок
     * @return Возвращает индекс найденного Item по id. Если Item не найден - возвращает -1.
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Замена заявки по id
     * @param id - id заявки, которую хотим заменить
     * @param item - новая заявка, которую хотим вставить вместо старой
     * @return Возвращает true в случае успеха, иначе false.
     */
    public boolean replace(String id, Item item) {
        int index = this.indexOf(id);
        boolean result = false;
        if (index != -1) {
            this.items[index].setName(item.getName());
            result = true;
        }
        return result;
    }

    /**
     * Удаление заявки по id
     * @param id - id заявки, которую хотим заменить
     * @return Возвращает true в случае успеха, иначе false.
     */
    public boolean delete(String id) {
        int index = this.indexOf(id);
        boolean result = false;
        if (index != -1) {
            System.arraycopy(this.items, index + 1, this.items, index, this.position - index + 1);
            this.items[this.position - 1] = null;
            this.position--;
            result = true;
        }
        return result;
    }
}
