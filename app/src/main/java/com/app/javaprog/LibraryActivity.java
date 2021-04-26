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

public class LibraryActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        text = findViewById(R.id.textView17);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("These are pre-defined functions, already present in the library classes of java. We have to just execute or call them using class name or its object’s name.\n" +
                "\nExample :  Functions belongs to Math class , String class , Character class etc.\n" +
                "\nSome functions belongs to Math class are : \n" +
                "pow(x,y)  :  to calculate x raised to power y.\n" +
                "sqrt(x)\t    :   to calculate square root of a number(x).\n\n" +
                "Functions of Math class:\n" +
                "\nJava Math class provides several methods to perform arithmetic calculations.\n" +
                "\nName of the Function:" +
                " sqrt(n)\nDescription: Calculate and returns the square root a number(n).\nExample: double k = Math.sqrt(n)\n" +
                "\nIt computes and returns the square root of n and gets assigned in variable k, where n can be declared earlier and initialized with some legal value. If n=16, then k will be 4.0.\n" +
                "\nName of the Function: cbrt(n)\nDescription: Calculate and returns the cube root a number(n).\nExample: double k = Math.cbrt (n)\n" +
                "\nIt computes and returns the cube root of n and gets assigned in variable k, where n can be declared earlier and initialized with some legal value. If n=8, then k will be 2.0.\n" +
                "\nName of the Function: pow(m,n)\nDescription: Calculate and returns m raised to the power n.\nExample: double k= Math.pow(m,n)\ti.e. mn,if m= 2 and n=3 then value of k will be 8.0\n" +
                "\nName of the Function: abs(n)\nDescription: returns absolute(positive) value.\nExample: int k = Math.abs(n)\nif n = -15 then k will be 15\n" +
                "\n" +
                "Name of the Function: max(a,b)\nDescription: returns largest out of variables a & b.\nExample: int k = Math.max(a,b)\tif a=10 and b=15, then value of k will be 15 whichever is largest.\n" +
                "\nName of the Function: min(a,b)\nDescription: returns smallest out of variables a & b.\nExample: int k = Math.min(a,b)\tif a=10 and b=15, then value of k will be 10 whichever is smallest.\n" +
                "\nName of the Function: rint(n)\nDescription: returns the double value that is closest integer to the value of n.\nExample: double k = Math.rint(n)\tif n = 5.7 , then value of k will be 6.0\n" +
                "if n = 5.3 , then value of k will be 5.0\n" +
                "\n" +
                "Name of the Function: ceil(n)\nDescription: returns the smallest integer value that is greater than or equal to the value of n.\nExample: double k = Math.ceil(n)\tif n = 5.7, then value of k will be 6.0\n" +
                "if n = 5.2, then value of k will be 6.0\n" +
                "if n = 5.0, then value of k will be 5.0\n" +
                "if n = -5.7, then value of k will be -5.0\n" +
                "\n" +
                "Name of the Function: floor(n)\nDescription: returns the \n" +
                "largest integer value that is smaller than or equal to the value of n.\nExample: double k = Math.floor(n)\tif n = 5.7, then value of k will be 5.0\n" +
                "if n = 5.2, then value of k will be 5.0\n" +
                "if n = 5.0, then value of k will be 5.0\n" +
                "if n = -5.7, then value of k will be -6.0\n" +
                "\n" +
                "Name of the Function: round(n)\nDescription: It is used to round of the decimal numbers to the nearest integer value.\n" +
                "Example: double k = Math.round(n)\tif n = 5.7 , then value of k will be 6.0\n" +
                "if n = 5.3 , then value of k will be 5.0\n" +
                "if n = 5.5 , then value of k will be 6.0\n" +
                "if n = -5.7 , then value of k will be -6.0\n" +
                "if n = -5.3 , then value of k will be -5.0\n" +
                "\n" +
                "Name of the Function: PI\nDescription: return the actual value of π\nExample: double k = Math.PI\nHere,  PI is the inbuilt static variable of Math class, not the function.\n" +
                "value of k will be 3.141592653589793\n" +
                "\nName of the Function: sin(n)\nDescription: Trigonometric function to calculate and returns the Sine value for  n.\nExample: double k = Math.sin(n)\n" +
                "\nIt computes and returns the Sine value for n and gets assigned in variable k.\n" +
                "here value of n must be in radians, not in degrees. So first convert the value of degrees into radians and assign to n.\n" +
                "(formula to convert degrees into radians is : radians =  π/180 * degrees.\n" +
                "\nName of the Function: cos(n)\nDescription: returns the Cosine value for n\nExample: double k = Math.cos(n)\n" +
                "\nIt computes and returns the Cosine value for n and gets assigned in variable k.\n" +
                "here value of n must be in radians, not in degrees.\n" +
                "\nName of the Function: tan(n)\nDescription: returns the Tangent value for n\nExample: double k = Math.tan(n)\n" +
                "\nIt computes and returns the Tangent value for n and gets assigned in variable k.\n" +
                "here value of n must be in radians, not in degrees.\n" +
                "\nName of the Function: log(n)\nDescription: returns the natural logarithm value of n\nExample: double k = Math.log(n)\n\nIt computes and returns the natural logarithm for n and gets assigned in variable k.\n" +
                "\nName of the Function: random()\nDescription: returns any value between 0.0 and 1.0\nExample: double k = Math.random()\nEach time when you call this function, It returns any random value between 0 & 1.\n" +
                "value of k may be  0.54567  ,  0.041265,  0.2345874, 0.865545 etc.\n" +
                "\n" +
                "There are many more functions belongs to Math class.\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Name of the Function:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("pre-defined functions"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Functions of Math class:"),
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
