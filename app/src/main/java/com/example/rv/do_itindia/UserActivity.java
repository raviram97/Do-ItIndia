package com.example.rv.do_itindia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        final TextView tvWelcome = (TextView) findViewById(R.id.tvWelcome);
        final EditText etName = (EditText) findViewById(R.id.et_name);
        final EditText etEmail = (EditText) findViewById(R.id.et_email);
        final EditText etPhone = (EditText) findViewById(R.id.et_phone);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        int phone = intent.getIntExtra("phone", -1);

        String message = name + " please check your details..";
        tvWelcome.setText(message);
        etName.setText(name);
        etEmail.setText(email);
        etPhone.setText(phone + "");
    }
}
