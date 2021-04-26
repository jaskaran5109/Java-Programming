package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ThirtySixProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_six_program);
        text = findViewById(R.id.program36);
        text.setText("/**\n" +
                "As many objects can be created using class name.\n" +
                "Each object keeps separate copy of values for its data members.\n" +
                "Go through the example.\n" +
                "In this example, two data() functions are created, but having \n" +
                "different parameters, the concept is called functions overloading\n" +
                " */\n" +
                "class Alpha\n" +
                "{\n" +
                "    int a,b;    //  here a,b are called data members\n" +
                "\n" +
                "    void data()\n" +
                "    {\n" +
                "        a=5;\n" +
                "        b=6;\n" +
                "    }\n" +
                "\n" +
                "    void data(int x,int y)\n" +
                "    {\n" +
                "        a=x;\n" +
                "        b=y;\n" +
                "    }\n" +
                "\n" +
                "    void display()\n" +
                "    {\n" +
                "        System.out.println(a+\"\\t\"+b);\n" +
                "    }\n" +
                "\n" +
                "    public static void main()\n" +
                "    {\n" +
                "        Alpha ob1 = new Alpha() ; // object(ob1) declaration and memory allocation\n" +
                "        Alpha ob2 = new Alpha() ; // object(ob2) declaration and memory allocation\n" +
                "        Alpha ob3 = new Alpha() ; // object(ob3) declaration and memory allocation\n" +
                "        ob1.data(7,8);\n" +
                "        ob2.data(10,20);\n" +
                "        ob3.data();\n" +
                "        ob1.display();\n" +
                "        ob2.display();\n" +
                "        ob3.display();\n" +
                "    }\n" +
                "}\n" +
                "/**\n" +
                "Output:\n" +
                "\n" +
                "7   8\n" +
                "10\t20\n" +
                "5\t6\n" +
                "\n" +
                " */");
        new PatternEditableBuilder().addPattern(Pattern.compile("As many objects can be created using class name.\n" +
                        "Each object keeps separate copy of values for its data members.\n" +
                        "Go through the example.\n" +
                        "In this example, two data\\(\\) functions are created, but having \n" +
                        "different parameters, the concept is called functions overloading"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile(" //  here a,b are called data members"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// object(ob1) declaration and memory allocation"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// object(ob2) declaration and memory allocation"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// object(ob3) declaration and memory allocation"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("7   8\n" +
                        "10\t20\n" +
                        "5\t6"),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output36);
        text2.setText("7\t8\n" +
                "10\t20\n" +
                "5\t6");
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