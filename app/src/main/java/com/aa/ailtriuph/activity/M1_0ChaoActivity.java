package com.aa.ailtriuph.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aa.ailtriuph.R;

public class M1_0ChaoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        button=findViewById(R.id.btnTesst);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
