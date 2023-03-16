package sv.edu.utec.ejercicio2_guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    EditText numero;
    Button ingresar;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = findViewById(R.id.edtNum);
        ingresar = findViewById(R.id.btnIngresar);
        resultado = findViewById(R.id.tvResultado);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String num = numero.getText().toString().trim();

                if (num.isEmpty())
                {
                    resultado.setText("Ingrese un número válido.");

                }
                else
                {
                    int cifra = Integer.parseInt(num);
                    int digitos = String.valueOf(cifra).length();

                    if (digitos == 1)
                    {
                        resultado.setText("El número tiene 1 cifra.");
                    }
                    else if (digitos == 2)
                    {
                        resultado.setText("El número tiene 2 cifras.");
                    }
                    else if (digitos == 3)
                    {
                        resultado.setText("El número tiene 3 cifras.");
                    }
                    else
                    {
                        resultado.setText("El número debe tener máximo 3 cifras.");
                    }
                }
            }
        });
    }
}
