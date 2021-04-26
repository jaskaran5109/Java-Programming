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

public class IdentifierActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifier);
        text = findViewById(R.id.textView11);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Variables are data items whose values can be changed during the execution of program or the names given by the programmer to the different parts of the programs. Examples: Name of the variable, function, arrays, class, package etc.\n" +
                       "\n" +
                       "Rules to write Name of the variables or Identifiers/variables :\n\n" +
                       "1.\tIdentifiers can have alphabets, digits, underscore and dollar sign characters.\n" +
                       "2.\tMust not be a key word, boolean literal.\n" +
                       "3.\tMust not begin with a digit.\n" +
                       "4.\tIt can be of any length.\n" +
                       "5.\tJava is a case sensitive language, so uppercase and lowercase letters are treated differently.\n" +
                       "\n" +
                       "Some examples of Variable names:-\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Variables"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Rules to write Name of the variables or Identifiers/variables :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Some examples of Variable names:-"),
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