package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class NinthProgramActivity extends AppCompatActivity {
    TextView text,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_program);
        text = findViewById(R.id.program9);
        text.setText("class Program9\n" +
                "{\n" +
                "    static void main(int a,int b,int c)\n" +
                "    {\n" +
                "        int h;\n" +
                "        h = (a>b) ? a : b ; // if condition is true value of 'a' will be stored to 'h'\n" +
                "        // otherwise value of 'b'.\n" +
                "        h = (c>h) ? c : h ; // if condition is true value of 'c' will be stored to 'h'\n" +
                "        // otherwise value of 'h' will remain same.\n" +
                "        System.out.println(h);\n" +
                "    }\n" +
                "}\n" +
                "/** Dry run working of the prorgram.\n" +
                "Let a= 10, b= 20, c =15\n" +
                "h = (10>20) ? a : b // condition is false, so h=20\n" +
                "h = (15>20) ? c : h // condition is false, so h will remain 20.\n" +
                "output : 20\n" +
                " **/");
        new PatternEditableBuilder().addPattern(Pattern.compile("// if condition is true value of 'a' will be stored to 'h'"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// otherwise value of 'b'."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// if condition is true value of 'c' will be stored to 'h'"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// otherwise value of 'h' will remain same."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Dry run working of the prorgram."),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output9);
        text2.setText("20");
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