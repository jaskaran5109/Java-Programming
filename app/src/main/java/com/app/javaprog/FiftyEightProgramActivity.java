package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FiftyEightProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_eight_program);
        text = findViewById(R.id.program58);
        text.setText("/**\n" +
                "Write a program to create a matrix of R x C and \n" +
                "find the biggest element from each row of the matrix. \n" +
                " */\n" +
                "import java.util.*;\n" +
                "public class DD5\n" +
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
                "    void rowWiseBiggest()\n" +
                "    {\n" +
                "        int i,j;\n" +
                "        for(i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            int h=a[i][0],r=i,c=0;\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                System.out.print(a[i][j]+\"\\t\");\n" +
                "                if(a[i][j]>h)\n" +
                "                { h=a[i][j];\n" +
                "                    r=i;\n" +
                "                    c=j;\n" +
                "                }\n" +
                "            }\n" +
                "            System.out.println(\"highest is \"+h+\" at \"+r+\",\"+c);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        DD5 obj = new DD5();\n" +
                "        obj.accept();\n" +
                "        obj.rowWiseBiggest();\n" +
                "    }\n" +
                "}");

          new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to create a matrix of R x C and \n" +
                        "find the biggest element from each row of the matrix."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output58);
        text2.setText("Enter the row-size \n" +
                "3\n" +
                "Enter the col-size \n" +
                "3\n" +
                "Enter the values \n" +
                "12\n" +
                "10\n" +
                "5\n" +
                "4\n" +
                "87\n" +
                "44\n" +
                "32\n" +
                "9\n" +
                "17\n" +
                "12   10   5   highest is 12 at 0,0\n" +
                "4    87   44  highest is 87 at 1,1\n" +
                "32   9    17  highest is 32 at 2,0");


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