package com.example.dts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String[] dataAwal = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",""};
    List<String> list = new ArrayList<>();
    List<String> newArray = new ArrayList<>();

    TextView kotak1;
    TextView kotak2;
    TextView kotak3;
    TextView kotak4;
    TextView kotak5;
    TextView kotak6;
    TextView kotak7;
    TextView kotak8;
    TextView kotak9;
    TextView kotak10;
    TextView kotak11;
    TextView kotak12;
    TextView kotak13;
    TextView kotak14;
    TextView kotak15;
    TextView kotak16;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kotak1 = (TextView) findViewById(R.id.kotak1);
        kotak2 = findViewById(R.id.kotak2);
        kotak3 = findViewById(R.id.kotak3);
        kotak4 = findViewById(R.id.kotak4);
        kotak5 = findViewById(R.id.kotak5);
        kotak6 = findViewById(R.id.kotak6);
        kotak7 = findViewById(R.id.kotak7);
        kotak8 = findViewById(R.id.kotak8);
        kotak9 = findViewById(R.id.kotak9);
        kotak10 = findViewById(R.id.kotak10);
        kotak11 = findViewById(R.id.kotak11);
        kotak12 = findViewById(R.id.kotak12);
        kotak13 = findViewById(R.id.kotak13);
        kotak14 = findViewById(R.id.kotak14);
        kotak15 = findViewById(R.id.kotak15);
        kotak16 = findViewById(R.id.kotak16);

        kotak1.setOnClickListener(this);
        kotak2.setOnClickListener(this);
        kotak3.setOnClickListener(this);
        kotak4.setOnClickListener(this);
        kotak5.setOnClickListener(this);
        kotak6.setOnClickListener(this);
        kotak7.setOnClickListener(this);
        kotak8.setOnClickListener(this);
        kotak9.setOnClickListener(this);
        kotak10.setOnClickListener(this);
        kotak11.setOnClickListener(this);
        kotak12.setOnClickListener(this);
        kotak13.setOnClickListener(this);
        kotak14.setOnClickListener(this);
        kotak15.setOnClickListener(this);
        kotak16.setOnClickListener(this);

        if(newArray.isEmpty()){
            list = Arrays.asList(dataAwal);
            Collections.shuffle(list);
//            int i = 0;
            for (String str : list) {
                newArray.add(str);
            }
            System.out.println(newArray);
            isiKotak();
        }
    }

    void isiKotak(){
        kotak1.setText(newArray.get(0));
        kotak2.setText(newArray.get(1));
        kotak3.setText(newArray.get(2));
        kotak4.setText(newArray.get(3));
        kotak5.setText(newArray.get(4));
        kotak6.setText(newArray.get(5));
        kotak7.setText(newArray.get(6));
        kotak8.setText(newArray.get(7));
        kotak9.setText(newArray.get(8));
        kotak10.setText(newArray.get(9));
        kotak11.setText(newArray.get(10));
        kotak12.setText(newArray.get(11));
        kotak13.setText(newArray.get(12));
        kotak14.setText(newArray.get(13));
        kotak15.setText(newArray.get(14));
        kotak16.setText(newArray.get(15));
    }

    public void onClick(View v){
        switch (v.getId()) {
            case (R.id.kotak1):
                if(kotak2.getText().toString().equals("") || kotak5.getText().toString().equals("")){
                    int posisiArray = 0;
                    String isi = kotak1.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;

            case (R.id.kotak2):
                if(kotak1.getText().toString().equals("") || kotak3.getText().toString().equals("") || kotak6.getText().toString().equals("") ){
                    int posisiArray = 1;
                    String isi = kotak2.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
            case (R.id.kotak3):
                if(kotak2.getText().toString().equals("") || kotak4.getText().toString().equals("") || kotak7.getText().toString().equals("") ){
                    int posisiArray = 2;
                    String isi = kotak3.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
            case (R.id.kotak4):
                if(kotak3.getText().toString().equals("") || kotak8.getText().toString().equals("") ){
                    int posisiArray = 3;
                    String isi = kotak4.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
            case (R.id.kotak5):
                if(kotak1.getText().toString().equals("") || kotak6.getText().toString().equals("") || kotak9.getText().toString().equals("")){
                    int posisiArray = 4;
                    String isi = kotak5.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;

            case (R.id.kotak6):
                if(kotak5.getText().toString().equals("") || kotak2.getText().toString().equals("") || kotak10.getText().toString().equals("") || kotak7.getText().toString().equals("") ){
                    int posisiArray = 5;
                    String isi = kotak6.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
            case (R.id.kotak7):
                if(kotak3.getText().toString().equals("") || kotak6.getText().toString().equals("") || kotak8.getText().toString().equals("") || kotak11.getText().toString().equals("")  ){
                    int posisiArray = 6;
                    String isi = kotak7.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
            case (R.id.kotak8):
                if(kotak4.getText().toString().equals("") || kotak7.getText().toString().equals("") || kotak12.getText().toString().equals("")|| kotak11.getText().toString().equals("") ){
                    int posisiArray = 7;
                    String isi = kotak8.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
            case (R.id.kotak9):
                if(kotak5.getText().toString().equals("") || kotak10.getText().toString().equals("") || kotak13.getText().toString().equals("")){
                    int posisiArray = 8;
                    String isi = kotak9.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;

            case (R.id.kotak10):
                if(kotak9.getText().toString().equals("") || kotak11.getText().toString().equals("") || kotak6.getText().toString().equals("") || kotak14.getText().toString().equals("") ){
                    int posisiArray = 9;
                    String isi = kotak10.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
            case (R.id.kotak11):
                if(kotak12.getText().toString().equals("") || kotak10.getText().toString().equals("") || kotak15.getText().toString().equals("") || kotak7.getText().toString().equals("")  ){
                    int posisiArray = 10;
                    String isi = kotak11.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
            case (R.id.kotak12):
                if(kotak11.getText().toString().equals("") || kotak16.getText().toString().equals("") || kotak8.getText().toString().equals("") ){
                    int posisiArray = 11;
                    String isi = kotak12.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
            case (R.id.kotak13):
                if(kotak14.getText().toString().equals("") || kotak9.getText().toString().equals("")){
                    int posisiArray = 12;
                    String isi = kotak13.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;

            case (R.id.kotak14):
                if(kotak13.getText().toString().equals("") || kotak15.getText().toString().equals("") || kotak10.getText().toString().equals("") ){
                    int posisiArray = 13;
                    String isi = kotak14.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
            case (R.id.kotak15):
                if(kotak14.getText().toString().equals("") || kotak16.getText().toString().equals("") || kotak11.getText().toString().equals("") ){
                    int posisiArray = 14;
                    String isi = kotak15.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
            case (R.id.kotak16):
                if(kotak15.getText().toString().equals("") || kotak12.getText().toString().equals("") ){
                    int posisiArray = 15;
                    String isi = kotak16.getText().toString();
                    pindah(posisiArray, isi);
                    isiKotak();
                }
                break;
        }
    }

    void pindah(int posisiArray, String isi){
        if(newArray == Arrays.asList(dataAwal)){
            Toast.makeText(getApplicationContext(), "Selamat Kamu Menang", Toast.LENGTH_LONG).show();
        }else {
            int kosong = newArray.indexOf("");
            System.out.println("posisi ksosong = " + kosong);
            newArray.set(posisiArray, "");
            newArray.set(kosong, isi);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.menuHome) {
            newArray.clear();
            list = Arrays.asList(dataAwal);
            Collections.shuffle(list);
//            int i = 0;
            for (String str : list) {
                newArray.add(str);
            }
            isiKotak();

            return true;
        }else if(item.getItemId()==R.id.menuBack) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }



}
