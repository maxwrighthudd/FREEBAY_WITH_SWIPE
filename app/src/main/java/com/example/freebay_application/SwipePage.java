package com.example.freebay_application;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SwipePage extends AppCompatActivity {
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swipe_page);
        layout = findViewById(R.id.relativeLayout);
        layout.setOnTouchListener(new OnSwipeTouchListener(SwipePage.this) {
            //Replace both 'Toast' functions with the function for switching active prdouct images
            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                Toast.makeText(SwipePage.this, "Disliked", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                Toast.makeText(SwipePage.this, "Liked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
