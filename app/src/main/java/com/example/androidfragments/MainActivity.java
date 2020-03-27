package com.example.androidfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fragment_blank_fragment1);
        setContentView(R.layout.fragment_blank_fragment2);
    }

    public void changeFragment(View view){
        Fragment fragment;
        if (view == findViewById(R.id.fragment)){
            fragment = new BlankFragment1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefult,fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.fragment2)){
            fragment = new BlankFragment2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefult,fragment);
            ft.commit();
        }
    }
        }





