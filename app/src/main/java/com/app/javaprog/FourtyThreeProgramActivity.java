package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FourtyThreeProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourty_three_program);
        text = findViewById(R.id.program43);
        text.setText("/**\n" +
                "Array as a data member.\n" +
                "Program to store N values into an array, count and find the sum of odd & even values present in the array\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Array\n" +
                "{\n" +
                "    int a[];  // array variable as a data member\n" +
                "\n" +
                "    void accept()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the size of the array\");\n" +
                "        int n = scan.nextInt();\n" +
                "        a = new int[n]; // memory allocation to the array\n" +
                "        System.out.println(\"Enter the values \");\n" +
                "        for(int i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            a[i] = scan.nextInt();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    void compute()\n" +
                "    {  \n" +
                "        int ev=0,od=0,sumEv=0, sumOd=0;\n" +
                "        for(int i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            if(a[i]%2==0)\n" +
                "            {\n" +
                "                ev++;\n" +
                "                sumEv = sumEv + a[i];\n" +
                "            }\n" +
                "            else\n" +
                "            {\n" +
                "                od++;\n" +
                "                sumOd = sumOd + a[i];\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"Total even numbers : \"+ev);\n" +
                "        System.out.println(\"Total odd numbers : \"+od);\n" +
                "        System.out.println(\"sum of Even Numbers : \"+sumEv);\n" +
                "        System.out.println(\"sum of Odd Numbers : \"+sumOd);\n" +
                "    }     \n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        Array obj = new Array();\n" +
                "        obj.accept();\n" +
                "        obj.compute();\n" +
                "    }\n" +
                "}");

        new PatternEditableBuilder().addPattern(Pattern.compile("Array as a data member.\n" +
                        "Program to store N values into an array, count and find the sum of odd & even values present in the array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// array variable as a data member"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// memory allocation to the array"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output43);
        text2.setText("Enter the size of the array\n" +
                "6\n" +
                "Enter the values \n" +
                "12\n" +
                "10\n" +
                "45\n" +
                "3\n" +
                "77\n" +
                "38\n" +
                "Total even numbers : 3\n" +
                "Total odd numbers : 3\n" +
                "sum of Even Numbers : 60\n" +
                "sum of Odd Numbers : 125");
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