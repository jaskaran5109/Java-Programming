package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FourtySevenProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourty_seven_program);
        text = findViewById(R.id.program47);
        text.setText("/**\n" +
                "Program to store N values into an array, Exchange first half of the array with the second half and display the values.\n" +
                "\n" +
                "Example 1: (Array contains even number of values , size is 10)\n" +
                "Array : 0   1   2   3   4   5   6   7   8   9   \n" +
                "Values :    5   7   10  15  12  30  18  17  20  11  \n" +
                "                First Half      Second Half \n" +
                "Output should be :                                  \n" +
                "Array : 0   1   2   3   4   5   6   7   8   9   \n" +
                "Values :    30  18  17  20  11  5   7   10  15  12  \n" +
                "                First Half      Second Half \n" +
                "\n" +
                "Example 2: (Array contains odd number of values , size is 11)\n" +
                "Array : 0   1   2   3   4   5   6   7   8   9   10\n" +
                "Values :    5   7   10  15  12  30  18  17  20  11  50\n" +
                "                First Half      Second Half\n" +
                "Here value at index 5 is middle value , do not exchange\n" +
                "\n" +
                "Output should be :                                  \n" +
                "Array : 0   1   2   3   4   5   6   7   8   9   10\n" +
                "Values :    18  17  20  11  50  30  5   7   10  15  12\n" +
                "                First Half      Second Half\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Array5\n" +
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
                "    void exchange()\n" +
                "    {   \n" +
                "        int h = a.length/2 ; // finding middle index of the array\n" +
                "        if(a.length%2==1)\n" +
                "            h++;   // add 1 to middle index, if size of the array is odd.\n" +
                "        for(int i=0;i<a.length/2;i++)  // here loop is just from 0 to half.\n" +
                "        {\n" +
                "            int t= a[i];  // exchange value at index 0 with the value at index 5 and so on.\n" +
                "            a[i] = a[h];\n" +
                "            a[h]=t;\n" +
                "            h++;\n" +
                "        }\n" +
                "\n" +
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
                "        Array5 obj = new Array5();\n" +
                "        obj.accept();\n" +
                "        obj.display(); // Original array\n" +
                "        obj.exchange();\n" +
                "        obj.display(); // after exchange first half with second half\n" +
                "    }\n" +
                "\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("// after exchange first half with second half"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Original array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// exchange value at index 0 with the value at index 5 and so on."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// here loop is just from 0 to half."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// add 1 to middle index, if size of the array is odd."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// finding middle index of the array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to store N values into an array, Exchange first half of the array with the second half and display the values.\n" +
                        "\n" +
                        "Example 1: \\(Array contains even number of values , size is 10\\)\n" +
                        "Array : 0   1   2   3   4   5   6   7   8   9   \n" +
                        "Values :    5   7   10  15  12  30  18  17  20  11  \n" +
                        "                First Half      Second Half \n" +
                        "Output should be :                                  \n" +
                        "Array : 0   1   2   3   4   5   6   7   8   9   \n" +
                        "Values :    30  18  17  20  11  5   7   10  15  12  \n" +
                        "                First Half      Second Half \n" +
                        "\n" +
                        "Example 2: \\(Array contains odd number of values , size is 11\\)\n" +
                        "Array : 0   1   2   3   4   5   6   7   8   9   10\n" +
                        "Values :    5   7   10  15  12  30  18  17  20  11  50\n" +
                        "                First Half      Second Half\n" +
                        "Here value at index 5 is middle value , do not exchange\n" +
                        "\n" +
                        "Output should be :                                  \n" +
                        "Array : 0   1   2   3   4   5   6   7   8   9   10\n" +
                        "Values :    18  17  20  11  50  30  5   7   10  15  12\n" +
                        "                First Half      Second Half"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output47);
        text2.setText("Enter the size of the array\n" +
                "6\n" +
                "Enter the values \n" +
                "12\n" +
                "34\n" +
                "3\n" +
                "68\n" +
                "4\n" +
                "10\n" +
                "12 34 3 68 4 10 \n" +
                "68 4 10 12 34 3");
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