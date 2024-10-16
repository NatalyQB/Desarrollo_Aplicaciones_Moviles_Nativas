package com.example.tiendaonline;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CrearProductoActivity extends AppCompatActivity {

    private EditText etCodigo, etNombre, etValor;
    private Button btnGuardarProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_producto);

        etCodigo = findViewById(R.id.etCodigo);
        etNombre = findViewById(R.id.etNombre);
        etValor = findViewById(R.id.etValor);
        btnGuardarProducto = findViewById(R.id.btnGuardarProducto);

        // Configurar el botón de guardar producto
        btnGuardarProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los datos ingresados
                String codigo = etCodigo.getText().toString().trim();
                String nombre = etNombre.getText().toString().trim();
                String valor = etValor.getText().toString().trim();

                // Validar que los campos no estén vacíos
                if (codigo.isEmpty() || nombre.isEmpty() || valor.isEmpty()) {
                    Toast.makeText(CrearProductoActivity.this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí se adiciona para guardar el producto



                    // Mensaje correcto y regresar
                    Toast.makeText(CrearProductoActivity.this, "Producto guardado exitosamente", Toast.LENGTH_SHORT).show();
                    finish(); // Regresar a ListadoProductosActivity
                }
            }
        });
    }
}
