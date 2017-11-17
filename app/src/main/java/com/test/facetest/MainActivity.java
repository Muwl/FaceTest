package com.test.facetest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.test.facetest.face.ObjectDetectingActivity;
import com.test.facetest.port.PortTestActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view){
        Intent intent=new Intent(this, PortTestActivity.class);
        startActivity(intent);
    }

    public void onClick2(View view){
        startActivity(new Intent(MainActivity.this, ObjectDetectingActivity.class));
    }
}
