package sv.edu.utec.foodapp.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import sv.edu.utec.foodapp.R;

public class Principal extends AppCompatActivity
{
    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Bundle bundle = getIntent().getExtras();
        mensaje = findViewById(R.id.txvUsuario);

        String info = "Hola, " + bundle.getString("Usuario");
        mensaje.setText(info);
    }
}