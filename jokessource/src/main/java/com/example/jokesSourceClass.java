package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class jokesSourceClass {

    public static String getJoke(){
        String[] jokearray =  new String[]{
                "Q: What computer sings the best?\nA: A Dell.",
                "Q: How many light bulbs does it take to change a light bulb?\nA: They can't; they're not bright enough.",
                "I put so much more effort into naming my first Wi-Fi than my first child.",
                "The cool part about naming your kid is you don’t have to add six numbers to make sure the name is available."
        };

        Random rn = new Random();
        return jokearray[rn.nextInt(jokearray.length)];
    }
}
