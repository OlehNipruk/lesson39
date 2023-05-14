package com.ua.robot.lesson39.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private int age;
}
