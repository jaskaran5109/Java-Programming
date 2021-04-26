package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class TwentyEightProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_eight_program);
        text = findViewById(R.id.program28);
        text.setText("/**\n" +
                "  Program to input a number and print the sum of its digits.\n" +
                "  Example : n = 457\n" +
                "  sum of the digits = 16\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Digits\n" +
                "{\n" +
                "    static int sod(int n)  //  if n = 457\n" +
                "    {\n" +
                "        int r,s=0;\n" +
                "        do\n" +
                "        {              //  I round    II round   III round\n" +
                "            r=n%10;   // r= 457%10=7  r=45%10=5  r=4%10=4             \n" +
                "            s=s+r;    // s=0+7=7      s=7+5=12   s=12+4=16\n" +
                "            n=n/10;  // n= 457/10=45  n=45/10=4  n=4/10=0 : loop will terminated\n" +
                "        }while(n!=0);\n" +
                "        return s;   //  finally  16 will be returned back.\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        int n,k;  \n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        n = scan.nextInt();\n" +
                "        k = sod(n);\n" +
                "        System.out.println(\"sum of the digits \"+k);\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile(" Program to input a number and print the sum of its digits."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example : n = 457"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("sum of the digits = 16"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  if n = 457"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  I round    II round   III round"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// r= 457%10=7  r=45%10=5  r=4%10=4"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// s=0+7=7      s=7+5=12   s=12+4=16"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// n= 457/10=45  n=45/10=4  n=4/10=0 : loop will terminated"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  finally  16 will be returned back."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output28);
        text2.setText("Enter a number \n" +
                "457\n" +
                "sum of the digits 16");



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