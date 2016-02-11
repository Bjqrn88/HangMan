package com.macbear.hangman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Spil_atk extends AppCompatActivity implements View.OnClickListener {

    Button guess;
    TextView ordet;
    Galgelogik logik = new Galgelogik();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spil);

        Log.d("Spil", "onCreate Spil_atk");

        ordet = (TextView) findViewById(R.id.ordet);

        guess = (Button) findViewById(R.id.guessButton);
        guess.setOnClickListener(this);

        //Sæt det skjulte ord:
        Log.d("Spil", "Hidden word: "+logik.getOrdet());

        ordet.setText(logik.getSynligtOrd());
    }

    @Override
    public void onClick(View view) {
        if (view == guess){
            Log.d("Button", "Gæt Clicked");

        }
    }
}
