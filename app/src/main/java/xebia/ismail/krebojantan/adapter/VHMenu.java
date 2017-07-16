package xebia.ismail.krebojantan.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import xebia.ismail.krebojantan.R;
import xebia.ismail.krebojantan.activity.DetailMenu;
import xebia.ismail.krebojantan.adapter.model.Menu;

/**
 * Created by Admin on 3/4/2017.
 */
public class VHMenu extends RecyclerView.ViewHolder {

    public String mBoundString;

    TextView title, harga,mins;
    ImageView img_menu;

    public Menu menuss;

    public VHMenu(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.txt_title);
        harga = (TextView) itemView.findViewById(R.id.txt_harga);
        mins = (TextView)itemView.findViewById(R.id.txt_mins);
        img_menu = (ImageView) itemView.findViewById(R.id.img_menu);

        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailMenu.class);
                v.getContext().startActivity(intent);
                //Bundle extras = new Bundle();
                //extras.putInt("position",getAdapterPosition());
                //intent.putExtras(extras);
            }
        });


        itemView.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(v.getContext(), "Kamu Long Click " + getPosition(), Toast.LENGTH_SHORT).show();

                return true;

            }
        });
    }
}
