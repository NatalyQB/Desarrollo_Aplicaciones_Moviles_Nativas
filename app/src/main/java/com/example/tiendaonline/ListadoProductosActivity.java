package com.example.tiendaonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ListadoProductosActivity extends AppCompatActivity {

    private Button btnCrearProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_productos); // Asegúrate de que sea el nombre correcto del layout

        btnCrearProducto = findViewById(R.id.btnCrearProducto); // Referencia al botón

        // Configurar el listener para el botón "Crear Producto"
        btnCrearProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para abrir CrearProductoActivity
                Intent intent = new Intent(ListadoProductosActivity.this, CrearProductoActivity.class);
                startActivity(intent);
            }
        });
    }
}
