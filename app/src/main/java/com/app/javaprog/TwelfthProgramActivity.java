package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class TwelfthProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelfth_program);
        text = findViewById(R.id.program12);
        text.setText("class Program12\n" +
                "{\n" +
                "    static void main(int a,int b,int c,int d,int e)\n" +
                "    {\n" +
                "        int h= a; // value of 'a' is stored in 'h'\n" +
                "        if(b>h)\n" +
                "            h=b; // if condition is true value of 'b' will store in 'h'\n" +
                "        if(c>h)\n" +
                "            h=c; // if condition is true value of 'c' will store in 'h'\n" +
                "        if(d>h)\n" +
                "            h=d; // if condition is true value of 'd' will store in 'h'\n" +
                "        if(e>h)\n" +
                "            h=e; // if condition is true value of 'e' will store in 'h'\n" +
                "        System.out.println(\"Biggest is \"+h); // finally value of 'h' is printed.\n" +
                "    }\n" +
                "}\n" +
                "/** Dry run working of the program.\n" +
                "Let a=20 , b=50 , c=10 , d=80 , e=40\n" +
                "int h = 20;\n" +
                "if(50>20)\n" +
                "h=b; // condition is true, so h=50 now.\n" +
                "if(10>50) // condition is false.\n" +
                "h=c; // this statement will not execute, 'h' will remain 50.\n" +
                "if(80>50) // conditon is true\n" +
                "h=d; // this statement will execute, so h=80 now.\n" +
                "if(40>80) // condition is false\n" +
                "h=e; // this statement will not execute, 'h' will remain 80.\n" +
                "System.out.println(\"Biggest is \"+h); // final value of 'h' is 80.\n" +
                "//output : Biggest is 80\n" +
                " **/");
        new PatternEditableBuilder().addPattern(Pattern.compile("// value of 'a' is stored in 'h'"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// if condition is true value of 'b' will store in 'h'"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// if condition is true value of 'c' will store in 'h'"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// if condition is true value of 'd' will store in 'h'"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// if condition is true value of 'e' will store in 'h'"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// finally value of 'h' is printed."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Dry run working of the program."),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output12);
        text2.setText("Biggest is 80");
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

