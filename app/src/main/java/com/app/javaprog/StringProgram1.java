package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram1 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program1);
        text = findViewById(R.id.string1program);
        text.setText("/**\n" +
                "Example:\n" +
                "Input word is : COMPUTER\n" +
                "Output :\n" +
                "C\n" +
                "O\n" +
                "M\n" +
                "P\n" +
                "U\n" +
                "T\n" +
                "E\n" +
                "R\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str1\n" +
                "{\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the string \");\n" +
                "        String a = scan.nextLine();\n" +
                "        for(int i=0;i<a.length();i++)\n" +
                "        {\n" +
                "            char k = a.charAt(i);\n" +
                "            System.out.println(k);\n" +
                "        }\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Example:\n" +
                        "Input word is : COMPUTER\n" +
                        "Output :\n" +
                        "C\n" +
                        "O\n" +
                        "M\n" +
                        "P\n" +
                        "U\n" +
                        "T\n" +
                        "E\n" +
                        "R"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string1output);
        text2.setText(" Enter the string \n" +
                " COMPUTER\n" +
                " C\n" +
                " O\n" +
                " M\n" +
                " P\n" +
                " U\n" +
                " T\n" +
                " E\n" +
                " R");
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

