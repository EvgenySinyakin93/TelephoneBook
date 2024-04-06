package org.example;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    public static int add(String name, String phone) {
        Map<String, String> phoneBook = new TreeMap<>();

        if(!phoneBook.containsKey(name) && !phoneBook.containsValue(phone)){
            phoneBook.putIfAbsent(name, phone);
        }
        return phoneBook.size();
    }
}
