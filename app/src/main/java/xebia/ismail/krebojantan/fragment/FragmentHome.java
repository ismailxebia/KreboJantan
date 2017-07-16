package xebia.ismail.krebojantan.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.freegeek.android.materialbanner.MaterialBanner;
import com.freegeek.android.materialbanner.holder.ViewHolderCreator;
import com.freegeek.android.materialbanner.view.indicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.List;

import xebia.ismail.krebojantan.AllMenu;
import xebia.ismail.krebojantan.R;
import xebia.ismail.krebojantan.adapter.ImageHolderView;
import xebia.ismail.krebojantan.adapter.MenuAdapter;
import xebia.ismail.krebojantan.adapter.NewsAdapter;
import xebia.ismail.krebojantan.adapter.model.BannerData;
import xebia.ismail.krebojantan.adapter.model.Menu;
import xebia.ismail.krebojantan.adapter.model.News;

/**
 * Created by Admin on 6/17/2017.
 */

public class FragmentHome extends Fragment {

    private MenuAdapter menuadapter;
    private NewsAdapter newsAdapter;

    private ImageView btn_drawer;
    private TextView title,btn_moree;
    private RelativeLayout banner;
    private LinearLayout lltxt1,lltxt2;
    private RecyclerView listmenu,listnews;

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

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        btn_drawer = (ImageView)v.findViewById(R.id.btn_drawer);
        title = (TextView)v.findViewById(R.id.titlee);
        banner = (RelativeLayout)v.findViewById(R.id.banner);
        lltxt1 = (LinearLayout)v.findViewById(R.id.lltext1);
        lltxt2 = (LinearLayout)v.findViewById(R.id.lltext2);
        listmenu = (RecyclerView)v.findViewById(R.id.rv_menu);
        listnews = (RecyclerView)v.findViewById(R.id.rv_news);

        btn_moree = (TextView)v.findViewById(R.id.btn_more);
        btn_moree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),AllMenu.class);
                startActivity(intent);
            }
        });
        Animate();

        List<BannerData> bannerData = new ArrayList<>();
        for (int i = 0; i < images.length; i++) {
            BannerData data = new BannerData();
            data.setTitle(texts[i]);
            data.setDesc(desc[i]);
            data.setUrl(images[i]);
            bannerData.add(data);
        }

        MaterialBanner materialBanner = (MaterialBanner) v.findViewById(R.id.material_banner);
        materialBanner.setPages(new ViewHolderCreator() {
            @Override
            public Object createHolder() {
                return new ImageHolderView();
            }
        },bannerData);
        //set indicator
        materialBanner.setIndicator(new CirclePageIndicator(getContext()));

        //RecyclerView

        final List<Menu> menus = data_menu();
        listmenu.setHasFixedSize(true);
        menuadapter = new MenuAdapter(menus, getActivity());
        listmenu.setAdapter(menuadapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        listmenu.setLayoutManager(layoutManager);

        final List<News> newses = data_news();
        listnews.setHasFixedSize(true);
        newsAdapter = new NewsAdapter(newses, getActivity());
        listnews.setAdapter(newsAdapter);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getActivity());
        layoutManager2.setOrientation(LinearLayoutManager.VERTICAL);
        listnews.setLayoutManager(layoutManager2);

        return v;
    }

    private void Animate() {
        Animation popeup1 = AnimationUtils.loadAnimation(getActivity(), R.anim.popeup);
        Animation popeup2 = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_up);
        Animation popeup3 = AnimationUtils.loadAnimation(getActivity(), R.anim.showin);
        Animation showup = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);
        popeup1.setStartOffset(300);
        popeup2.setStartOffset(350);
        popeup3.setStartOffset(250);
        showup.setStartOffset(300);
        btn_drawer.startAnimation(popeup1);
        title.startAnimation(popeup2);
        banner.startAnimation(popeup3);
        lltxt1.startAnimation(popeup3);
        listmenu.startAnimation(showup);
        lltxt2.startAnimation(popeup3);
    }

    private List<Menu> data_menu() {

        List<Menu> menu = new ArrayList<>();
        menu.add(new Menu("Pancake Black Chocolate","10 mins","Rp 40.000",R.drawable.menuc));
        menu.add(new Menu("Tomate of Burger","5 mins","Rp. 20.000",R.drawable.menua));
        menu.add(new Menu("Mirian Desert Noodles","5 mins","Rp 25.000",R.drawable.menub));
        menu.add(new Menu("Gado Gado Special","7 mins","Rp 20.000",R.drawable.menud));
        menu.add(new Menu("Green Tea Atlantis","2 mins","Rp 10.000",R.drawable.menue));

        return menu;
    }

    private List<News> data_news() {
        List<News> news = new ArrayList<>();
        news.add(new News("Cabang Baru !","Dengan diadakan bukber bersama dalam rangka peresmian gedung baru krebo jantan kami turut bahagia","2 Days Ago",R.drawable.menua));
        news.add(new News("Update Aplikasi","di aplikasi krebo jantan versi 1.2 ini di sediakan fitur rasa yang tertera pada makanan tersebut jadi user bisa","4 Days Ago",R.drawable.menub));
        news.add(new News("Selamat Idul Fitri","Seluruh staff dan karyawan mengucapkan minal aizin wal faidzin","8 Days Ago",R.drawable.menuc));
        return news;
    }
}