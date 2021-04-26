package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FourtyEightProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourty_eight_program);
        text = findViewById(R.id.program48);
        text.setText("/**\n" +
                "Program to store N values into an array and reverse the order of the values within the array.\n" +
                "\n" +
                "Example : (Array contains values , size is 10)\t\t\t\t\n" +
                "Array :\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\n" +
                "Values :\t5\t7\t10\t15\t12\t30\t18\t17\t20\t11\n" +
                "\n" +
                "Output :\t\t\t\t\t\t\t\t\t\t\n" +
                "Array :\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\n" +
                "Values :\t11\t20\t17\t18\t30\t12\t15\t10\t7\t5\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Array6\n" +
                "{\n" +
                "    int a[];\n" +
                "\n" +
                "    void accept()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the size of the array\");\n" +
                "        int n = scan.nextInt();\n" +
                "        a = new int[n];\n" +
                "        System.out.println(\"Enter the values \");\n" +
                "        for(int i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            a[i] = scan.nextInt();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    void reverse()\n" +
                "    {         \n" +
                "        int h = a.length-1; // storing last index of the array.\n" +
                "        for(int i=0;i<a.length/2;i++)  // here loop is just from 0 to half.\n" +
                "        {\n" +
                "            int t= a[i];  // exchange value at index 0 with value at index 5 and so on.\n" +
                "            a[i] = a[h];\n" +
                "            a[h]=t;\n" +
                "            h--;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    void display()\n" +
                "    { \n" +
                "        for(int i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            System.out.print(a[i]+\" \");\n" +
                "        }\n" +
                "        System.out.println();\n" +
                "    }     \n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        Array6 obj = new Array6();\n" +
                "        obj.accept();\n" +
                "        obj.display(); // orginal array\n" +
                "        obj.reverse();\n" +
                "        obj.display(); // reversed array\n" +
                "    }\n" +
                "\n" +
                "}");

        new PatternEditableBuilder().addPattern(Pattern.compile("Program to store N values into an array and reverse the order of the values within the array.\n" +
                        "\n" +
                        "Example : \\(Array contains values , size is 10\\)\t\t\t\t\n" +
                        "Array :\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\n" +
                        "Values :\t5\t7\t10\t15\t12\t30\t18\t17\t20\t11\n" +
                        "\n" +
                        "Output :\t\t\t\t\t\t\t\t\t\t\n" +
                        "Array :\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\n" +
                        "Values :\t11\t20\t17\t18\t30\t12\t15\t10\t7\t5"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// storing last index of the array."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// here loop is just from 0 to half."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// exchange value at index 0 with value at index 5 and so on."),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output48);
        text2.setText("Enter the size of the array\n" +
                "6\n" +
                "Enter the values \n" +
                "12\n" +
                "10\n" +
                "34\n" +
                "2\n" +
                "45\n" +
                "6\n" +
                "12 10 34 2 45 6 \n" +
                "6 45 2 34 10 12 ");




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