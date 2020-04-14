package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Хранилище для заявок
 * Умеет: добавлять, заменять, искать по имени, читать все сохраненные данные
 */
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Возвращает количество заявок в трекере
     * @return Количество заявок
     */
    public int getItemsCount() {
        return this.items.size();
    }

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     * @return Новую заявку.
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
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
    public List<Item> findAll() {
        return this.items;
    }

    /**
     * Получение списка по имени
     * @param key - имя-ключ
     * @return Списка всех заявок соответствующих имени
     */
    public List<Item> findByName(String key) {
        List<Item> itemsWithKey = new ArrayList<>();
        for (int index = 0; index < this.items.size(); index++) {
            Item item = this.items.get(index);
            if (item.getName().equals(key)) {
                itemsWithKey.add(item);
            }
        }
        return itemsWithKey;
    }

    /**
     * Получение заявки по id
     * @param id - id элемента в списке заявок
     * @return Возвращает найденный Item по id. Если Item не найден - возвращает null.
     */
    public Item findById(String id) {
        int index = this.indexOf(id);
        return index != -1 ? this.items.get(index) : null;
    }

    /**
     * Получение индекса заявки по id
     * @param id - id элемента в списке заявок
     * @return Возвращает индекс найденного Item по id. Если Item не найден - возвращает -1.
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Замена заявки по id (id остается старой)
     * @param id - id старой заявки, которую хотим заменить
     * @param item - новая заявка, которую хотим вставить вместо старой
     * @return Возвращает true в случае успеха, иначе false.
     */
    public boolean replace(String id, Item item) {
        int index = this.indexOf(id);
        boolean result = false;
        if (index != -1) {
            item.setId(id);
            this.items.set(index, item);
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
            this.items.remove(index);
            result = true;
        }
        return result;
    }
}
