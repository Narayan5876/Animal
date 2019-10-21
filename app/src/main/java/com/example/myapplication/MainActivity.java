package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numFirst,numSecond;
    TextView txtViewResult;
    Button btnAdd, btnSub,btnMul,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numFirst=findViewById(R.id.numFirst);
        numSecond=findViewById(R.id.numSecond);
        txtViewResult=findViewById(R.id.txtView);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);


//event listener for button click
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(numFirst.getText().toString());
                int b=Integer.parseInt(numSecond.getText().toString());
                int c=a+b;
                txtViewResult.setText("Result:"+String.valueOf(c));



            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(numFirst.getText().toString());
                int b=Integer.parseInt(numSecond.getText().toString());
                int c=a-b;
                txtViewResult.setText("Result:"+String.valueOf(c));



            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(numFirst.getText().toString());
                int b=Integer.parseInt(numSecond.getText().toString());
                int c=a*b;
                txtViewResult.setText("Result:"+String.valueOf(c));



            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(numFirst.getText().toString());
                int b=Integer.parseInt(numSecond.getText().toString());
                int c=a/b;
                txtViewResult.setText("Result:"+String.valueOf(c));



            }
        });
    }
}
