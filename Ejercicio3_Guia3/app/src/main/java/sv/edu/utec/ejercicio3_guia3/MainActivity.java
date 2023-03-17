package sv.edu.utec.ejercicio3_guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    EditText[] numeros = new EditText[10];
    Button calcular;
    TextView resultado;
    int[] val = new int[10];

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeros[0] = findViewById(R.id.edtNum1);
        numeros[1] = findViewById(R.id.edtNum2);
        numeros[2] = findViewById(R.id.edtNum3);
        numeros[3] = findViewById(R.id.edtNum4);
        numeros[4] = findViewById(R.id.edtNum5);
        numeros[5] = findViewById(R.id.edtNum6);
        numeros[6] = findViewById(R.id.edtNum7);
        numeros[7] = findViewById(R.id.edtNum8);
        numeros[8] = findViewById(R.id.edtNum9);
        numeros[9] = findViewById(R.id.edtNum10);
        resultado = findViewById(R.id.tvResultado);
        calcular = findViewById(R.id.btnCalcular);

        calcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                for (int i=0; i<10; i++)
                {
                    val[i] = Integer.parseInt(numeros[i].getText().toString());
                }

                int suma = 0;

                for (int i=5; i<10; i++)
                {
                    suma += val[i];
                }

                resultado.setText("La suma de los últimos 5 números es: " + suma);
            }
        });
    }
}
