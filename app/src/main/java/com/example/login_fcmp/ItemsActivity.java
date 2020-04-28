package com.example.login_fcmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ItemsActivity extends AppCompatActivity {
    private EditText itemname, Quantity;
    private Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        itemname = (EditText) findViewById(R.id.editText2);
        Quantity = (EditText) findViewById(R.id.editText4);
        Add=(Button)findViewById(R.id.button6);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {
                if(check()) {
                    Toast.makeText(ItemsActivity.this, "Order placed in public Domain", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(ItemsActivity.this, Role_assign.class));
                }
            }
        });


    }

    public Boolean check() {
        Boolean result = false;
        String name = Quantity.getText().toString();
        String email = itemname.getText().toString();

        if (name.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Please fill all columns", Toast.LENGTH_SHORT).show();

        } else {
            result = true;
        }
        return result;
    }
}