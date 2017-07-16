package xebia.ismail.krebojantan.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.freegeek.android.materialbanner.MaterialBanner;
import com.freegeek.android.materialbanner.holder.ViewHolderCreator;
import com.freegeek.android.materialbanner.view.indicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.List;

import xebia.ismail.krebojantan.R;
import xebia.ismail.krebojantan.adapter.ImageHolderView;
import xebia.ismail.krebojantan.adapter.model.BannerData;

/**
 * Created by Admin on 7/3/2017.
 */

public class DetailMenu extends AppCompatActivity {

    private RelativeLayout banner;

    private String[] texts = {"Grilled Egg","Omelet with Sauce","Chicken Stick","Dark Vegetable"};
    private String[] desc = {"Happy Ramadhan and ied mubarak 2017",
            "Get Discount 20% for buy 2 Grilled Egg",
            "Chicken Stick only Rp. 12.000 on weekend",
            "Happy Happy on Ramadhan"};

    private String[] images = {"http://www.nationalgeographic.com/content/dam/photography/photos/000/570/57046.jpg",
            "http://finedinelove.com/wp-content/uploads/2015/03/Featured-Image-for-FDL-Food-Photography.jpg",
            "https://www.usnews.com/dims4/USNEWS/5cbebeb/2147483647/thumbnail/970x647/quality/85/?url=%2Fcmsmedia%2F0c%2F8c%2Fb7e9682e46d0bc5fa911e1096597%2F140924-cookingteam-stock.jpg",
            "http://www.editions-solal.fr/wp-content/uploads/2016/08/hygiene-alimentaire.jpg"
    };
    private TextView btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmenu);

        List<BannerData> bannerData = new ArrayList<>();
        for (int i = 0; i < images.length; i++) {
            BannerData data = new BannerData();
            data.setTitle(texts[i]);
            data.setDesc(desc[i]);
            data.setUrl(images[i]);
            bannerData.add(data);
        }

        MaterialBanner materialBanner = (MaterialBanner)findViewById(R.id.material_banner);
        materialBanner.setPages(new ViewHolderCreator() {
            @Override
            public Object createHolder() {
                return new ImageHolderView();
            }
        },bannerData);
        //set indicator
        materialBanner.setIndicator(new CirclePageIndicator(this));

    }
}
