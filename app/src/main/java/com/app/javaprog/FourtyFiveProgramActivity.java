package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FourtyFiveProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourty_five_program);
        text = findViewById(R.id.program45);
        text.setText("/**\n" +
                "Program to generate first N terms of fibonacii series, using arrays.\n" +
                "1 1 2 3 5 8 13 - - - - n terms\n" +
                "(sum of previous two terms is the next terms)\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Array\n" +
                "{\n" +
                "    int a[];\n" +
                "    void accept()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the size\");\n" +
                "        int n = scan.nextInt();\n" +
                "        a = new int[n]; // memory allocation to the array\n" +
                "        a[0] = 1; // storing first two terms at index a[0] & a[1]\n" +
                "        a[1] = 1;\n" +
                "    }\n" +
                "\n" +
                "    void generateSeries()\n" +
                "    {\n" +
                "        for(int i=2;i<a.length;i++)\n" +
                "        {\n" +
                "            a[i] = a[i-2] + a[i-1];\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    void display()\n" +
                "    {   \n" +
                "        for(int i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            System.out.print(a[i]+\" \");\n" +
                "        }\n" +
                "    }     \n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        Array obj = new Array();\n" +
                "        obj.accept();\n" +
                "        obj.generateSeries();\n" +
                "        obj.display();\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to generate first N terms of fibonacii series, using arrays.\n" +
                        "1 1 2 3 5 8 13 - - - - n terms\n" +
                        "\\(sum of previous two terms is the next terms\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// memory allocation to the array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// storing first two terms at index a\\[0\\] & a\\[1\\]"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// 10 is the size of the array"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output45);
        text2.setText("Enter the size\n" +
                "15\n" +
                "1 1 2 3 5 8 13 21 34 55 89 144 233 377 610");




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