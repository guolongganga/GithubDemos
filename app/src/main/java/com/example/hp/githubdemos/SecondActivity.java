package com.example.hp.githubdemos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by guolonggang on 2019/6/5.
 * Description:
 */

public class SecondActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"这是第二个activity",Toast.LENGTH_LONG).show();
                ////
                //
                //////
                //提交
                Toast.makeText(SecondActivity.this,"这是第二个activity",Toast.LENGTH_LONG).show();
                ////////




            }
        });
    }
}
