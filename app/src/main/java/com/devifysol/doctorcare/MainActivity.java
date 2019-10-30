package com.devifysol.doctorcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Doctor;
        Doctor=findViewById(R.id.btn_doc);
        Doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Doctor_Signup.class);
                startActivity(i);

            }
        });
        Button Pat_btn = findViewById(R.id.btn_pat);
        Pat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Patient_Signup.class);
                startActivity(i);

            }
        });
    }
}
