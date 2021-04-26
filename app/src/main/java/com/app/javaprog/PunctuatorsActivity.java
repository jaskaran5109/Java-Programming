package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class PunctuatorsActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punctuators);
        text = findViewById(R.id.textView12);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Punctuation marks can be used in a program while writing the instructions.\n" +
                "\nExample :   ,    ;      ()   {}     []  .\n" +
                "Comma (,) :- \nThey are used to initialize more than one variable in a statement  \nExample: int a,b,c,d; float x,y,z;\n" +
                "\nSemi-Colon (;) :- \nThis helps in separating more than one statement in an expression.  \nExample: int a,b,c; float x,y,z; double c;\n" +
                "\n" +
                "Parentheses ( ) :- \nThese indicate a function call along with function parameters or in mathematical calculations.\nExample: x = 5+6*2 = 17  x = (5+6)*2 = 22\n" +
                "\n(BODMAS Rule)\n" +
                "\nBraces{ } :- \nThe opening and ending curly braces indicate the beginning and end of a block of code having more than one statement. \nExample: \n void main()\n" +
                "   {\n" +
                "        int p,q;\n" +
                "         p=5;\n" +
                "         q=6; \n" +
                "    }\n" +
                "\nBrackets [ ] :- \nThese are used as an array element reference and also indicates single and multidimensional subscripts. \nExample: \nint a[] = new int[5];\n" +
                "int a[][] = new int[3][4];\n" +
                "\n" +
                "Some more descriptions:\n" +
                "\nParentheses ( ) :-   5 * (6+  (2 + 10) *2 )\n" +
                "Using BODMAS , Result : 150   (Internal brackets will be evaluated first then external) curly braces and square brackets are not allowed in mathematical calculations.\n" +
                "\n" +
                "Braces{ } :- \nSet of statements enclosed in a curly  { }  is called a block . A block may or may not have a name. The scope of the variables declared is limited to block/class/function where they are declared. It means they cannot be used outside the block.\n" +
                "\nExample :\t\n" +
                "class Alpha\n" +
                "{\n" +
                "  int a, b;    //  variables declared can be used in any function within the class.\n" +
                "\n" +
                "  void add()\n" +
                "\t{\n" +
                "\t   int c=5;\n" +
                "\t          {  \n" +
                "                 int d=6;\n" +
                "\t\t    System.out.println(c);      //  c  can be used inside the block, but declared outside.\n" +
                "\t\t    System.out.println(d);     //  valid.\n" +
                "\t \t    System.out.println(a);\t  // valid, declared in the body of the class and can be used in any \n" +
                "  //  function defined within the class.\n" +
                "\t            }\n" +
                "      System.out.println(d);\t\t//  invalid, d cannot be used outside the block.\n" +
                "\t    System.out.println(c);  \t\t//  valid.\n" +
                "  }\n" +
                "\n" +
                "   void display()\n" +
                "    {\n" +
                "            System.out.println(c ) ;   //  invalid, as c  is declared in function void add().\n" +
                "     }\n" +
                "}       // end of class.\n" +
                "\n" +
                "Comments or Remarks in the program Some statements are written in the above program just for explanation of the statements. So, compiler will not read them during compilation process, if they are started with the comments symbols.\n" +
                "\nThere are two types of comments symbols:\n" +
                "// : Single line comments.\n" +
                "/*  */ : Multiple lines comments.\n" +
                "\nExample :  /*  System.out.println(“Java”);  System.out.println(“Programs ”) */\n" +
                "\nSo compiler will ignore the set of statements if they are written in between  /* -- - -- - - */\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Comma"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Parentheses"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Brackets"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Braces"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// : Single line comments."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("/\\*  \\*/ : Multiple lines comments."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :"),
                Color.rgb(0, 0, 255)).into(text);

        new PatternEditableBuilder().addPattern(Pattern.compile("Semi-Colon"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Some more descriptions:"),
                Color.rgb(0, 0, 255)).into(text);

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