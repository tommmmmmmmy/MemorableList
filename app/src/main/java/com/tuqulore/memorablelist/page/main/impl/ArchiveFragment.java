package com.tuqulore.memorablelist.page.main.impl;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tuqulore.memorablelist.R;

/**
 * Created by chihiroakiba on 2014/11/15.
 */
public class ArchiveFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.archive_my, container, false);

        return root;
    }
}
