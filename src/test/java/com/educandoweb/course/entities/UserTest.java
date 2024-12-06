package com.educandoweb.course.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserTest {
    User user1;

    @BeforeEach
    void setUp() {
        user1 = new User(2L, "Paulo", "123891", "2834823", "aaa");
    }

    @Test
    void getId() {
        assertEquals("Paulo", user1.getName());
        assertEquals("Sla", user1.getName());
    }
}