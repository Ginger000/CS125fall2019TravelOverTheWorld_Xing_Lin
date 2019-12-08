package com.example.travelovertheworld_xing_lin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.like.LikeButton;
import com.like.OnLikeListener;

public class Australia_1 extends AppCompatActivity {
    static int Liked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.australia);

        Button backbutton = (Button) findViewById(R.id.back_button);
        backbutton.setOnClickListener(new View.OnClickListener() {
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
    }
}
