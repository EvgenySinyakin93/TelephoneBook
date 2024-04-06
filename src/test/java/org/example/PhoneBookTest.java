package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    void findByNumberNull() {
        phoneBook.add("Oleg", "79105304792");
        phoneBook.add("Elena", "79178308923");
        phoneBook.add("Yura", "79489573202");
        String actual = phoneBook.findByNumber("76584032802");
        Assertions.assertEquals(null,actual);
    }

    @Test
    void findByName() {
        phoneBook.add("Oleg", "79105304792");
        phoneBook.add("Elena", "79178308923");
        phoneBook.add("Yura", "79489573202");
        String actual = phoneBook.findByName("Yura");
        Assertions.assertEquals("79489573202",actual);
    }

    @Test
    void findByNameNull() {
        phoneBook.add("Oleg", "79105304792");
        phoneBook.add("Elena", "79178308923");
        phoneBook.add("Yura", "79489573202");
        String actual = phoneBook.findByName("Evgeny");
        Assertions.assertEquals(null,actual);
    }

    @Test
    void printAllNames() {
        List<String> expected = new ArrayList<>(Arrays.asList("Elena","Oleg", "Yura"));
        phoneBook.add("Oleg", "79105304792");
        phoneBook.add("Elena", "79178308923");
        phoneBook.add("Yura", "79489573202");
        List <String> actual = phoneBook.printAllNames();
        Assertions.assertEquals(expected,actual);
    }
}