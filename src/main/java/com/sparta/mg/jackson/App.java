package com.sparta.mg.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            ArrayList<Boolean> flags = new ArrayList<>(Arrays.asList(true, false, false, true));
            Spartan manish = new Spartan("Manish", "Java", flags);
            String output = mapper.writeValueAsString(manish);
            System.out.println(output);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
