package com.example.pmo1_exercise12;

import android.widget.EditText;

public class Information {
    private String name;
    private String last_name;
    private Integer age;
    private String email;

    public Information(String name, String last_name, Integer age, String email){
        this.name=name;
        this.last_name=last_name;
        this.age=age;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
