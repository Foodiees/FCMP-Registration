package com.example.login_fcmp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {
    private EditText username,userpassword,useremail;
    private Button  regBtn;
    private TextView alreadyuser;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        username=(EditText)findViewById(R.id.usernameEt);
        useremail=(EditText)findViewById(R.id.Email1Et);
        regBtn=(Button)findViewById(R.id.RegBtn);
        userpassword=(EditText)findViewById((R.id.passwordEt));
        alreadyuser=(TextView)findViewById(R.id.textView3);
        firebaseAuth=FirebaseAuth.getInstance();
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check()){
                    //upload to firebase FCMP
                    String user_email=useremail.getText().toString().trim();
                    String user_password=userpassword.getText().toString().trim();
                    firebaseAuth.createUserWithEmailAndPassword(user_email,user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(RegistrationActivity.this, "Registration success:user account for FCMP is created", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
                            }
                            else {
                                Toast.makeText(RegistrationActivity.this, "Registration Failed! Contact with FCMP Admin", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });


                }
            }
        });

    }
    private Boolean check() {
        Boolean result=false;
        String name=username.getText().toString();
        String email=useremail.getText().toString();
        String password=userpassword.getText().toString();
        if(name.isEmpty()||email.isEmpty()||password.isEmpty()){
            Toast.makeText(this, "Please fill all columns", Toast.LENGTH_SHORT).show();

        }
        else {
            result=true;
        }
        return result;
    }
}
