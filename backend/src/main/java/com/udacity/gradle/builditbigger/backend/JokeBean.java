package com.udacity.gradle.builditbigger.backend;

import com.example.joketeller.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    private String joke;

    public JokeBean(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }
}