package com.example.alita_pc.alikawulansari_1202152332_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Alita-pc on 2/4/2018.
 */

public class ResultActivity extends AppCompatActivity {
    TextView Tempat, Menu, Porsi, Harga;
    int abnormalHarga = 30000;
    int EatbusHarga = 50000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        Tempat = findViewById(R.id.Lokasi);
        Menu = findViewById(R.id.Menu);
        Porsi = findViewById(R.id.Jumlah);
        Harga = findViewById(R.id.Harga);

        String tempat = intent.getStringExtra("Lokasi");
        String menu = intent.getStringExtra("Makanan");
        String porsi = intent.getStringExtra("Jumlah");
        int uang = intent.getIntExtra("duitOsas", 0);

        int jumlah = Integer.parseInt(porsi);

        Tempat.setText(tempat);
        Menu.setText(menu);
        Porsi.setText(porsi);

        int HargaAB = abnormalHarga * jumlah;
        int HargaEAT = EatbusHarga * jumlah;

        switch (tempat) {
            case "Abnormal":
                Harga.setText(String.valueOf(HargaAB));
                if (HargaAB > uang) {
                    Toast.makeText(this, "Jangan disini makan malamnya, uang tidak cukup", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
                }
                break;
            case "Eatbus":
                Harga.setText(String.valueOf(HargaEAT));
                if (HargaEAT > uang) {
                    Toast.makeText(this, "Jangan disini makan malamnya, uang tidak cukup", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}