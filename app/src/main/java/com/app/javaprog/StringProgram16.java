package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram16 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program16);
        text = findViewById(R.id.string16program);
        text.setText("/**\n" +
                "Program To Input A Sentence And Count And Print Those Words Whose First Character Is Vowel And Last Is Consonant.\n" +
                "Example : AMAN AND SUNIL ARE FRIENDS\n" +
                "OUTPUT :\n" +
                "AMAN\n" +
                "AND\n" +
                "Total words : 2\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str14\n" +
                "{\n" +
                "    static boolean checkVowel(char ch)\n" +
                "    {\n" +
                "        ch=Character.toLowerCase(ch);\n" +
                "        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')\n" +
                "            return true;\n" +
                "        else\n" +
                "            return false;\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the sentence \");\n" +
                "        String st = scan.nextLine();\n" +
                "        String b=\"\";\n" +
                "        st=st+\" \";\n" +
                "        int c=0;\n" +
                "        for(int i=0;i<st.length();i++)\n" +
                "        {\n" +
                "            char k = st.charAt(i);\n" +
                "            if(k!=' ')\n" +
                "                b=b+k;\n" +
                "            else\n" +
                "            {\n" +
                "                char first = b.charAt(0);\n" +
                "                char last = b.charAt(b.length()-1);\n" +
                "                boolean k1 = checkVowel(first);\n" +
                "                boolean k2 = checkVowel(last);\n" +
                "                if(k1==true && k2==false)\n" +
                "                {\n" +
                "                    System.out.println(b);\n" +
                "                    c++;\n" +
                "                }\n" +
                "                b=\"\";\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"total words \"+c);\n" +
                "    }\n" +
                "}");

        new PatternEditableBuilder().addPattern(Pattern.compile("Program To Input A Sentence And Count And Print Those Words Whose First Character Is Vowel And Last Is Consonant.\n" +
                        "Example : AMAN AND SUNIL ARE FRIENDS\n" +
                        "OUTPUT :\n" +
                        "AMAN\n" +
                        "AND\n" +
                        "Total words : 2"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string16output);
        text2.setText("Enter the sentence \n" +
                "AMAN AND SUNIL ARE FRIENDS\n" +
                "AMAN\n" +
                "AND\n" +
                "total words 2");
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

