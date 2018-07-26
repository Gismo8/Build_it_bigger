package com.udacity.gradle.builditbigger.backend;

import com.example.joketeller.JokeTeller;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class JokeEndpoint {

    private JokeTeller jokeTeller;

    @ApiMethod(name = "pushJoke")
    public JokeBean pushJoke() {
        if (jokeTeller == null) {
            jokeTeller = new JokeTeller();
        }
        return new JokeBean(jokeTeller.tellJoke());
    }

}
