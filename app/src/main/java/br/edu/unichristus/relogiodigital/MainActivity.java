package br.edu.unichristus.relogiodigital;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextClock tcRelogio;
    TextView tvHoraAtual;
    Button btCapturar;

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

        DeclararComponentes();
        CapturarHora();

    }

    private void CapturarHora() {
        btCapturar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHoraAtual.setText("HORA ATUAL: " + tcRelogio.getText());

            }
        });
    }

    private void DeclararComponentes() {
        tcRelogio = findViewById(R.id.tcRelogio);
        tvHoraAtual = findViewById(R.id.tvHoraAtual);
        btCapturar = findViewById(R.id.btCapturar);

    }


}