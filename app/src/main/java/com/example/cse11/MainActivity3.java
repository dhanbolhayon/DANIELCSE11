package com.example.cse11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    EditText text;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button b17;
    Button b18;

    boolean mean, mode, median;
    float v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        advanceCalcu();
    }
    public void advanceCalcu(){
        text = findViewById(R.id.text);
        b1 = findViewById(R.id.B1);
        b2 = findViewById(R.id.B2);
        b3 = findViewById(R.id.B3);
        b4 = findViewById(R.id.B4);
        b5 = findViewById(R.id.B5);
        b6 = findViewById(R.id.B6);
        b7 = findViewById(R.id.B7);
        b8 = findViewById(R.id.B8);
        b9 = findViewById(R.id.B9);
        b10 = findViewById(R.id.B10);
        b11 = findViewById(R.id.B11);
        b12 = findViewById(R.id.B12);
        b13 = findViewById(R.id.B13);
        b14 = findViewById(R.id.B14);
        b15 = findViewById(R.id.B15);
        b16 = findViewById(R.id.B16);
        b17 = findViewById(R.id.B17);
        b18 = findViewById(R.id.B18);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.B1:
                text.setText(text.getText() + "5");
                break;
            case R.id.B3:
                text.setText(text.getText() + "1");
                break;
            case R.id.B2:
                text.setText(text.getText() + "2");
                break;
            case R.id.B4:
                text.setText(text.getText() + "3");
                break;
            //MODE
            case R.id.B5:
                float maxNumber = -1;
                float maxApearance = -1;
                String strmode = text.getText().toString();
                String[] Strdhanmode = strmode.split(",");
                float[] Numdhanmode = new float[Strdhanmode.length];

                for (int i = 0; i < Strdhanmode.length; i++) {
                    String num = Strdhanmode[i];
                    Numdhanmode[i] = Float.parseFloat(num);
                }
                for (int x = 0; x < Numdhanmode.length; x++){
                    int count = 0;
                        for (int j = 0; j < Numdhanmode.length; j++){
                            if (Numdhanmode[x] == Numdhanmode[j])
                                count++;
                        }
                 if (count > maxApearance){
                     maxNumber = Numdhanmode[x];
                     maxApearance = count;
                 }
                }

                text.setText(maxNumber + "");
                break;
            case R.id.B6:
                text.setText(text.getText() + "4");
                break;
            case R.id.B7:
                text.setText(text.getText() + "6");
                break;

                    //MEAN
            case R.id.B8:

                String str = text.getText().toString();
                String[] Strdhan = str.split(",");
                float[] Numdhan = new float[Strdhan.length];

                for (int i = 0; i < Strdhan.length; i++) {
                    String num = Strdhan[i];
                    Numdhan[i] = Float.parseFloat(num);
                }
                float sum = 0;
                for (float n : Numdhan) {
                    sum += n;
                }
                text.setText(sum/Numdhan.length + "");



                break;
            case R.id.B9:
                text.setText(text.getText() + "7");
                break;
            case R.id.B10:
                text.setText(text.getText() + "8");
                break;
            case R.id.B11:
                text.setText(text.getText() + "9");
                break;

            //MEDIAN
            case R.id.B12:
                String strMedian = text.getText().toString();
                String[] Strdhanmedian = strMedian.split(",");
                float[] Numdhanmedian = new float[Strdhanmedian.length];

                for (int i = 0; i < Strdhanmedian.length; i++) {
                    String num = Strdhanmedian[i];
                    Numdhanmedian[i] = Float.parseFloat(num);
                }
                Arrays.sort(Numdhanmedian);
                if (Numdhanmedian.length % 2 !=0){
                    text.setText(Numdhanmedian[Numdhanmedian.length/2] + "");
                }else {
                    text.setText((Numdhanmedian[Numdhanmedian.length/2] + Numdhanmedian[Numdhanmedian.length/2-1])/2 + "");
                }

                break;
            case R.id.B13:
                text.setText(text.getText() + ".");
                break;
            case R.id.B14:
                text.setText(text.getText() + "0");
                break;
                // equals
            case R.id.B15:

                if (mean == true){



                  //  String str = text.getText().toString();
                    //String[] result = str.split(",");
                  //  int[] fl = new int[result.length];

                  //  for (int i = 0; i < result.length; i++){
                    //    String num = result[i];
                     //   fl[i] = Integer.parseInt(num);
                  //  }
                   // int sum = 0;
                   // for (int n : fl){
                     //   sum += n;
                     //   text.setText(sum/fl.length);
                   // }
                   // mean = false;

               }
                break;

            case R.id.B16:
               text.setText(text.getText() + ",");
               break;
            case R.id.B17:
                if (text.getText().length() > 0){
                    CharSequence name = text.getText().toString();
                    text.setText(name.subSequence(0, name.length()-1));
                }
                break;
            case R.id.B18:
                text.setText("");
                break;
        }
    }
}