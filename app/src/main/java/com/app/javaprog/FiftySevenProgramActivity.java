package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FiftySevenProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_seven_program);
        text = findViewById(R.id.program57);
        text.setText("/**\n" +
                "Write a program to create a matrix of R x C and \n" +
                "find the biggest element from the matrix alongwith its row & column index.\n" +
                " */\n" +
                "import java.util.*;\n" +
                "public class DD4\n" +
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
                "    void biggest()\n" +
                "    {\n" +
                "        int i,j,h=a[0][0],r=0,c=0;\n" +
                "        for(i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                System.out.print(a[i][j]+\"\\t\");\n" +
                "                if(a[i][j]>h)\n" +
                "                {\n" +
                "                    h=a[i][j];\n" +
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
                "        DD4 obj = new DD4();\n" +
                "        obj.accept();\n" +
                "        obj.biggest();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to create a matrix of R x C and \n" +
                        "find the biggest element from the matrix alongwith its row & column index."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output57);
        text2.setText("Enter the row-size \n" +
                "3\n" +
                "Enter the col-size \n" +
                "3\n" +
                "Enter the values \n" +
                "12\n" +
                "10\n" +
                "6\n" +
                "46\n" +
                "33\n" +
                "89\n" +
                "44\n" +
                "19\n" +
                "32\n" +
                "12   10   6    highest is 12 at 0,0\n" +
                "46   33   89   highest is 89 at 1,2\n" +
                "44   19   32   highest is 89 at 1,2");
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