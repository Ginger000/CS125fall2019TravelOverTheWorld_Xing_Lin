package com.example.travelovertheworld_xing_lin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewSwitcher;

import com.like.LikeButton;
import com.like.OnLikeListener;

public class Us_1 extends AppCompatActivity {
    static int Liked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.us);

        Button backbutton = (Button) findViewById(R.id.back_button);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button backbutton2 = (Button) findViewById(R.id.back_button2);
        backbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        final LikeButton likeButton = findViewById(R.id.star_button);
        likeButton.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                Liked = 1;
            }

            @Override
            public void unLiked(LikeButton likeButton) {
                Liked = 0;
            }
        });
        if (Liked == 1) {
            likeButton.setLiked(true);
        } else {
            likeButton.setLiked(false);
        }
        final ViewSwitcher viewSwitcher =   (ViewSwitcher)findViewById(R.id.viewswticher);
        final ConstraintLayout myFirstView= findViewById(R.id.view1);
        final ConstraintLayout mySecondView = findViewById(R.id.view2);
        Button button1 = (Button) findViewById(R.id.go);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (viewSwitcher.getCurrentView() != myFirstView) {
                    viewSwitcher.showPrevious();
                } else if (viewSwitcher.getCurrentView() != mySecondView) {
                    viewSwitcher.showNext();
                }
            }
        });
        Button button2 = (Button) findViewById(R.id.go2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (viewSwitcher.getCurrentView() != myFirstView) {
                    viewSwitcher.showPrevious();
                } else if (viewSwitcher.getCurrentView() != mySecondView) {
                    viewSwitcher.showNext();
                }
            }
        });
    }

}
