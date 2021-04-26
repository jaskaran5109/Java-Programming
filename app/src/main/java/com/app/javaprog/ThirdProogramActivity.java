package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ThirdProogramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_proogram);
        text = findViewById(R.id.program3);
        text.setText("public class Program3\n" +
                "{\n" +
                "    static void main(int a,int b)\n" +
                "    {\n" +
                "        int q,r;\n" +
                "        q = a/b;\n" +
                "        r = a%b;\n" +
                "        System.out.println(\"Quotient \"+q);\n" +
                "        System.out.println(\"Remainder \"+r);\n" +
                "    }\n" +
                "}\n" +
                "// if a = 20 and b = 6\n" +
                "// q = 20/6 = 3 only integer part : quotient\n" +
                "// r = 20%6 = 2 remainder in integer.\n" +
                "\n" +
                "// OUTPUT:\n" +
                "// Quotient 3\n" +
                "// Remainder 2 \n" +
                "\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("// if a = 20 and b = 6"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// q = 20/6 = 3 only integer part : quotient"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// r = 20%6 = 2 remainder in integer."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// OUTPUT:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Quotient 3"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Remainder 2"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output3);
        text2.setText("Quotient 3\n" +
                "Remainder 2");
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