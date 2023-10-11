package pl.zabrze.zs10.testtakniesroda3p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class PodpowiedzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podpowiedz);
        Intent intent = getIntent();
        //int nrPytania = intent.getIntExtra("NRPYTANIE");
    }
}