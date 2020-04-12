package ru.stqa.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
//        String[] langs = {"Java", "Python", "C#", "C++"};

        List<String> languages = Arrays.asList("Java", "C#", "Python");


        for (String l : languages) {
            System.out.println("I want to study " + l);
        }



    }
}
