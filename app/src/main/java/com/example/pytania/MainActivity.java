package com.example.pytania;

import android.os.Bundle;
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