package com.alexen.zodiacnumerology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonZodiac = findViewById(R.id.button_Zodiac);
        buttonZodiac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentZodiac = new Intent(MainActivity.this, Zodiac_Activity.class);
                startActivity(intentZodiac);
            }
        });

        Button buttonNumerology = findViewById(R.id.button_Numerology);
        buttonNumerology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNumerology = new Intent(MainActivity.this, Numerology_Activity.class);
                startActivity(intentNumerology);
            }
        });
    }
}
