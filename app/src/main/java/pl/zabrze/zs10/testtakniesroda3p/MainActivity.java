package pl.zabrze.zs10.testtakniesroda3p;

import androidx.appcompat.app.AppCompatActivity;

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        wyswietlPytanie(0);
        buttontak = findViewById(R.id.button);
        buttontak.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        boolean czyDobra = pytanies.get(aktualnyNumer).isOdpowiedz();
                        if(czyDobra == true){
                            Toast.makeText(MainActivity.this, "Dobra odpowiedź",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
        buttonnie = findViewById(R.id.button2);
        buttonnie.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(pytanies.get(aktualnyNumer).isOdpowiedz() == false){
                            Toast.makeText(MainActivity.this, "Dobra odpowiedź",
                                    Toast.LENGTH_SHORT).show();
                        }
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
                            textView.setText("Koniec testu");

                            buttondalej.setVisibility(View.INVISIBLE);
                            return;
                        }
                        wyswietlPytanie(aktualnyNumer);
                    }
                }
        );
    }

    private void wyswietlPytanie(int i){
        textView.setText(pytanies.get(i).getTrescPytanie());
        imageView.setImageResource(pytanies.get(i).getIdZdejcia());
    }
}