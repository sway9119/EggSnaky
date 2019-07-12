package com.example.eggsnaky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class FifthActivity extends AppCompatActivity implements View.OnClickListener {

    private String mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        Button eventButton = (Button)findViewById(R.id.buttonOfBack);
        eventButton.setOnClickListener(this);

        Intent intent = getIntent();
        mText = intent.getStringExtra("texts");
        TextView textView = (TextView)findViewById(R.id.textViewOfJyotai);
        textView.setText(mText);
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
