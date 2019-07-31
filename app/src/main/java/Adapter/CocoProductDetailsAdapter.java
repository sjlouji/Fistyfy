package Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fistyfy.Details4Fragment;


public class CocoProductDetailsAdapter extends FragmentPagerAdapter {


    int mNoOfTabs;

    public CocoProductDetailsAdapter(FragmentManager fm) {
        super(fm);


    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {

            case 0:
                Details4Fragment tab1 = new Details4Fragment();
                return tab1;
            case 1:
                Details4Fragment tab2 = new Details4Fragment();
                return tab2;
            case 2:
                Details4Fragment tab3 = new Details4Fragment();
                return tab3;

            case 3:
                Details4Fragment tab4 = new Details4Fragment();
                return tab4;
            case 4:
                Details4Fragment tab5 = new Details4Fragment();
                return tab5;
            case 5:
                Details4Fragment tab6 = new Details4Fragment();
                return tab6;
            case 6:
                Details4Fragment tab7 = new Details4Fragment();
                return tab7;


            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 7;
    }
}
