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

public class OperatorsActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);
        text = findViewById(R.id.textView14);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
       text.setText("Types Of Operators :\n\n" +
                        "*Assignment \t= , += , -= , *= , /= , %= \n" +
                        "*Unary\t+ , – \n" +
                        "*Arithmetic\t+ , – , / , * , %\n" +
                        "*Relational\t==, != , < , >, <= , >=\n" +
                        "*Logical\t&& , || , !\n" +
                        "*Ternary\t(Condition)?(Statement1):(Statement2);\n" +
                        "*Bitwise\t& , | , ^ , ~\n" +
                        "*Shift\t<< , >> , >>>\n" +
                        "\n" +
                        "1.\tAssignment Operators :\n" +
                        "   a = 5 ;\n" +
                        "   a = a + 2;     or   a+=2      //   value of a become 7\n" +
                        "   a=10;   \n" +
                        "   a = a - 2;    or   a-=2;        //   value of a become  8\n" +
                        "\n2.\tUnary Operators :    +    ,   -       (It means one operator one operand)\n" +
                        "a = 5 ;    or   a = +5       //    value of a is 5  (positive)\n" +
                        "a = -5   //  value of a is  -5 (negative)\n" +
                        "\n" +
                        "3.\tArithmetic or Binary Operators  :   + , – ,  / , * , %    (one operator, two operand)\n" +
                        "a)\ta =  5;\n" +
                        "      c =  a + 10 ;   // here  a and 10  are operands and + is the operator\n" +
                        "\n" +
                        "b)\t int a = 10; \n" +
                        " int b =  2;\n" +
                        " int c = a/b;   //  value of  c will be 5\n" +
                        "\n" +
                        "c)\tint a = 20 , b=3, c;\n" +
                        "          c=a%b     //  value of c will be  2  as remainder, here %  is called modulus or remainder operator.\n" +
                        "\n" +
                        "4.\t Relational Operators :              < , >, <= , >=, ==, != \n" +
                        "Example 1:\n" +
                        "int a=10,b=6;\n" +
                        "if(a>b)                                             //   checking if a is greater than b\n" +
                        "\t    System.out.println(a);            //   statement 1\n" +
                        "else\n" +
                        "      System.out.println(b);           //    statement 2\n" +
                        "\n" +
                        "        In the above program segment   a is greater than b, so statement 1 will execute.\n" +
                        "\n" +
                        "Example 2:\n" +
                        "int a=10, b=10;\n" +
                        "if(a>=b)                                             //   checking if a is greater or equal to b\n" +
                        "\t    System.out.println(a);            //   statement 1\n" +
                        "else\n" +
                        "      System.out.println(b);           //    statement 2\n" +
                        "\n" +
                        "        In the above program segment   a is equal to b, so statement 1 will execute.\n" +
                        "\n" +
                        "Example 3:\n" +
                        "int a=10,b=5;\n" +
                        "if(a<b)                                             //   checking if a is less than b\n" +
                        "\t    System.out.println(a);            //   statement 1\n" +
                        "else\n" +
                        "      System.out.println(b);           //    statement 2\n" +
                        "\n" +
                        " In the above program segment   if condition is false , a is not less than  b, so statement 2 will execute.\n" +
                        "Example 4:\n" +
                        "int a=10,b=5;\n" +
                        "if(a==b)                                             //   checking if a is exactly equal to b\n" +
                        "\t    System.out.println(a);            //   statement 1\n" +
                        "else\n" +
                        "      System.out.println(b);           //    statement 2\n" +
                        "\n" +
                        " In the above program segment   if condition is false , a is not equal to  b, so statement 2 will execute.\n" +
                        "\n" +
                        "Example 5:\n" +
                        "int a=10,b=5;\n" +
                        "if(a!=b)                                             //   checking if a is not equal to b  ( ! is not operator)\n" +
                        "\t    System.out.println(a);            //   statement 1\n" +
                        "else\n" +
                        "      System.out.println(b);           //    statement 2\n" +
                        "\n" +
                        " In the above program segment   if condition is true , a is not equal to  b, so statement 1 will execute.\n" +
                        "\n" +
                        "5.\tLogical Operators :    && (AND) ,    || (OR)   ,   ! (NOT)\n" +
                        "If there are multiple conditions to check, then logical operators can be used.\n" +
                        "Example 1:\n" +
                        "int a=10,b=5,c=2;\n" +
                        "if(a>b && a>c  && b>c)                 //   checking if  a>b AND a>c AND b>c\n" +
                        "\t    System.out.println(a);            //   statement 1\n" +
                        "else\n" +
                        "      System.out.println(b);           //    statement 2\n" +
                        "\n" +
                        " In the above program segment  all the conditions are true, so statement 1 will execute.\n" +
                        "Example 2:\n" +
                        "int a=10,b=5,c=8;\n" +
                        "if(a>b && a>c  && b>c)                 //   checking if  a>b AND a>c AND b>c\n" +
                        "\t    System.out.println(a);            //   statement 1\n" +
                        "else\n" +
                        "      System.out.println(b);           //    statement 2\n" +
                        "\n" +
                        " In the above program segment first two conditions are true but b is not greater than c , then complete condition will be considered as false , so statement 2 will execute.\n" +
                        "Example 3:\n" +
                        "int a=10,b=15,c=12;\n" +
                        "if(a>b || a>c || b>c)                 //   checking if  a>b OR a>c OR b>c\n" +
                        "\t    System.out.println(a);            //   statement 1\n" +
                        "else\n" +
                        "      System.out.println(b);           //    statement 2\n" +
                        "\n" +
                        " In the above program segment if at least one condition is true, then complete condition will be considered as true , so statement 1 will execute.\n" +
                        "If all the conditions are false then else statement will execute.\n" +
                        "\n" +
                        "Example 4:  (use of  ! (not)  operator\n" +
                        "int a=10,b=5;\n" +
                        " if (! ( a>b) )                 //   checking  if a is not greater than b.\n" +
                        "\t    System.out.println(a);            //   statement 1\n" +
                        " else\n" +
                        "      System.out.println(b);           //    statement 2\n" +
                        "\n" +
                        " In the above program segment  a  is greater than b (which is true), but  ! (not) operator is used before the condition which will make it negative or reverse, so we will read as if a  is not greater than b then true otherwise false , so statement 2 will execute.\n" +
                        "\n" +
                        "6.\tIncrement and Decrement Operators :\n" +
                        " ++    (Increment Operator)   :  increase the value of the variable by 1.\n" +
                        "  --     (Decrement Operator) :  decrease the value of the variable by 1.\n" +
                        "Increment operators are of two types : post increment, pre increment\n" +
                        "Decrement operators are of two types : post decrement, pre decrement\n" +
                        "\n" +
                        "Example 1\n" +
                        "a = 5 ;\n" +
                        "a++  ;       //  post increment\n" +
                        "System.out.println(a);        // output  6\n" +
                        "\ta = 5 ;\n" +
                        "++a  ;       //  pre increment\n" +
                        "System.out.println(a);        // output  6\n" +
                        "In both the cases output is 6, So value of the variable will always increase whether you write before or after the variable.\n" +
                        "\n" +
                        "\n" +
                        "Example 2\n" +
                        "a = 5 ;\n" +
                        "System.out.println(a++);        // output  5\n" +
                        "System.out.println(a);            // output  6\n" +
                        "\ta = 5 ;\n" +
                        "System.out.println(++a);        // output  6 \n" +
                        "System.out.println(a);        // output  6\n" +
                        "Here it will print 5 and then increase by 1 for the next statement.\tHere it will increase by 1 and print 6 and finally it will become 6.\n" +
                        "\n" +
                        "\n" +
                        "Example 3\n" +
                        "a = 5 ;\n" +
                        "b =  a++ * 2 + a++  +  a++ ;\n" +
                        "System.out.println(a);        // output  8\n" +
                        "System.out.println(b);        // output  23\n" +
                        "\tWorking :\n" +
                        "a = 5 ;\n" +
                        "b =  5 * 2 + 6 + 7 =  23\n" +
                        " (step by step increasing the value of a )\n" +
                        "Here  variable a  is increased three times so final value of a is  8.\n" +
                        "\n" +
                        "\n" +
                        "Example 4\n" +
                        "a = 5 ;\n" +
                        "b =  a++ * 2 +  a--   +   a++ ;\n" +
                        "System.out.println(a);        // output  6\n" +
                        "System.out.println(b);        // output  21\n" +
                        "\tWorking :\n" +
                        "a = 5 ;\n" +
                        "b =  5 * 2 + 6 + 5=  21\n" +
                        " (step by step increasing/decreasing the    value of a )\n" +
                        "Here  variable a  is increased two times but decreased one time so final value of a is  6.\n" +
                        "\n" +
                        "\n" +
                        "Example 5\n" +
                        "a = 5 ;\n" +
                        "b =  ++a * 2 +  a--   +   --a  ;\n" +
                        "System.out.println(a);        // output  4\n" +
                        "System.out.println(b);        // output  22\n" +
                        "\tWorking :\n" +
                        "a = 5 ;\n" +
                        "b =  6 * 2 + 6 + 4=  22\n" +
                        " (step by step increasing/decreasing the    value of a )\n" +
                        "Here  variable a  is decreased two times but increased one time so final value of a is  4.\n" +
                        "\n" +
                        "\n" +
                        "Example 6\n" +
                        "a = 6 ;\n" +
                        "b =  ++a  * 2 +  ++a   +   a++/2  ;\n" +
                        "System.out.println(a);        // output  9\n" +
                        "System.out.println(b);        // output  26\n" +
                        "\tWorking :\n" +
                        "a = 6;\n" +
                        "b =  7 * 2 + 8 + 8/2=  26\n" +
                        " (step by step increasing value of a )\n" +
                        "Here  variable a  is increased three times so final value of a is  9.\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Types Of Operators :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Assignment Operators :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Arithmetic or Binary Operators  :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Relational Operators :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Unary Operators :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Logical Operators :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Increment and Decrement Operators :"),
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