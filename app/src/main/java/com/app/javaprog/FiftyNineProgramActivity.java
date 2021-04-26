package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FiftyNineProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_nine_program);
        text = findViewById(R.id.program59);
        text.setText("/**\n" +
                "Write a program to create a matrix of R x C and \n" +
                "find the biggest element from each row of the matrix.\n" +
                " */\n" +
                "import java.util.*;\n" +
                "public class DD6\n" +
                "{\n" +
                "    int a[][]; \n" +
                "\n" +
                "    void accept()\n" +
                "    { \n" +
                "        int i,j,r,c;\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the row-size \");\n" +
                "        r = scan.nextInt();\n" +
                "        System.out.println(\"Enter the col-size \");\n" +
                "        c = scan.nextInt();\n" +
                "        a = new int[r][c];\n" +
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
                "    void colWiseBiggest()\n" +
                "    {\n" +
                "        int i,j;\n" +
                "        for(j=0;j<a[0].length;j++)\n" +
                "        {\n" +
                "            int h=a[0][j],r=0,c=j;\n" +
                "            for(i=0;i<a.length;i++)\n" +
                "            {\n" +
                "                if(a[i][j]>h)\n" +
                "                { \n" +
                "                    h=a[i][j];\n" +
                "                    r=i;\n" +
                "                    c=j;\n" +
                "                }\n" +
                "            }\n" +
                "            System.out.println(\"highest is \"+h+\" at \"+r+\",\"+c);\n" +
                "        }\n" +
                "    }\n" +
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
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        DD6 obj = new DD6();\n" +
                "        obj.accept();\n" +
                "        obj.display();\n" +
                "        obj.colWiseBiggest();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to create a matrix of R x C and \n" +
                        "find the biggest element from each row of the matrix."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// displaying elements in the matrix format"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  a.length returns number of rows"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// a\\[0\\]\\.length returns numbers of coloumns"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output59);
        text2.setText("Enter the row-size \n" +
                "3\n" +
                "Enter the col-size \n" +
                "3\n" +
                "Enter the values \n" +
                "12\n" +
                "10\n" +
                "3\n" +
                "5\n" +
                "67\n" +
                "33\n" +
                "97\n" +
                "23\n" +
                "17\n" +
                "12   10   3\t\n" +
                "5    67   33\t\n" +
                "97   23   17\t\n" +
                "highest is 97 at 2,0\n" +
                "highest is 67 at 1,1\n" +
                "highest is 33 at 1,2");
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