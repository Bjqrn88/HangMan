package com.macbear.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class Mainmenu_atk extends AppCompatActivity implements View.OnClickListener {

    Button spilButton, helpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        spilButton = (Button) findViewById(R.id.spilButton);
        spilButton.setOnClickListener(this);
        helpButton = (Button) findViewById(R.id.helpButton);
        helpButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.spilButton:
                Log.d("Button", "Spil Clicked");
                Intent spilIntent = new Intent(this, Spil_atk.class);
                startActivity(spilIntent);
                break;
            case R.id.helpButton:
                Log.d("Button", "Help Clicked");
                Intent helpIntent = new Intent(this, Help_atk.class);
                startActivity(helpIntent);
                break;
        }
    }
}
