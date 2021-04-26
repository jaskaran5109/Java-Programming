package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ThirtyOneProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_one_program);
        text = findViewById(R.id.program31);
        text.setText("/**\n" +
                "  Program to input a number and check it is magical or not.\n" +
                "  Magical numbers, we can say if the eventual sum of digits of number is 1.\n" +
                "  Example : 9874 -> 9+8+7+4 =28 ->2+8=10 ->1+0=1  : so magical number\n" +
                "            9875 -> 9+8+7+5 =29 ->2+9=11 ->1+1=2  : so not magical number\n" +
                " **/\n" +
                "\n" +
                "import java.util.*;\n" +
                "class Magical\n" +
                "{\n" +
                "    static int sod(int n)\n" +
                "    {\n" +
                "        int r,d=0;  \n" +
                "        do\n" +
                "        {              \n" +
                "            r=n%10;                   \n" +
                "            d=d + r;  \n" +
                "            n=n/10;      \n" +
                "        }while(n!=0);\n" +
                "        return d;\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        int n,k;  \n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        n = scan.nextInt();\n" +
                "        while(n>9)\n" +
                "        {\n" +
                "            n =sod(n);\n" +
                "        }\n" +
                "        if(n==1)\n" +
                "            System.out.println(\"magical\");\n" +
                "        else\n" +
                "            System.out.println(\"not magical\");\n" +
                "\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to input a number and check it is magical or not."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Magical numbers, we can say if the eventual sum of digits of number is 1."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example : 9874 -> 9\\+8\\+7\\+4 =28 ->2\\+8=10 ->1\\+0=1  : so magical number"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("9875 -> 9\\+8\\+7\\+5 =29 ->2\\+9=11 ->1\\+1=2  : so not magical number"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output31);
        text2.setText("Output1:-\n" +
                "Enter a number \n" +
                "9874\n" +
                "magical\n" +
                "Output2:-\n" +
                "Enter a number \n" +
                "9875\n" +
                "not magical");
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