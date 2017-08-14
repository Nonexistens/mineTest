package com.test.nex.minetest.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.test.nex.minetest.R;

public class FinalActivity extends AppCompatActivity {

    private Context mContext;
    private int mUserChoose;
    private ImageView mImageView;
    private int resID;
    private LinearLayout mReverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_screen);
        mContext = this;
        mUserChoose = getIntent().getIntExtra("Выбор пользователя", 0);
        mReverse = (LinearLayout) findViewById(R.id.reverse);

        mImageView = (ImageView) findViewById(R.id.imageView);
        switch (mUserChoose) {
            case 1:
                mImageView.setImageResource(R.drawable.final_pig);
                break;
            case 2:
                mImageView.setImageResource(R.drawable.final_payk);
                break;
            case 3:
                mImageView.setImageResource(R.drawable.final_skeleton);
                break;
            case 4:
                mImageView.setImageResource(R.drawable.final_kripper);
                break;
            case 5:
                mImageView.setImageResource(R.drawable.final_lipkiy);
                break;
            case 6:
                mImageView.setImageResource(R.drawable.final_gast);
                break;
            case 7:
                mImageView.setImageResource(R.drawable.final_enderman);
                break;
            case 8:
                mImageView.setImageResource(R.drawable.final_zombi);
                break;
            case 9:
                mImageView.setImageResource(R.drawable.final_kuro_zombi);
                break;
            case 10:
                mImageView.setImageResource(R.drawable.final_skelet_payk);
                break;
        }

        mReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, MainActivity.class));
            }
        });

    }
}
