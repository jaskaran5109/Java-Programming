package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class DataTypesActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_types);
        text = findViewById(R.id.textView9);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Program :  Program is set of instructions to perform the specific task. Program can be divided into many segments. Collection of programs is called a software.\n" +
                "\n" +
                "Execution of Program\n" +
                "\n" +
                "1.\tSupply the data and instructions through input device (keyboard or any other input source).\n" +
                "2.\tInstructions and data is processed by the CPU.\n" +
                "3.\tDesired result as an output can be displayed on the console (screen).\n" +
                "\n" +
                "So, Before learning any programming language, you must know about the way, how to supply data and instructions.\n" +
                "\n" +
                "Data is classified into two types  PRIMITIVE and NON-PRIMITIVE and further classification is given below.\n" +
                "\n" +
                "Java provides different data types (keywords) for different types of data.\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Execution of Program"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("PRIMITIVE"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("NON-PRIMITIVE"),
                Color.rgb(0, 0, 255)).into(text);


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

    }
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left,
                R.anim.slide_out_right);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_right);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}

