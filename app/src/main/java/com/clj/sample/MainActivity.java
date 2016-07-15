package com.clj.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.clj.imageprogressbar.ImageProgressBar;

public class MainActivity extends AppCompatActivity {

    private ImageProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ImageProgressBar) findViewById(R.id.progressbar);
        progressBar.setProgress(50);
    }
}
