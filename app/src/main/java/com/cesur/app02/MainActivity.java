package com.cesur.app02;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView imagen;
    private Switch mostrarLogo;

    private EditText nuevoAlumno;
    private Button insertarAlumno;
    private Spinner listadoAlumnos;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imagen = (ImageView) findViewById(R.id.imageView);
        mostrarLogo = (Switch) findViewById(R.id.switch1);
        nuevoAlumno = (EditText) findViewById(R.id.nuevoAlumno);
        insertarAlumno = (Button) findViewById(R.id.insertarAlumno);
        listadoAlumnos = (Spinner) findViewById(R.id.listaAlumnos);

        String[] alumnos = new String[10];
        alumnos[0]="listado vacío";
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alumnos);
        listadoAlumnos.setAdapter(adapter);

        // evento programado directamente.
        mostrarLogo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mostrarLogo.isChecked()){
                            imagen.setVisibility(View.VISIBLE);
                        } else {
                            imagen.setVisibility(View.INVISIBLE);
                        }
                    }
                }

        );

    }
}