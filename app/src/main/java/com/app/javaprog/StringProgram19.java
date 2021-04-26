package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram19 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program19);
        text = findViewById(R.id.string19program);
        text.setText("/** \n" +
                "Program To Reverse The Sentence.\n" +
                "INPUT :COMPUTER IS FUN\n" +
                "OUTPUT :FUN IS COMPTUER\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str17\n" +
                "{ \n" +
                "    static void reverse2()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the sentence \");\n" +
                "        String st = scan.nextLine();\n" +
                "        st = \" \"+st;\n" +
                "        String b=\"\";\n" +
                "        for(int i=st.length()-1;i>=0;i--)\n" +
                "        {\n" +
                "            char k = st.charAt(i);\n" +
                "            if(k!=' ')\n" +
                "                b=k+b;\n" +
                "            else\n" +
                "            {\n" +
                "                System.out.print(b+\" \");\n" +
                "                b=\"\";\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}");
       new PatternEditableBuilder().addPattern(Pattern.compile("Program To Reverse The Sentence.\n" +
                       "INPUT :COMPUTER IS FUN\n" +
                       "OUTPUT :FUN IS COMPTUER"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string19output);
        text2.setText("Enter the sentence \n" +
                "COMPUTER IS FUN\n" +
                "FUN IS COMPUTER");
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
                finish();overridePendingTransition(R.anim.slide_in_left,
                    R.anim.slide_out_right);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}

