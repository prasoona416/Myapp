package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Log extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    EditText et1,et2,et3,et4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        tv1= (TextView) findViewById(R.id.textView2);
        tv2= (TextView) findViewById(R.id.textView4);
        tv3= (TextView) findViewById(R.id.textView5);
        et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        et2 = (EditText) findViewById(R.id.editTextTextPersonName1);
        et3 = (EditText) findViewById(R.id.editTextTextPersonName2);
        et4 = (EditText) findViewById(R.id.editt1);

        Intent in = getIntent();
        String sname =in.getStringExtra("NAME");
        String semail=in.getStringExtra("EMAIL");
        String spass=in.getStringExtra("PASSWORD");
        String sgender=in.getStringExtra("GENDER");

        et4.setText(sgender);
        et1.setText(sname);
        et2.setText(semail);
        et3.setText(spass);




    }
}