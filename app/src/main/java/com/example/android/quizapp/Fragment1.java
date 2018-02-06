package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by enrico on 26/01/18.
 */

public class Fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1, container, false);
        if (MainActivity.questionNumber == 1) {
            TextView tv0 = (TextView) view.findViewById(R.id.question);
            tv0.setText(getResources().getString(R.string.question1));
            CheckBox cb1 = view.findViewById(R.id.answer1);
            cb1.setText(getResources().getString(R.string.q1a1));
            cb1.setChecked(MainActivity.q1a1);
            CheckBox cb2 = view.findViewById(R.id.answer2);
            cb2.setText(getResources().getString(R.string.q1a2));
            cb2.setChecked(MainActivity.q1a2);
            CheckBox cb3 = view.findViewById(R.id.answer3);
            cb3.setText(getResources().getString(R.string.q1a3));
            cb3.setChecked(MainActivity.q1a3);
            CheckBox cb4 = view.findViewById(R.id.answer4);
            cb4.setText(getResources().getString(R.string.q1a4));
            cb4.setChecked(MainActivity.q1a4);
            CheckBox cb5 = view.findViewById(R.id.answer5);
            cb5.setText(getResources().getString(R.string.q1a5));
            cb5.setChecked(MainActivity.q1a5);

        }
        if (MainActivity.questionNumber == 5) {
            TextView tv0 = (TextView) view.findViewById(R.id.question);
            tv0.setText(getResources().getString(R.string.question5));
            CheckBox cb1 = view.findViewById(R.id.answer1);
            cb1.setText(getResources().getString(R.string.q5a1));
            cb1.setChecked(MainActivity.q5a1);
            CheckBox cb2 = view.findViewById(R.id.answer2);
            cb2.setText(getResources().getString(R.string.q5a2));
            cb2.setChecked(MainActivity.q5a2);
            CheckBox cb3 = view.findViewById(R.id.answer3);
            cb3.setText(getResources().getString(R.string.q5a3));
            cb3.setChecked(MainActivity.q5a3);
            CheckBox cb4 = view.findViewById(R.id.answer4);
            cb4.setText(getResources().getString(R.string.q5a4));
            cb4.setChecked(MainActivity.q5a4);
            CheckBox cb5 = view.findViewById(R.id.answer5);
            cb5.setText(getResources().getString(R.string.q5a5));
            cb5.setChecked(MainActivity.q5a5);

        }
        if (MainActivity.questionNumber == 6) {
            TextView tv0 = (TextView) view.findViewById(R.id.question);
            tv0.setText(getResources().getString(R.string.question6));
            CheckBox cb1 = view.findViewById(R.id.answer1);
            cb1.setText(getResources().getString(R.string.q6a1));
            cb1.setChecked(MainActivity.q6a1);
            CheckBox cb2 = view.findViewById(R.id.answer2);
            cb2.setText(getResources().getString(R.string.q6a2));
            cb2.setChecked(MainActivity.q6a2);
            CheckBox cb3 = view.findViewById(R.id.answer3);
            cb3.setText(getResources().getString(R.string.q6a3));
            cb3.setChecked(MainActivity.q6a3);
            CheckBox cb4 = view.findViewById(R.id.answer4);
            cb4.setText(getResources().getString(R.string.q6a4));
            cb4.setChecked(MainActivity.q6a4);
            CheckBox cb5 = view.findViewById(R.id.answer5);
            cb5.setText(getResources().getString(R.string.q6a5));
            cb5.setChecked(MainActivity.q6a5);

        }

        return view;

    }

}
