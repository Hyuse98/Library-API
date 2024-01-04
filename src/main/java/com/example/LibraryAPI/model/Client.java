package com.example.LibraryAPI.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Client extends Person{


    Adress adress;
}
