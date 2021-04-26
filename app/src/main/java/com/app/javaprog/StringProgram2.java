package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram2 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program2);
        text = findViewById(R.id.string2program);
        text.setText("/**\n" +
                "Example:\n" +
                "Input word is : COMPUTER\n" +
                "Output :\n" +
                "R\n" +
                "E\n" +
                "T\n" +
                "U\n" +
                "P\n" +
                "M\n" +
                "O\n" +
                "C\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str2\n" +
                "{\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the string \");\n" +
                "        String a = scan.nextLine();\n" +
                "        for(int i=a.length()-1;i>=0;i--)\n" +
                "        { // loop starts from index of last character\n" +
                "            // as index of last character is length-1\n" +
                "            char k = a.charAt(i);\n" +
                "            System.out.println(k);\n" +
                "        }\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Example:\n" +
                        "Input word is : COMPUTER\n" +
                        "Output :\n" +
                        "R\n" +
                        "E\n" +
                        "T\n" +
                        "U\n" +
                        "P\n" +
                        "M\n" +
                        "O\n" +
                        "C"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// loop starts from index of last character"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// as index of last character is length-1"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string2output);
        text2.setText("Enter the string \n" +
                "COMPUTER\n" +
                "R\n" +
                "E\n" +
                "T\n" +
                "U\n" +
                "P\n" +
                "M\n" +
                "O\n" +
                "C");
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

