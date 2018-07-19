package com.udacity.gradle.builditbigger.backend;

import com.example.joketeller.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    private JokeTeller jokeTeller;

    public JokeBean() {
        jokeTeller = new JokeTeller();
    }

    public String getJoke() {
        return jokeTeller.tellJoke();
    }
}