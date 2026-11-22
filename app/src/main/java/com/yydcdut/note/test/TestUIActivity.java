package com.yydcdut.note.test;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.yydcdut.note.R;

import butterknife.OnClick;

/**
 * Created by yuyidong on 16/4/29.
 */
public class TestUIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_ui);
    }

    @OnClick(R.id.btn_test)
    public void testClick(View v) {

    }
}
