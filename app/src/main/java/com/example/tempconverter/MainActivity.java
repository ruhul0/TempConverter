package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button ftoc,ctof;
    private TextView out;
    private EditText in;
    double result;
    String output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ftoc = findViewById(R.id.ftoc);
        ctof = findViewById(R.id.ctof);
        out = findViewById(R.id.out);
        in = findViewById(R.id.in);

        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(in.getText().toString());
                result  = (temp - 32) / 1.8;
                output = "Celcius value is : " + String.valueOf(result);
                out.setText(output);
            }
        });

        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(in.getText().toString());
                result = (temp * 1.8) + 32;
                output = "Fahrenheit value is : " + String.valueOf(result);
                out.setText(String.valueOf(output));
            }
        });
    }



}
