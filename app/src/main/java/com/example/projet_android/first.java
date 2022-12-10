package com.example.projet_android;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import static java.lang.Thread.sleep;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_impression);

        final Thread thread = new Thread(() -> {
            try {
                sleep(1500);
                Intent intent = new Intent(first.this,MainActivity.class);
                startActivity(intent);
                finish();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });thread.start();
    }
}