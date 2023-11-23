package com.gustavo.aplicativo_de_converso;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void conversaokm(View view){
        EditText valor = findViewById(R.id.valor);
        TextView r1 = findViewById(R.id.textResultado1);
        int v = Integer.parseInt(valor.getText().toString());
        r1.setText("Valor:" + String.valueOf(v / 1000) + "km");
    }

    public void conversaot(View view){
        EditText valor = findViewById(R.id.valor);
        TextView r2 = findViewById(R.id.textResultado2);
        int v2 = Integer.parseInt(valor.getText().toString());
        r2.setText("Valor:" + String.valueOf(v2 / 1000) + "t");
    }

}