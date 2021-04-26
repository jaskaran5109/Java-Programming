package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SixtyTwoProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixty_two_program);
        text = findViewById(R.id.program62);
        text.setText("/**\n" +
                "Write a program to create double dimensional array of size N by N\n" +
                "find the sum of all the elements belongs to diagonal.\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class DD9\n" +
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
                "        int i,j,s=0;\n" +
                "        for(i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                if(i==j || i+j==a.length-1)\n" +
                "                    s = s +a[i][j];\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"sum of all the diagonal elements : \"+s);\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        DD9 obj = new DD9();\n" +
                "        obj.accept();\n" +
                "        obj.display();\n" +
                "        obj.diagonal();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("// possible only in square matrix"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// memory allocation to 2D array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// declaration of Double Dimensional or 2D Array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to create double dimensional array of size N by N\n" +
                        "find the sum of all the elements belongs to diagonal."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output62);
        text2.setText("Enter the row & column size \n" +
                "3\n" +
                "Enter the values \n" +
                "12\n" +
                "10\n" +
                "4\n" +
                "9\n" +
                "17\n" +
                "38\n" +
                "76\n" +
                "22\n" +
                "30\n" +
                "12   10   4\t\n" +
                "9    17   38\t\n" +
                "76   22   30\t\n" +
                "sum of all the diagonal elements : 139");
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