package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        findViewById(R.id.changeBackgroundBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

        findViewById(R.id.changeTextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android is awesome!");
            }
        });

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // reset text
                textView.setText("Hello from Jess!");

                // reset text color
                textView.setTextColor(getResources().getColor(R.color.black));

                // reset background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.bluish));

            }
        });

        findViewById(R.id.changeCustomTextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userEnteredText);
                }
            }
        });

    }
}