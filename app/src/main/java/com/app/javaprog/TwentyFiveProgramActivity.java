package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class TwentyFiveProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_five_program);
        text = findViewById(R.id.program25);
        text.setText("/** Prime numbers are those numbers,which are having only\n" +
                "   two factors 1 and itself.\n" +
                "   Example :  11   only two factors  1 and 11  , so prime number\n" +
                "              10   1 2 5 10  : four factors  , not prime number\n" +
                " **/\n" +
                "import java.util.*;\n" +
                "class Primes\n" +
                "{\n" +
                "    static void printPrime(int n)   \n" +
                "    {   int c=0;\n" +
                "        for(int i=1;i<=n;i++)\n" +
                "        {\n" +
                "            if(n%i==0)\n" +
                "                c++;\n" +
                "        }\n" +
                "        if(c==2)\n" +
                "            System.out.println(\"PRIME\");\n" +
                "        else\n" +
                "            System.out.println(\"NOT PRIME\");\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        int n,k;  \n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        n = scan.nextInt();\n" +
                "        printPrime(n);\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Prime numbers are those numbers,which are having only"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("two factors 1 and itself."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :  11   only two factors  1 and 11  , so prime number"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("10   1 2 5 10  : four factors  , not prime number"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output25);
        text2.setText("Output1:-\n" +
                "Enter a number \n" +
                "10\n" +
                "NOT PRIME\n" +
                "\nOutput2:-\n" +
                "Enter a number \n" +
                "11\n" +
                "PRIME");
        new PatternEditableBuilder().addPattern(Pattern.compile("Output1:-"),
                Color.rgb(255, 140, 0)).into(text2);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output2:-"),
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