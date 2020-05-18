package mm.com.tabbedactivity.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import mm.com.tabbedactivity.R;
import mm.com.tabbedactivity.fragment.TabLength;
import mm.com.tabbedactivity.fragment.TabMass;
import mm.com.tabbedactivity.fragment.TabVolume;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {


    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_length, R.string.tab_mass, R.string.tab_volume};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        switch (position){
            case 0:
                TabLength tabLength = new TabLength();
                return tabLength;
            case 1:
                TabMass tabMass = new TabMass();
                return tabMass;
            case 2:
                TabVolume tabVolume = new TabVolume();
                return tabVolume;
        }
        return null;
       // return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}

