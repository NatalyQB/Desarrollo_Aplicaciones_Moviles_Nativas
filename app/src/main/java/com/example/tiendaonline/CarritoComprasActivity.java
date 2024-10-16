package com.example.tiendaonline;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CarritoComprasActivity extends AppCompatActivity {

    private TextView tvMensaje;
    private Button btnComprar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito_compras); // Asegúrate de que el nombre del layout sea correcto

        // Inicializa las vistas
        tvMensaje = findViewById(R.id.tvMensaje);
        btnComprar = findViewById(R.id.btnComprar);

    }
}
