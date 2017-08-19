package com.yanghaoyi.hotfix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tencent.bugly.beta.Beta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Beta.applyDownloadedPatch();

        TextView tvTest = (TextView) findViewById(R.id.tvTest);
        tvTest.setText("第二次运行");


    }
}
