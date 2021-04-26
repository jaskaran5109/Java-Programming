package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram3 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program3);
        text = findViewById(R.id.string3program);
        text.setText("import java.util.*;\n" +
                "class Str3\n" +
                "{\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the string \");\n" +
                "        String a = scan.nextLine();\n" +
                "        int vow=0,cons=0;\n" +
                "        for(int i=0;i<a.length();i++)\n" +
                "        {\n" +
                "            char k = a.charAt(i);\n" +
                "            if(Character.isLetter(k))\n" +
                "            {\n" +
                "                k = Character.toLowerCase(k);\n" +
                "                if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u')\n" +
                "                    vow++;\n" +
                "                else\n" +
                "                    cons++;\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"total vowels :\"+vow);\n" +
                "        System.out.println(\"total consonants :\"+cons);\n" +
                "    }\n" +
                "}");

        text2 = findViewById(R.id.string3output);
        text2.setText("Enter the string \n" +
                "COMPUTER\n" +
                "total vowels :3\n" +
                "total consonants :5");
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

