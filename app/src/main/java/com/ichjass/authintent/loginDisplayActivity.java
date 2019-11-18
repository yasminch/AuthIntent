package com.ichjass.authintent;





import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.net.PasswordAuthentication;

public class loginDisplayActivity extends AppCompatActivity {
    final String EXTRA_LOGIN="USER_LOGIN";
    final String EXTRA_PASSWORD="USER_PASSWORD";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_display);
        Intent intent2 =getIntent();

        TextView loginDisplay=findViewById(R.id.email_display);
        TextView passwordDisplay=findViewById(R.id.password_display);
        if (intent2 !=null)
        {
            loginDisplay.setText((intent2.getStringExtra(EXTRA_LOGIN)));
            passwordDisplay.setText((intent2.getStringExtra(EXTRA_PASSWORD)));
        }
    }}
