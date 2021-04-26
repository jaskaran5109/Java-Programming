package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FiftyFiveProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_five_program);
        text = findViewById(R.id.program55);
        text.setText("/**\n" +
                "Write a program to create double dimensional array of size r x c.\n" +
                "Print the elements in matrix format and find the sum of each row of the matrix. \n" +
                " */\n" +
                "import java.util.*;\n" +
                "class DD2\n" +
                "{\n" +
                "    int a[][];\n" +
                "    void accept()\n" +
                "    { \n" +
                "        int i,j,r,c;\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the row size \");\n" +
                "        r = scan.nextInt();\n" +
                "        System.out.println(\"Enter the coloumn size \");\n" +
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
                "        int i,j,s;\n" +
                "        for(i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            s=0;\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                System.out.print(a[i][j]+\"\\t\");\n" +
                "                s = s + a[i][j];\n" +
                "            }\n" +
                "            System.out.println(\" -> \"+s);    \n" +
                "        } \n" +
                "    }\n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        DD2 obj = new DD2();\n" +
                "        obj.accept();\n" +
                "        obj.display();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to create double dimensional array of size r x c.\n" +
                        "Print the elements in matrix format and find the sum of each row of the matrix."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output55);
        text2.setText("Enter the row size \n" +
                "3\n" +
                "Enter the coloumn size \n" +
                "3\n" +
                "Enter the values \n" +
                "12\n" +
                "10\n" +
                "5\n" +
                "33\n" +
                "19\n" +
                "77\n" +
                "40\n" +
                "89\n" +
                "57\n" +
                "12   10   5   -> 27\n" +
                "33   19   77   -> 129\n" +
                "40   89   57   -> 186");
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