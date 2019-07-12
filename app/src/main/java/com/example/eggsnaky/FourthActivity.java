package com.example.eggsnaky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FourthActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button eventButton = (Button)findViewById(R.id.buttonOfIntent);
        eventButton.setOnClickListener(this);
qあ
        editText = (EditText)findViewById(R.id.editText);
    }

    public void onClick(View v){
        if(v.getId() == R.id.buttonOfIntent) {
            Intent intent = new Intent();
            String string = editText.getText().toString();
            intent.putExtra("texts", string);
            intent.setClassName("com.example.eggsnaky",
                    "com.example.eggsnaky.FifthActivity");
            startActivity(intent);
        }

    }
}
