package com.example.nois.myapplication;

import android.support.v4.provider.DocumentFile;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int counter = 0; counter < 50; counter++) {
            Log.i("Mainactivity","Value:" +counter);
        }
    }
}
