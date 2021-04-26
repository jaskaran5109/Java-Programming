package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram12 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program12);
        text = findViewById(R.id.string12program);
        text.setText("/**\n" +
                "program to print the output in the following rotation format, if the string is \"MOUSE\"\n" +
                "MOUSE\n" +
                "OUSE\n" +
                "USE\n" +
                "SE\n" +
                "E\n" +
                " */\n" +
                "class St10\n" +
                "{\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        String st=\"MOUSE\";\n" +
                "        int n=st.length();\n" +
                "        for(int i=0;i<n;i++)\n" +
                "        {\n" +
                "            for(int j=i;j<n;j++)\n" +
                "            {\n" +
                "                System.out.print(st.charAt(j));\n" +
                "            }\n" +
                "            System.out.println();\n" +
                "        }\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("MOUSE\n" +
                        "OUSE\n" +
                        "USE\n" +
                        "SE\n" +
                        "E"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("program to print the output in the following rotation format, if the string is \"MOUSE\""),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.string12output);
        text2.setText("MOUSE\n" +
                "OUSE\n" +
                "USE\n" +
                "SE\n" +
                "E");
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

