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

public class WrapperClassActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrapper_class);
        text = findViewById(R.id.textView24);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Wrapper Classes are those classes, in which functions are wrapped to convert the value of primitive data type to object and object to primitive data.\n" +
                "\n" +
                "Example:  Numeric to String\n" +
                "               String to numeric\n" +
                "\n" +
                "Each data type is associated with a wrapper class:\n" +
                "\n" +
                "Data types\tWrapper classes\n" +
                "byte\t\t           Byte\n" +
                "short\t\t         Short\n" +
                "int\t\t             Integer\n" +
                "long\t\t           Long\n" +
                "float\t\t           Float\n" +
                "double\t\t     Double\n" +
                "char\t\t          Character\n" +
                "Boolean\t\t   Boolean\n" +
                "\n" +
                "Integer wrapper class contain many functions. Some of them are explained here.\n" +
                "\n" +
                "To convert String in to integer :\n" +
                "parseInt()  function :\n" +
                "String st = “45”;    \n" +
                "int n =   Integer.parseInt(st);  //  value of  st=”45” will be converted into integer\n" +
                "\n" +
                "valueOf()  function :\n" +
                "String st = “45”;\n" +
                "int n =   Integer.valueOf(st);  //  value of  st=”45” will be converted into integer\n" +
                "\n" +
                "\n" +
                "To convert Integer to String :\n" +
                "toString(int) // static\n" +
                "int n=45;\n" +
                "String st =  Integer.toString(n);   //   value of n will be converted into String\n" +
                "\n" +
                "toString()   // non static\n" +
                "int n=45;\n" +
                "Integer ob = new Integer(n);  //   value of n will be converted into  Integer class object (ob)\n" +
                "String st = ob.toString();   //   value of object(ob) will be converted into String.\n" +
                "\n" +
                "Float wrapper class contain many functions. Some of them are explained here.\n" +
                "\n" +
                "To convert String in to float :\n" +
                "parseInt()  function :\n" +
                "String st = “45”;    \n" +
                "float n  =   Float.parseFloat(st);  //  value of  st=”45” will be converted into float\n" +
                "\n" +
                "valueOf()  function :\n" +
                "String st = “45”;\n" +
                "float n =   Float.valueOf(st);  //  value of  st=”45” will be converted into float\n" +
                "\n" +
                "\n" +
                "To convert float to String :\n" +
                "toString(float) // static\n" +
                "float n=45;\n" +
                "String st =  Float.toString(n);   //   value of n will be converted into String\n" +
                "\n" +
                "toString()   // non static\n" +
                "float n=45;\n" +
                "Float ob = new Float(n);  // value of n will be converted into  Float class object (ob)\n" +
                "String st = ob.toString();   //value of object(ob) will be converted into String.\n" +
                "\n" +
                "Same type of functions are also present in Byte, Short, Long & Double Wrapper classes.\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("Wrapper Classes"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Each data type is associated with a wrapper class:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("To convert String in to integer :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("To convert Integer to String :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("To convert String in to float :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("To convert float to String :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("parseInt\\(\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("valueOf\\(\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("toString\\(int\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("toString\\(\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("toString\\(float\\)"),
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

