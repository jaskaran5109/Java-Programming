package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SeventhProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_program);
        text = findViewById(R.id.program7);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("class Program7\n" +
                "{\n" +
                "static void main(int a,int b)\n" +
                "{\n" +
                "if(a>b)\n" +
                "System.out.println(\"Greatest is : \"); // statement 1\n" +
                "System.out.println(a); // statement 2\n" +
                "else\n" +
                "System.out.println(\"Biggest is : \"); // statement 3\n" +
                "System.out.println(b); // statement 4\n" +
                "}\n" +
                "}\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("// statement 1"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// statement 3"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// statement 2"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// statement 4"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output7);
        text2.setMovementMethod(ScrollingMovementMethod.getInstance());
        text2.setText("* This program will be display error message : 'else' without 'if'\n" +
                "* because statement 2 is just like hidden else, it means if condition is completed here.\n" +
                "* 'else' this 'else' is treated as extra 'else'.\n" +
                "* (It is already explained in the previous program, how statement1 and statement2 executes.)\n" +
                "*\n" +
                "* What actually we want?\n" +
                "* I would like to execute statement1 and statement2 if condition is true and statement3 and\n" +
                "statement4 if condition is false.\n" +
                "* then make you of blocks. Blocks means { } - curly brackets.\n" +
                "* If you want to execute multiple statements then make use of blocks, example is given below:\n" +
                "*\n" +
                "static void main(int a,int b)\n" +
                "{\n" +
                "if(a>b)\n" +
                "{\n" +
                "System.out.println(\"Greatest is : \"); // statement 1\n" +
                "System.out.println(a); // statement 2\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "System.out.println(\"Biggest is : \"); // statement 3\n" +
                "System.out.println(b); // statement 4\n" +
                "}\n" +
                "}");


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

