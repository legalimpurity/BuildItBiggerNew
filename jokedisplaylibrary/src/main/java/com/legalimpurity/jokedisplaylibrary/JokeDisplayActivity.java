package com.legalimpurity.jokedisplaylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "JOKE_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_display_activity);
        TextView tv = (TextView)findViewById(R.id.textVal);

        if(getIntent().getExtras() != null)
            if(getIntent().getExtras().containsKey(JOKE_KEY))
                tv.setText(getIntent().getExtras().getString(JOKE_KEY));
    }
}
