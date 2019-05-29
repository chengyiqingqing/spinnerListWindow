package com.louisgeek.louisdropdownview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @author ShaoWenWen
 * @date 2019/5/29
 */
public class TestActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> arrayList = new ArrayList<>();
    private TextView textShow;
    private PopupWindow popupWindow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recycler);
        //        recyclerView = findViewById(R.id.recycler_list);
        recyclerView = new RecyclerView(TestActivity.this);
        textShow = findViewById(R.id.text_show);
        /*textShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.showAsDropDown(textShow);

            }
        });*/
    }

    @Override
    protected void onResume() {
        super.onResume();
        /*for (int index = 0; index < 5; index++) {
            arrayList.add("数据1数据1数据1");
            arrayList.add("数据2");
            arrayList.add("数据3数据3数据3");
            arrayList.add("数据4");
            arrayList.add("数据5");
        }
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(TestActivity.this));
        recyclerView.setAdapter(recyclerAdapter);
        popupWindow = new PopupWindow(TestActivity.this);
        popupWindow.setContentView(recyclerView);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());*/
    }

}
