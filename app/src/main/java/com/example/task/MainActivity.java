package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText textSender;
    Button go;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        clickedButton(RecieverActivity.class);


    }
    private void initView(){
        textSender = findViewById(R.id.textSender);
        go = findViewById(R.id.clicked);
    }
    private void sendData(){
        String sender = textSender.getText().toString();
        intent.putExtra("KEY",sender);
    }
    private void clickedButton(final Class Reciever){

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivityReciver();

            }

            private void startActivityReciver() {
                intent = new Intent(MainActivity.this,Reciever);
                sendData();
                startActivity(intent);

            }
        });

    }
}