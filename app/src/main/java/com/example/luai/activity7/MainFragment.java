package com.example.luai.activity7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MainFragment extends Fragment {

    public static final String ITEM_INDEX_KEY = "item-index";

    private OnFragmentInteractionListener mListener;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    public void openFirstItem(View view) {

        openItem(0);

    }

    public void openSecondItem(View view) {

        openItem(1);

    }

    public void openThirdItem(View view) {

        openItem(2);

    }

    public void openItem(int index) {

        // TODO (3): There are two possible cases. The device is a phone, or a tablet (has 600 width or more). Use bools.xml resource file to know if it's tablet (600 dp width) or not.
        // TODO (4): If the device is a normal phone, start DetailsActivity through an intent (and pass in index as extra), else if it is a tablet, call mListener.onFragmentInteraction, and pass in index. The listner will represent the activity containing this fragment

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(int index);
    }
}
