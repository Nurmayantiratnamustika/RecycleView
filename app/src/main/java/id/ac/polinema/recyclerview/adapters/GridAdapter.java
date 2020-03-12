package id.ac.polinema.recyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.recyclerview.R;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class GridAdapter  extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    private Context context;
    private List<TeamLogo> listLogo;

    public GridAdapter(Context context, List<TeamLogo> listLogo) {
        this.context = context;
        this.listLogo = listLogo;
    }


    @NonNull
    @Override
    public GridAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_grid, parent, false);
        return new GridAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.ViewHolder holder, int position) {
        TeamLogo item = listLogo.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        holder.nameText.setText(item.getName());
        Picasso.get().load(item.getLogo()).into(holder.logoImage);
    }

    @Override
    public int getItemCount() {
        return  (listLogo != null) ? listLogo.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.text_name);
            logoImage = itemView.findViewById(R.id.image_logo);
        }
    }
}
