package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class EleventhProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh_program);
        text = findViewById(R.id.program11);
        text.setText("class Program11\n" +
                "{\n" +
                "    static void main(int a,int b,int c)\n" +
                "    {\n" +
                "        if(a>b && a>c) // conditon 1\n" +
                "            System.out.println(a); // if both the conditions are true it will print the value of ‘a’\n" +
                "        // and no other statement will execute.\n" +
                "        else\n" +
                "        if(b>c) // condition 2 : if condition 1 is false then only it will be compared\n" +
                "            System.out.println(b); // if condition 2 is true then value of b will be printed.\n" +
                "        else\n" +
                "            System.out.println(c); // if condition 2 is also false then only the value of 'c' will be printed.\n" +
                "    }\n" +
                "}\n" +
                "\n/** Dry run working of the program.\n" +
                "Let a=20 , b=50 , c=10\n" +
                "if(20>50 && 20>10) Here 20 is not greater than 50 but 20 is greater than 10, so whole condition\n" +
                "will become false. Here &&(AND logical operator) is used.\n" +
                "System.out.println(a); this statement will not execute.\n" +
                "else Condition 1 is false, it means 'a' is not greater, so greater can be either 'b' or 'c'\n" +
                "if(50>10) here 50 is greater than 10 which is true.\n" +
                "System.out.println(b); this statement will execute and 50 will be printed.\n" +
                "else\n" +
                "System.out.println(c); this statement will not execute.\n" +
                " **/");
        new PatternEditableBuilder().addPattern(Pattern.compile("// conditon 1"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// if both the conditions are true it will print the value of ‘a’"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// and no other statement will execute."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// condition 2 : if condition 1 is false then only it will be compared"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// if condition 2 is true then value of b will be printed."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// if condition 2 is also false then only the value of 'c' will be printed."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Dry run working of the program."),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output11);
        text2.setText("50");
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

