package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram6 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program6);
        text = findViewById(R.id.string6program);
        text.setText("/**\n" +
                "Write a program to input a string and encode the string\n" +
                "each character to its next third character.\n" +
                "Capital to capital and small to small alphabet, but other\n" +
                "will remain same.\n" +
                "Example:\n" +
                "Input : GALAXY\n" +
                "Output: JDODAB\n" +
                "(here X will be converted into A and Y into B on round\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class St6\n" +
                "{ // e.g. (\"GALAXY\" , 3) // here word is galaxy,if moves is 3\n" +
                "    static void encode()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the string \");\n" +
                "        String st = scan.nextLine();\n" +
                "        int move = scan.nextInt();\n" +
                "        for(int i=0;i<st.length();i++)\n" +
                "        {\n" +
                "            int k = st.charAt(i);\n" +
                "            if(k>=65&&k<=90)\n" +
                "            {\n" +
                "                k=k+move;\n" +
                "                if(k>90)\n" +
                "                    k=k-26;\n" +
                "            }\n" +
                "            else\n" +
                "            if(k>=97&&k<=122)\n" +
                "            {\n" +
                "                k=k+move;\n" +
                "                if(k>122)\n" +
                "                    k=k-26;\n" +
                "            }\n" +
                "            System.out.print((char)k);\n" +
                "        }\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to input a string and encode the string\n" +
                        "each character to its next third character.\n" +
                        "Capital to capital and small to small alphabet, but other\n" +
                        "will remain same.\n" +
                        "Example:\n" +
                        "Input : GALAXY\n" +
                        "Output: JDODAB\n" +
                        "\\(here X will be converted into A and Y into B on round"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// e.g. \\(\"GALAXY\" , 3\\) // here word is galaxy,if moves is 3"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string6output);
        text2.setText("Enter the string \n" +
                "GALAXY\n" +
                "3\n" +
                "JDODAB");
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

