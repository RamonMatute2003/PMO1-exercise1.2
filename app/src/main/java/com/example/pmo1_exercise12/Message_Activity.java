package com.example.pmo1_exercise12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Message_Activity extends AppCompatActivity {

    EditText txt_name,txt_last_name,txt_age,txt_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        txt_name=(EditText) findViewById(R.id.txt_name_message);
        txt_last_name=(EditText) findViewById(R.id.txt_last_name_message);
        txt_age=(EditText) findViewById(R.id.txt_age_message);
        txt_email=(EditText) findViewById(R.id.txt_email_message);

        txt_name.setText("Nombre: "+((getIntent().getExtras()).getString("name")));
        txt_last_name.setText("Apellido: "+((getIntent().getExtras()).getString("last_name")));
        txt_age.setText("Edad: "+((getIntent().getExtras()).getInt("age")));
        txt_email.setText("Email: "+((getIntent().getExtras()).getString("email")));
    }
}