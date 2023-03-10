package sv.edu.utec.foodapp.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import sv.edu.utec.foodapp.R;

public class MainActivity extends AppCompatActivity
{

    ConstraintLayout btnInicial;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInicial = findViewById(R.id.btnInicio);
        nombre = findViewById(R.id.edtNombre);

        btnInicial.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(new Intent(getApplicationContext(),Principal.class));
                i.putExtra("Usuario",nombre.getText().toString());
                startActivity(i);
            }
        });
    }
}