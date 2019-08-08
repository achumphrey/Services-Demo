package com.example.servicesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyServices";
    private Button btn_start;
    private Button btn_stop;
    private Intent serviceIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "MainActivity thread id: " + Thread.currentThread().getId());

        btn_start = findViewById(R.id.btn_start);
        btn_stop = findViewById(R.id.btn_stop);

        serviceIntent = new Intent(getApplicationContext(), MyService.class);


        btn_start.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              startService(serviceIntent);

          }
        });

        btn_stop.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              stopService(serviceIntent);

          }
        });

    }

}

