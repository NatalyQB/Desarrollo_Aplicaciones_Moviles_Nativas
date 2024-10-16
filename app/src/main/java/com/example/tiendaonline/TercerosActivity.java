package com.example.tiendaonline;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TercerosActivity extends AppCompatActivity {

    private EditText etNombre, etApellido, etNit, etTelefono, etCorreo;
    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceros);

        // Referencias a los campos de entrada
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etNit = findViewById(R.id.etNit);
        etTelefono = findViewById(R.id.etTelefono);
        etCorreo = findViewById(R.id.etCorreo);
        btnRegistrar = findViewById(R.id.btnRegistrar);


        // Configuración del listener para el botón de registro
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener datos de los campos
                String nombre = etNombre.getText().toString().trim();
                String apellido = etApellido.getText().toString().trim();
                String nit = etNit.getText().toString().trim();
                String telefono = etTelefono.getText().toString().trim();
                String correo = etCorreo.getText().toString().trim();

                // Validación simple
                if (nombre.isEmpty() || apellido.isEmpty() || nit.isEmpty() || telefono.isEmpty() || correo.isEmpty()) {
                    Toast.makeText(TercerosActivity.this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí se adiciona la lógica para guardar los datos en tu base de datos
                    Toast.makeText(TercerosActivity.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
                    // Opcional: Navegar a otra actividad después del registro
                    finish(); // Regresar a la actividad anterior
                }
            }
        });

    }
}
