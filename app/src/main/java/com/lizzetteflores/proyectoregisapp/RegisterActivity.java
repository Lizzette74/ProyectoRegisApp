package com.lizzetteflores.proyectoregisapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class RegisterActivity extends AppCompatActivity {

    private EditText editTextAsistencia;
    private EditText editTextFecha;
    private EditText editTextHora;
    private EditText editTextAula;
    private final ThreadLocal<Button> buttonEnviar = new ThreadLocal<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextAsistencia = findViewById(R.id.editTextAsistencia);
        editTextFecha = findViewById(R.id.editTextFecha);
        editTextHora = findViewById(R.id.editTextHora);
        editTextAula = findViewById(R.id.editTextAula);
        buttonEnviar.set(findViewById(R.id.buttonEnviar));

        // Configura el listener para el botón Enviar
        Objects.requireNonNull(buttonEnviar.get()).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarDatos();
            }
        });
    }

    private void enviarDatos() {
        // Obtiene los valores ingresados por el usuario
        String asistencia = editTextAsistencia.getText().toString().trim();
        String fecha = editTextFecha.getText().toString().trim();
        String hora = editTextHora.getText().toString().trim();
        String aula = editTextAula.getText().toString().trim();

        // Verifica que todos los campos estén llenos
        if (asistencia.isEmpty() || fecha.isEmpty() || hora.isEmpty() || aula.isEmpty()) {
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        // Aquí puedes agregar la lógica para enviar los datos a un servidor o base de datos

        // Muestra un mensaje de éxito
        Toast.makeText(this, "Datos enviados correctamente", Toast.LENGTH_SHORT).show();

        // Limpia los campos después de enviar
        editTextAsistencia.setText("");
        editTextFecha.setText("");
        editTextHora.setText("");
        editTextAula.setText("");
    }
        }





