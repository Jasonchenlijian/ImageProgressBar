package com.clj.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.clj.imageprogressbar.ImageProgressBar;
import com.clj.imageprogressbar.OnProgressBarListener;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Timer timer;
    private ImageProgressBar progressBar1, progressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar1 = (ImageProgressBar) findViewById(R.id.progressbar1);
        progressBar1.setProgress(0);
        progressBar1.setOnProgressBarListener(new OnProgressBarListener() {
            @Override
            public void onProgressChange(int current, int max) {
                if (current == max) {
                    progressBar1.setProgress(0);
                }
            }
        });

        progressBar2 = (ImageProgressBar) findViewById(R.id.progressbar2);
        progressBar2.setProgress(50);
        progressBar2.setOnProgressBarListener(new OnProgressBarListener() {
            @Override
            public void onProgressChange(int current, int max) {
                if (current == max) {
                    progressBar2.setProgress(0);
                }
            }
        });

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar1.incrementProgressBy(1);
                        progressBar2.incrementProgressBy(1);
                    }
                });
            }
        }, 1000, 100);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }

}
