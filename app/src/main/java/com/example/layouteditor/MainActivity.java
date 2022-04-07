package com.example.layouteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    Button buttoncount;
    Button buttonzero;
    Button buttonzero1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        buttonzero= (Button) findViewById(R.id.button_zero);
        buttonzero1=(Button) findViewById(R.id.button_zero);
        buttoncount=(Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint("ResourceAsColor")
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        buttonzero.setBackgroundColor(getResources().getColor(R.color.teal_700));
        switch (mCount%2){
            case 0: buttoncount.setBackgroundColor(getResources().getColor(R.color.purple_200));
                break;
            case 1: buttoncount.setBackgroundColor(getResources().getColor(R.color.black));
                break;
        }
    }

    @SuppressLint("ResourceAsColor")
    public void showZero(View view) {
        mCount=0;
        mShowCount.setText(String.valueOf(mCount));
        buttonzero.setBackgroundColor(R.color.grey);
        buttonzero1.setBackgroundColor(getResources().getColor(R.color.grey));
        buttoncount.setBackgroundColor(getResources().getColor(R.color.primary));

    }
}