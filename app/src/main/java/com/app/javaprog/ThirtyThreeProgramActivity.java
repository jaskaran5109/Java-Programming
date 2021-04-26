package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ThirtyThreeProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_three_program);
        text = findViewById(R.id.program33);
        text.setText("/**\n" +
                " Program to print list of Armstrong numbers between 100 and 999\n" +
                " **/\n" +
                "class Armstrong2\n" +
                "{\n" +
                "\n" +
                "    static boolean armstrong(int n)\n" +
                "    {\n" +
                "        int r,s=0,t=n;\n" +
                "        do\n" +
                "        {\n" +
                "            r =n%10;\n" +
                "            s = s + r*r*r;\n" +
                "            n=n/10;\n" +
                "        }while(n!=0);\n" +
                "        if(t==s)\n" +
                "            return true;\n" +
                "        else\n" +
                "            return false;\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        for(int i=100;i<=999;i++)\n" +
                "        {\n" +
                "            boolean k = armstrong(i);\n" +
                "            if(k==true)\n" +
                "                System.out.println(i);\n" +
                "        }\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to print list of Armstrong numbers between 100 and 999"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output33);
        text2.setText("153\n" +
                "370\n" +
                "371\n" +
                "407");
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