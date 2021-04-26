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

public class ASCIICodeActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_s_c_i_i_code);
        text = findViewById(R.id.textView23);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Each  character which we can type with help of keyboard is having unique code, which are called ASCII Codes or Unicodes.\n" +
                "\n" +
                "ASCII : American Standard code for Information Interchange\n" +
                "UNICODE : Universal Codes , Java uses Universal Coding System.\n" +
                "First 128 (0-127) ASCII & UNICODES  are same.\n" +
                "There are 256 ASCII  & UNICODE are there.\n" +
                "\n" +
                "Common characters used in java.\n" +
                "\nAlphabets A to Z is having  codes  65 to 90\n" +
                "Alphabets a to z is having  codes  97 to 122\n" +
                "Digits from 0 to 9 is having codes 48 to 57\n" +
                "space is having code : 32\n" +
                "\n" +
                "If you try to store a character into an integer value it stores the ASCII value of the respective character.\n" +
                "\n" +
                "Example 1 :\n" +
                "char k = ‘B’;\n" +
                "int n = k;\n" +
                "System.out.println(n); //  output : 66\n" +
                "\n" +
                "Example 2:\n" +
                "int n = 66;\n" +
                "char k = (char)n;  // type casting is required.\n" +
                "System.out.println(k); //  output :  B\n" +
                "\n" +
                "Example 3:\n" +
                "\n" +
                "Program to print Alphabets from A to Z and their codes.\n" +
                "\n" +
                "for(int i=65;i<=90;i++)\n" +
                "{\n" +
                "    System.out.println(i+\"     \"+(char)i);\n" +
                "}\n" +
                "// same way all the characters can be printed by changing the values in the loop.\n" +
                " for(int i = 0; i <= 255; i++)\n" +
                " {\n" +
                "     System.out.println(i+\"     \"+(char)i);\n" +
                " }\n" +
                "\n" +
                "Example 4:\n" +
                "\n" +
                "Program to convert capital to small and small to capital letter\n" +
                "\n" +
                "class ASCIII\n" +
                "{\n" +
                "    static void main(char a)\n" +
                "    {\n" +
                "        if(a>=65 && a<=90)\n" +
                "           a+=32;\n" +
                "        else\n" +
                "        if(a>=97 && a<=122)\n" +
                "           a-=32;\n" +
                "        System.out.println(a);   \n" +
                "                    \n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("ASCII :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("UNICODE :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Common characters used in java."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example 1 :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example 2:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example 3:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example 4:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to print Alphabets from A to Z and their codes."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to convert capital to small and small to capital letter"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// same way all the characters can be printed by changing the values in the loop."),
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

