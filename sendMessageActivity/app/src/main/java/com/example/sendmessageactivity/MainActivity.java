package com.example.sendmessageactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int SEND_SMS_PERMISSION_REQUEST_CODE = 1;
    EditText Phone, Message;
    Button Send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSend(View v){
        String pho = Phone.getText().toString();
        String Msg = Message.getText().toString();

        if(pho==null || pho.length()==0 ||Msg.length()==0||Msg==null){
            return ;
        }
        if(checkPermission(Manifest.permission.SEND_SMS))
        {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(pho,null, Msg, null, null);
            Toast.makeText(this,"Message succesfully sent", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "MESSAGE IS NOR SENT", Toast.LENGTH_SHORT);
        }

    }

    public boolean checkPermission(String permission)
    {
        int check = ContextCompat.checkSelfPermission(this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }
}