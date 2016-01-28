package mx.edu.utng.abstractas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import mx.edu.utng.*;
/**
 * Created by David Moreno on 22/01/2016.
 */
public class AreasActivity extends Activity {

    private Cuadrado cuadrado;
    private EditText edtLado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areas_layout);
        cuadrado = new Cuadrado();
        edtLado = (EditText)findViewById(R.id.edt_lado);
    }

    public void calcular(View view){
        float lado = Float.parseFloat(edtLado.getText().toString());
        cuadrado.setLado(lado);
        Toast.makeText(this, "Area de cuadradro: "+cuadrado.calcularArea(), Toast.LENGTH_SHORT).show();
    }

    public void SiguienteAc(View v){

           Intent siguiente = new Intent(this, AreaTriangActivity.class);
             startActivity(siguiente);
    }

}
