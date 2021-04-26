package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FirstProgramActivity extends AppCompatActivity {
    TextView text0,text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_program);
        text = findViewById(R.id.program1);
        text.setText("class Program1\n" +
                "{\n" +
                "    public static void main(String arg[]) // in bluej public and String arg is not compulsary to write.\n" +
                "    {\n" +
                "        int a,b,s; // declaration of integer type variables\n" +
                "        float avg; // declaration of float type variable\n" +
                "        a=5; // assigning 5 to a\n" +
                "        b=6; // assigning 6 to b\n" +
                "        s = a + b ; // calculating sum and storing in variable s\n" +
                "        avg = (float)s/2; // calculating average : here data type casting is required because\n" +
                "        // s and 2 , both are integers, one must be float to get the result\n" +
                "        // in decimal. Without typecasting we will get only integer value.\n" +
                "        System.out.println(\"SUM IS \"+s); // printing the sum with the message\n" +
                "        System.out.println(\"AVERAGE IS \"+avg); // printing the average with the message\n" +
                "    }\n" +
                "}\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("// in bluej public and String arg is not compulsary to write."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// declaration of integer type variables"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// declaration of float type variable"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// assigning 5 to a"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// assigning 6 to b"),
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
        text2 = findViewById(R.id.output1);
        text2.setText("SUM IS 11\n" +
                "AVERAGE IS 5.5");

        new PatternEditableBuilder().addPattern(Pattern.compile("OUTPUT:-"),
                Color.rgb(255,140,0)).into(text2);

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