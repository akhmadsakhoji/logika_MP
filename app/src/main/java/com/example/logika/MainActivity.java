package com.example.logika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Pertama
    TextView input1, cetakNilai, cetakLogika ;
    Button buttonLogika;
    private double nilaiLogika;
    private String cek1;
    private String cek2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //kedua
        input1 = (TextView) findViewById(R.id.NilaiEditText);
        cetakNilai = (TextView) findViewById(R.id.CetakNilaiTextView);
        cetakLogika = (TextView) findViewById(R.id.LogikaTextView);
        buttonLogika = (Button) findViewById(R.id.LogikaButton);
    }


    //ketiga
    public void klikHitungYa(View V){
        double inputA = Double.parseDouble(input1.getText().toString());
        if(inputA>=80){
            cetakNilai.setText(""+inputA);
            cetakLogika.setText("A");
        }
    }
}