package com.example.sendmessageapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View v){

        //EditText phoneView = (EditText) findViewById(R.id.phone);
        //String  phone = phoneView.getText().toString();

        EditText messageView = (EditText) findViewById(R.id.message);
        String  message = messageView.getText().toString();

        TextView handle = findViewById(R.id.displaybox);

        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra("message", message);

        startActivity(intent);
    }
}