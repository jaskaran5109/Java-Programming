package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FiftySixProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_six_program);
        text = findViewById(R.id.program56);
        text.setText("/**\n" +
                "Write a program to create double dimensional array of size r x c.\n" +
                "Print the elements in matrix format and find the sum of each column of the matrix.\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class DD3\n" +
                "{\n" +
                "    int a[][];\n" +
                "    void accept()\n" +
                "    { \n" +
                "        int i,j,r,c;\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the row size \");\n" +
                "        r = scan.nextInt();\n" +
                "        System.out.println(\"Enter the column size \");\n" +
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
                "    void colSum()\n" +
                "    {\n" +
                "        System.out.println(\"Column-wise sum\");\n" +
                "        int i,j,s;\n" +
                "        for(i=0;i<a[0].length;i++)\n" +
                "        {\n" +
                "            s=0;\n" +
                "            for(j=0;j<a.length;j++)\n" +
                "            {\n" +
                "                s = s + a[j][i];\n" +
                "            }\n" +
                "            System.out.print(s+\"\\t\");    \n" +
                "        } \n" +
                "    }\n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        DD3 obj = new DD3();\n" +
                "        obj.accept();\n" +
                "        obj.display();\n" +
                "        obj.colSum();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to create double dimensional array of size r x c.\n" +
                        "Print the elements in matrix format and find the sum of each column of the matrix."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output56);
        text2.setText("Enter the row size \n" +
                "3\n" +
                "Enter the column size \n" +
                "3\n" +
                "Enter the values \n" +
                "12\n" +
                "10\n" +
                "6\n" +
                "34\n" +
                "18\n" +
                "55\n" +
                "87\n" +
                "3\n" +
                "45\n" +
                "12   10   6\t\n" +
                "34   18   55\t\n" +
                "87   3    45\t\n" +
                "Column-wise sum\n" +
                "133  31   106");

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