package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SixteenProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteen_program);
        text = findViewById(R.id.program16);
        text.setText("/**\n" +
                "Program to calculate Electricity Bill.\n" +
                "Input number of units consumed in a month and calculate electricity bill as per following\n" +
                "slabs given in the table.\n" +
                "Fixed Rent Rs. 400\n" +
                "Units Consumed Rate per unit\n" +
                "up to 100 units Rs. 3.00 per unit\n" +
                "Between 101 and 300 units Rs. 4.00 per unit\n" +
                "Between 301 and 600 units Rs. 5.00 per unit\n" +
                "above 600 units Rs. 6.00 per unit\n" +
                "Note : Fixed Rent is Rs. 400. It is must to pay even if the number of units consumed are 0.\n" +
                " **/\n" +
                "class Program16\n" +
                "{\n" +
                "    static void main(int unit) /** unit -> variable to inputs number of units consumed **/\n" +
                "    {\n" +
                "        int bill=0; // to store bill amount.\n" +
                "        if(unit<=100)\n" +
                "            bill = 400 + unit * 3; // Rs. 400 is fixed rent + (units consumed * 3)\n" +
                "        else\n" +
                "        if(unit<=300)\n" +
                "            bill = 400 + 100*3 + (unit-100)*4; /** Rs. 400 is fixed rent + first 100 units * 3 + (units consumed -100)*4 **/\n" +
                "        else\n" +
                "        if(unit<=600)\n" +
                "            bill = 400 + 100*3 + 200*4 + (unit-300)*5;\n" +
                "        else\n" +
                "            bill = 400 + 100*3 + 200*4 + 300*5 + (unit-600)*6;\n" +
                "        System.out.println(\"Bill amount : \"+bill);\n" +
                "    }\n" +
                "}\n" +
                "/**\n" +
                "Example :\n" +
                "Input number of units are : 480\n" +
                "It comes in the slab of : between 301 and 600 units\n" +
                "So, to calculate bill take:\n" +
                "Fixed Rent : Rs. 400\n" +
                "First 100 units : Rs. 300 i.e. (100*3)\n" +
                "next 200 units : Rs. 800 i.e. (200*4)\n" +
                "(from 101 to 300 units)\n" +
                "next 180 units : Rs. 900 i.e. (180*5)\n" +
                "(from 301 to 480 units)\n" +
                "----------------------------------------------\n" +
                "Total Bill : Rs. 2400\n" +
                "----------------------------------------------\n" +
                " **/\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to calculate Electricity Bill.\n" +
                        "Input number of units consumed in a month and calculate electricity bill as per following\n" +
                        "slabs given in the table.\n" +
                        "Fixed Rent Rs. 400\n" +
                        "Units Consumed Rate per unit\n" +
                        "up to 100 units Rs. 3.00 per unit\n" +
                        "Between 101 and 300 units Rs. 4.00 per unit\n" +
                        "Between 301 and 600 units Rs. 5.00 per unit\n" +
                        "above 600 units Rs. 6.00 per unit\n" +
                        "Note : Fixed Rent is Rs. 400. It is must to pay even if the number of units consumed are 0."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("nit -> variable to inputs number of units consume"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// to store bill amount."),
                Color.rgb(0, 0, 255)).into(text);



        text2 = findViewById(R.id.output16);
        text2.setText("Bill amount : 2400");
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

