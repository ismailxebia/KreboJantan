package xebia.ismail.krebojantan.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import xebia.ismail.krebojantan.NearestBankFragment;
import xebia.ismail.krebojantan.R;
import xebia.ismail.krebojantan.RewardFragment;

public class SimpleFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    // fm is the fragment manager that will keep each fragment's state in the adapter across swipes.
    public SimpleFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new RewardFragment();
        else if (position == 1)
            return new NearestBankFragment();
        else if (position == 2)
            return new NearestBankFragment();
        else
            return new NearestBankFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.breakfast);
        else if (position == 1)
            return mContext.getString(R.string.drinks);
        else if (position == 2)
            return mContext.getString(R.string.dessert);
        else
            return mContext.getString(R.string.garnish);
    }
}
