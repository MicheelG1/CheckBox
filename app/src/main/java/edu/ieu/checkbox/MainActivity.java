package edu.ieu.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox seleccionDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seleccionDireccion = (CheckBox) findViewById(R.id.seleccion_direccion_envio);
    }

    public void loguearCheckbox(View v){
        String s = "Estado: " + (seleccionDireccion.isChecked() ? "Marcado" : "No marcado");
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}