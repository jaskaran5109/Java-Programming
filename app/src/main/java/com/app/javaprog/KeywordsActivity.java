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

public class KeywordsActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keywords);
        text = findViewById(R.id.textView10);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
       text.setText("Keywords are predefined or reserved words that convey special meaning to the Java compiler. Each keyword is assigned a special task or function. Compiler takes some action when they appear in the program. \n" +
                "\nA keyword should always be written in lowercase/small letters. \n\nJava supports various keywords, some of them are listed below:\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Keywords"),
                Color.rgb(0, 0, 255)).into(text);

        new PatternEditableBuilder().addPattern(Pattern.compile("Java supports various keywords, some of them are listed below:"),
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