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

public class UserDefinedActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_defined);
        text = findViewById(R.id.textView18);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("The functions which are defined/created by the user or programmer to perform some specific task.\n" +
                "Suppose you want to calculate area  of circle and there is not any pre-defined function to calculate area, So you can create function by providing any name to perform this task.\n" +
                "(In later topics we will discuss how to create or define such kind of functions).\n" +
                "\nExample 1 :\n" +
                "\n" +
                "class Alpha\n" +
                "{\n" +
                "\n" +
                "     static void delhi()      //  function defined by the user\n" +
                "    {\n" +
                "      System.out.println(“I am in delhi”);\n" +
                "     }\n" +
                "\n" +
                "   public static void main(String arg[])       //  reserved function of java\n" +
                "   {\n" +
                "      System.out.println(“I am in main”);\n" +
                "      delhi();                     // calling the function  first time\n" +
                "      System.out.println(“I am back in main”);\n" +
                "      delhi();\t\t   //  calling the function second time\n" +
                "      System.out.println(“I am back in main”);\n" +
                "   }\n" +
                "}\n" +
                "\n" +
                "When you run the main function, you will get the following output\n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "  I am in main\n" +
                "  I am in delhi\n" +
                "  I am back in main\n" +
                "  I am in delhi\n" +
                "  I am back in main\n" +
                "\nExample 2 :\n" +
                "\n" +
                "class Alpha\n" +
                "{\n" +
                "\n" +
                "   static void mumbai()\n" +
                "  {\n" +
                "       System.out.println(“I am in Mumbai”);\n" +
                "   }\n" +
                "\n" +
                "\n" +
                "     static void delhi()      //  function defined by the user\n" +
                "    {\n" +
                "      System.out.println(“I am in delhi”);\n" +
                "       mumbai();              // calling the function mumbai\n" +
                "      System.out.println(“I am back in delhi”);\n" +
                "     }\n" +
                "\n" +
                "   public static void main(String arg[])       //  reserved function of java\n" +
                "   {\n" +
                "      System.out.println(“I am in main”);\n" +
                "      delhi();                     // calling the function  delhi\n" +
                "      System.out.println(“I am back in main”);\n" +
                "   }\n" +
                "}\n" +
                "\n" +
                "When you run the main function, you will get the following output\n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "  I am in main\n" +
                "  I am in delhi\n" +
                "  I am in Mumbai\n" +
                "  I am back in delhi\n" +
                "  I am back in main\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Example 1 :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example 2 :"),
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
