package com.example.savvy.nav_menu;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends android.support.v4.app.Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myVIew = inflater.inflate(R.layout.first_layout, container, false);
        return myView;
    }
}
