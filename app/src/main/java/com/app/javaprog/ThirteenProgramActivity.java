package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ThirteenProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen_program);
        text = findViewById(R.id.program13);
        text.setText("/**\n" +
                "Input length of three sides of a triangle, check and print whether triangle is possible or not with\n" +
                "input three sides.\n" +
                "If triangle is possible then print what type of a triangle it is : Equilateral, Isosceles or Scalene.\n" +
                "Rules :\n" +
                "Sum of lengths of every two sides must be greater than the third to form the triangle.\n" +
                "Equilateral : If all the sides are equal.\n" +
                "Isosceles : If any two sides are equal.\n" +
                "Scalene : If length of all the sides are different.\n" +
                " **/\n" +
                "\n" +
                "class Program13\n" +
                "{\n" +
                "    static void main(int a,int b,int c)\n" +
                "    {\n" +
                "        if(a+b>c && a+c>b && b+c>a)\n" +
                "        {\n" +
                "            System.out.println(\"Triangle is possible\");\n" +
                "            if(a==b && b==c)\n" +
                "                System.out.println(\"Equilateral triangle\");\n" +
                "            else\n" +
                "            if(a==b || b==c || a==c)\n" +
                "                System.out.println(\"Isosceles triangle\");\n" +
                "            else\n" +
                "                System.out.println(\"Scalene triangle\");\n" +
                "        }\n" +
                "        else\n" +
                "            System.out.println(\"Triangle is not possible\");\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Input length of three sides of a triangle, check and print whether triangle is possible or not with"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("input three sides."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("If triangle is possible then print what type of a triangle it is : Equilateral, Isosceles or Scalene."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Rules :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Sum of lengths of every two sides must be greater than the third to form the triangle."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Equilateral : If all the sides are equal."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Isosceles : If any two sides are equal."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Scalene : If length of all the sides are different."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output13);
        text2.setText("Triangle is possible\n" +
                "Scalene triangle");
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:-"),
                Color.rgb(255, 140, 0)).into(text2);



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

