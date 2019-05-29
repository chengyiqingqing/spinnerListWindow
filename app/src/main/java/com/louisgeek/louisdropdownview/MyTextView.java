package com.louisgeek.louisdropdownview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * @author ShaoWenWen
 * @date 2019/5/29
 */
public class MyTextView extends FrameLayout {

    private View rootView;
    private TextView textItem;

    public MyTextView(@NonNull Context context) {
        this(context, null);
    }

    public MyTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    private void initView() {
        rootView = inflate(getContext(), R.layout.layout_item_text, this);
        textItem = rootView.findViewById(R.id.text_use);
    }

    public void updateViewByData(String text) {
        textItem.setText(text);
    }

}
