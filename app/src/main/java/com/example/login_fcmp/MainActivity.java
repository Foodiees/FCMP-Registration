package com.example.login_fcmp;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText pass;
    private Button login;
    private TextView newuserSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText3);
        login=(Button)findViewById(R.id.button);
        newuserSignup=(TextView)findViewById(R.id.newAccountTv);
        newuserSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RegistrationActivity.class));

            }
        });
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                check(email.getText().toString(),pass.getText().toString());
            }
        });

        }

    private void check(String userName,String userPassword)
    {
        if(userName.equals("syedaffanhameed@gmail.com")||(userName.equals("sudeepmanasali@gmail.com")||userName.equals("sudhanshumoolya93@gmail.com")||userName.equals("yashassuresh775@gmail.com")&&(userPassword.equals("12ab"))))
        {
            Intent intent =new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);

        }
        else
        {
            Intent intent=new Intent(MainActivity.this,ThirdActivity.class);
            startActivity(intent);
        }
    }

}
