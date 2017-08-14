package com.test.nex.minetest.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.test.nex.minetest.R;

public class QuestionActivity extends AppCompatActivity {

    String[] questions = {
            "Какое время суток вам по душе ?",
            "Любите ли вы плавать?",
            "Как вы относитесь к Стиву",
            "Что вы любите делать ночью?",
            "Либите ли вы разрушения?",
            "Если бы был выбор, где бы вы жили?",
            "Какой цвет вам больше по душе?",
            "Играли ли вы в Minecraft ранних версий?",
            "Выберите способ передвижения из предложенных",
            "Что лучше?",
            "Боитесь ли вы монстров под кроватью?",
            "Какой тип вооружения вам по душе?",
            "Какая температура вам по душе?",
            "Как вы любите играть в Minecraft?",
    };

    String[] answers = {
            "День",
            "Ночь",
            "Любое",
            "Да",
            "Нет",
            "По настроению",
            "Дружелюбно",
            "Враждебно",
            "Нейтрально",
            "Спать",
            "Гулять",
            "Играть в Minecraft",
            "Обожаю",
            "Не люблю",
            "Люблю создавать",
            "В городе",
            "В деревне",
            "В лесу",
            "Зеленый",
            "Белый",
            "Черный",
            "Да",
            "Нет",
            "Уже не помню",
            "Прыжки",
            "Полет",
            "На животном",
            "Круг",
            "Квадрат",
            "Прямоугольник",
            "Боюсь",
            "Нет",
            "Боялся раньше",
            "Взрывы",
            "Без оружия",
            "Средневековое оружие",
            "Когда холодно",
            "Когда жарко",
            "Любая",
            "На сервере",
            "Синглплеер",
            "Без разницы"
    };

    private int mSvinZombi = 0;
    private int mPayk = 0;
    private int mSkelet = 0;
    private int mKreper = 0;
    private int mSlizen = 0;
    private int mGast = 0;
    private int mEndermen = 0;
    private int mZombi = 0;
    private int mZombiNaeznik = 0;
    private int mSkeletNaeznik = 0;

    private Context mContext;
    private TextView mHeader;
    private TextView mMain;
    private TextView mAnswerOne;
    private TextView mAnswerTwo;
    private TextView mAnswerThree;
    private StringBuilder sb;
    private int mQuantity = 0;
    private int mUserChoose;
    private int mMax = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_board);
        mContext = this;

        mAnswerOne = (TextView) findViewById(R.id.answer_one);
        mAnswerTwo = (TextView) findViewById(R.id.answer_two);
        mAnswerThree = (TextView) findViewById(R.id.answer_three);
        mMain = (TextView) findViewById(R.id.main);
        mHeader = (TextView) findViewById(R.id.header);

        setQuestion(mQuantity);

        mAnswerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refreshFlag(mAnswerOne.getText().toString());
                if (mQuantity == 13) {
                    goToFinalScreen();
                } else {
                    mQuantity++;
                    setQuestion(mQuantity);
                }
            }
        });

        mAnswerTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refreshFlag(mAnswerTwo.getText().toString());
                if (mQuantity == 13) {
                    goToFinalScreen();
                } else {
                    mQuantity++;
                    setQuestion(mQuantity);
                }
            }
        });

        mAnswerThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refreshFlag(mAnswerThree.getText().toString());
                if (mQuantity == 13) {
                    goToFinalScreen();
                } else {
                    mQuantity++;
                    setQuestion(mQuantity);
                }
            }
        });
    }

    private void goToFinalScreen() {
        if (mSvinZombi > mMax) {
            mUserChoose = 1;
            mMax = mSvinZombi;
        }
        if (mPayk > mMax) {
            mUserChoose = 2;
            mMax = mPayk;
        }
        if (mSkelet > mMax) {
            mUserChoose = 3;
            mMax = mSkelet;
        }
        if (mKreper > mMax ) {
            mUserChoose = 4;
            mMax = mKreper;
        }
        if (mSlizen > mMax ) {
            mUserChoose = 5;
            mMax = mSlizen;
        }
        if (mGast > mMax ) {
            mUserChoose = 6;
            mMax = mGast;
        }
        if (mEndermen > mMax ) {
            mUserChoose = 7;
            mMax = mEndermen;
        }
        if (mZombi > mMax ) {
            mUserChoose = 8;
            mMax = mZombi;
        }
        if (mZombiNaeznik > mMax ) {
            mUserChoose = 9;
            mMax = mZombiNaeznik;
        }
        if (mSkeletNaeznik > mMax ) {
            mUserChoose = 10;
            mMax = mSkeletNaeznik;
        }
        Intent intent = new Intent(mContext, FinalActivity.class);
        intent.putExtra("Выбор пользователя", mUserChoose);
        startActivity(intent);
    }

    private void refreshFlag(String answer) {
        if (answer.equals("Когда жарко") || answer.equals("Нейтрально") || answer.equals("Средневековое оружие") || answer.equals("Когда жарко")) {
            mSvinZombi++;
        }

        if (answer.equals("Нейтрально") || answer.equals("Без оружия") || answer.equals("Ночь") || answer.equals("Черный")) {
            mPayk++;
        }

        if (answer.equals("Враждебно") || answer.equals("Белый") || answer.equals("Средневековое оружие") || answer.equals("Ночь")) {
            mSkelet++;
        }

        if (answer.equals("Зеленый") || answer.equals("Враждебно") || answer.equals("Обожаю") || answer.equals("Взрывы")) {
            mKreper++;
        }

        if (answer.equals("Враждебно") || answer.equals("Зеленый") || answer.equals("Прыжки") || answer.equals("Без оружия")) {
            mSlizen++;
        }

        if (answer.equals("Враждебно") || answer.equals("Белый") || answer.equals("Взрывы") || answer.equals("Полет")) {
            mGast++;
        }

        if (answer.equals("Нейтрально") || answer.equals("Черный") || answer.equals("Любая") || answer.equals("Обожаю")) {
            mEndermen++;
        }

        if (answer.equals("Зеленый") || answer.equals("Враждебно") || answer.equals("Когда холодно") || answer.equals("Ночь")) {
            mZombi++;
        }

        if (answer.equals("Враждебно") || answer.equals("Зеленый") || answer.equals("На животном") || answer.equals("Без оружия")) {
            mZombiNaeznik++;
        }

        if (answer.equals("Белый") || answer.equals("На животном") || answer.equals("Средневековое оружие") || answer.equals("Когда холодно")) {
            mSkeletNaeznik++;
        }

    }

    private void setQuestion(int numberQuestion) {
        sb = new StringBuilder();

        sb.append("Вопрос № ")
                .append(numberQuestion + 1)
                .append(" из 14");
        mHeader.setText(sb.toString());

        mMain.setText(questions[numberQuestion]);
        mAnswerOne.setText(answers[3 * numberQuestion]);
        mAnswerTwo.setText(answers[3 * numberQuestion + 1]);
        mAnswerThree.setText(answers[3 * numberQuestion + 2]);
    }
}
