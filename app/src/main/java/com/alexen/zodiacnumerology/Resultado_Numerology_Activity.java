package com.alexen.zodiacnumerology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.TextView;

public class Resultado_Numerology_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado__numerology);
        Intent intentCalcular = getIntent();
        int day = intentCalcular.getIntExtra("Dia", 0);
        TextView textViewName = findViewById(R.id.textViewUserName);
        textViewName.setText(day);



    }
}
