package com.example.hepei.mytreasure.treasure.map;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hepei.mytreasure.R;


/**
 * Created by gqq on 2017/1/4.
 */

// 宝藏页面：地图的展示和宝藏数据的展示
public class MapFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_map,container);
    }
}
