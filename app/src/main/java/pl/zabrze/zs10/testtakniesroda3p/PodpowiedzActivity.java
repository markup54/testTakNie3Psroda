package pl.zabrze.zs10.testtakniesroda3p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PodpowiedzActivity extends AppCompatActivity {
    TextView textViewTrescPytania;
    TextView textViewPodpowiedz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podpowiedz);
        Intent intent = getIntent();
        int nrPytania = intent.getIntExtra("NRPYTANIE",0);
        textViewTrescPytania = findViewById(R.id.textView2);
        textViewPodpowiedz = findViewById(R.id.textView3);
        textViewPodpowiedz.setText(RepozytoriumPytan.zwrocPytania().get(nrPytania).getPodpowiedz());
        textViewTrescPytania.setText("Korzystasz z podpowiedzi do pytania: "
                +RepozytoriumPytan.zwrocPytania().get(nrPytania).getTrescPytanie());

    }
}