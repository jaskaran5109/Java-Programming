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

public class FunctionInJavaActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function_in_java);
        text = findViewById(R.id.textView16);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("In Java Functions are also called Methods. Each and every function belongs to one class. \n" +
                "\nA method is a block of code or instructions which only executes when it is called.  We can pass data, known as parameters, into a method. Methods are used to perform certain task, and they are also known as functions.\n" +
                "\n" +
                "Functions are of two types:\n" +
                "\n1.\tInbuilt or Library functions\n" +
                "2.\tUser-defined functions\n" +
                "\n" +
                "1.\tInbuilt or Library functions : These are pre-defined functions, already present in the library classes of java. We have to just execute or call them using class name or its object’s name.\n" +
                "\nExample :  Functions belongs to Math class , String class , Character class etc.\n" +
                "some functions belongs to Math class are : \n" +
                "pow(x,y)  :  to calculate x raised to power y.\n" +
                "sqrt(x)\t    :   to calculate square root of a number(x).\n" +
                "\n" +
                "2.\tUser-defined functions :  The functions which are defined/created by the user or programmer to perform some specific task.\n" +
                "Suppose you want to calculate area  of circle and there is not any pre-defined function to calculate area, So you can create function by providing any name to perform this task.\n" +
                "(In later topics we will discuss how to create or define such kind of functions).\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Methods"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Functions are of two types:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Inbuilt or Library functions :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("User-defined functions :"),
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
