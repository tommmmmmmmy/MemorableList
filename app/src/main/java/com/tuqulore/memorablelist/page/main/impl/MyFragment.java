package com.tuqulore.memorablelist.page.main.impl;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tuqulore.memorablelist.R;
import com.tuqulore.memorablelist.page.main.MainApp;
import com.tuqulore.memorablelist.page.main.MainUI;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import jp.fkmsoft.android.framework.base.BaseFragment;
import jp.fkmsoft.android.framework.impl.UIHolderImpl;

/**
 * Created by chihiroakiba on 2014/11/14.
 */
public class MyFragment extends BaseFragment<MainApp> implements MainUI {

    @InjectView(R.id.btn_new)
    Button mNewBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_my, container, false);

        // いろいろどーんと設定
        ButterKnife.inject(this, root);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // 設定を解除
        ButterKnife.reset(this);
    }

    // BaseFragment

    @Override
    protected MainApp createApp() {
        return new MainAppImpl(new UIHolderImpl<MainUI>(this));
    }

    // ボタンなどのイベント

    @OnClick(R.id.btn_new)
    void newButtonClicked(View v) {
        Intent intent = new Intent();
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivityForResult(intent, 0);
    }
}
