package com.example.jingbin.yunviews.stackblur;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.ToggleButton;

import com.example.jingbin.yunviews.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StackblurActivity extends AppCompatActivity {

    @BindView(R.id.blur_amount)
    SeekBar blurAmount;
    @BindView(R.id.toggleButton)
    ToggleButton toggleButton;
    @BindView(R.id.imageView)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stackblur);
        ButterKnife.bind(this);
    }
}
