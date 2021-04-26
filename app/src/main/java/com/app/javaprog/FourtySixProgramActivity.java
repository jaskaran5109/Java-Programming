package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FourtySixProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourty_six_program);
        text = findViewById(R.id.program46);
        text.setText("/**\n" +
                "Program to store N values into an array,\n" +
                "find biggest and smallest value in the array alongwith its index.\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Array\n" +
                "{\n" +
                "    int a[];\n" +
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
                "    void highest()\n" +
                "    {\n" +
                "        int h=a[0],pos=0;\n" +
                "        for(int i=1;i<a.length;i++)\n" +
                "        {\n" +
                "            if(a[i]>h)\n" +
                "            {\n" +
                "                h=a[i];\n" +
                "                pos=i;\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"biggest is \"+h+\" at \"+pos);\n" +
                "    }\n" +
                "\n" +
                "    void smallest()\n" +
                "    {\n" +
                "        int small=a[0],pos=0;\n" +
                "        for(int i=1;i<a.length;i++)\n" +
                "        {\n" +
                "            if(a[i]<small)\n" +
                "            {\n" +
                "                small=a[i];\n" +
                "                pos=i;\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"smallest is \"+small+\" at \"+pos);\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        Array obj = new Array();\n" +
                "        obj.accept();\n" +
                "        obj.highest();\n" +
                "        obj.smallest();\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to store N values into an array,\n" +
                        "find biggest and smallest value in the array alongwith its index."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output46);
        text2.setText("Enter the size of the array\n" +
                "6\n" +
                "Enter the values \n" +
                "45\n" +
                "2\n" +
                "73\n" +
                "55\n" +
                "12\n" +
                "10\n" +
                "biggest is 73 at 2\n" +
                "smallest is 2 at 1");
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