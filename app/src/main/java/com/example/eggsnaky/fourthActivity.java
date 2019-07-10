package com.example.eggsnaky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fourthActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button eventButton = (Button)findViewById(R.id.button);
        eventButton.setOnClickListener(this);
    }

    public void onClick(View v){
        TextView textView = (TextView)findViewById(R.id.textViewOfJyotai);
        textView.setText("Pushed Button");
    }
}
