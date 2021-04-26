package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ThirtyEightProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_eight_program);
        text = findViewById(R.id.program38);
        text.setText("class Beta\n" +
                "{\n" +
                "    int a,b; //a & b are called instance variables or data members\n" +
                "\n" +
                "    Beta()  // default constructor\n" +
                "    {\n" +
                "        a=5;\n" +
                "        b=10;\n" +
                "    }\n" +
                "\n" +
                "    Beta(int x,int y) // parameterised constructor (1)\n" +
                "    {\n" +
                "        a=x;\n" +
                "        b=y;\n" +
                "    }\n" +
                "\n" +
                "    Beta(int x) // parameterised constructor (2)\n" +
                "    {\n" +
                "        a=x;\n" +
                "        b=x;\n" +
                "    }\n" +
                "\n" +
                "    void display()\n" +
                "    {\n" +
                "        System.out.println(a+\"\\t\"+b);\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Beta obj1 = new Beta(15,16); // Creation of obj1 ,parameterised constructor(1) will be invoked\n" +
                "        Beta obj2 = new Beta(50,60); // Creation of obj2,parameterised constructor(1) will be invoked\n" +
                "        Beta obj3 = new Beta(); // Creation of obj3,default constructor will be invoked\n" +
                "        Beta obj4 = new Beta(12); // Creation of obj4,parameterised constructor(2) will be invoked\n" +
                "        obj1.display(); // this function will print the values of a & b   15,16\n" +
                "        obj2.display(); // this function will print the values of a & b   50,60 \n" +
                "        obj3.display(); // this function will print the values of a & b   5,10 \n" +
                "        obj4.display(); // this function will print the values of a & b   12,12 \n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("// this function will print the values of a & b   12,12"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// this function will print the values of a & b   5,10"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// this function will print the values of a & b   50,60"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// this function will print the values of a & b   15,16"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Creation of obj4,parameterised constructor\\(2\\) will be invoked"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Creation of obj3,default constructor will be invoked"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Creation of obj2,parameterised constructor\\(1\\) will be invoked"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Creation of obj1 ,parameterised constructor\\(1\\) will be invoked"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// parameterised constructor \\(2\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// parameterised constructor \\(1\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// default constructor"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//a & b are called instance variables or data members"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output38);
        text2.setText("15\t 16\n" +
                "50\t 60\n" +
                "5\t  10\n" +
                "12\t 12");
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