package com.example.sendmessageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class ReceiveMessageActivity extends Activity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_receive_message);

            Intent intent = getIntent();
            String message  = intent.getStringExtra("message");
            TextView handler = (TextView) findViewById(R.id.view);;
            String combinedMessage = "'from Marry\n'+" + message;
            handler.setText(combinedMessage);
        }

}
