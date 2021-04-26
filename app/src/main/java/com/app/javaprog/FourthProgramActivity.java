package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FourthProgramActivity extends AppCompatActivity {
    TextView text,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_program);
        text = findViewById(R.id.program4);
        text.setText("/* Program to input the amount in Rs. and print the Denominations of the Indian currency from higher to lower.\n" +
                "  Example :\n" +
                "  Amount Rs. :17776\n" +
                "  2000 x 8\n" +
                "  500 x 3\n" +
                "  200 x 1\n" +
                "  100 x 0\n" +
                "  50 x 1\n" +
                "  20 x 1\n" +
                "  10 x 0\n" +
                "  5 x 1\n" +
                "  2 x 0\n" +
                "  1 x 1\n" +
                " */\n" +
                "public class Program4\n" +
                "{\n" +
                "    static void main(int amt)\n" +
                "    {\n" +
                "        int q;\n" +
                "        System.out.println(\"Amount Rs. :\"+amt);\n" +
                "        q = amt/2000;\n" +
                "        System.out.println(\"2000 x \"+q);\n" +
                "        amt = amt%2000;\n" +
                "        q = amt/500;\n" +
                "        System.out.println(\"500 x \"+q);\n" +
                "        amt = amt%500;\n" +
                "        q = amt/200;\n" +
                "        System.out.println(\"200 x \"+q);\n" +
                "        amt = amt%200;\n" +
                "        q = amt/100;\n" +
                "        System.out.println(\"100 x \"+q);\n" +
                "        amt = amt%100;\n" +
                "        q = amt/50;\n" +
                "        System.out.println(\"50 x \"+q);\n" +
                "        amt = amt%50;\n" +
                "        q = amt/20;\n" +
                "        System.out.println(\"20 x \"+q);\n" +
                "        amt = amt%20;\n" +
                "        q = amt/10;\n" +
                "        System.out.println(\"10 x \"+q);\n" +
                "        amt = amt%10;\n" +
                "        q = amt/5;\n" +
                "        System.out.println(\"5 x \"+q);\n" +
                "        amt = amt%5;\n" +
                "        q = amt/2;\n" +
                "        System.out.println(\"2 x \"+q);\n" +
                "        amt = amt%2;\n" +
                "        System.out.println(\"1 x \"+amt);\n" +
                "    }\n" +
                "}\n" +
                "\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to input the amount in Rs. and print the Denominations of the Indian currency from higher to lower."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Amount Rs. :17776"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("2000 x 8"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("500 x 3"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("200 x 1"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("100 x 0"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("50 x 1"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("20 x 1"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("10 x 0"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("5 x 1"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("2 x 0"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("1 x 1"),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output4);
        text2.setText("Amount Rs. :17776\n" +
                "2000 x 8\n" +
                "500 x 3\n" +
                "200 x 1\n" +
                "100 x 0\n" +
                "50 x 1\n" +
                "20 x 1\n" +
                "10 x 0\n" +
                "5 x 1\n" +
                "2 x 0\n" +
                "1 x 1");
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