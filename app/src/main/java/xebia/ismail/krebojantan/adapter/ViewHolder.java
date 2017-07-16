package xebia.ismail.krebojantan.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import xebia.ismail.krebojantan.R;

/**
 * Created by Admin on 2/24/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public String mBoundString;

    CardView cv;
    TextView kilogram, detail,point;
    ImageView banksampah;

    public ModelTrashed data;

    ViewHolder(View itemView) {
        super(itemView);
        kilogram = (TextView) itemView.findViewById(R.id.kg);
        detail = (TextView) itemView.findViewById(R.id.detail_data);
        point = (TextView) itemView.findViewById(R.id.point);
        banksampah = (ImageView) itemView.findViewById(R.id.img_bs);

        //itemView.setOnClickListener(new View.OnClickListener() {

          //  @Override
            //public void onClick(View v) {
              //  Intent intent = new Intent(v.getContext(), DetailActivity.class);
                //v.getContext().startActivity(intent);
                //Bundle extras = new Bundle();
                //extras.putInt("position",getAdapterPosition());
                //intent.putExtras(extras);
                //Toast.makeText(v.getContext(), "Kamu Click " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
            //}
        //});

        itemView.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(v.getContext(), "Kamu Long Click " + getPosition(), Toast.LENGTH_SHORT).show();

                return true;

            }
        });
    }
}
