package com.dtstemrepair.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCheck = (Button) findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextNum1 = (EditText) findViewById(R.id.editTextNum1);
                TextView textViewResult = (TextView) findViewById(R.id.textViewResult);

                int num1 = Integer.parseInt(editTextNum1.getText().toString());

                if (num1 == 42)
                    textViewResult.setText(getResources().getString(R.string.results_correct));
                else
                    textViewResult.setText(getResources().getString(R.string.results_incorrect));
            }
        });
    }
}