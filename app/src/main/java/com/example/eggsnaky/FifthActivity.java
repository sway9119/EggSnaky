package com.example.eggsnaky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class FifthActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        Button eventButton = (Button)findViewById(R.id.buttonOfBack);
        eventButton.setOnClickListener(this);
    }
    public void onClick(View v) {
        if(v.getId() == R.id.buttonOfBack) {
            Intent intent = new Intent();
            intent.setClassName("com.example.eggsnaky",
                    "com.example.eggsnaky.FourthActivity");
            startActivity(intent);
        } else {
            finish();
        }
    }
}
