package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ThirtyTwoProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_two_program);
        text = findViewById(R.id.program32);
        text.setText("/**\n" +
                "  This program is to check Single number, whether it is \n" +
                "  Armstrong or not.\n" +
                "  sum of the cube of each digit is the same number is Armstrong number\n" +
                "  Example :  if number is 153\n" +
                "  cube of 1 : 1\n" +
                "  cube of 5 : 125\n" +
                "  cube of 3 : 27\n" +
                "  there sum : 1+125+27 = 153\n" +
                " **/\n" +
                "\n" +
                "import java.util.*;\n" +
                "class Armstrong\n" +
                "{\n" +
                "\n" +
                "    static void armstrong(int n)\n" +
                "    {\n" +
                "        int r,s=0,t=n;\n" +
                "        do\n" +
                "        {\n" +
                "            r =n%10;\n" +
                "            s = s + r*r*r;\n" +
                "            n=n/10;\n" +
                "        }while(n!=0);\n" +
                "        if(t==s)\n" +
                "            System.out.println(\"Armstrong\");\n" +
                "        else\n" +
                "            System.out.println(\"NOT Armstrong\");\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        int n;  \n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        n = scan.nextInt();\n" +
                "        armstrong(n);\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("This program is to check Single number, whether it is"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Armstrong or not."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("sum of the cube of each digit is the same number is Armstrong number"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :  if number is 153"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("cube of 1 : 1"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("cube of 5 : 125"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("cube of 3 : 27"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("there sum : 1\\+125\\+27 = 153"),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output32);
        text2.setText("Output1:-\n" +
                "Enter a number \n" +
                "153\n" +
                "Armstrong\n" +
                "Output2:-\n" +
                "Enter a number \n" +
                "454\n" +
                "NOT Armstrong");
        new PatternEditableBuilder().addPattern(Pattern.compile("Output1:-"),
                Color.rgb(255, 140, 0)).into(text2);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output2:-"),
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