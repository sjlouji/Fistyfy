package Adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fistyfy.Details4Fragment;




public class Details4TabAdapter extends FragmentPagerAdapter {
    int numoftabs;

    public Details4TabAdapter(FragmentManager fm, int mnumoftabs) {
        super(fm);
        this.numoftabs = mnumoftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Details4Fragment tab1 = new Details4Fragment();
                return tab1;

            case 1:
                Details4Fragment tab2 = new Details4Fragment();
                return tab2;

            case 2:
                Details4Fragment tab3 = new Details4Fragment();
                return tab3;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
