package com.example.alita_pc.alikawulansari_1202152332_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText namaMknan;
    EditText jmlhMknan;
    private int duitOsas = 65600;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaMknan = findViewById(R.id.namaMknan);
        jmlhMknan = findViewById(R.id.jmlhMknan);
    }
    public String getNmMakanan() {
        return namaMknan.getText().toString();
    }
    public String getJumlah() {
        return jmlhMknan.getText().toString();
    }
    public int getUang() {
        return duitOsas;
    }

    public void Eatbus(View view) {
        Intent intentEatbus = new Intent(this, ResultActivity.class);
        intentEatbus.putExtra("lokasi", "Eatbus");
        intentEatbus.putExtra("makanan", getNmMakanan());
        intentEatbus.putExtra("jumlah", getJumlah());
        intentEatbus.putExtra("duitOsas", getUang());

        startActivity(intentEatbus);
    }

    public void Abnormal(View view) {
        Intent intentAbnormal = new Intent(this, ResultActivity.class);
        intentAbnormal.putExtra("lokasi", "Abnormal");
        intentAbnormal.putExtra("makanan", getNmMakanan());
        intentAbnormal.putExtra("jumlah", getJumlah());
        intentAbnormal.putExtra("duitOsas", getUang());

        startActivity(intentAbnormal);

    }

}
