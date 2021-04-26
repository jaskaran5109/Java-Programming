package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ThirtyFourProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_four_program);
        text = findViewById(R.id.program34);
        text.setText("/**\n" +
                "Program to check the input number is automorphic or not.\n" +
                "Automorphic numbers are those, the number itself is present at the end of its square.\n" +
                "Example :\n" +
                "5   its square  25  // automorphic, 5 is present at the end.\n" +
                "6   its square  36  // automorphic, 6 is present at the end.\n" +
                "25  its square  625  // automorphic, 25 is present at the end.\n" +
                "7  its square  49  // not automorphic, 7 is not present at the end.\n" +
                "10  its square  100  // not automorphic, 10 is not present at the end.\n" +
                " **/\n" +
                "\n" +
                "import java.util.*;\n" +
                "class Automorphic\n" +
                "{\n" +
                "" +
                "    static void main()\n" +
                "    {   \n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        int n = scan.nextInt();\n" +
                "        int sq=n*n,t=n,p=1;\n" +
                "        do\n" +
                "        {\n" +
                "            p=p*10;\n" +
                "            n=n/10;\n" +
                "        }while(n!=0);\n" +
                "        if(sq%p==t)\n" +
                "            System.out.println(\"automorphic\");\n" +
                "        else\n" +
                "            System.out.println(\"not automorphic\");\n" +
                "\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to check the input number is automorphic or not."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Automorphic numbers are those, the number itself is present at the end of its square."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("5   its square  25  // automorphic, 5 is present at the end."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("6   its square  36  // automorphic, 6 is present at the end."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("25  its square  625  // automorphic, 25 is present at the end."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("7  its square  49  // not automorphic, 7 is not present at the end."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("10  its square  100  // not automorphic, 10 is not present at the end."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output34);
        text2.setText("Output1:-\n" +
                "Enter a number \n" +
                "10\n" +
                "not automorphic\n" +
                "\nOutput2:-\n" +
                "Enter a number \n" +
                "25\n" +
                "automorphic");
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