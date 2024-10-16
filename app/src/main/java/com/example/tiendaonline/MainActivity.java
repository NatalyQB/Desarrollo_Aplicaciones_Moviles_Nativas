package com.example.tiendaonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnListadoProductos;
    private Button btnRegistro;
    private Button btnCarrito; // Declaración del botón de carrito

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias de los botones
        initializeButtons();

        // Configuración de listeners para los botones
        setupButtonListeners();
    }

    private void initializeButtons() {
        btnLogin = findViewById(R.id.btnLogin);
        btnListadoProductos = findViewById(R.id.btnListadoProductos);
        btnRegistro = findViewById(R.id.btnRegistroClientes);
        btnCarrito = findViewById(R.id.btnCarritoCompras); // Asegúrate de que esté definido en activity_main.xml
    }

    private void setupButtonListeners() {
        // Listener para el botón de Login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToActivity(LoginActivity.class);
            }
        });

        // Listener para el botón de Listado de Productos
        btnListadoProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToActivity(ListadoProductosActivity.class);
            }
        });

        // Listener para el botón de Registro
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToActivity(TercerosActivity.class);
            }
        });

        // Listener para el botón de Carrito de Compras
        btnCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToActivity(CarritoComprasActivity.class);
            }
        });
    }

    private void navigateToActivity(Class<?> targetActivity) {
        Intent intent = new Intent(MainActivity.this, targetActivity);
        startActivity(intent);
    }
}
