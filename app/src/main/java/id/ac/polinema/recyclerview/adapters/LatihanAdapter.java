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
import id.ac.polinema.recyclerview.models.News;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class LatihanAdapter extends RecyclerView.Adapter<LatihanAdapter.ViewHolder> {
    private Context context;
    private List<News> newsList;
    private static final int LOGO_PUTIH = 1;
    private static final int LOGO_ABU = 2;


    public LatihanAdapter(Context context, List<News> newsList) {
        this.context = context;
        this.newsList = newsList;
    }


    @NonNull
    @Override
    public LatihanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        if(viewType == LOGO_PUTIH){
            view = LayoutInflater.from(context).inflate(R.layout.item_latihan_putih,parent,false);
        }
        else if(viewType ==LOGO_ABU){
            view = LayoutInflater.from(context).inflate(R.layout.item_latihan_abu,parent,false);
        }
        return  new LatihanAdapter.ViewHolder(view);
    }

    @Override
    public int getItemViewType(int position){
        return  (position %4 == 0 || position %4 == 3) ? LOGO_ABU : LOGO_PUTIH;
    }

    @Override
    public void onBindViewHolder(@NonNull LatihanAdapter.ViewHolder holder, int position) {
        News item = newsList.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        holder.berita.setText(item.getBeritanya());
        holder.namastasiun.setText(item.getStasiun());
        Picasso.get().load(item.getLogonews()).into(holder.logoNews);
    }

    @Override
    public int getItemCount() {
        return  (newsList != null) ? newsList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView berita;
        ImageView logoNews;
        TextView namastasiun;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            berita = itemView.findViewById(R.id.berita);
            logoNews  = itemView.findViewById(R.id.image_logo);
            namastasiun = itemView.findViewById(R.id.stasiun);
        }
    }
}
