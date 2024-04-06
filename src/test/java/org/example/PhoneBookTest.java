package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    void add() {
        phoneBook.add("Oleg", "79105304792");
        phoneBook.add("Elena", "79178308923");
        int actual = phoneBook.add("Yura", "79564372901");
        Assertions.assertEquals(3,actual);
    }

    @Test
    void addPassed() {
        phoneBook.add("Oleg", "79105304792");
        phoneBook.add("Elena", "79178308923");
        phoneBook.add("Yura", "79489573202");
        int actual = phoneBook.add("Yura", "79564372901");
        Assertions.assertEquals(1,actual);
    }

    @Test
    void findByNumber() {
        phoneBook.add("Oleg", "79105304792");
        phoneBook.add("Elena", "79178308923");
        phoneBook.add("Yura", "79489573202");
        String actual = phoneBook.findByNumber("79105304792");
        Assertions.assertEquals("Oleg",actual);
    }
}