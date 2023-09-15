package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User roman = new User("Roman", "Belnitskiy");
        System.out.println(new Gson().toJson(roman));
    }
}