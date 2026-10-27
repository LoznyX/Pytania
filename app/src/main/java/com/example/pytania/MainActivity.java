package com.example.pytania;

import static android.view.View.INVISIBLE;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Pytanie> pytania;
private TextView textView;
private ImageView imageView;
private Button buttonTak,buttonNie,buttonDalej;
private  int aktualne =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        dodajPytanie();
        textView = findViewById(R.id.textViewPytanie);
        buttonTak = findViewById(R.id.button2);
        buttonNie = findViewById(R.id.button);
        buttonDalej = findViewById(R.id.button6);
        imageView = findViewById(R.id.imageView);

        wpiszPytanie(0);
        buttonDalej.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        aktualne++;
                        if(aktualne ==pytania.size()) {
                            buttonDalej.setVisibility(INVISIBLE);
                            //TODO: wypisz wyniku
                        } else {
                            wpiszPytanie(aktualne);
                        }
                        wpiszPytanie(aktualne);
                    }
                }
        );

    }
    private  void wpiszPytanie(int ktore) {
        Pytanie pytanko = pytania.get(ktore);
        textView.setText(pytanko.getTrescPytania());
        imageView.setImageResource((int) pytanko.getIdZdjecia());
    }
    private void dodajPytanie() {
        pytania = new ArrayList<>();
        pytania.add(new Pytanie(R.drawable.szynszyla, "Czy to jest szynszyla?",true));
        pytania.add(new Pytanie(R.drawable.axolotl,"czy to jest axolotl?",true));
        pytania.add(new Pytanie(R.drawable.zebra,"czy to zebra?",true));
    }
}