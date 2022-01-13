
/*package com.example.stopwatchactivity;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.os.Bundle;
import java.util.Locale;
import android.widget.TextView;

public class StopwatchActivity extends Activity {

    private int seconds = 0;

    // Is the stopwatch running?
    private boolean running;

    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {

            seconds
                    = savedInstanceState
                    .getInt("seconds");
            running
                    = savedInstanceState
                    .getBoolean("running");
            wasRunning
                    = savedInstanceState
                    .getBoolean("wasRunning");
        }
        runTimer();
    }

    // Save the state of the stopwatch
    // if it's about to be destroyed.
    @Override
    public void onSaveInstanceState(
            Bundle savedInstanceState)
    {
        savedInstanceState
                .putInt("seconds", seconds);
        savedInstanceState
                .putBoolean("running", running);
        savedInstanceState
                .putBoolean("wasRunning", wasRunning);
    }

    // If the activity is paused,
    // stop the stopwatch.
    @Override
    protected void onPause()
    {
        super.onPause();
        wasRunning = running;
        running = false;
    }

    // If the activity is resumed,
    // start the stopwatch
    // again if it was running previously.
    @Override
    protected void onResume()
    {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }


    public void onClickStart(View view)
    {
        running = true;
    }

    public void onClickStop(View view)
    {
        running = false;
    }

    public void onClickReset(View view)
    {
        running = false;
        seconds = 0;
    }

    private void runTimer()
    {

        // Get the text view.
        final TextView timeView
                = (TextView)findViewById(
                R.id.time_view);

        // Creates a new Handler
        final Handler handler
                = new Handler();
        handler.post(new Runnable() {
            @Override

            public void run()
            {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;

                // Format the seconds into hours, minutes,
                // and seconds.
                String time
                        = String
                        .format(Locale.getDefault(),
                                "%d:%02d:%02d", hours,
                                minutes, secs);

                // Set the text view text.
                timeView.setText(time);

                // If running is true, increment the
                // seconds variable.
                if (running) {
                    seconds++;
                }

                // Post the code again
                // with a delay of 1 second.
                handler.postDelayed(this, 1000);
            }
        });
    }
}
*/


package com.example.stopwatchactivity;
import android.app.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class StopwatchActivity extends Activity {

    //declaration of global variables
    private int sec = 0;
    private boolean isRunning;
    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null)
        {

            sec = savedInstanceState.getInt("seconds");
            isRunning = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        startTimer();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("seconds", sec);
        savedInstanceState.putBoolean("running", isRunning);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }


    @Override
    protected void onPause()
    {
        super.onPause();
        wasRunning = isRunning;
        isRunning = false;
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if (wasRunning) {
            isRunning = true;
        }
    }

    public void Start(View view)
    {
        isRunning = true;
    }


    public void Stop(View view)
    {
        isRunning = false;
    }

    public void Reset(View view)
    {
        isRunning = false;
        sec = 0;
    }

    private void startTimer()
    {
        final TextView timer = (TextView)findViewById(R.id.time_view);

        final Handler hd = new Handler();

        hd.post(new Runnable() {
            @Override

            public void run()
            {
                int hours_var = sec / 3600;
                int minutes_var = (sec % 3600) / 60;
                int secs_var = sec % 60;

                String time_value = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours_var, minutes_var, secs_var);

                timer.setText(time_value);

                if (isRunning)
                {
                    sec++;
                }

                hd.postDelayed(this, 1000);
            }
        });
    }
}
