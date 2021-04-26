package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class NineteenProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineteen_program);
        text = findViewById(R.id.program19);
        text.setText("/**   Use of Scanner class\n" +
                "    Scanner class is present in util package of java library\n" +
                "    Package is a collection of classes.\n" +
                "    first of all use the statement :  import java.util.Scanner or import java.util.*\n" +
                "    Here is an example program : to find the sum of two input numbers using scanner class\n" +
                " **/\n" +
                "\n" +
                "import java.util.*;\n" +
                "class F3\n" +
                "{\n" +
                "    static void main()\n" +
                "    {\n" +
                "        int a,b,s;\n" +
                "        Scanner scan = new Scanner(System.in);  \n" +
                "        //  creating object of scanner class : object name is scan\n" +
                "        System.out.println(\"Enter two numbers \");\n" +
                "        a = scan.nextInt(); //  nextInt is the function to input integer value at run time.\n" +
                "        b = scan.nextInt();\n" +
                "        s=a+b;\n" +
                "        System.out.println(\"sum is \"+s);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                "Output:\n" +
                "Enter two numbers \n" +
                "45\n" +
                "35\n" +
                "sum is 80\n" +
                " **/");
            new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Enter two numbers"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("45"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("35"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("sum is 80"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  nextInt is the function to input integer value at run time."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  creating object of scanner class : object name is scan"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Use of Scanner class"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Scanner class is present in util package of java library"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Package is a collection of classes."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile(" first of all use the statement :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Here is an example program : to find the sum of two input numbers using scanner class"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output19);
        text2.setText("Enter two numbers \n" +
                "45\n" +
                "35\n" +
                "sum is 80");
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