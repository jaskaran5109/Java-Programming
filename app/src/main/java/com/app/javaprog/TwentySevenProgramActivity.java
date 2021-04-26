package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class TwentySevenProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_seven_program);
        text = findViewById(R.id.program27);
        text.setText("/**\n" +
                "  Program to print the prime factors of a number.\n" +
                "  Example : if n = 100, prime factors are 2,2,5,5\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class PrimeFactors\n" +
                "{\n" +
                "    static void factors(int n)\n" +
                "    {\n" +
                "        int i,c=0;\n" +
                "        for(i=2;i<=n;i++)\n" +
                "        {\n" +
                "            if(n%i==0)\n" +
                "            {\n" +
                "                System.out.println(i);\n" +
                "                n=n/i;\n" +
                "                i--;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        int n;  \n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        n = scan.nextInt();\n" +
                "        factors(n);\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to print the prime factors of a number."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example : if n = 100, prime factors are 2,2,5,5"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output27);
        text2.setText("Enter a number \n" +
                "100\n" +
                "2\n" +
                "2\n" +
                "5\n" +
                "5");
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