package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<EditText> editTextList = new ArrayList<EditText>();


    private Button addButton,subtractButton,multiplyButton;
    private EditText valuea,valueb;
    private TextView result;
    private LinearLayout l1;
    private EditText ed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById(R.id.button1);
        subtractButton = findViewById(R.id.button2);
        multiplyButton = findViewById(R.id.button3);
        valuea = findViewById(R.id.valueA);
        valueb = findViewById(R.id.valueB);
        result = findViewById(R.id.res);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int c = Integer.parseInt(valuea.getText().toString()) + Integer.parseInt(valueb.getText().toString());
                result.setText("Result is "+Integer.toString(c));
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int c = Integer.parseInt(valuea.getText().toString()) - Integer.parseInt(valueb.getText().toString());
                result.setText("Result is "+Integer.toString(c));
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int c = Integer.parseInt(valuea.getText().toString()) * Integer.parseInt(valueb.getText().toString());
                result.setText("Result is "+Integer.toString(c));
            }
        });
    }


}
