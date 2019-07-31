package Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fistyfy.DetailaFragment;
import com.example.fistyfy.Details4Fragment;


public class CocoProductDetailsAdapter extends FragmentPagerAdapter {


    int mNoOfTabs;

    public CocoProductDetailsAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {

            case 0:
                DetailaFragment tab1 = new DetailaFragment();
                return tab1;
            case 1:
                DetailaFragment tab2 = new DetailaFragment();
                return tab2;
            case 2:
                DetailaFragment tab3 = new DetailaFragment();
                return tab3;

            case 3:
                DetailaFragment tab4 = new DetailaFragment();
                return tab4;
            case 4:
                DetailaFragment tab5 = new DetailaFragment();
                return tab5;
            case 5:
                DetailaFragment tab6 = new DetailaFragment();
                return tab6;
            case 6:
                DetailaFragment tab7 = new DetailaFragment();
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
