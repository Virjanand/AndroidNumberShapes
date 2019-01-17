package com.virjanand.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

        int sum = 0;
        String message = "";

        if (numberText.getText().toString().isEmpty()) {
            message = "Please enter a number";
        } else {
            int number = Integer.parseInt(numberText.getText().toString());
            if (NumberShapes.isTriangular(number)) {
                message = "Triangular";
            }

            if (NumberShapes.isSquare(number)) {
                if (message == "" || message == null) {
                    message = "Square";
                } else {
                    message = "Both triangular and square";
                }
            }

            if (message == "" || message == null) {
                message = "Neither triangular nor square";
            }
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
