package id.sch.smktelkom_mlg.project.xirpl203122130.ngantin.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl203122130.ngantin.R;
import id.sch.smktelkom_mlg.project.xirpl203122130.ngantin.model.Kantin;

/**
 * Created by AngganaApsari on 30/11/2016.
 */
public class KantinAdapter extends RecyclerView.Adapter<KantinAdapter.ViewHolder> {
    ArrayList<Kantin> kantinList;

    public KantinAdapter(ArrayList<Kantin> kantinList) {
        this.kantinList = kantinList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Kantin kantin = kantinList.get(position);
        holder.tvJudul.setText(kantin.judul);
        holder.ivFoto.setImageDrawable(kantin.foto);
    }

    @Override
    public int getItemCount() {
        if (kantinList != null)
            return kantinList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
        }
    }
}
