package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram7 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program7);
        text = findViewById(R.id.string7program);
        text.setText("/**\n" +
                "Write a program to input a string and check whether palindrome or not.\n" +
                "Example :\n" +
                "MALAYALAM when reverse it -> MALALAYAM (so palindrome)\n" +
                "NITIN <-> NITIN (palindrome)\n" +
                "COMPUTER <-> RETUPMOC (not palindrome)\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str7\n" +
                "{\n" +
                "    static void palindrome()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the string \");\n" +
                "        String st = scan.nextLine();\n" +
                "        st=st.toUpperCase();\n" +
                "        String b=\"\";\n" +
                "        for(int i=0;i<st.length();i++)\n" +
                "        {\n" +
                "            char k = st.charAt(i);\n" +
                "            b = k + b;\n" +
                "        }\n" +
                "        if(st.equals(b))\n" +
                "            System.out.println(\"palindrome\");\n" +
                "        else\n" +
                "            System.out.println(\"not palindrome\");\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to input a string and check whether palindrome or not.\n" +
                        "Example :\n" +
                        "MALAYALAM when reverse it -> MALALAYAM \\(so palindrome\\)\n" +
                        "NITIN <-> NITIN \\(palindrome\\)\n" +
                        "COMPUTER <-> RETUPMOC \\(not palindrome\\)"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string7output);
        text2.setText("Enter the string \n" +
                "Nitin\n" +
                "palindrome");
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

