package com.example.sendmessageapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class ReceiveMessageActivity  extends Activity{

        Intent intent = getIntent();
        String message  = intent.getStringExtra("message");

        TextView text_area = findViewById(R.id.receive_box);

    //String combinedMessage = "'from Marry\n'+" + message;
    //handle.setText(combinedMessage);
}
