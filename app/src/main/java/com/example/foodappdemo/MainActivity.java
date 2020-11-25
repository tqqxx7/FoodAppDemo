package com.example.foodappdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import fragment.MapFragment;

public class MainActivity extends AppCompatActivity {
    MeowBottomNavigation bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation = findViewById(R.id.BottomNavi);
        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_home));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_shopping_cart));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_map_placeholder));
        bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.ic_star));
        bottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.ic_settings));

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.FrameHome, new MapFragment(), "MapFragment");
        fragmentTransaction.commit();
    }
}