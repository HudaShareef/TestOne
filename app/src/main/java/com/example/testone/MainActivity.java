package com.example.testone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private EditText edtName;
     private EditText  edtpassword;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        edtpassword = findViewById(R.id.edtpassword);
    }

    public void btnSubmitOnClick(View view) {
     String name =edtName.getText().toString();
     String password = edtpassword.getText().toString();
     String msg = "name: " + name + "pass: " + password;
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

    }
}