package com.example.lotteryfragmenttwo;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectFragment(View view) {

        Fragment frFragment;

        if (view == findViewById(R.id.btSwiss)) {
            frFragment = new FragmentSwiss();

        } else {
            frFragment = new FragmentEuro();
        }

        // Dynamic fragment: A dynamic Fragment isn't associated with a fragment tag and it is created in association with the FragmentManager.
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frFragmentPlace, frFragment);
        fragmentTransaction.commit();
    }
}
