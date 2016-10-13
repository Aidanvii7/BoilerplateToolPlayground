package com.crazybanana.lombokplayground.model;

import lombok.Builder;
import lombok.Value;

@Value
public class Person {
    int id, age;
    String name, address;

    @Builder
    public Person(int id, int age) {
        this.id = id;
        this.age = age;
    }
}
