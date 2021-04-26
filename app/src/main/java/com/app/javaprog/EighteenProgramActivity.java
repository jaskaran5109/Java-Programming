package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class EighteenProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteen_program);
        text = findViewById(R.id.program18);
        text.setText("/**\n" +
                "return statement\n" +
                "A function can return back only value, if it required. Many return statement can be used but\n" +
                "only one return statement will execute.\n" +
                "\n" +
                "passing values to the functions and a value returned by the function\n" +
                "program to find sum of two numbers using user defined function\n" +
                "In place of void  write  int : which is called return type\n" +
                "functions started with void  cannot return a value.\n" +
                " **/\n" +
                "\n" +
                "public class F2\n" +
                "{\n" +
                "    static int add(int a,int b)\n" +
                "    {\n" +
                "        int s;\n" +
                "        s=a+b;\n" +
                "        return s;  //  value of s will be return back from where it is called\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        int k;\n" +
                "        k = add(5,20);  //  calling the function add by passing values and return by the function\n" +
                "        //  is stored in variable k.\n" +
                "        System.out.println(\"Sum is \"+k);\n" +
                "    }    \n" +
                "}\n" +
                "\n" +
                "/**\n" +
                "output:\n" +
                "sum is 25\n" +
                " **/\n" +
                "\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("return statement\n" +
                        "A function can return back only value, if it required. Many return statement can be used but\n" +
                        "only one return statement will execute.\n" +
                        "\n" +
                        "passing values to the functions and a value returned by the function\n" +
                        "program to find sum of two numbers using user defined function\n" +
                        "In place of void  write  int : which is called return type\n" +
                        "functions started with void  cannot return a value."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  value of s will be return back from where it is called"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  calling the function add by passing values and return by the function"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  is stored in variable k."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("sum is 25"),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output18);
        text2.setText("Sum is 25");

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