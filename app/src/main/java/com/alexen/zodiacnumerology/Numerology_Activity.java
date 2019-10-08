package com.alexen.zodiacnumerology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Numerology_Activity extends AppCompatActivity {
    EditText editText_Day,editText_Month,editText_Year;
    Button button_Calcular;
    int Day,Month,Year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerology);

        editText_Day = findViewById(R.id.Day_Number);
        editText_Month = findViewById(R.id.Month_number);
        editText_Year = findViewById(R.id.Year_Number);

        button_Calcular = findViewById(R.id.button_Calcular);
        button_Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 Day = Integer.parseInt(editText_Day.getText().toString());
                 Month = Integer.parseInt(editText_Month.getText().toString());
                 Year = Integer.parseInt(editText_Year.getText().toString());

//                if (Day <= 31 && Month <= 12 && Year <= 2999) {







                    Intent intentCalcular = new Intent(Numerology_Activity.this, Resultado_Numerology_Activity.class);

                    intentCalcular.putExtra("Dia", Day);
                    intentCalcular.putExtra("Mes", Month);
                    intentCalcular.putExtra("Año", Year);

                    startActivity(intentCalcular);
//                }




            }
        });



    }
}
