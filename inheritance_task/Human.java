package ru.kpfu.itis.entities;

import java.util.Date;

public class Human {
    protected String name;
    protected boolean gender;
    protected Date birthDate;

    public Human(String name, boolean gender, Date birthDate) {
        if(name.length() >= 2) {
            this.name = name;
        }
        this.gender = gender;
        this.birthDate = birthDate;
    }
}
