package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ThirtyFiveProgramActivity extends AppCompatActivity {
    TextView text,text2,text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_five_program);
        text = findViewById(R.id.program35);
        text.setText("class Chars\n" +
                "{\n" +
                "    static void main(char a)\n" +
                "    {\n" +
                "        if(Character.isLetter(a))  // it will check the given character is an Alphabet or not\n" +
                "        // if alphabet it will return true otherwise false.\n" +
                "            System.out.println(\"it is an alphabet\");\n" +
                "        \nif(Character.isDigit(a))  \n" +
                "            System.out.println(\"it is a Digit\");\n" +
                "        \nif(Character.isLetterOrDigit(a))  \n" +
                "            System.out.println(\"it is a Digit/alphabet\");\n" +
                "        \nif(Character.isUpperCase(a))  \n" +
                "            System.out.println(\"it is a capital letter\");\n" +
                "        \nif(Character.isLowerCase(a))  \n" +
                "            System.out.println(\"it is a small letter\");\n" +
                "        \nif(Character.isWhitespace(a))  // or Character.isSpace(a) // any one\n" +
                "            System.out.println(\"it is a space\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                "IF the input character is  'A'\n" +
                "Output will be :\n" +
                "it is an alphabet\n" +
                "it is a Digit/alphabet\n" +
                "it is a capital letter\n" +
                "\n" +
                "IF the input character is  '7'\n" +
                "Output will be :\n" +
                "it is a Digit\n" +
                "it is a Digit/alphabet\n" +
                "\n" +
                " */");
        new PatternEditableBuilder().addPattern(Pattern.compile("// it will check the given character is an Alphabet or not"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// if alphabet it will return true otherwise false."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// or Character.isSpace\\(a\\) // any one"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("IF the input character is  'A'\n" +
                        "Output will be :\n" +
                        "it is an alphabet\n" +
                        "it is a Digit/alphabet\n" +
                        "it is a capital letter\n" +
                        "\n" +
                        "IF the input character is  '7'\n" +
                        "Output will be :\n" +
                        "it is a Digit\n" +
                        "it is a Digit/alphabet"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output35);
        text2.setText("it is an alphabet\n" +
                "it is a Digit/alphabet\n" +
                "it is a capital letter");
        text3 = findViewById(R.id.output351);
        text3.setText("it is a Digit\n" +
                "it is a Digit/alphabet");





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