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

public class CallByValueActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_by_value);
        text = findViewById(R.id.textView29);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Call by Value means calling a method with a parameter as value. Through this, the argument value is passed to the parameter.\n" +
                "\n" +
                "Example: Passing values through primitive data types.\n" +
                "\n" +
                "In call by value, the changes being done in the called method, is not affected in the calling method. \n" +
                "\n" +
                "The modification done to the formal parameter does not reflect in the actual parameter.\n" +
                "\n" +
                "// Example of call by value\n" +
                "\n" +
                "class CallByValue\n" +
                "{\n" +
                "    static void display(int n) // here n is formal parameter\n" +
                "    {\n" +
                "        n=n+100;   // adding 100 to n\n" +
                "        System.out.println(\"n = \"+n); // n = 125\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        int a=25;\n" +
                "        display(a);// passing value of 'a' as an actual paramter\n" +
                "        System.out.println(\"a = \"+a);  //  a = 25\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "Output:\n" +
                "n = 125\n" +
                "a = 25\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("//  a = 25"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// passing value of 'a' as an actual paramter"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// n = 125"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// adding 100 to n"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// here n is formal parameter"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Example of call by value"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Call by Value"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example:"),
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

