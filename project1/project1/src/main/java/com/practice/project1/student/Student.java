package com.practice.project1.student;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {

    private Long id;
    private String name;
    private String email;
    private String dob;
    private int age;
}
