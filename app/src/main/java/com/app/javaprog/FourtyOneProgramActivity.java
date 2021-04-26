package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FourtyOneProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourty_one_program);
        text = findViewById(R.id.program41);
        text.setText("/**\n" +
                "Program to store N values into an array and find the sum of values stored in the array.\n" +
                " **/\n" +
                "import java.util.*;\n" +
                "class Array\n" +
                "{\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the size of the array\");\n" +
                "        int n = scan.nextInt();\n" +
                "        int a[] = new int[n]; // memory allocation to the array\n" +
                "        System.out.println(\"Enter the values \");\n" +
                "        for(int i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            a[i] = scan.nextInt();   // storing the values\n" +
                "        }\n" +
                "        int s=0;\n" +
                "        for(int i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            s = s + a[i];   // calculating the sum of all the values\n" +
                "        }\n" +
                "        System.out.println(\"Sum is \"+s);\n" +
                "    }\n" +
                "}");

        new PatternEditableBuilder().addPattern(Pattern.compile("Program to store N values into an array and find the sum of values stored in the array."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// calculating the sum of all the values"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// storing the values"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// memory allocation to the array"),
                Color.rgb(0, 0, 255)).into(text);
        text2 = findViewById(R.id.output41);
        text2.setText("Enter the size of the array\n" +
                "5\n" +
                "Enter the values \n" +
                "12\n" +
                "14\n" +
                "10\n" +
                "5\n" +
                "34\n" +
                "Sum is 75");



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