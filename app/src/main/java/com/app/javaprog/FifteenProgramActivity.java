package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FifteenProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen_program);
        text = findViewById(R.id.program15);
        text.setText("/**\n" +
                "Input marks in five subjects, print the toal, percentage and grades as per following criteria.\n" +
                "Maximum marks : 100\n" +
                "Criteria Grades\n" +
                "90 or above : A+\n" +
                "80 to below 90 : A\n" +
                "70 to below 80 : B+\n" +
                "60 to below 70 : B\n" +
                "50 to below 60 : C\n" +
                "40 to below 50 : D\n" +
                "Below 40 : Fail.\n" +
                " **/\n" +
                "class Program15\n" +
                "{\n" +
                "    static void main(int m1,int m2,int m3,int m4,int m5) /** m1,m2,m3,m3,m4 are marks in five subjects.*/\n" +
                "    {\n" +
                "        int total; // variable to store total\n" +
                "        float per; // variable to store the percentage\n" +
                "        total = m1+m2+m3+m4+m5; // calculating total marks\n" +
                "        per = (float)total/500 * 100 ; // calculating percentage\n" +
                "        System.out.println(\"Input Marks are : \"+m1+\" \"+m2+\" \"+m3+\" \"+m4+\" \"+m5);\n" +
                "        System.out.println(\"Total Marks : \"+total);\n" +
                "        System.out.println(\"Percentage : \"+per);\n" +
                "        if(per>=90)\n" +
                "            System.out.println(\"Grade : A+\");\n" +
                "        else\n" +
                "        if(per>=80 && per<90)\n" +
                "            System.out.println(\"Grade : A\");\n" +
                "        else\n" +
                "        if(per>=70 && per<80)\n" +
                "            System.out.println(\"Grade : B+\");\n" +
                "        else\n" +
                "        if(per>=60 && per<70)\n" +
                "            System.out.println(\"Grade : B\");\n" +
                "        else\n" +
                "        if(per>=50 && per<60)\n" +
                "            System.out.println(\"Grade : C\");\n" +
                "        else\n" +
                "        if(per>=40 && per<50)\n" +
                "            System.out.println(\"Grade : D\");\n" +
                "        else\n" +
                "            System.out.println(\"FAIL\");\n" +
                "    }\n" +
                "}\n" +
                "/** Example :\n" +
                "Input Marks are : 70 80 85 90 60\n" +
                "Total Marks : 385\n" +
                "Percentage : 77.0\n" +
                "B+\n" +
                " **/\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Input marks in five subjects, print the toal, percentage and grades as per following criteria."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Maximum marks : 100"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Criteria Grades"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("90 or above : A+"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("80 to below 90 : A"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("70 to below 80 : B+"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("60 to below 70 : B"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("50 to below 60 : C"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("40 to below 50 : D"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Below 40 : Fail."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("m1,m2,m3,m3,m4 are marks in five subjects."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// variable to store total"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// variable to store the percentage"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// calculating total marks"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// calculating percentage"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Input Marks are : 70 80 85 90 60"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Total Marks : 385"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Percentage : 77.0"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("B+"),
                Color.rgb(0, 0, 255)).into(text);



        text2 = findViewById(R.id.output15);
        text2.setText("Input Marks are : 70 80 85 90 60\n" +
                "Total Marks : 385\n" +
                "Percentage : 77.0\n" +
                "Grade : B+");
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

