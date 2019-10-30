package com.devifysol.doctorcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Doctor_Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor__signup);
        EditText edit_password;
        Button Doc_btn = findViewById(R.id.btn_doc_signup);
        Doc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Doctor_Signup.this,Doctor_Singin.class);
                startActivity(i);
                finish();
            }
        });

    }

       /* public void ShowHideRePass(View view){

        EditText edit_password;
        edit_password=findViewById(R.id.edt_re_pswrd);

        if(view.getId()==R.id.show_pass_btn2){

            if(edit_password.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())){
                ((ImageView)(view)).setImageResource(R.drawable.hide_password);

                //Show Password
                edit_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
            else{
                ((ImageView)(view)).setImageResource(R.drawable.show_password);

                //Hide Password
                edit_password.setTransformationMethod(PasswordTransformationMethod.getInstance());

            }
        }
    }*/
}
