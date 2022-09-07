package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et1stnum = findViewById(R.id.editTextText1stnumber);
        EditText et2ndnum = findViewById(R.id.editTextTextPersonName2);
        TextView txresult = findViewById(R.id.textViewresult);
        Button calc = findViewById(R.id.button);
        Button subtract = findViewById(R.id.button2);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texta= et1stnum.getText().toString();
                int x1=Integer.parseInt(texta);

                String textb= et2ndnum.getText().toString();
                int x2=Integer.parseInt(textb);

          int res= x1+x2;

          txresult.setText(String.valueOf(res));



            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                String textc= et1stnum.getText().toString();
                int x3=Integer.parseInt(textc);

                String textd= et2ndnum.getText().toString();
                int x4=Integer.parseInt(textd);

                int subtract= x3-x4;
            }
        });


    }//method for subtraction
    public int  subtract(int x, int y){
        int a= x+y;
        return a;
    }
}