package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FiftyFourProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_four_program);
        text = findViewById(R.id.program54);
        text.setText("/**\n" +
                "Write a program to create double dimensional array of size r x c.\n" +
                "Print the elements in matrix format and find the sum of all the elements. \n" +
                " */\n" +
                "import java.util.*;\n" +
                "class DD1\n" +
                "{\n" +
                "    int a[][]; // declaration of Double Dimensional or 2D Array\n" +
                "    void accept()\n" +
                "    { \n" +
                "        int i,j,r,c;\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the row size \");\n" +
                "        r = scan.nextInt();\n" +
                "        System.out.println(\"Enter the coloumn size \");\n" +
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
                "    void display()  // displaying elements in the matrix format\n" +
                "    {\n" +
                "        int i,j,s=0;\n" +
                "        for(i=0;i<a.length;i++) //  a.length returns number of rows\n" +
                "        {\n" +
                "            for(j=0;j<a[0].length;j++) // a[0].length returns numbers of coloumns\n" +
                "            {\n" +
                "                System.out.print(a[i][j]+\"\\t\");\n" +
                "                s = s + a[i][j];\n" +
                "            }\n" +
                "            System.out.println();    \n" +
                "        } \n" +
                "        System.out.println(\"sum of all the elements \"+s);\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        DD1 obj = new DD1();\n" +
                "        obj.accept();\n" +
                "        obj.display();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to create double dimensional array of size r x c.\n" +
                        "Print the elements in matrix format and find the sum of all the elements."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// a\\[0\\]\\.length returns numbers of coloumns"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  a\\.length returns number of rows"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// displaying elements in the matrix format"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// memory allocation to 2D array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// declaration of Double Dimensional or 2D Array"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output54);
        text2.setText("Enter the row size \n" +
                "3\n" +
                "Enter the coloumn size \n" +
                "3\n" +
                "Enter the values \n" +
                "12\n" +
                "10\n" +
                "4\n" +
                "56\n" +
                "9\n" +
                "24\n" +
                "88\n" +
                "69\n" +
                "1\n" +
                "12\t10\t4\t\n" +
                "56\t9\t24\t\n" +
                "88\t69\t1\t\n" +
                "sum of all the elements 273");

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