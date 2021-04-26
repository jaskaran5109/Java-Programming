package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram13 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program13);
        text = findViewById(R.id.string13program);
        text.setText("/**\n" +
                "program to print the output in the following rotation format, if the string is \"MOUSE\"\n" +
                "MOUSE\n" +
                "MOUS\n" +
                "MOU\n" +
                "MO\n" +
                "M\n" +
                " */\n" +
                "class St10\n" +
                "{\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        String st=\"MOUSE\";\n" +
                "        int n=st.length();\n" +
                "        for(int i=n-1;i>=0;i--)\n" +
                "        {\n" +
                "            for(int j=0;j<i;j++)\n" +
                "            {\n" +
                "                System.out.print(st.charAt(j));\n" +
                "            }\n" +
                "            System.out.println();\n" +
                "        }\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("MOUSE\n" +
                        "MOUS\n" +
                        "MOU\n" +
                        "MO\n" +
                        "M"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("program to print the output in the following rotation format, if the string is \"MOUSE\""),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string13output);
        text2.setText("MOUSE\n" +
                "MOUS\n" +
                "MOU\n" +
                "MO\n" +
                "M");
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

