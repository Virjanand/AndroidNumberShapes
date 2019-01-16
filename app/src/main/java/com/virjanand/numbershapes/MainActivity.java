package com.virjanand.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickCheckNumber(View view) {
        Log.i("Info", "Click");

        EditText numberText = (EditText) findViewById(R.id.numberEditText);
        int number = Integer.parseInt(numberText.getText().toString());

        int sum = 0;
        String message;
        for (int i = 1; i < number; i++) {
            sum += i;
            if (sum == number) {
                Log.i("Number is ", "triangular.");
            }
            if (i * i == number) {
                Log.i("Number is ", "square");
            }
        }
//        Log.i("Number is ", "neither triangular nor square.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
