package com.example.tiendaonline;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroUsuarioActivity extends AppCompatActivity {

    private EditText etNombre, etApellido, etCorreo, etClave;
    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        // Inicialización de las vistas
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etCorreo = findViewById(R.id.etCorreo);
        etClave = findViewById(R.id.etClave);
        btnRegistrar = findViewById(R.id.btnRegistrar);


        // Configurar  el botón "Registrar"
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = etNombre.getText().toString().trim();
                String apellido = etApellido.getText().toString().trim();
                String correo = etCorreo.getText().toString().trim();
                String clave = etClave.getText().toString().trim();

                // Validación simple para comprobar si los campos no están vacíos
                if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || clave.isEmpty()) {
                    Toast.makeText(RegistroUsuarioActivity.this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí se agrega la lógica para registrar el usuario en la base de datos
                    Toast.makeText(RegistroUsuarioActivity.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
                    finish(); //
                }
            }
        });
    }
}
