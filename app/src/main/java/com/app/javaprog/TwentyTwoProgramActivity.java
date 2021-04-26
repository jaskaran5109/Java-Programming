package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class TwentyTwoProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_two_program);
        text = findViewById(R.id.program22);
        text.setText("/**\n" +
                "  Input a number and print in the form of words.\n" +
                "  Example : n = 45  ->  Forty Five\n" +
                "            n = 125 ->  One Hundred Twenty Five\n" +
                "            n = 34562 -> Thirty four thousand Five hundred Sixty two.\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Words\n" +
                "{\n" +
                "    static void disp1(int n) // for 0 to 19 words\n" +
                "    {\n" +
                "        switch(n)\n" +
                "        {\n" +
                "            case 0 : System.out.print(\"zero \");\n" +
                "            break;\n" +
                "            case 1 : System.out.print(\"one \");\n" +
                "            break;\n" +
                "            case 2 : System.out.print(\"two \");\n" +
                "            break;\n" +
                "            case 3 : System.out.print(\"three \");\n" +
                "            break;\n" +
                "            case 4 : System.out.print(\"four \");\n" +
                "            break;\n" +
                "            case 5 : System.out.print(\"five \");\n" +
                "            break;\n" +
                "            case 6 : System.out.print(\"six \");\n" +
                "            break;\n" +
                "            case 7 : System.out.print(\"seven \");\n" +
                "            break;\n" +
                "            case 8 : System.out.print(\"eight \");\n" +
                "            break;\n" +
                "            case 9 : System.out.print(\"nine \");\n" +
                "            break;\n" +
                "            case 10 : System.out.print(\"ten \");\n" +
                "            break;\n" +
                "            case 11 : System.out.print(\"eleven \");\n" +
                "            break;\n" +
                "            case 12 : System.out.print(\"twelve \");\n" +
                "            break;\n" +
                "            case 13 : System.out.print(\"thirteen \");\n" +
                "            break;\n" +
                "            case 14 : System.out.print(\"fourteen \");\n" +
                "            break;\n" +
                "            case 15 : System.out.print(\"fifteen \");\n" +
                "            break;\n" +
                "            case 16 : System.out.print(\"sixteen \");\n" +
                "            break;\n" +
                "            case 17 : System.out.print(\"seventeen \");\n" +
                "            break;\n" +
                "            case 18 : System.out.print(\"eighteen \");\n" +
                "            break;\n" +
                "            case 19 : System.out.print(\"nineteen \");\n" +
                "            break;\n" +
                "        }       \n" +
                "    }\n" +
                "\n" +
                "    static void disp2(int n) // for twenty,thirty,forty .... ninety \n" +
                "    {\n" +
                "        switch(n)\n" +
                "        {\n" +
                "            case 2 : System.out.print(\"twenty \");\n" +
                "            break;\n" +
                "            case 3 : System.out.print(\"thirty \");\n" +
                "            break;\n" +
                "            case 4 : System.out.print(\"forty \");\n" +
                "            break;\n" +
                "            case 5 : System.out.print(\"fifty \");\n" +
                "            break;\n" +
                "            case 6 : System.out.print(\"sixty \");\n" +
                "            break;\n" +
                "            case 7 : System.out.print(\"seventy \");\n" +
                "            break;\n" +
                "            case 8 : System.out.print(\"eighty \");\n" +
                "            break;\n" +
                "            case 9 : System.out.print(\"ninety \");\n" +
                "            break;\n" +
                "        }\n" +
                "    }  \n" +
                "\n" +
                "    static void digit2(int n) // for numbers 0-99\n" +
                "    {\n" +
                "        if(n<=19)\n" +
                "            disp1(n);\n" +
                "        else\n" +
                "        { disp2(n/10);\n" +
                "            int r = n%10;\n" +
                "            if(r!=0)\n" +
                "                disp1(r);\n" +
                "        }  \n" +
                "    }      \n" +
                "\n" +
                "    static void digit3(int n) // for numbers 0-999\n" +
                "    {  if(n<=99)\n" +
                "            digit2(n);\n" +
                "        else\n" +
                "        { int q = n/100; \n" +
                "            disp1(q);\n" +
                "            System.out.print(\"hundred \");\n" +
                "            int r = n%100;\n" +
                "            if(r!=0)\n" +
                "                digit2(r);\n" +
                "        }\n" +
                "    }    \n" +
                "\n" +
                "    static void digit5(int n) // for numbers 0-99999\n" +
                "    {  if(n<=999)\n" +
                "            digit3(n);\n" +
                "        else\n" +
                "        { int q = n/1000; \n" +
                "            digit2(q);\n" +
                "            System.out.print(\"thousand \");\n" +
                "            int r = n%1000;\n" +
                "            if(r!=0)\n" +
                "                digit3(r);\n" +
                "        }\n" +
                "    }    \n" +
                "\n" +
                "    static void digit7(int n) // for numbers 0-9999999\n" +
                "    {  if(n<=99999)\n" +
                "            digit5(n);\n" +
                "        else\n" +
                "        { int q = n/100000; \n" +
                "            digit2(q);\n" +
                "            System.out.print(\"lakh(s) \");\n" +
                "            int r = n%100000;\n" +
                "            if(r!=0)\n" +
                "                digit5(r);\n" +
                "        }\n" +
                "    }    \n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan  = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter any number: \");\n" +
                "        int n = scan.nextInt();\n" +
                "        digit7(n);\n" +
                "    }      \n" +
                "}   ");
        new PatternEditableBuilder().addPattern(Pattern.compile("Input a number and print in the form of words.\n" +
                        "  Example : n = 45  ->  Forty Five\n" +
                        "            n = 125 ->  One Hundred Twenty Five\n" +
                        "            n = 34562 -> Thirty four thousand Five hundred Sixty two."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// for 0 to 19 words"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// for numbers 0-999"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// for numbers 0-99999"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// for numbers 0-9999999"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// for twenty,thirty,forty .... ninety"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// for numbers 0-99"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output22);
        text2.setText("Enter any number: 34562\n" +
                "thirty four thousand five hundred sixty two");
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