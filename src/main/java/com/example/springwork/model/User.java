package com.example.springwork.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String name;
    private int age;
}
