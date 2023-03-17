package sv.edu.utec.ejercicio1_guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText numero;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = findViewById(R.id.edtNum);
        resultado = findViewById(R.id.tvResultado);
    }

    public void Calcular(View v)
    {
        String val = numero.getText().toString();
        int num = Integer.parseInt(val);
        String res1 = "";

        if(num > 0)
        {
            res1 = "Es un numero positivo";
        }
        if(num < 0)
        {
            res1 = "Es un numero negativo";
        }
        if(num == 0)
        {
            res1 = "Es nulo";
        }

        resultado.setText(res1);
    }
}