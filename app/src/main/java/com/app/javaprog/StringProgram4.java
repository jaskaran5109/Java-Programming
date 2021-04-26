package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram4 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program4);
        text = findViewById(R.id.string4program);
        text.setText("/**\n" +
                "Write a program to input the string and change the case of each character present in the string.\n" +
                "(i.e. capital to small and small to capital)\n" +
                "Example :\n" +
                "Input : ComPUteR\n" +
                "Output: cOMpuTEr\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str4\n" +
                "{\n" +
                "    static void changeCases()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the string \");\n" +
                "        String st = scan.nextLine();\n" +
                "        for(int i=0;i<st.length();i++)\n" +
                "        {\n" +
                "            char k = st.charAt(i);\n" +
                "            if(Character.isUpperCase(k))\n" +
                "                k = Character.toLowerCase(k);\n" +
                "            else\n" +
                "            if(Character.isLowerCase(k))\n" +
                "                k = Character.toUpperCase(k);\n" +
                "            System.out.print(k);\n" +
                "        }\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to input the string and change the case of each character present in the string.\n" +
                        "(i.e. capital to small and small to capital)\n" +
                        "Example :\n" +
                        "Input : ComPUteR\n" +
                        "Output: cOMpuTEr"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string4output);
        text2.setText("Enter the string \n" +
                "ComPUteR\n" +
                "cOMpuTEr");
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

