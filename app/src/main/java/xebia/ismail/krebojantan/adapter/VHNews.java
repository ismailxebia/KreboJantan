package xebia.ismail.krebojantan.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import xebia.ismail.krebojantan.R;
import xebia.ismail.krebojantan.adapter.model.News;

/**
 * Created by Admin on 3/4/2017.
 */
public class VHNews extends RecyclerView.ViewHolder {

    public String mBoundString;

    TextView title, des,date;
    ImageView img_news;

    public News menuss;

    public VHNews(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.txt_news);
        des = (TextView) itemView.findViewById(R.id.txt_des);
        date = (TextView)itemView.findViewById(R.id.txt_date);
        img_news = (ImageView) itemView.findViewById(R.id.img_news);

        /*
        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MusicActivity.class);
                v.getContext().startActivity(intent);
                //Bundle extras = new Bundle();
                //extras.putInt("position",getAdapterPosition());
                //intent.putExtras(extras);
            }
        });

        */

        itemView.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(v.getContext(), "Kamu Long Click " + getPosition(), Toast.LENGTH_SHORT).show();

                return true;

            }
        });
    }
}
