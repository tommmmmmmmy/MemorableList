package com.tuqulore.memorablelist;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.tuqulore.memorablelist.page.main.impl.ArchiveFragment;
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_archive) {
            FragmentUtils.toNextFragment(getSupportFragmentManager(), R.id.container, new ArchiveFragment(), true);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
