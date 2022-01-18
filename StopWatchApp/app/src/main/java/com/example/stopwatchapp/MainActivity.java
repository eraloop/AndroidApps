package com.example.stopwatchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //start of new type of code, use of onclicklistener

            Button start =   findViewById(R.id.start);
            Button stop =  findViewById(R.id.stop);
            Button reset =   findViewById(R.id.reset);

            start.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                  // Start(v);
                }
            });

            stop.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                   //Stop(v);
                }
            });

            reset.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //Reset(v);
                }
            });
        }

        //TextView time = findViewById(R.id.timebox);

      /* public void Start(View v){

       }

        public void Stop(View v){
            //count =  2;
        }

       public void Reset(View v){

        }*/

}