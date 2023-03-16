package sv.edu.utec.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Elementos extends RecyclerView.ViewHolder
{
    static TextView tvnompeli, tvgenpeli;
    static ImageView imvpeli;

    public Elementos(@NonNull View itemView)
    {
        super(itemView);

        tvnompeli = itemView.findViewById(R.id.tvTitulo);
        tvgenpeli = itemView.findViewById(R.id.tvGenero);
        imvpeli = itemView.findViewById(R.id.imvPelicula1);
    }
}
