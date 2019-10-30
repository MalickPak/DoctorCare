package com.devifysol.doctorcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Patient_Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient__signup);
        Button Doc_btn = findViewById(R.id.btn_pat_signup);
        Doc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Patient_Signup.this,Patient_Singin.class);
                startActivity(i);
                finish();
            }
        });
    }
}
