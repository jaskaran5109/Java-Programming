package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FifthProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_program);
        text = findViewById(R.id.program5);
        text.setText("class Program5\n" +
                "{\n" +
                "    static void main(int a,int b) \n" +
                "    {\n" +
                "        if(a>b) \n" +
                "            System.out.println(a); //if condition is true it will print the value of a\n" +
                "        else\n" +
                "            System.out.println(b); //if condition is false it will print the value of b\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "// Never put semicolon after ‘if’ and ‘else’\n" +
                "// Example:\n" +
                "/** if(a>b) // It means ‘If’ condition is terminated here. No use of ‘else’ here.\n" +
                " System.out.println(a);\n" +
                " else\n" +
                " System.out.println(b);  **/\n" +
                "\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("// Never put semicolon after \u2018if\u2019 and \u2018else\u2019"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Example:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//if condition is true it will print the value of a"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//if condition is false it will print the value of b"),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output5);
        text2.setText("12");
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

