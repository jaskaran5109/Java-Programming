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

public class SixthProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_program);
        text = findViewById(R.id.program6);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("class Program6\n" +
                "{\n" +
                "    static void main(int a,int b)\n" +
                "    {\n" +
                "        if(a>b)\n" +
                "            System.out.println(a); // statement 1\n" +
                "        System.out.println(b); // statement 2\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "// if condition is true then statement 1 will execute,\n" +
                "// if it is false statement 1 will not execute.\n" +
                "// It means statement 2 will execute in both the cases, only statement 1 is conditional.\n" +
                "// so, statement 2 will execute like else statement. We can say hidden else.");

        new PatternEditableBuilder().addPattern(Pattern.compile("// if condition is true then statement 1 will execute,"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// if it is false statement 1 will not execute."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// It means statement 2 will execute in both the cases, only statement 1 is conditional."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// so, statement 2 will execute like else statement. We can say hidden else."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// statement 1"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// statement 2"),
                Color.rgb(0, 0, 255)).into(text);



        text2 = findViewById(R.id.output6);
        text2.setMovementMethod(ScrollingMovementMethod.getInstance());
        text2.setText("12\n" +
                "10");
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

