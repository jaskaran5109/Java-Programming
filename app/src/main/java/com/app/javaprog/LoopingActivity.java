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

public class LoopingActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looping);
        text = findViewById(R.id.textView22);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Loop :- Loop is also called iteration (repetition). To execute  the instructions again and again, repetition of statements fixed number of times or till the condition remains true.\n" +
                "\n" +
                "There are three types of loops :-\n" +
                "\n" +
                "1.while loop\n" +
                "2.do-while loop\n" +
                "3.for loop\n" +
                "\n" +
                "Similarity between while, do-while & for loops :- \n" +
                "\n" +
                "All the loops will execute the statements till the condition remains true.\n" +
                "\n" +
                "Difference between while, do-while & for loops :- \n" +
                "\n" +
                "While & for loop will not execute any statement in the loop if the condition is false in the beginning whereas do-while loop will execute at least once even if the condition is false.\n" +
                "\n" +
                "while loop : This loop is called entry controlled loop. Body of the loop will not execute if the condition is false.\n" +
                "\n" +
                "Syntax :-\n" +
                "while(boolean condition)\n" +
                "{\n" +
                "    statement(s)\n" +
                "}\n" +
                "\n" +
                "Example1 :-\n" +
                "int i = 1;\n" +
                "while(i<=5)\n" +
                "{\n" +
                "  System.out.println(i);\n" +
                "  i++;\n" +
                "}\n" +
                "\n" +
                "Output :-\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "\n" +
                "Example2 :-\n" +
                "int i = 10;\n" +
                "while(i<=5)\n" +
                "{\n" +
                "  System.out.println(i);\n" +
                "  i++;\n" +
                "}\n" +
                "\n" +
                "Output :-\n" +
                "(nothing), because condition is false in the beginning, so set of statements enclosed in the {  } braces will not execute.\n" +
                "\n" +
                "do-while loop : This loop is called exit controlled loop. Body of the loop will execute at least once even if the condition is false.\n" +
                "\n" +
                "Syntax :-\n" +
                "do{\n" +
                "      statement(s)\n" +
                "   }while(boolean condition);\n" +
                "\n" +
                "Example1 :-\n" +
                "int i = 1;\n" +
                "do\n" +
                "{\n" +
                "  System.out.println(i);\n" +
                "  i++;\n" +
                "}while(i<=5);\n" +
                "\n" +
                "Output :-\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "\n" +
                "Example2 :-\n" +
                "int i = 10;\n" +
                "do\n" +
                "{\n" +
                "  System.out.println(i);\n" +
                "  i++;\n" +
                "} while(i<=5);\n" +
                "\n" +
                "Output :-\n" +
                "10\n" +
                "(condition is false, but it will execute one time), after printing 10, value of i will become 11, control will be transferred out of the loop).\n" +
                "\n" +
                "for loop : It also repeat the instructions within the body of the loop till the condition is true.\n" +
                "\n" +
                "Syntax :-\n" +
                "for (initialization condition; testing condition;  increment/decrement)\n" +
                "{\n" +
                "  statement(s)\n" +
                "}\n" +
                "\n" +
                "Example1 :-\n" +
                "int i;\n" +
                "for(i=1;i<=5;i++)\n" +
                "{\n" +
                "  System.out.println(i);\n" +
                "}\n" +
                "Output:\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "Example2 :- (reverse loop)\n" +
                "int i;\n" +
                "for(i=5;i>=1;i--)\n" +
                "{\n" +
                "  System.out.println(i);\n" +
                "}\n" +
                "\n" +
                "Output :-\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "\n" +
                "Example3 :-\n" +
                "int i;\n" +
                "for(i=5;i<=1;i--)\n" +
                "{\n" +
                "  System.out.println(i);\n" +
                "}\n" +
                "\n" +
                "Output :-\n" +
                "(nothing, because condition is false, value of  i is not less than or equal to 1.\n" +
                "\n" +
                "Infinite loop : The loop which never terminates.\n" +
                "\n" +
                "Example1 :-\n" +
                "int i=1;\n" +
                "while(i<=5)\n" +
                "{\n" +
                "  System.out.println(i);\n" +
                "}\n" +
                "\n" +
                "Output :-\n" +
                "1 will be printed infinite times, no increment in the value of i.\n" +
                "\n" +
                "Example2 :-\n" +
                "int i;\n" +
                "for(i=1; ; i++)\n" +
                "{\n" +
                "  System.out.println(i);\n" +
                "}\n" +
                "\n" +
                "Output :-\n" +
                "counting 1 , 2 ,3 . . . . .. .  will be printed infinite times, no condition is there between two semi-colons ( ; ;) .\n" +
                "\n" +
                "Different types of Variations in for loop :-\n" +
                "\n" +
                "Example1 :-\n" +
                "int i,j;\n" +
                "for(i=1,j=1;i<=5;i++,j++)\n" +
                "{\n" +
                "  System.out.println(i + ”\\t” + j);\n" +
                "}\n" +
                "\n" +
                "Output :-\n" +
                "1\t1\n" +
                "2\t2\n" +
                "3\t3\n" +
                "4\t4\n" +
                "5\t5\n" +
                "\n" +
                "\n" +
                "Example2 :-\n" +
                "int i,j;\n" +
                "for(i=1,j=1;i<=5 && j<=10 ;i++,j++)\n" +
                "{\n" +
                "  System.out.println( i + ”\\t” + j);\n" +
                "}\n" +
                "\n" +
                "Output :-\n" +
                "1\t1\n" +
                "2\t2\n" +
                "3\t3\n" +
                "4\t4\n" +
                "5\t5\n" +
                "\n" +
                "\n" +
                "Example 3 :-\n" +
                "int i,j;\n" +
                "for(i=1,j=1;i<=3 || j<=6 ;i++,j++)\n" +
                "{\n" +
                "  System.out.println(i + ”\\t” + j );\n" +
                "}\n" +
                "\n" +
                "Output :-\n" +
                "1\t1\n" +
                "2\t2\n" +
                "3\t3\n" +
                "4\t4\n" +
                "5\t5\n" +
                "6\t6\n" +
                "\n" +
                "break and continue keywords : both are called jump statements.\n" +
                "\n" +
                "break keyword :- \n" +
                "It is used inside the body of the  loop.\n" +
                "Brings the control out of the loop when break executes.\n" +
                "\n" +
                "Example :-\n" +
                "int i;\n" +
                "for(i=1;i<=10 ;i++)\n" +
                "{\n" +
                "  System.out.println(i);\n" +
                "  if(i==3)\n" +
                "        break;\n" +
                "}\n" +
                "\n" +
                "Output :-\n" +
                "1 \n" +
                "2 \n" +
                "3\n" +
                "\n" +
                "continue keyword :-\n" +
                "It is also used inside the body of the loop.\n" +
                "It takes the control for the next iteration without executing the rest of the statement in the body of the loop.\n" +
                "\n" +
                "Example :-\n" +
                "int i;\n" +
                "for(i=1;i<=5 ;i++)\n" +
                "{\n" +
                "  if(i==3)\n" +
                "        continue ;\n" +
                "  System.out.println(i);\n" +
                "}\n" +
                "\n" +
                "Output :-\n" +
                "1\n" +
                "2 \n" +
                "4\n" +
                "5( 3 will not be printed)\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Loop :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("There are three types of loops :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Similarity between while, do-while & for loops :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Difference between while, do-while & for loops :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("while loop :"),
                Color.rgb(255, 140, 0)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Syntax :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example1 :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example2 :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example3 :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("do-while loop :"),
                Color.rgb(255, 140, 0)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("for loop :"),
                Color.rgb(255, 140, 0)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Infinite loop :"),
                Color.rgb(255, 140, 0)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Different types of Variations in for loop :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("break and continue keywords :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("break keyword :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("continue keyword :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :-"),
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
