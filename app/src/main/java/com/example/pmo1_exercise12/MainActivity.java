package com.example.pmo1_exercise12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.PatternsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_send;//send=enviar
    EditText txt_name,txt_last_name,txt_age,txt_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_name=(EditText) findViewById(R.id.txt_name);
        txt_last_name=(EditText) findViewById(R.id.txt_last_name);
        txt_age=(EditText) findViewById(R.id.txt_age);
        txt_email=(EditText) findViewById(R.id.txt_email);
        btn_send=(Button) findViewById(R.id.btn_send);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(txt_name.getText().toString().equals("") || txt_last_name.getText().toString().equals("") || txt_age.getText().toString().equals("") || txt_email.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "No dejar campos vacios",Toast.LENGTH_LONG).show();
                }else{
                    if(validate_email(txt_email.getText().toString())==true){
                        Information information=new Information(txt_name.getText().toString(), txt_last_name.getText().toString(), (Integer.parseInt(txt_age.getText().toString())), txt_email.getText().toString());
                        Intent new_window=new Intent(getApplicationContext(), Message_Activity.class);
                        new_window.putExtra("name",information.getName());
                        new_window.putExtra("last_name",information.getLast_name());
                        new_window.putExtra("age",information.getAge());
                        new_window.putExtra("email",information.getEmail());
                        startActivity(new_window);
                    }
                }
            }
        });
    }

    private boolean validate_email(String email){
        if(!PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(getApplicationContext(), "Por favor escribe el correo valido",Toast.LENGTH_LONG).show();
            return false;
        }else{
            return true;
        }
    }
}