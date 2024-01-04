package com.example.LibraryAPI.model;

import lombok.Data;

import java.util.Date;

@Data
public class Person {

    private String name;
    private Adress adress;
    private Date birthday;
}
