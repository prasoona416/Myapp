package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText etName,etEmail,etPass;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.editText1);
        etEmail = (EditText) findViewById(R.id.editTextTextEmailAddress);
        etPass= (EditText) findViewById(R.id.editTextTextPassword);
        rg = (RadioGroup) findViewById(R.id.radiogroup);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String salute ="";
                if(rb1.isChecked()){
                    salute =" Mr";
                }
                else if (rb2.isChecked()){
                    salute = "Ms";
                }
                else if (rb3.isChecked()){
                    salute = "Mx";
                }

                String name=etName.getText().toString();
                String email =etEmail.getText().toString();
                String pas = etPass.getText().toString();

                int i = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(i);
                Toast.makeText(getApplicationContext(),"DONE!",Toast.LENGTH_SHORT).show();

                Intent in = new Intent(MainActivity.this, Log.class);

                in.putExtra("NAME", name);
                in.putExtra("EMAIL",email);
                in.putExtra("PASSWORD",pas);
                in.putExtra("GENDER",salute);

                startActivity(in);


            }
        });
    }
}