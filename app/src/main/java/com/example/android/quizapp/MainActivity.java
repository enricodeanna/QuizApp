package com.example.android.quizapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup;


public class MainActivity extends FragmentActivity {
    public static int questionNumber = 0;
    public static boolean q1a1 = false;
    public static boolean q1a2 = false;
    public static boolean q1a3 = false;
    public static boolean q1a4 = false;
    public static boolean q1a5 = false;
    public static int q2 = 10;
    public static int q3 = 10;
    public static String q4 = "";
    public static boolean q5a1 = false;
    public static boolean q5a2 = false;
    public static boolean q5a3 = false;
    public static boolean q5a4 = false;
    public static boolean q5a5 = false;
    public static boolean q6a1 = false;
    public static boolean q6a2 = false;
    public static boolean q6a3 = false;
    public static boolean q6a4 = false;
    public static boolean q6a5 = false;
    public static String q7 = "";
    public static int q8 = 10;
    public static int q9 = 10;
    public static String q10 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new Fragment0();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.question_fragment, fragment);
        transaction.commit();

    }

    public void nextQuestion(View view) {
        questionNumber = questionNumber + 1;
        if (questionNumber >= 10) {
            questionNumber = 10;
        }
        changeFragment();
    }

    public void previousQuestion(View view) {
        questionNumber = questionNumber - 1;
        if (questionNumber <= 0) {
            questionNumber = 1;
        }
        changeFragment();
    }


    public void changeFragment() {
        TextView tv1 = (TextView) findViewById(R.id.header1);
        tv1.setText(getString(R.string.question) + " " + String.valueOf(questionNumber));
        TextView tv2 = (TextView) findViewById(R.id.header2);
        tv2.setText(R.string.click_reset);
        tv2.setTextSize(12);
        if (questionNumber == 1 | questionNumber == 5 | questionNumber == 6) {
            Fragment1 fragment = new Fragment1();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.question_fragment, fragment);
            transaction.commit();
        }

        if (questionNumber == 2 | questionNumber == 3 | questionNumber == 8 | questionNumber == 9) {
            Fragment2 fragment = new Fragment2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.question_fragment, fragment);
            transaction.commit();
        }

        if (questionNumber == 4 | questionNumber == 7 | questionNumber == 10) {
            Fragment3 fragment = new Fragment3();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.question_fragment, fragment);
            transaction.commit();
        }
    }

    public void calculateScore(View view) {
        int totalScore = 0;
        if (q1a1) {
            totalScore = totalScore + 1;
        }
        if (q1a2) {
            totalScore = totalScore + 1;
        }
        if (q1a3 == false) {
            totalScore = totalScore + 1;
        }
        if (q1a4) {
            totalScore = totalScore + 1;
        }
        if (q1a5 == false) {
            totalScore = totalScore + 1;
        }
        if (q2 == 1) {
            totalScore = totalScore + 1;
        }
        if (q3 == 3) {
            totalScore = totalScore + 1;
        }
        if (q4.equals("IBU")) {
            totalScore = totalScore + 1;
        }
        if (q5a1 == false) {
            totalScore = totalScore + 1;
        }
        if (q5a2) {
            totalScore = totalScore + 1;
        }
        if (q5a3) {
            totalScore = totalScore + 1;
        }
        if (q5a4) {
            totalScore = totalScore + 1;
        }
        if (q5a5 == false) {
            totalScore = totalScore + 1;
        }
        if (q6a1 == false) {
            totalScore = totalScore + 1;
        }
        if (q6a2) {
            totalScore = totalScore + 1;
        }
        if (q6a3 == false) {
            totalScore = totalScore + 1;
        }
        if (q6a4 == false) {
            totalScore = totalScore + 1;
        }
        if (q6a5 == false) {
            totalScore = totalScore + 1;
        }
        if (q7.equals("CO2")) {
            totalScore = totalScore + 1;
        }
        if (q8 == 3) {
            totalScore = totalScore + 1;
        }
        if (q9 == 3) {
            totalScore = totalScore + 1;
        }
        if (q10.equals("Trappist")) {
            totalScore = totalScore + 1;
        }
        Toast.makeText(this, "Your score is " + String.valueOf(totalScore) + " out of 22", Toast.LENGTH_LONG).show();
        return;
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        if (questionNumber == 1) {
            switch (view.getId()) {
                case R.id.answer1:
                    if (checked) {
                        q1a1 = true;
                    } else
                        q1a1 = false;
                    break;
                case R.id.answer2:
                    if (checked) {
                        q1a2 = true;
                    } else
                        q1a2 = false;
                    break;
                case R.id.answer3:
                    if (checked) {
                        q1a3 = true;
                    } else
                        q1a3 = false;
                    break;
                case R.id.answer4:
                    if (checked) {
                        q1a4 = true;
                    } else
                        q1a4 = false;
                    break;
                case R.id.answer5:
                    if (checked) {
                        q1a5 = true;
                    } else
                        q1a5 = false;
                    break;
            }
        }
        if (questionNumber == 5) {
            switch (view.getId()) {
                case R.id.answer1:
                    if (checked) {
                        q5a1 = true;
                    } else
                        q5a1 = false;
                    break;
                case R.id.answer2:
                    if (checked) {
                        q5a2 = true;
                    } else
                        q5a2 = false;
                    break;
                case R.id.answer3:
                    if (checked) {
                        q5a3 = true;
                    } else
                        q5a3 = false;
                    break;
                case R.id.answer4:
                    if (checked) {
                        q5a4 = true;
                    } else
                        q5a4 = false;
                    break;
                case R.id.answer5:
                    if (checked) {
                        q5a5 = true;
                    } else
                        q5a5 = false;
                    break;
            }
        }
        if (questionNumber == 6) {
            switch (view.getId()) {
                case R.id.answer1:
                    if (checked) {
                        q6a1 = true;
                    } else
                        q6a1 = false;
                    break;
                case R.id.answer2:
                    if (checked) {
                        q6a2 = true;
                    } else
                        q6a2 = false;
                    break;
                case R.id.answer3:
                    if (checked) {
                        q6a3 = true;
                    } else
                        q6a3 = false;
                    break;
                case R.id.answer4:
                    if (checked) {
                        q6a4 = true;
                    } else
                        q6a4 = false;
                    break;
                case R.id.answer5:
                    if (checked) {
                        q6a5 = true;
                    } else
                        q6a5 = false;
                    break;
            }
        }
    }

    public void onRadioButtonClicked(View view) {
        RadioGroup radioButtonGroup = (RadioGroup) findViewById(R.id.radioButtons);
        int radioButtonID = radioButtonGroup.getCheckedRadioButtonId();
        View radioButton = radioButtonGroup.findViewById(radioButtonID);
        int idx = radioButtonGroup.indexOfChild(radioButton);
        if (questionNumber == 2) {
            q2 = idx;
        }
        if (questionNumber == 3) {
            q3 = idx;
        }
        if (questionNumber == 8) {
            q8 = idx;
        }
        if (questionNumber == 9) {
            q9 = idx;
        }
        Log.i("MainActivity", String.valueOf(idx));
    }

    public void textAnswerEntered(View view) {
        EditText editText = findViewById(R.id.textAnswer);
        if (questionNumber == 4) {
            q4 = editText.getText().toString();
        }
        if (questionNumber == 7) {
            q7 = editText.getText().toString();
        }
        if (questionNumber == 10) {
            q10 = editText.getText().toString();
        }

    }

    public void reset(View view) {
        questionNumber = 0;
        q1a1 = false;
        q1a2 = false;
        q1a3 = false;
        q1a4 = false;
        q1a5 = false;
        q2 = 10;
        q3 = 10;
        q4 = "";
        q5a1 = false;
        q5a2 = false;
        q5a3 = false;
        q5a4 = false;
        q5a5 = false;
        q6a1 = false;
        q6a2 = false;
        q6a3 = false;
        q6a4 = false;
        q6a5 = false;
        q7 = "";
        q8 = 10;
        q9 = 10;
        q10 = "";
        nextQuestion(view);
    }
}

