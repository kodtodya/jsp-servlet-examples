package com.kodtodya.practice.web.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int id;
}
