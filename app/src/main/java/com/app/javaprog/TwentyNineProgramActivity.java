package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class TwentyNineProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_nine_program);
        text = findViewById(R.id.program29);
        text.setText("// Palindrome numbers : are those numbers whose reversed is the same number.\n" +
                "EXAMPLE :  454  is a palindrome number. **/\n" +
                "\n" +
                "import java.util.*;\n" +
                "class Palindrome\n" +
                "{\n" +
                "    static void palindrome(int n) //  if n = 457\n" +
                "    {\n" +
                "        int r,s=0,t=n; // storing  value of  n to t : temporary variable\n" +
                "        do\n" +
                "        {              //  I round     II round     III round\n" +
                "            r=n%10;    // r= 457%10=7  r=45%10=5    r=4%10=4             \n" +
                "            s=s*10 + r;   // s=0*10+7=7   s=7*10+5=75  s=75*10+4=754\n" +
                "            n=n/10;    // n= 457/10=45 n=45/10=4    n=4/10=0 :loop will terminated\n" +
                "        }while(n!=0);\n" +
                "        // final value of s will be 754 which is reverse of 457 and n will become 0.\n" +
                "        if(t==s)\n" +
                "            System.out.println(\"PALINDROME\");\n" +
                "        else \n" +
                "            System.out.println(\"NOT PALINDROME\");\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        int n;  \n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        n = scan.nextInt();\n" +
                "        palindrome(n);\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("Palindrome numbers : are those numbers whose reversed is the same number."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("EXAMPLE :  454  is a palindrome number."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  if n = 457"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("storing  value of  n to t : temporary variable"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("I round     II round     III round"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("r= 457%10=7  r=45%10=5    r=4%10=4"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("s=0\\*10\\+7=7   s=7\\*10\\+5=75  s=75\\*10\\+4=754"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("n= 457/10=45 n=45/10=4    n=4/10=0 :loop will terminated"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile(" final value of s will be 754 which is reverse of 457 and n will become 0."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output29);
        text2.setText("Output1:-\n" +
                "Enter a number \n" +
                "454\n" +
                "PALINDROME\n" +
                "Output2:-\n" +
                "Enter a number \n" +
                "899\n" +
                "NOT PALINDROME");
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