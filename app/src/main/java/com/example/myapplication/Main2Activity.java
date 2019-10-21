package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup = findViewById(R.id.rgSubject);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i == R.id.rban)
                {
                    Toast.makeText(Main2Activity.this,"cancel",Toast.LENGTH_SHORT).show();
                }
                if(i == R.id.rbWeb)
                {
                    Toast.makeText(Main2Activity.this,"cancel",Toast.LENGTH_SHORT).show();
                }
                if(i == R.id.rbIot)
                {
                    Toast.makeText(Main2Activity.this,"cancel",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}

