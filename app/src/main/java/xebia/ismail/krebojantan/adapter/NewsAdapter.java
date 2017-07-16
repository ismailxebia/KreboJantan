package xebia.ismail.krebojantan.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

import xebia.ismail.krebojantan.R;
import xebia.ismail.krebojantan.adapter.model.News;

/**
 * Created by Admin on 6/21/2017.
 */

public class NewsAdapter extends RecyclerView.Adapter<VHNews> {

    List<News> list = Collections.emptyList();
    Context context;

    public NewsAdapter(List<News> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public VHNews onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        VHNews holder = new VHNews(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(VHNews holder, int position) {
        holder.title.setText(list.get(position).news);
        holder.des.setText(list.get(position).des);
        holder.date.setText(list.get(position).date);
        holder.img_news.setImageResource(list.get(position).imageNews);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    // Insert a new item to the RecyclerView
    public void insert(int position, News menuss) {
        list.add(position, menuss);
        notifyItemInserted(position);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
