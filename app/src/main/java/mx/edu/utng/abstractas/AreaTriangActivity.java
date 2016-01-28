package mx.edu.utng.abstractas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by David Moreno on 27/01/2016.
 */
public class AreaTriangActivity extends Activity {

    private Triangulo triangulo;
    private EditText edtBase;
    private EditText edtAltura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_triangulo_layout);
        triangulo = new Triangulo();
        edtBase = (EditText)findViewById(R.id.edt_base);
        edtAltura = (EditText)findViewById(R.id.edt_altura);
    }

    public void calcularTriangulo(View view){
        float base = Float.parseFloat(edtBase.getText().toString());
        float altura = Float.parseFloat(edtAltura.getText().toString());
        triangulo.setBase(base);
        triangulo.setAltura(altura);
        Toast.makeText(this, "Area de triangulo: "+ triangulo.calcularArea(), Toast.LENGTH_SHORT).show();
    }

    public void calcularCuadrado(View v){

        Intent regresar = new Intent(this, AreasActivity.class);
        startActivity(regresar);
    }
}
