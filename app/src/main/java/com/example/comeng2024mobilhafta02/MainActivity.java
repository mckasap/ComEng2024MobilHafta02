package com.example.comeng2024mobilhafta02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MCK","ON Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MCK","ON Pause");
    }

    @Override
    protected void onDestroy() {

        Log.d("MCK","ON Destroy");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MCK","ON Stop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MCK","ON Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MCK","ON Resume");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Log.d("MCK","ON CREATE");
    }
}