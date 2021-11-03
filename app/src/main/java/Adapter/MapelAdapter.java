package Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ofcourse.R;

import java.util.ArrayList;

import Model.Mapel;

public class MapelAdapter extends RecyclerView.Adapter<MapelAdapter.MapelViewHolder> {

    //VIEW HOLDER
    public class MapelViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama_guru, tvNama_mapel, tvLokasi, tvScore;

        public MapelViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama_guru = itemView.findViewById(R.id.nama_guru);
            tvNama_mapel = itemView.findViewById(R.id.nama_mapel);
            tvLokasi = itemView.findViewById(R.id.lokasi);
            tvScore = itemView.findViewById(R.id.score);
        }
    }

    //UNTUK DATA YANG AKAN DITAMPILKAN
    ArrayList<Mapel> listMapel = new ArrayList<>();

    public void setListMapel(ArrayList<Mapel> listMapel) {
        this.listMapel = listMapel;
        notifyDataSetChanged();
    }

    //METHOD ADAPTER
    @NonNull
    @Override
    public MapelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_listmapel_item,parent,false);
        MapelViewHolder viewHolder = new MapelViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MapelViewHolder viewHolder, int position) {
        Mapel mapel = listMapel.get(position);
        viewHolder.tvNama_guru.setText(mapel.nama_guru);
        viewHolder.tvNama_mapel.setText(mapel.nama_mapel);
        viewHolder.tvLokasi.setText(mapel.lokasi);
        viewHolder.tvScore.setText(mapel.score);
    }

    @Override
    public int getItemCount() {
        return listMapel.size();
    }


}
