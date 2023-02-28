package sv.edu.utec.controleslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Spinner spPais;
    EditText etNombre, etApellido, etInfo;
    RadioButton rbMas, rbFem, rbOtros;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.edtNombre);
        etApellido = findViewById(R.id.edtApellido);
        etInfo = findViewById(R.id.edtMInfo);
        spPais = findViewById(R.id.spnPais);
        rbMas = findViewById(R.id.rbMasculino);
        rbFem = findViewById(R.id.rbFemenino);
        rbOtros = findViewById(R.id.rbOtros);

        /* Forma 1

        spPais.setSelection(0, false);
        String[]opciones = {"Seleccione un pais","Guatemala","El Salvador","Honduras","Nicaragua","Costa Rica","Panama"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, opciones);

        spPais.setAdapter(adaptador);
         */

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item)
        {
            public View getView(int posicion, View contenido, ViewGroup parent)
            {
                View vista = super.getView(posicion, contenido, parent);

                if(posicion == getCount())
                {
                    ((TextView)vista.findViewById(android.R.id.text1)).setText("");
                    ((TextView)vista.findViewById(android.R.id.text1)).setHint(getItem(getCount()));
                }

                return vista;
            }

            public int getCount()
            {
                return super.getCount() - 1;
            }
        };

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adaptador.add("Guatemala");
        adaptador.add("El Salvador");
        adaptador.add("Honduras");
        adaptador.add("Nicaragua");
        adaptador.add("Costa Rica");
        adaptador.add("Panamá");
        adaptador.add("Seleccione un pais"); //<--- Este es el elemento a quitar del spinner con este metodo

        spPais.setAdapter(adaptador);
        spPais.setSelection(adaptador.getCount());
    }

    public void almacenar(View v)
    {
        String datos = "";
        String seleccion = spPais.getSelectedItem().toString();
        String nombre = etNombre.getText().toString();
        String apellido = etApellido.getText().toString();
        String genero = "";
        String info;

        if (rbMas.isChecked() == false && rbFem.isChecked() == false && rbOtros.isChecked() == false)
        {
            Toast mensaje = Toast.makeText(this, "Seleccione un genero", Toast.LENGTH_LONG);
            mensaje.show();
        }

        if(rbMas.isChecked() == true)
        {
            genero = "Masculino";
        }
        else if(rbFem.isChecked() == true)
        {
            genero = "Femenino";
        }
        else if(rbOtros.isChecked() == true)
        {
            genero = "Otros";
        }


        if(seleccion.equals("Seleccione un pais"))
        {
            datos = "No selecciono ningún país";
            etInfo.append(datos);
        }
        else if(seleccion.equals("Guatemala"))
        {
            datos = "Guatemala";
            etInfo.append(datos);
        }
        else if(seleccion.equals("El Salvador"))
        {
            datos = "El Salvador";
            etInfo.append(datos);
        }
        else if(seleccion.equals("Honduras"))
        {
            datos = "Honduras";
            etInfo.append(datos);
        }
        else if(seleccion.equals("Nicaragua"))
        {
            datos = "Nicaragua";
            etInfo.append(datos);
        }
        else if(seleccion.equals("Costa Rica"))
        {
            datos = "Costa Rica";
            etInfo.append(datos);
        }
        else if(seleccion.equals("Panama"))
        {
            datos = "Panama";
            etInfo.append(datos);
        }

        info = "\n Los datos ingresados son los siguientes \n" +
                "Nombre       : " + nombre + "\n" +
                "Apellido     : " + apellido + "\n" +
                "Genero       : " + genero + "\n" +
                "Pais         : " + datos + "\n";

        etInfo.append(info);
    }
}