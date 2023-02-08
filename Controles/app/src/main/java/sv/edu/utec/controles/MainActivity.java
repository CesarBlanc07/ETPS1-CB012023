package sv.edu.utec.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText edtValor, edtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValor = findViewById(R.id.edtTabla);
        edtResultado = findViewById(R.id.edtMTabla);
    }

    public void Tabla(View V)
    {
        int ValorTabla = Integer.parseInt(edtValor.getText().toString());
        int ResultadoTabla2;
        String ResultadoTabla = "";
        edtResultado.setText(ResultadoTabla);

        for(int i = 0; i <= 10; i++)
        {
            ResultadoTabla2 = ValorTabla * i;
            ResultadoTabla = String.valueOf(ResultadoTabla2);
            edtResultado.append(ValorTabla + "*" + i + "=" + ResultadoTabla + "\n");
        }
    }
}