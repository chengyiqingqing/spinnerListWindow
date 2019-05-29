package com.louisgeek.louisdropdownview;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

import java.util.ArrayList;

/**
 * @author ShaoWenWen
 * @date 2019/5/29
 */
public class MySpinnerView extends AppCompatTextView {

    private RecyclerView recyclerView;
    private PopupWindow popupWindow;
    private ArrayList<String> arrayList = new ArrayList<>();

    public MySpinnerView(Context context) {
        this(context, null);
    }

    public MySpinnerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
        initData();
        initListener();
    }

    private void initData() {
        for (int index = 0; index < 5; index++) {
            arrayList.add("数据1数据1数据1");
            arrayList.add("数据2");
            arrayList.add("数据3数据3数据3");
            arrayList.add("数据4");
            arrayList.add("数据5");
        }
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(recyclerAdapter);
    }

    private void initView() {

        recyclerView = new RecyclerView(getContext());
        popupWindow = new PopupWindow(getContext());
        popupWindow.setContentView(recyclerView);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
    }


    private void initListener() {
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.showAsDropDown(MySpinnerView.this);
            }
        });
    }

}
