package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by enrico on 28/01/18.
 */

public class Fragment3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);
        if (MainActivity.questionNumber == 4) {
            TextView tv0 = (TextView) view.findViewById(R.id.question);
            tv0.setText(getResources().getString(R.string.question4));
            EditText et = view.findViewById(R.id.textAnswer);
            et.setAllCaps(true);
            et.setText(MainActivity.q4);
        }
        if (MainActivity.questionNumber == 7) {
            TextView tv0 = (TextView) view.findViewById(R.id.question);
            tv0.setText(getResources().getString(R.string.question7));
            EditText et = view.findViewById(R.id.textAnswer);
            et.setAllCaps(true);
            et.setText(MainActivity.q7);
        }
        if (MainActivity.questionNumber == 10) {
            TextView tv0 = (TextView) view.findViewById(R.id.question);
            tv0.setText(getResources().getString(R.string.question10));
            EditText et = view.findViewById(R.id.textAnswer);
            et.setText(MainActivity.q10);
        }
        return view;
    }
}