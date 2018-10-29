package com.example.luai.activity7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DetailsFragment extends Fragment {

    private TextView mTextViewDesc;

    private OnFragmentInteractionListener mListener;

    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Intent i = getActivity().getIntent();

        View view = inflater.inflate(R.layout.fragment_details, container, false);

        mTextViewDesc = view.findViewById(R.id.tv_item_desc);

        int index = 0;

        if (i != null)
            index = i.getIntExtra(MainFragment.ITEM_INDEX_KEY, 0);

        setDescText(index);

        return view;
    }

    public void setDescText(int index) {

        String desc;

        switch (index) {

            case 0:
                desc = getString(R.string.item1_desc);
                break;

            case 1:
                desc = getString(R.string.item2_desc);
                break;

            case 2:
                desc = getString(R.string.item3_desc);
                break;

            default:
                desc = getString(R.string.item1_desc);

        }

        mTextViewDesc.setText(desc);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
