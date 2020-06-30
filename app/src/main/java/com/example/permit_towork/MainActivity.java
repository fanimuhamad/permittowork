package com.example.permit_towork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Email, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = (EditText) findViewById(R.id.etemail);
        Password = (EditText) findViewById(R.id.etpassword);
    }

//public void OnLogin(View view) {
//        String email = Email.getText().toString();
//        String password = Password.getText().toString();
//        String type = "login";
//        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
//        backgroundWorker.execute(type, email, password);
//}

}
