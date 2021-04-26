package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SeventeenProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeen_program);
        text = findViewById(R.id.program17);
        text.setText("\npublic class F1\n" +
                "{\n" +
                "    static void add(int a,int b) /** here variable a and b are called parameterized variables**/\n" +
                "    {\n" +
                "        int s;\n" +
                "        s=a+b;\n" +
                "        System.out.println(\"Sum is \"+s);\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        add(5,20); // calling the function add by passing values\n" +
                "        // 5 will be passed to 'a' and 20 to 'b'\n" +
                "    }\n" +
                "}\n" +
                "/**\n" +
                "output:\n" +
                "sum is 25\n" +
                " **/");
        new PatternEditableBuilder().addPattern(Pattern.compile("here variable a and b are called parameterized variables"),
                Color.rgb(0, 0, 255)).into(text);

        new PatternEditableBuilder().addPattern(Pattern.compile("// calling the function add by passing values"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// 5 will be passed to 'a' and 20 to 'b'"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("sum is 25"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("output:"),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output17);
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