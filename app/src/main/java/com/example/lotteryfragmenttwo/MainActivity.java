package com.example.lotteryfragmenttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
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

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frFragmentPlace, frFragment);
        fragmentTransaction.commit();

    }
}
