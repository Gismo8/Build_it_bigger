package com.example.joketeller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeTeller {

    List<Joke> jokeList = new ArrayList();

    public JokeTeller() {
        fillJokeList();
    }

    public String tellJoke() {
        Joke joke = jokeList.get(new Random().nextInt(jokeList.size()));
        return joke.getJoke();
    }

    void fillJokeList() {
        jokeList.add(new Joke("An Android app walks into a bar. Bartender asks, \"Can I get you a drink?\" The app looks disappointed and says, \"That wasn't my intent.\""));
        jokeList.add(new Joke("A Gingerbread phone walks into a bar and starts screaming obscenities. An irate patron, having had enough of Gingerbread's nonsense, throws a direct punch... but somehow misses. Gingerbread erupts with laugher and says, \"Lololol! You have no idea where my touch area is!\""));
        jokeList.add(new Joke("A pregnant fragment walks into a bar. The bartender says, \"Whoa! Whoa! We don't support nested fragments here!\""));
        jokeList.add(new Joke("A fragment walks into a bar, and the bartender asks for an ID. Fragment says, \"I don't have an ID.\" So the bartender says, \"Okay, I'll make a NullPointerException.\""));
    }

}
