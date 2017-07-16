package xebia.ismail.krebojantan.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

import xebia.ismail.krebojantan.R;
import xebia.ismail.krebojantan.adapter.model.Menu;

/**
 * Created by Admin on 3/4/2017.
 */

public class MenuAdapter extends RecyclerView.Adapter<VHMenu> {

    List<Menu> list = Collections.emptyList();
    Context context;

    public MenuAdapter(List<Menu> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public VHMenu onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        VHMenu holder = new VHMenu(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(VHMenu holder, int position) {
        holder.title.setText(list.get(position).title);
        holder.harga.setText(list.get(position).harga);
        holder.mins.setText(list.get(position).min);
        holder.img_menu.setImageResource(list.get(position).imageId);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // Insert a new item to the RecyclerView
    public void insert(int position, Menu menuss) {
        list.add(position, menuss);
        notifyItemInserted(position);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
