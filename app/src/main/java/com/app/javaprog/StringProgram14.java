package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram14 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program14);
        text = findViewById(R.id.string14program);
        text.setText("/**\n" +
                "  To Input A Word In Capital Letter And Print In Alphabetical Order.\n" +
                "  Example:\n" +
                "  INPUT : COMPUTER\n" +
                "  OUTPUT: CEMOPRTU\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str12\n" +
                "{\n" +
                "    static void alphaBeticalOrder()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the sentence \");\n" +
                "        String st = scan.nextLine();\n" +
                "        for(char i=65;i<=90;i++) // ASCII code of A to Z is 65 to 90\n" +
                "        {\n" +
                "            for(int j=0;j<st.length();j++)\n" +
                "            {\n" +
                "                char k = st.charAt(j);\n" +
                "                if(k==i)\n" +
                "                    System.out.print(k);\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("// ASCII code of A to Z is 65 to 90"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("To Input A Word In Capital Letter And Print In Alphabetical Order.\n" +
                        "  Example:\n" +
                        "  INPUT : COMPUTER\n" +
                        "  OUTPUT: CEMOPRTU"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string14output);
        text2.setText("Enter the sentence \n" +
                "COMPUTER\n" +
                "CEMOPRTU");
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

