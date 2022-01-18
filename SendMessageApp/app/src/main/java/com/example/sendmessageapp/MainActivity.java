package com.example.sendmessageapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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

     EditText phoneView = findViewById(R.id.phone);
    //CharSequence phone = phoneView.getText();

    EditText messageView = findViewById(R.id.message);
    //CharSequence message =  phoneView.getText();

    TextView handle = findViewById(R.id.displaybox);

    String combinedMessage = "'from Marry\n'+" + messageView;

    public void sendMessage(View v){
        handle.setText(combinedMessage);
    }
}