package com.example.sendmessageapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText phoneView = (EditText) findViewById(R.id.phone);
    int phone = Integer.parseInt(phoneView.getText().toString().trim());

    EditText messageView = (EditText) findViewById(R.id.message);
    String  message = messageView.getText().toString();

    //TextView handle = findViewById(R.id.displaybox);

    public void sendMessage(View v){
        int length = (int)(Math.log10(phone)+1);

        if(!(length == 9)){
            Intent intent = new Intent(this, ReceiveMessageActivity.class);
            intent.putExtra("message", message);
            startActivity(intent);
        }else{
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            PendingIntent pi = PendingIntent.getActivity(getApplicationContext(), 0, intent,0);
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(String.valueOf(phone), null, message, pi,null);
            Toast.makeText(getApplicationContext(), "Message Sent successfully!",
                    Toast.LENGTH_LONG).show();
        }
    }
}