package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class RecieverActivity extends AppCompatActivity {
    String textReceiver;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);
        recieverData();


        Toast.makeText(RecieverActivity.this,textReceiver,Toast.LENGTH_LONG).show();
    }

    private void recieverData(){
        intent = getIntent();
        textReceiver = intent.getStringExtra("KEY");
    }
}