package com.example.fishingtest;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuItemView extends LinearLayout {

    TextView inputText1;
    TextView inputText2;
    ImageView imageView;

    public MenuItemView(Context context) {
        super(context);
    }

    public MenuItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.menu_item, this, true);

        inputText1 = findViewById(R.id.inputText1);
        inputText2 = findViewById(R.id.inputText2);
        imageView = findViewById(R.id.imageView);
    }

    public void setName(String name) {
        inputText1.setText(name);
    }

    public void setMobile(String mobile) {
        inputText2.setText(mobile);
    }

}
