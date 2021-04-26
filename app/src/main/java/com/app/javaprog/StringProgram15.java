package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram15 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program15);
        text = findViewById(R.id.string15program);
        text.setText("/**\n" +
                "Program To Input A Sentence And Count And Print The Palindromic Words From The Sentence.\n" +
                "Example : MOM AND DAD ARE COMING AT NOON.\n" +
                "OUTPUT :\n" +
                "MOM\n" +
                "DAD\n" +
                "NOON\n" +
                "Total words : 3\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str_13\n" +
                "{\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the sentence \");\n" +
                "        String st = scan.nextLine();\n" +
                "        String b=\"\",d=\"\";\n" +
                "        st=st+\" \";\n" +
                "        int c=0;\n" +
                "        for(int i=0;i<st.length();i++)\n" +
                "        {\n" +
                "            char k = st.charAt(i);\n" +
                "            if(k!=' ')\n" +
                "            { b=b+k;\n" +
                "                d=k+d;\n" +
                "            }\n" +
                "            else\n" +
                "            {\n" +
                "                if(d.equals(b))\n" +
                "                {\n" +
                "                    System.out.println(b);\n" +
                "                    c++;\n" +
                "                }\n" +
                "                b=\"\";\n" +
                "                d=\"\";\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"total palindromic words \"+c);\n" +
                "    }\n" +
                "}");
    new PatternEditableBuilder().addPattern(Pattern.compile("Program To Input A Sentence And Count And Print The Palindromic Words From The Sentence.\n" +
                    "Example : MOM AND DAD ARE COMING AT NOON.\n" +
                    "OUTPUT :\n" +
                    "MOM\n" +
                    "DAD\n" +
                    "NOON\n" +
                    "Total words : 3"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string15output);
        text2.setText("Enter the sentence \n" +
                "MOM AND DAD ARE COMING AT NOON\n" +
                "MOM\n" +
                "DAD\n" +
                "NOON\n" +
                "total palindromic words 3");


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

