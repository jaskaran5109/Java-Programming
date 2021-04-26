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

public class VisibilityModesActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visibility_modes);
        text = findViewById(R.id.textView37);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Visibility modes :\n" +
                "\n" +
                "1.private\n" +
                "2.public\n" +
                "3.protected\n" +
                "\n" +
                "private:  If it written before any data member and function, then it can only be accessible within the class, not outsides the class.\n" +
                "\n" +
                "default:  It is not the keyword, it means nothing you have to write before the  data members or functions, then it can be accessible outside the class but in same package.\n" +
                "\n" +
                "protected :  protected data members or functions can be accessible outside the package but only in sub classes (only using the concept of inheritance).\n" +
                "\n" +
                "public : public data members or functions can be accessible anywhere i.e. same class, other class or classes from other packages.\n" +
                "\n" +
                "Table  to explain the accessibility of different visibility modes :");

        new PatternEditableBuilder().addPattern(Pattern.compile("Visibility modes :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("private:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("default:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("protected :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("public :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Table  to explain the accessibility of different visibility modes :"),
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

