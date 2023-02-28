package sv.edu.utec.proyectolistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity
{

    Button btnmensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnmensaje = findViewById(R.id.btnToast);
        btnmensaje.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast toastp = new Toast(getApplicationContext());
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.lytMensaje));

                TextView txtmensaje = (TextView) layout.findViewById(R.id.textView3);
                txtmensaje.setText("Soy el mensaje");

                toastp.setDuration(Toast.LENGTH_LONG);
                toastp.setView(layout);
                toastp.show();
            }
        });
    }
}