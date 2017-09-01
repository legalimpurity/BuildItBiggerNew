package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.jokesSourceClass;
import com.legalimpurity.jokedisplaylibrary.JokeDisplayActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private String getJoke()
    {
        return jokesSourceClass.getJoke();
    }

    public void tellJoke(View view) {
        Intent jokesDisplayMainIntent = new Intent(this,JokeDisplayActivity.class);
        Bundle extraData = new Bundle();
        extraData.putString(JokeDisplayActivity.JOKE_KEY,getJoke());
        jokesDisplayMainIntent.putExtras(extraData);
        startActivity(jokesDisplayMainIntent);
    }


}
