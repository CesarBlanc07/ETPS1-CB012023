package sv.edu.utec.IntroduccionProy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText val1, val2;
    Button btnCalculo;
    TextView resultado1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1=findViewById(R.id.edtValor1);
        val2=findViewById(R.id.edtValor2);
        resultado1=findViewById(R.id.txvResultado);
    }

    //void = metodos sin retorno
    //int, string, double, etc = metodos con retorno

    public void suma(View view)
    {
        double dato1, dato2, resultado2;

        dato1 = Double.parseDouble(val1.getText().toString());
        dato2 = Double.parseDouble(val2.getText().toString());
        resultado2 = dato1 + dato2;
        resultado1.setText("El resultado es: " + String.valueOf(resultado2));

    }

    public void resta(View view)
    {
        double dato1, dato2, resultado2;

        dato1 = Double.parseDouble(val1.getText().toString());
        dato2 = Double.parseDouble(val2.getText().toString());
        resultado2 = dato1 - dato2;
        resultado1.setText("El resultado es: " + String.valueOf(resultado2));

    }

    public void multi(View view)
    {
        double dato1, dato2, resultado2;

        dato1 = Double.parseDouble(val1.getText().toString());
        dato2 = Double.parseDouble(val2.getText().toString());
        resultado2 = dato1 * dato2;
        resultado1.setText("El resultado es: " + String.valueOf(resultado2));

    }

    public void dividir(View view)
    {
        double dato1, dato2, resultado2;

        dato1 = Double.parseDouble(val1.getText().toString());
        dato2 = Double.parseDouble(val2.getText().toString());
        resultado2 = dato1 / dato2;
        resultado1.setText("El resultado es: " + String.valueOf(resultado2));

    }
}