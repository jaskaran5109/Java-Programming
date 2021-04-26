package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram9 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program9);
        text = findViewById(R.id.string9program);
        text.setText("/*\n" +
                "  Write a program to input a name and print the initials of the\n" +
                "  name with surname.\n" +
                "  Example:\n" +
                "  INPUT : MOHANDAS KARAMCHAND GANDHI\n" +
                "  OUTPUT: M.K.GANDHI\n" +
                " \n" +
                "  If name is in single word:\n" +
                "  Example:\n" +
                "  INPUT: MOHANDAS\n" +
                "  OUTPUT: MOHANDAS\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str9\n" +
                "{\n" +
                "    static void main()\n" +
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
                "                System.out.print(b.charAt(0)+\".\");\n" +
                "                b=\"\";\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(b);// last word will be printed here\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Write a program to input a name and print the initials of the\n" +
                        "  name with surname.\n" +
                        "  Example:\n" +
                        "  INPUT : MOHANDAS KARAMCHAND GANDHI\n" +
                        "  OUTPUT: M.K.GANDHI\n" +
                        " \n" +
                        "  If name is in single word:\n" +
                        "  Example:\n" +
                        "  INPUT: MOHANDAS\n" +
                        "  OUTPUT: MOHANDAS"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// last word will be printed here"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string9output);
        text2.setText("Enter the string \n" +
                "MOHANDAS KARAMCHAND GANDHI\n" +
                "M.K.GANDHI");
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

