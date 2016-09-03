package com.pccw.mark.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doGet();

    }

    private void doGet() {
        Toast.makeText(this,"吐司",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"远程更新",Toast.LENGTH_LONG).show();
    }
}
