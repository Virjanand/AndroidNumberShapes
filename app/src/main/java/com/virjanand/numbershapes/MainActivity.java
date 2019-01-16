package com.virjanand.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    static class NumberShapes {

        static boolean isTriangular(int n) {
            int sum = 0;
            int i = 1;
            while(sum < n) {
                sum += i;
                if (sum == n) {
                    return true;
                }
                i++;
            }
            return false;
        }

        static boolean isSquare(int n) {
            int i = 1;
            while (i*i < n) {
                i++;
            }
            if (i*i == n) {
                return true;
            }
            return false;
        }
    }

    public void clickCheckNumber(View view) {

        EditText numberText = (EditText) findViewById(R.id.numberEditText);
        int number = Integer.parseInt(numberText.getText().toString());

        int sum = 0;
        String message;

        if (NumberShapes.isTriangular(number)) {
            Log.i("Number is ", "triangular.");
        }

        if (NumberShapes.isSquare(number)) {
            Log.i("Number is ", "square");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
