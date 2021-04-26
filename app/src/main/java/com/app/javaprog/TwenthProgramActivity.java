package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class TwenthProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenth_program);
        text = findViewById(R.id.program20);
        text.setText("/**\n" +
                "  Program to input year and check it is leap or not.\n" +
                "  Leap years contains 366 days, in the month of february 29 days.\n" +
                "  Leap years are those which can be divided completely by 4,if non century years.\n" +
                "  and must be divided by 400 if century years.\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class F4\n" +
                "{\n" +
                "    static boolean isLeap(int y)\n" +
                "    {\n" +
                "        if(y%100==0)\n" +
                "            if(y%400==0)\n" +
                "                return true;\n" +
                "            else\n" +
                "                return false;\n" +
                "            else\n" +
                "            if(y%4==0)\n" +
                "                return true;\n" +
                "            else\n" +
                "                return false;\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the year \");\n" +
                "        int n = scan.nextInt();\n" +
                "        boolean k = isLeap(n);\n" +
                "        if(k==true)\n" +
                "            System.out.println(\"Leap year\");\n" +
                "        else\n" +
                "            System.out.println(\"Not Leap year\");\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to input year and check it is leap or not."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Leap years contains 366 days, in the month of february 29 days."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Leap years are those which can be divided completely by 4,if non century years."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("and must be divided by 400 if century years."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output20);
        text2.setText("Enter the year \n" +
                "2021\n" +
                "Not Leap year");
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