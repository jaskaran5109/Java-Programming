package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class PatternProgram8 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_program8);
        text = findViewById(R.id.pattern8program);
        text.setText("/**\n" +
                "1\n" +
                "22\n" +
                "333\n" +
                "4444\n" +
                "55555\n" +
                " */\n" +
                "\n" +
                "class Nested\n" +
                "{\n" +
                "    static void main()\n" +
                "    {\n" +
                "        int i,j;\n" +
                "        for(i=1;i<=5;i++)\n" +
                "        {\n" +
                "            for(j=1;j<=i;j++)\n" +
                "            {\n" +
                "                System.out.print(i);\n" +
                "            }\n" +
                "            System.out.println();\n" +
                "        }   \n" +
                "    }\n" +
                "}\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("1\n" +
                        "22\n" +
                        "333\n" +
                        "4444\n" +
                        "55555"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.pattern8output);
        text2.setText("1\n" +
                "22\n" +
                "333\n" +
                "4444\n" +
                "55555");
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