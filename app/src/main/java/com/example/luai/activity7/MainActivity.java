package com.example.luai.activity7;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener {

    private MainFragment mFragmentMain;
    private DetailsFragment mFragmentDetails; // Only in tablet

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentMain = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_main);

        if (getResources().getBoolean(R.bool.has_600_width))
            mFragmentDetails = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_details);

    }

    public void openFirstItem(View view) {

        mFragmentMain.openItem(0);

    }

    public void openSecondItem(View view) {

        mFragmentMain.openItem(1);

    }

    public void openThirdItem(View view) {

        mFragmentMain.openItem(2);

    }

    @Override
    public void onFragmentInteraction(int index) {

        mFragmentDetails.setDescText(index);

    }
}
