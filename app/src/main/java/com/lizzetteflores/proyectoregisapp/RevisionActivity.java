package com.lizzetteflores.proyectoregisapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RevisionActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revision);

        // Inicializa los TextViews para mostrar los encabezados
        TextView encabezado = findViewById(R.id.encabezado_asistencia);
        encabezado.setText("Registro de Asistencia");

        // Inicializa otros TextViews para mostrar información
        TextView asignatura = findViewById(R.id.asignatura);
        asignatura.setText("Asignatura: Software");

        TextView fecha = findViewById(R.id.fecha);
        fecha.setText("Fecha: 19/12/2024");

        TextView aula = findViewById(R.id.aula);
        aula.setText("Aula: 101");

        TextView totalMujeres = findViewById(R.id.total_mujeres);
        totalMujeres.setText("Total Mujeres: 20");

        TextView totalVarones = findViewById(R.id.total_varones);
        totalVarones.setText("Total Varones: 15");

    }
}

