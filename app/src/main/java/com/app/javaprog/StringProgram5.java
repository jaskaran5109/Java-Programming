package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram5 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program5);
        text = findViewById(R.id.string5program);
        text.setText("/**\n" +
                " * Write a program to input a string and find total number\n" +
                "capital letters , small letters , digits, spaces and special characters.\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str5\n" +
                "{\n" +
                "    static void count()\n" +
                "    {\n" +
                "        int cap=0,sm=0,digits=0,space=0,sp=0;\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the string \");\n" +
                "        String st = scan.nextLine();\n" +
                "        for(int i=0;i<st.length();i++)\n" +
                "        {\n" +
                "            char k = st.charAt(i);\n" +
                "            if(Character.isUpperCase(k))\n" +
                "                cap++;\n" +
                "            else\n" +
                "            if(Character.isLowerCase(k))\n" +
                "                sm++;\n" +
                "            else\n" +
                "            if(Character.isDigit(k))\n" +
                "                digits++;\n" +
                "            else\n" +
                "            if(Character.isWhitespace(k))\n" +
                "                space++;\n" +
                "            else\n" +
                "                sp++;\n" +
                "        }\n" +
                "        System.out.println(\"capital : \"+cap);\n" +
                "        System.out.println(\"small : \"+sm);\n" +
                "        System.out.println(\"digits : \"+digits);\n" +
                "        System.out.println(\"spaces : \"+space);\n" +
                "        System.out.println(\"special : \"+sp);\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to input a string and find total number\n" +
                        "capital letters , small letters , digits, spaces and special characters."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string5output);
        text2.setText("Enter the string \n" +
                "compUTER123Ele;ctro\n" +
                "capital : 5\n" +
                "small : 10\n" +
                "digits : 3\n" +
                "spaces : 0\n" +
                "special : 1");
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

