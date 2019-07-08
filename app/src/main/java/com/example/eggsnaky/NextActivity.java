package com.example.eggsnaky;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    private Button startButton;
    private Button stopButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        startButton = new Button(this);
        startButton.setText("BTN1");
        stopButton = new Button(this);
        stopButton.setText("BTN2");
        textView = new TextView(this);
        textView.setText("TXTVW1");
        textView.setBackgroundColor(Color.YELLOW);

        LinearLayoutCompat.LayoutParams linearLayoutParams = new LinearLayoutCompat.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(linearLayoutParams);

        linearLayout.addView(startButton, linearLayoutParams);
        linearLayout.addView(stopButton, linearLayoutParams);
        linearLayout.addView(textView, linearLayoutParams);
        
        setContentView(linearLayout); //LinearLayoutを表示する。
    }
}
