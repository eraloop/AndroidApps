package com.example.stopwatchapp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int seconds = 0;
    private boolean startRun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*if(savedInstanceState != null){
            seconds = savedInstanceState.getInt("seconds");
            startRun=savedInstanceState.getBoolean("startRun");
        }*/

        Timer();

    }

    /*public void onSaveInstanceState(Bundle saveInstanceState){
        saveInstanceState.putInt("seconds", seconds);
        saveInstanceState.putBoolean("startRun", startRun);
    }*/

    public void onClickStart(View view){
        startRun=true;
    }

    public void onClickStop(View view){
        startRun=false;
    }

    public void onClickReset(View view){
        startRun=false;
        seconds=0;
    }

    private void Timer(){
        final TextView timeView = findViewById(R.id.timebox);

        final Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                //int hours = seconds / 3600;
                int minutes = (seconds % 3600)/60;
                int secs = seconds % 60;

                String time = String.format("%02d:%02d", minutes, secs);

                timeView.setText(time);

                if(startRun){
                    seconds++;
                }

                handler.postDelayed(this, 100);
            }
        });

    }
}