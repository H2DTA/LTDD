package com.example.xuka.h2dta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LTDD extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltdd);
        findViewById();
    }

    private void findViewById() {
        imageButton = (ImageButton) findViewById(R.id.imgbt_3);
        imageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgbt_3:
                Intent intent = new Intent(this, LTDD2.class);
                startActivity(intent);
        }

    }
}
