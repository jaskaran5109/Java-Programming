package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SecondProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_program);
        text = findViewById(R.id.program2);
        text.setText("// Program 2 : It same as previous program, but values of a and b can only be input during execution of program. In the previous program, values were fixed a=5 and b=6. Rest is same.\n" +
                "class Program2\n" +
                "{\n" +
                "    static void main(int a,int b) // here a & b are called parameterised variable\n" +
                "    // when you execute this function, you can input/pass the values for a and b\n" +
                "    { // so, it is called : Input by the user\n" +
                "        int s; // declaration of integer type variables to store sum\n" +
                "        float avg; // declaration of float type variable to store the average.\n" +
                "        s = a + b ; // calculating sum and storing in variable s\n" +
                "        avg = (float)s/2; // calculating average : here data type casting is required because\n" +
                "        // s and 2 , both are integers, one must be float to get the result\n" +
                "        // in decimal. Without typecasting we will get only integer value.\n" +
                "        System.out.println(\"SUM IS \"+s); // printing the sum with the message\n" +
                "        System.out.println(\"AVERAGE IS \"+avg); // printing the average with the message\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("// Program 2 : It same as previous program, but values of a and b can only be input during execution of program. In the previous program, values were fixed a=5 and b=6. Rest is same."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// here a & b are called parameterised variable"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// when you execute this function, you can input/pass the values for a and b"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// so, it is called : Input by the user"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// declaration of integer type variables to store sum"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// declaration of float type variable to store the average."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// calculating sum and storing in variable s"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// calculating average : here data type casting is required because"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// s and 2 , both are integers, one must be float to get the result"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// in decimal. Without typecasting we will get only integer value."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// printing the sum with the message"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// printing the average with the message"),
                Color.rgb(0, 0, 255)).into(text);




        text2 = findViewById(R.id.output2);
        text2.setText("SUM IS 22\n" +
                "AVERAGE IS 11.0");
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