package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FourteenProgramActivity extends AppCompatActivity {
    TextView text,text2,text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen_program);
        text = findViewById(R.id.program14);
        text.setText("/**Leap Year : If the year is completely divisible by 4.\n" +
                "but If the year is century year then it must be divisible by 400.\n" +
                "Example : 2020 - Leap Year : divisible by 4\n" +
                "2021 - Not Leap Year : not divisible by 4\n" +
                "2000 - Leap Year : century year and divisible by 400\n" +
                "2100 - Not Leap Year : century year, but not divisible by 400\n" +
                " **/\n" +
                "class Program14\n" +
                "{\n" +
                "    static void main(int y) // here variable y is to input year.\n" +
                "    {\n" +
                "        if(y%100==0) // to check Year is century year or not.\n" +
                "        {\n" +
                "            if(y%400==0) // checking whether year is divisible by 400 or not.\n" +
                "                System.out.println(\"Leap Year\");\n" +
                "            else\n" +
                "                System.out.println(\"Not Leap Year\");\n" +
                "        }\n" +
                "        else // for non-century year\n" +
                "        {\n" +
                "            if(y%4==0)\n" +
                "                System.out.println(\"Leap Year\");\n" +
                "            else\n" +
                "                System.out.println(\"Not Leap Year\");\n" +
                "        }\n" +
                "    }\n" +
                "}\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Leap Year : If the year is completely divisible by 4."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("but If the year is century year then it must be divisible by 400."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example : 2020 - Leap Year : divisible by 4"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("2021 - Not Leap Year : not divisible by 4"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("2000 - Leap Year : century year and divisible by 400"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("2100 - Not Leap Year : century year, but not divisible by 400"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// here variable y is to input year."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// to check Year is century year or not."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// checking whether year is divisible by 400 or not."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// for non-century year"),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output14one);
        text2.setText("Leap Year");
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:-"),
                Color.rgb(255, 140, 0)).into(text2);

        text3 = findViewById(R.id.output14two);
        text3.setText("Not Leap Year");
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:-"),
                Color.rgb(255, 140, 0)).into(text3);


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

