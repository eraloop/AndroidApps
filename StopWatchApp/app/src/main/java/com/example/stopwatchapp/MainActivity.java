package com.example.stopwatchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   int minutes;
   // int seconds;
   // int count = 1;

   TextView time = findViewById(R.id.time_box);

   public void Start(View v){
       for(int i = 0; i <= 10; i ++){
           if(i == 10){
               i = 0;
           }
           minutes ++ ;
           time.setText(minutes);
       }
    }

    public void Stop(View v){
        //count =  2;
    }

   public void Reset(View v){

    }
}