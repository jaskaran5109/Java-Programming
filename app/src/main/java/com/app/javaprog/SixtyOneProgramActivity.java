package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SixtyOneProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixty_one_program);
        text = findViewById(R.id.program61);
        text.setText("/**\n" +
                "Write a program to create double dimensional array of size N by N\n" +
                "find the sum of each diagonal elements separately.\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class DD8\n" +
                "{\n" +
                "    int a[][]; // declaration of Double Dimensional or 2D Array\n" +
                "    void accept()\n" +
                "    { \n" +
                "        int i,j,n;\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the row & column size \");\n" +
                "        n = scan.nextInt();\n" +
                "        a = new int[n][n];  // memory allocation to 2D array\n" +
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
                "    void diagonal() // possible only in square matrix\n" +
                "    {\n" +
                "        int i,j,s=0,t=0;\n" +
                "        for(i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                if(i==j)\n" +
                "                    s=s +a[i][j];\n" +
                "                if(i+j==a.length-1)\n" +
                "                    t = t + a[i][j];\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"sum of first diagonal  \"+s);\n" +
                "        System.out.println(\"sum of second diagonal \"+t);\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        DD8 obj = new DD8();\n" +
                "        obj.accept();\n" +
                "        obj.display();\n" +
                "        obj.diagonal();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to create double dimensional array of size N by N\n" +
                        "find the sum of each diagonal elements separately."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// declaration of Double Dimensional or 2D Array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// memory allocation to 2D array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// possible only in square matrix"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output61);
        text2.setText("Enter the row & column size \n" +
                "3\n" +
                "Enter the values \n" +
                "3\n" +
                "12\n" +
                "10\n" +
                "3\n" +
                "64\n" +
                "18\n" +
                "44\n" +
                "34\n" +
                "7\n" +
                "3   12   10\t\n" +
                "3   64   18\t\n" +
                "44  34   7\t\n" +
                "sum of first diagonal  74\n" +
                "sum of second diagonal 118");
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