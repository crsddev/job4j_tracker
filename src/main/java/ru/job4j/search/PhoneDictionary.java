package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getPhone().equals(key)
                    || persons.get(i).getSurname().equals(key)
                    || persons.get(i).getName().equals(key)
                    || persons.get(i).getAddress().equals(key)) {
                result.add(persons.get(i));
            }
        }
        return result;
    }
}