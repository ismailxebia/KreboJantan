package xebia.ismail.krebojantan.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

import xebia.ismail.krebojantan.R;

/**
 * Created by Admin on 2/24/2017.
 */

public class AdapterTrashed extends RecyclerView.Adapter<ViewHolder>{

    List<ModelTrashed> list = Collections.emptyList();
    Context context;

    public AdapterTrashed(List<ModelTrashed> list,Context context){
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycled, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder (ViewHolder holder,int position) {
        holder.kilogram.setText(list.get(position).kg);
        holder.detail.setText(list.get(position).detail);
        holder.point.setText(list.get(position).point);
        holder.banksampah.setImageResource(list.get(position).imageId);

        //animate(holder);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // Insert a new item to the RecyclerView
    public void insert(int position, ModelTrashed data) {
        list.add(position, data);
        notifyItemInserted(position);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
