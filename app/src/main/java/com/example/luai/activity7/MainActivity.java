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

        // TODO (5): Use the support fragment manager to get MainFragment and store it in mFragmentMain.
        // TODO (6): Do the same for mFragmentDetails, only if we are in tablet mode


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

        // TODO (7): Since we made the fragment call onFragmentInteraction. Call setDescText on the details fragment, and there is no need to send an intent, because we are not opening another activity

    }
}
