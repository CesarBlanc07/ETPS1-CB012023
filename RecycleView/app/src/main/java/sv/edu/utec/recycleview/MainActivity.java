package sv.edu.utec.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    RecyclerView recv;
    Adaptador adap;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recv = findViewById(R.id.rvPeliculas);
        recv.setLayoutManager(new LinearLayoutManager(this));
        adap = new Adaptador(this,getListado());
        recv.setAdapter(adap);

        recv.setOnHoverListener(new View.OnHoverListener()
        {
            @Override
            public boolean onHover(View view, MotionEvent motionEvent)
            {
                Toast.makeText(getApplicationContext(), "Seleccionar",Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }


    private ArrayList <Modelo> getListado()
    {
        ArrayList <Modelo> modelos = new ArrayList<>();

        Modelo modelista = new Modelo();
        modelista.setNompeli("Ex-Maquina");
        modelista.setDirecpeli("Andrew Macdonald");
        modelista.setGenepeli("Ciencia Ficción - Suspenso");
        modelista.setImgpeli(String.valueOf(R.drawable.ex_maquina));
        modelista.setClasipeli(3.45);
        modelista.setDurapeli("1 hora 50 minutos");
        modelista.setYearpeli("2015");
        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNompeli("Extraordinario");
        modelista.setDirecpeli("David Hoberman");
        modelista.setGenepeli("Drama - Comedia");
        modelista.setImgpeli(String.valueOf(R.drawable.extraordinario));
        modelista.setClasipeli(3.45);
        modelista.setDurapeli("1 hora 53 minutos");
        modelista.setYearpeli("2017");
        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNompeli("La forma del agua");
        modelista.setDirecpeli("Guillermo del Toro");
        modelista.setGenepeli("Romance - Fantasia");
        modelista.setImgpeli(String.valueOf(R.drawable.forma_agua));
        modelista.setClasipeli(3.45);
        modelista.setDurapeli("2 horas 03 minutos");
        modelista.setYearpeli("2017");
        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNompeli("Interestelar");
        modelista.setDirecpeli("Jonathan Nolan");
        modelista.setGenepeli("Ciencia Ficción - Aventura");
        modelista.setImgpeli(String.valueOf(R.drawable.interestelar));
        modelista.setClasipeli(3.45);
        modelista.setDurapeli("2 horas 49 minutos");
        modelista.setYearpeli("2014");
        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNompeli("Jumanji 'En la selva'");
        modelista.setDirecpeli("Jake Kasdan");
        modelista.setGenepeli("Aventura - Comedia");
        modelista.setImgpeli(String.valueOf(R.drawable.jumanji));
        modelista.setClasipeli(3.45);
        modelista.setDurapeli("1 hora 59 minutos");
        modelista.setYearpeli("2017");
        modelos.add(modelista);

        modelista = new Modelo();
        modelista.setNompeli("La llegada");
        modelista.setDirecpeli("Denis Villeneuve");
        modelista.setGenepeli("Ciencia Ficción - Suspenso");
        modelista.setImgpeli(String.valueOf(R.drawable.la_llegada));
        modelista.setClasipeli(3.45);
        modelista.setDurapeli("1 hora 56 minutos");
        modelista.setYearpeli("2016");
        modelos.add(modelista);

        return modelos;
    }
}