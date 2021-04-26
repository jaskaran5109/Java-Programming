package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram8 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program8);
        text = findViewById(R.id.string8program);
        text.setText("/*\n" +
                "  Write a program to input a sentence and print each word in a\n" +
                "  separate line.\n" +
                "  Example : COMPUTER IS A MACHINE\n" +
                "  Output:\n" +
                "  COMPUTER\n" +
                "  IS\n" +
                "  A\n" +
                "  MACHINE\n" +
                " \n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str8\n" +
                "{\n" +
                "    // Method 1\n" +
                "    static void display1()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the string \");\n" +
                "        String st = scan.nextLine();\n" +
                "        String b=\"\";\n" +
                "        for(int i=0;i<st.length();i++)\n" +
                "        {\n" +
                "            char k = st.charAt(i);\n" +
                "            if(k!=' ')\n" +
                "                b=b+k;\n" +
                "            else\n" +
                "            {\n" +
                "                System.out.println(b+\" \");\n" +
                "                b=\"\";\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(b);// last word will be printed here\n" +
                "    }\n" +
                "    //Method 2\n" +
                "    static void display2()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the string \");\n" +
                "        String st = scan.nextLine();\n" +
                "        String b=\"\";\n" +
                "        st =st+\" \"; // adding extra spaces at the end of string\n" +
                "        // to access last word in else block\n" +
                "        for(int i=0;i<st.length();i++)\n" +
                "        {\n" +
                "            char k = st.charAt(i);\n" +
                "            if(k!=' ')\n" +
                "                b=b+k;\n" +
                "            else\n" +
                "            {\n" +
                "                System.out.println(b+\" \");\n" +
                "                b=\"\";\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to input a sentence and print each word in a\n" +
                        "  separate line.\n" +
                        "  Example : COMPUTER IS A MACHINE\n" +
                        "  Output:\n" +
                        "  COMPUTER\n" +
                        "  IS\n" +
                        "  A\n" +
                        "  MACHINE"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Method 1"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// last word will be printed here"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//Method 2"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// adding extra spaces at the end of string"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// to access last word in else block"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string8output);
        text2.setText("Enter the string \n" +
                "computer is a machine\n" +
                "computer \n" +
                "is \n" +
                "a \n" +
                "machine");
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

