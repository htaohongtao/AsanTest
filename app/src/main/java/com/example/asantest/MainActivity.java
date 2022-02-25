package com.example.asantest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnUseAfterFreeClick(View view) {
        ASanTest.testUseAfterFree();
    }
    public void onBtnHeapBufferOverflow(View view) {
        ASanTest.testHeapBufferOverflow();
    }

    public void onBtnStackBufferOverflow(View view) {
        ASanTest.testStackBufferOverflow();
    }

    public void onBtnGlobalBufferOverflow(View view) {
        ASanTest.testGlobalBufferOverflow();
    }

    public void onBtnUseAfterReturn(View view) {
        ASanTest.testUseAfterReturn();
    }

    public void onBtnUseAfterScope(View view) {
        ASanTest.testUseAfterScope();
    }

    public void onBtnUseRepeatFree(View view) {
        ASanTest.testRepeatFree();
    }

    public void onBtnMemoryLeak(View view) {
        ASanTest.testMemoryLeak();
    }
}