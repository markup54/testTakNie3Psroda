package pl.zabrze.zs10.testtakniesroda3p;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private Button buttontak;
    private Button buttonnie;
    private Button buttondalej;
    private Button buttonczit;
    private ArrayList<Pytanie> pytanies = RepozytoriumPytan.zwrocPytania();
    private int aktualnyNumer;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("NR",aktualnyNumer);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        if(savedInstanceState == null){
        wyswietlPytanie(0);}
        else{
            aktualnyNumer = savedInstanceState.getInt("NR");
            wyswietlPytanie(aktualnyNumer);
        }
        buttontak = findViewById(R.id.button);
        buttontak.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sprawdzOdpowiedz(true);
                    }
                }
        );
        buttonnie = findViewById(R.id.button2);
        buttonnie.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       sprawdzOdpowiedz(false);
                    }
                }
        );
        buttondalej = findViewById(R.id.button4);
        buttondalej.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        aktualnyNumer++;
                        if(aktualnyNumer == pytanies.size()){
                            int pkt = podliczPunkty();
                            textView.setText("Koniec testu zdobyto "+pkt+" punktów");
                            --aktualnyNumer;
                            buttondalej.setVisibility(View.INVISIBLE);
                            return;
                        }
                        wyswietlPytanie(aktualnyNumer);
                    }
                }
        );
        buttonczit = findViewById(R.id.button3);
        buttonczit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent =new Intent(MainActivity.this,PodpowiedzActivity.class);
                        intent.putExtra("NRPYTANIE",aktualnyNumer);
                        MainActivity.this.startActivity(intent);
                    }
                }
        );
    }

    private void wyswietlPytanie(int i){
        textView.setText(pytanies.get(i).getTrescPytanie());
        imageView.setImageResource(pytanies.get(i).getIdZdejcia());
    }
    private void sprawdzOdpowiedz(boolean odp){
        if(pytanies.get(aktualnyNumer).isOdpowiedz() == odp){
            pytanies.get(aktualnyNumer).setCzyUdzielonoPoprawnejOdpowiedzi(true);
            Toast.makeText(MainActivity.this, "Dobra odpowiedź",
                    Toast.LENGTH_SHORT).show();
        }
    }
    private int podliczPunkty(){
        int punkty =0;
        for(Pytanie p:pytanies){
            if(p.isCzyUdzielonoPoprawnejOdpowiedzi())
                punkty++;
        }
        return punkty;
    }
}