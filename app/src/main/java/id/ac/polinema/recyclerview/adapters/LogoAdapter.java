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

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.R;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class LogoAdapter extends RecyclerView.Adapter<LogoAdapter.ViewHolder>{
    private Context context;
    private List<TeamLogo> items;


    public LogoAdapter(Context context, List<TeamLogo> items) {
        this.context = context;
        this.items = items;
    }

    private  OnLogoClickListener listener;

    public  interface  OnLogoClickListener{
        public  void onClick (View view,int position);

    }

    public  void setListener(OnLogoClickListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_logo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder vh, int position) {
        TeamLogo item = items.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        vh.nameText.setText(item.getName());
        Picasso.get().load(item.getLogo()).into(vh.logoImage);

    }

    @Override
    public int getItemCount() {
        return  (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView  logoImage;
        TextView nameText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
