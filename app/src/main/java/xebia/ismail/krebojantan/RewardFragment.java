package xebia.ismail.krebojantan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Admin on 1/11/2017.
 */

public class RewardFragment extends Fragment {

    ImageView img1;
    EditText a,b;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.login, container, false);
        img1 = (ImageView)v.findViewById(R.id.img1);
        a = (EditText)v.findViewById(R.id.editTextUserName);
        b = (EditText)v.findViewById(R.id.editTextPassword);
        Animate();
        return v;
    }

    private void Animate() {
        Animation popeup1 = AnimationUtils.loadAnimation(getActivity(), R.anim.slow_fadein);
        Animation popeup2 = AnimationUtils.loadAnimation(getActivity(), R.anim.showin);
        Animation popeup3 = AnimationUtils.loadAnimation(getActivity(), R.anim.showin);
        popeup1.setStartOffset(300);
        popeup2.setStartOffset(500);
        popeup3.setStartOffset(570);
        img1.startAnimation(popeup1);
        a.startAnimation(popeup2);
        b.startAnimation(popeup3);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_redeem, menu);
    }
}
