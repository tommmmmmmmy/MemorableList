package com.tuqulore.memorablelist;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.tuqulore.memorablelist.page.main.impl.MyFragment;

import jp.fkmsoft.android.framework.util.FragmentUtils;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        // 初回起動時のみ処理する
        if (savedInstanceState == null) {
            // R.id.containerの位置に、MyFragmentを張る
            FragmentUtils.toNextFragment(getSupportFragmentManager(), R.id.container, new MyFragment(), false);
        }

    }
}
