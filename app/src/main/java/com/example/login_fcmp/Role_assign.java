package com.example.login_fcmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Role_assign extends AppCompatActivity {
    private Button order;
    private Button deliver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_assign);
        order=(Button)findViewById(R.id.button3);
        deliver=(Button)findViewById(R.id.button4);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Role_assign.this,RegistrationActivity.class));

            }
        });
        deliver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Role_assign.this,RegistrationActivity.class));

            }
        });
    }
}
