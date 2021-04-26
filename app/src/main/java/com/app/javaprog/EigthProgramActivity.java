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

public class EigthProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eigth_program);
        text = findViewById(R.id.program8);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("class Program8\n" +
                "{\n" +
                "    static void main(int a,int b)\n" +
                "    {\n" +
                "        int h;\n" +
                "        h = (a>b) ? a : b ; /** if condition is true value of 'a' will be transfer to h otherwise value of 'b'.**/\n" +
                "        System.out.println(h);\n" +
                "    }\n" +
                "}\n" +
                "/**\n" +
                "Similar to the program given below using 'if else'.\n" +
                "static void main(int a,int b)\n" +
                "{\n" +
                "int h;\n" +
                "if(a>b)\n" +
                "h=a;\n" +
                "else\n" +
                "h=b;\n" +
                "System.out.println(h);\n" +
                " **/\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("if condition is true value of 'a' will be transfer to h otherwise value of 'b'."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Similar to the program given below using 'if else'."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output8);
        text2.setMovementMethod(ScrollingMovementMethod.getInstance());
        text2.setText("12");

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

