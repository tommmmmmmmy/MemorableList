package com.tuqulore.memorablelist;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

/**
 * Created by chihiroakiba on 2014/11/14.
 */
public class ViewUtil {
    public static void toNextFragment(FragmentManager manager, Fragment next, boolean addBackStack){
        FragmentTransaction transaction = manager.beginTransaction();
        if(addBackStack){
            transaction.addToBackStack("");
        }
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.replace(R.id.container, next);
        transaction.commit();
    }
}
