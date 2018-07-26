package com.example.jokeactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE = "joke";
    String joke;
    TextView jokeText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        jokeText = (TextView) findViewById(R.id.jokeText);
        if (getIntent().hasExtra(JOKE)) {
            joke = getIntent().getExtras().getString(JOKE, getResources().getString(R.string.no_joke));
            jokeText.setText(joke);
        }
    }


}
