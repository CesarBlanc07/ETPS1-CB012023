package sv.edu.utec.ejercicio4_guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    EditText Valores;
    Button Calcular;
    TextView Negativos, Positivos, Multiplos, Pares;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Valores = findViewById(R.id.edtValores);
        Calcular = findViewById(R.id.btnCalcular);
        Negativos = findViewById(R.id.tvNegativos);
        Positivos = findViewById(R.id.tvPositivos);
        Multiplos = findViewById(R.id.tvMultiplo);
        Pares = findViewById(R.id.tvPares);

        Calcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String val = Valores.getText().toString();
                String[] cantidad = val.split(",");
                int neg = 0, pos = 0, mul = 0, par = 0;

                for(int i = 0; i < cantidad.length; i++)
                {
                    int valor = Integer.parseInt(cantidad[i].trim());

                    if(valor < 0)
                    {
                        neg++;
                    }
                    else
                    {
                        pos++;
                    }

                    if(valor % 15 == 0)
                    {
                        mul++;
                    }

                    if(valor % 2 == 0)
                    {
                        par += valor;
                    }
                }

                Negativos.setText("Negativos: " + neg);
                Positivos.setText("Positivos: " + pos);
                Multiplos.setText("Multiplos de 15: " + mul);
                Pares.setText("Acumulado de pares: " + par);
            }
        });
    }
}