package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
 RadioButton radioButton1,radioButton2,radioButton3;
 ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        radioButton1 = findViewById(R.id.rbird);
        radioButton2 = findViewById(R.id.rtiger);
        radioButton3 = findViewById(R.id.rsanke);
        imageView = findViewById(R.id.ivShowimg);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rbird:
                imageView.setImageResource(R.drawable.bird);
                break;
            case R.id.rtiger:
                imageView.setImageResource(R.drawable.tiger);
                break;
            case R.id.rsanke:
                imageView.setImageResource(R.drawable.snake);
                break;
        }

    }
}

