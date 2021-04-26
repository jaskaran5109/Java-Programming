package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SixtyProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixty_program);
        text = findViewById(R.id.program60);
        text.setText("/**\n" +
                "Write a program to create double dimensional array of size m by n\n" +
                "Print the elements in matrix format and find the sum of only boundary elements.\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class DD7\n" +
                "{\n" +
                "    int a[][]; // declaration of Double Dimensional or 2D Array\n" +
                "    void accept()\n" +
                "    { \n" +
                "        int i,j,r,c;\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the row size \");\n" +
                "        r = scan.nextInt();\n" +
                "        System.out.println(\"Enter the column size \");\n" +
                "        c = scan.nextInt();\n" +
                "        a = new int[r][c];  // memory allocation to 2D array\n" +
                "        System.out.println(\"Enter the values \");\n" +
                "        for(i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                a[i][j] = scan.nextInt();\n" +
                "            }\n" +
                "        }\n" +
                "    } \n" +
                "\n" +
                "    void display()\n" +
                "    {\n" +
                "        int i,j;\n" +
                "        for(i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                System.out.print(a[i][j]+\"\\t\");\n" +
                "            }\n" +
                "            System.out.println();    \n" +
                "        } \n" +
                "    }\n" +
                "\n" +
                "    void sumOfBoundary()\n" +
                "    {\n" +
                "        int i,j,s=0;\n" +
                "\n" +
                "        for(j=0;j<a[0].length;j++)\n" +
                "        {\n" +
                "            for(i=0;i<a.length;i++)\n" +
                "            {\n" +
                "                if(i==0 || j==0 || i== a.length-1 || j==a[0].length-1)  \n" +
                "                    s = s + a[i][j];\n" +
                "            }\n" +
                "        } \n" +
                "        System.out.println(\"sum of boundary elements \"+s);    \n" +
                "    }\n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        DD7 obj = new DD7();\n" +
                "        obj.accept();\n" +
                "        obj.display();\n" +
                "        obj.sumOfBoundary();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to create double dimensional array of size m by n\n" +
                        "Print the elements in matrix format and find the sum of only boundary elements."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// declaration of Double Dimensional or 2D Array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// memory allocation to 2D array"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output60);
        text2.setText("Enter the row size \n" +
                "3\n" +
                "Enter the column size \n" +
                "3\n" +
                "Enter the values \n" +
                "12\n" +
                "10\n" +
                "5\n" +
                "3\n" +
                "85\n" +
                "34\n" +
                "77\n" +
                "17\n" +
                "29\n" +
                "12   10   5\t\n" +
                "3    85   34\t\n" +
                "77   17   29\t\n" +
                "sum of boundary elements 187");

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