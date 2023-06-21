package com.example.myapplication;

import static java.lang.Math.sqrt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);

        Button button = findViewById(R.id.button1);
        Button button1 = findViewById(R.id.button2);
        EditText editText = findViewById(R.id.edit1);
        EditText editText1 = findViewById(R.id.edit3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("key1","Hello");
                intent.putExtra("key2",editText.getText());
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                float num1 = Float.parseFloat(editText.getText().toString());
                float num2 = Float.parseFloat(editText1.getText().toString());
                float res = (num1 * num2) / 2;
                intent.putExtra("result", String.valueOf(res));
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                float num1 = Float.parseFloat(editText.getText().toString());
                float num2 = Float.parseFloat(editText1.getText().toString());
                float c = Float.parseFloat(String.valueOf(sqrt(num1 * num1 + num2 * num2)));
                float res = num1 + num2 + c;
                intent.putExtra("result", String.valueOf(res));
                startActivity(intent);
            }
        });
    }
}
