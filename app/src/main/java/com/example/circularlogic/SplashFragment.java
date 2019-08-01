package com.example.circularlogic;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SplashFragment extends Fragment {

    View view;

    public SplashFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
        view = inflater.inflate(R.layout.fragment_splash, container, false);
           new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {
                   Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_AFragment);
               }
           },3000);
        return view;
    }

}
