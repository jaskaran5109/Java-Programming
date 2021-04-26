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

public class TypesOfComputerActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_computer);
        text = findViewById(R.id.textView4);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Type of Computer Languages\n" +
                "\n" +
                "1. Machine Language\n" +
                "2. Assembly Language\n" +
                "3. High Level Language\n" +
                "\n" +
                "1. Machine Language: A processor understands only machine language instructions, which are strings of 1's and 0's. which is also called binary language. However, machine language is too ambiguous and complex for writing programs. Each processor has its own set of instructions for handling various operations, So different processors are having their own machine language.\n" +
                "\n" +
                "2. Assembly Language: Instructions written in machine language is not so easy. So, the low-level assembly language is designed for a specific family of processors that represents various instructions in symbolic code and a more understandable form. But finally program written in assembly language is required to convert into machine language using Assembler and it is designed for exactly one specific compute architecture.\n" +
                "\n" +
                "3. High Level Language is a computer programming language designed to simplify computer programming. High-level source code contains easy-to-read syntax that is later converted into a low-level or machine language, which can be recognized and run by a specific CPU (Central processing unit).\n" +
                "\n" +
                "Example of High Level Languages:\n" +
                "\n" +
                " C, C++, Cobol, Fortran, Pascal, Java, Perl, PHP, Python, JavaScript, Swift etc.\n" +
                "\n" +
                " All above mentioned languages use different syntax. Some are designed for writing desktop software programs while others are best-suited for web development But they all are considered high-level since they must be processed by compiler or interpreter and converted into machine language. Some language uses compiler and some uses interpreter. But Java uses both compiler and interpreter.\n" +
                "\n" +
                "Difference between Compiler and Interpreter\n" +
                "\n" +
                "Both converts High Level Language to machine language as processor can only understand machine language. Interpreter converts line by line each instruction whereas compiler converts whole program at a time.\n" +
                "\n" +
                "Now the difference between Ordinary compilation process and Java compilation process.\n" +
                "\n" +
                "Ordinary compilation process converts High level language to machine language by using either compiler or interpreter.");
        new PatternEditableBuilder().addPattern(Pattern.compile("1. Machine Language"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("2. Assembly Language"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("3. High Level Language"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example of High Level Languages:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Difference between Compiler and Interpreter"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Ordinary compilation process."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Java compilation process."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.textView4011);
        text2.setMovementMethod(ScrollingMovementMethod.getInstance());
        text2.setText("What are Byte codes:-  \n" +
                "\n" +
                "      Java programs are both compiled and Interpreted. The java compiler translated the source code to an intermediate level language called byte code. It is independent of the machine on which the program is run. The same byte code file can be used by a system.\n" +
                "\n" +
                "What is Java Virtual Machine:-\n" +
                "    \n" +
                "     To run a java program written on another system, its byte code needs to be transferred to its own Java virtual machine. JVM is an interpreter for which translates the program to its own machine language and runs it to give the result.\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("What are Byte codes:-"),
                Color.rgb(0, 0, 255)).into(text2);
        new PatternEditableBuilder().addPattern(Pattern.compile("What is Java Virtual Machine:-"),
                Color.rgb(0, 0, 255)).into(text2);

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
