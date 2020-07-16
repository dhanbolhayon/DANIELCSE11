package com.example.cse11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        Button button;
        Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            dhan();
    }
        public void dhan(){
            button = findViewById(R.id.Fbutton);
            button1 = findViewById(R.id.Sbutton);

            button.setOnClickListener(this);
            button1.setOnClickListener(this);
        }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Fbutton:
                Intent go_to_second = new Intent(this, MainActivity2.class);
                startActivity(go_to_second);
                break;
            case R.id.Sbutton:
                Intent go_to_third = new Intent(this, MainActivity3.class);
                startActivity(go_to_third);
                break;
        }
    }
}