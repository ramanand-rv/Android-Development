package com.ramanand.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View v){
        EditText uName = findViewById(R.id.uname);
        EditText uNum = findViewById(R.id.unum);
        EditText uMail = findViewById(R.id.umail);
        TextView textView = findViewById(R.id.txtView);

        textView.setText("\nFull Name: "+uName.getText().toString()+"\n"+"Email: "+uMail.getText().toString()+"\n"+"Mobile Number: "+ uNum.getText().toString()
        );
        ImageView imgV = findViewById(R.id.pspImg);
        imgV.setImageResource(R.drawable.passportsize);

    }
}