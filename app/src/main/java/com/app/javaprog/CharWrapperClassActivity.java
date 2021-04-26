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

public class CharWrapperClassActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char_wrapper_class);
        text = findViewById(R.id.textView25);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Character Wrapper Classes and its functions\n" +
                "\n" +
                "The Character class of the java.lang package wraps a value of the primitive datatype char. \n\nIt offers a number of useful class (i.e., static) methods for manipulating characters. \nWe can create a Character class object with the Character constructor.\t\n" +
                "\n" +
                "Character ch = new Character('a');  \t\n" +
                "or assigning character value to a variable.\t\n" +
                "char ch = 'a';\t\n" +
                "\t\t\n" +
                "Functions                  Return data type\n" +
                "\n" +
                "isLetter(char)\t           boolean\n" +
                "Determines whether the specified char value is a letter.\t\n" +
                "\n" +
                "isDigit(char)\t            boolean\n" +
                "Determines whether the specified char value is a digit.\t\n" +
                "\n" +
                "isLetterOrDigit(char)\t            boolean\n" +
                "Determines whether the specified char value is a letter or a Digit.\t\n" +
                "\n" +
                "isWhitespace(char) or isSpace(char)\tboolean\n" +
                "Determines whether the specified char value is white space.\t\n" +
                "\n" +
                "isUpperCase(char)\t            boolean\n" +
                "Determines whether the specified char value is uppercase.\t\n" +
                "\n" +
                "isLowerCase(char)\t            boolean\n" +
                "Determines whether the specified char value is lowercase.\t\n" +
                "\n" +
                "toUpperCase(char)\t            char.\n" +
                "Returns the uppercase (capital letter) form of the specified char value.\t\n" +
                "\n" +
                "toLowerCase(char)\t            char.\n" +
                "Returns the lowercase (small letter) form of the specified char value.\t\n" +
                "\n" +
                "toString(char)\t               String.\n" +
                "Returns a String object representing the specified character value that is, a one-character string.\t\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("Character Wrapper Classes"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Character ch = new Character\\('a'\\);"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("char ch = 'a';"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Functions Return data type"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("isLetter\\(char\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("isDigit\\(char\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("isLetterOrDigit\\(char\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("isWhitespace\\(char\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("isSpace\\(char\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("isUpperCase\\(char\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("isLowerCase\\(char\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("toUpperCase\\(char\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("toLowerCase\\(char\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("toString\\(char\\)"),
                Color.rgb(0, 0, 255)).into(text);



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

