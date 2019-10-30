package com.devifysol.doctorcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doctor_Singin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_singin);
        Button Doc_btn = findViewById(R.id.btn_doc_account);
        Doc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Doctor_Singin.this,Doctor_Signup.class);
                startActivity(i);
                finish();
            }
        });
    }
}
