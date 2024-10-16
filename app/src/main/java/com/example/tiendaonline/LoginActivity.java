package com.example.tiendaonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsuario, etContrasena;
    private Button btnIniciarSesion, btnVolver; // Botones de "Iniciar Sesión" y "Volver"
    private TextView tvCrearCuenta; // Texto para la creación de cuenta

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        // Inicialización de las vistas
        etUsuario = findViewById(R.id.etUsuario);
        etContrasena = findViewById(R.id.etContrasena);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        btnVolver = findViewById(R.id.btnVolver);
        tvCrearCuenta = findViewById(R.id.tvCrearCuenta);

        // Configurar  el botón de "Iniciar Sesión"
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = etUsuario.getText().toString().trim();
                String contrasena = etContrasena.getText().toString().trim();

                // Validación simple para comprobar si los campos no están vacíos
                if (usuario.isEmpty() || contrasena.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Aquí se agrega la lógica para verificar las credenciales
                    if (usuario.equals("admin") && contrasena.equals("1234")) { // Ejemplo de credenciales
                        Toast.makeText(LoginActivity.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class); // Navega a la pantalla principal
                        startActivity(intent);
                        finish(); // Finaliza la actividad actual para que no se pueda volver a ella con el botón de retroceso
                    } else {
                        Toast.makeText(LoginActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        // Configurar el botón "Volver"
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Regresa a la actividad anterior (MainActivity)
                finish(); // Esto cierra la LoginActivity y regresa a MainActivity
            }
        });

        // Configurar el texto "¿Aún no tienes una cuenta?"
        tvCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a la pantalla de registro de usuario
                Intent intent = new Intent(LoginActivity.this, RegistroUsuarioActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Acción a realizar cuando se hace clic en el botón de volver
            finish(); //
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
