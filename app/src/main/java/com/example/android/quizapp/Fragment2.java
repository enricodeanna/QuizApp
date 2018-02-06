package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.widget.RadioGroup.*;

/**
 * Created by enrico on 26/01/18.
 */

public class Fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        if (MainActivity.questionNumber == 2) {
            TextView tv0 = (TextView) view.findViewById(R.id.question);
            tv0.setText(getResources().getString(R.string.question2));
            TextView tv1 = (TextView) view.findViewById(R.id.answer1);
            tv1.setText(getResources().getString(R.string.q2a1));
            TextView tv2 = (TextView) view.findViewById(R.id.answer2);
            tv2.setText(getResources().getString(R.string.q2a2));
            TextView tv3 = (TextView) view.findViewById(R.id.answer3);
            tv3.setText(getResources().getString(R.string.q2a3));
            TextView tv4 = (TextView) view.findViewById(R.id.answer4);
            tv4.setText(getResources().getString(R.string.q2a4));
            TextView tv5 = (TextView) view.findViewById(R.id.answer5);
            tv5.setText(getResources().getString(R.string.q2a5));
            if (MainActivity.q2 == 0) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer1);
            }
            if (MainActivity.q2 == 1) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer2);
            }
            if (MainActivity.q2 == 2) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer3);
            }
            if (MainActivity.q2 == 3) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer4);
            }
            if (MainActivity.q2 == 4) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer5);
            }
        }

        if (MainActivity.questionNumber == 3) {
            TextView tv0 = (TextView) view.findViewById(R.id.question);
            tv0.setText(getResources().getString(R.string.question3));
            TextView tv1 = (TextView) view.findViewById(R.id.answer1);
            tv1.setText(getResources().getString(R.string.q3a1));
            TextView tv2 = (TextView) view.findViewById(R.id.answer2);
            tv2.setText(getResources().getString(R.string.q3a2));
            TextView tv3 = (TextView) view.findViewById(R.id.answer3);
            tv3.setText(getResources().getString(R.string.q3a3));
            TextView tv4 = (TextView) view.findViewById(R.id.answer4);
            tv4.setText(getResources().getString(R.string.q3a4));
            TextView tv5 = (TextView) view.findViewById(R.id.answer5);
            tv5.setText(getResources().getString(R.string.q3a5));
            if (MainActivity.q3 == 0) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer1);
            }
            if (MainActivity.q3 == 1) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer2);
            }
            if (MainActivity.q3 == 2) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer3);
            }
            if (MainActivity.q3 == 3) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer4);
            }
            if (MainActivity.q3 == 4) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer5);
            }

        }
        if (MainActivity.questionNumber == 8) {
            TextView tv0 = (TextView) view.findViewById(R.id.question);
            tv0.setText(getResources().getString(R.string.question8));
            RadioButton rb1 = view.findViewById(R.id.answer1);
            rb1.setText(getResources().getString(R.string.q8a1));
            TextView tv2 = (TextView) view.findViewById(R.id.answer2);
            tv2.setText(getResources().getString(R.string.q8a2));
            TextView tv3 = (TextView) view.findViewById(R.id.answer3);
            tv3.setText(getResources().getString(R.string.q8a3));
            TextView tv4 = (TextView) view.findViewById(R.id.answer4);
            tv4.setText(getResources().getString(R.string.q8a4));
            TextView tv5 = (TextView) view.findViewById(R.id.answer5);
            tv5.setText(getResources().getString(R.string.q8a5));
            if (MainActivity.q8 == 0) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer1);
            }
            if (MainActivity.q8 == 1) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer2);
            }
            if (MainActivity.q8 == 2) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer3);
            }
            if (MainActivity.q8 == 3) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer4);
            }
            if (MainActivity.q8 == 4) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer5);
            }
        }
        if (MainActivity.questionNumber == 9) {
            TextView tv0 = (TextView) view.findViewById(R.id.question);
            tv0.setText(getResources().getString(R.string.question9));
            TextView tv1 = (TextView) view.findViewById(R.id.answer1);
            tv1.setText(getResources().getString(R.string.q9a1));
            TextView tv2 = (TextView) view.findViewById(R.id.answer2);
            tv2.setText(getResources().getString(R.string.q9a2));
            TextView tv3 = (TextView) view.findViewById(R.id.answer3);
            tv3.setText(getResources().getString(R.string.q9a3));
            TextView tv4 = (TextView) view.findViewById(R.id.answer4);
            tv4.setText(getResources().getString(R.string.q9a4));
            TextView tv5 = (TextView) view.findViewById(R.id.answer5);
            tv5.setText(getResources().getString(R.string.q9a5));
            if (MainActivity.q9 == 0) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer1);
            }
            if (MainActivity.q9 == 1) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer2);
            }
            if (MainActivity.q9 == 2) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer3);
            }
            if (MainActivity.q9 == 3) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer4);
            }
            if (MainActivity.q9 == 4) {
                RadioGroup rg = view.findViewById(R.id.radioButtons);
                rg.check(R.id.answer5);
            }
        }
        return view;
        }

}