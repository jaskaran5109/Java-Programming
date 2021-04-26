package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class TwentySixProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_six_program);
        text = findViewById(R.id.program26);
        text.setText("import java.util.*;\n" +
                "class PrimeList\n" +
                "{\n" +
                "    // this function return true if number is prime and false if not.\n" +
                "    static boolean checkPrime(int n)   \n" +
                "    {   int c=0;\n" +
                "        for(int i=1;i<=n;i++)\n" +
                "        {\n" +
                "            if(n%i==0)\n" +
                "                c++;\n" +
                "        }\n" +
                "        if(c==2)\n" +
                "            return true;\n" +
                "        else\n" +
                "            return false;\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        for(int i=1;i<=50;i++)\n" +
                "        {\n" +
                "            boolean k = checkPrime(i);\n" +
                "            if(k==true)\n" +
                "                System.out.println(i);\n" +
                "        }\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("// this function return true if number is prime and false if not."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output26);
        text2.setText("2\n" +
                "3\n" +
                "5\n" +
                "7\n" +
                "11\n" +
                "13\n" +
                "17\n" +
                "19\n" +
                "23\n" +
                "29\n" +
                "31\n" +
                "37\n" +
                "41\n" +
                "43\n" +
                "47");
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