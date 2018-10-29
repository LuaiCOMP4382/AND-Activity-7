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

        if (getResources().getBoolean(R.bool.has_600_width))
            mListener.onFragmentInteraction(index);

        else {

            Intent intent = new Intent(getContext(), DetailsActivity.class);
            intent.putExtra(ITEM_INDEX_KEY, index);

            startActivity(intent);

        }

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
