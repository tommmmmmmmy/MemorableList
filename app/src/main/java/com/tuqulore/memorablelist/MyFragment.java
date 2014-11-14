package com.tuqulore.memorablelist;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by chihiroakiba on 2014/11/14.
 */
public class MyFragment extends Fragment {

    Button mNewBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_my, container, false);

        mNewBtn = (Button) root.findViewById(R.id.btn_new);
        mNewBtn.setOnClickListener(mNewClickListener);

        return root;
    }

    View.OnClickListener mNewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
            intent.addCategory(Intent.CATEGORY_DEFAULT);
            startActivityForResult(intent, 0);
        }
    };
}
