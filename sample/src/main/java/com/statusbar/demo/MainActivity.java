package com.statusbar.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.wangzhen.statusbar.DarkStatusBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnDark;
    private Button btnLight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        btnDark = (Button) findViewById(R.id.btn_dark);
        btnLight = (Button) findViewById(R.id.btn_light);
        btnDark.setOnClickListener(this);
        btnLight.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_dark:
                DarkStatusBar.get().fitDark(this);
                break;
            case R.id.btn_light:
                DarkStatusBar.get().fitLight(this);
                break;
        }
    }
}
