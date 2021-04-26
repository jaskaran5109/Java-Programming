package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SixtySixProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixty_six_program);
        text = findViewById(R.id.program66);
        text.setText("/**\n" +
                " * Demonstration program of Inheritance:\n" +
                " * There are two classes, one is Room class (parent or super class) and another is drawing class(child or sub class)\n" +
                "  \n" +
                " * Room class is having:\n" +
                " * data members: length & breadth.\n" +
                " * constructors : default & parameterised.\n" +
                " * functions :  area() & display()\n" +
                "  \n" +
                " * Drawing class is having:\n" +
                " * data members: height\n" +
                " * constructors : default & parameterised.\n" +
                " * functions :  volume() & display()\n" +
                " * \n" +
                " */\n" +
                "class Room\n" +
                "{\n" +
                "    int length,breadth;\n" +
                "\n" +
                "    Room() // default constructor\n" +
                "    {\n" +
                "        length=5;\n" +
                "        breadth=7;\n" +
                "    }\n" +
                "\n" +
                "    Room(int x,int y) // parameterised constructor\n" +
                "    {\n" +
                "        length=x;\n" +
                "        breadth=y;\n" +
                "    }\n" +
                "\n" +
                "    int area()\n" +
                "    {\n" +
                "        return length*breadth;\n" +
                "    }\n" +
                "\n" +
                "    void display()\n" +
                "    {\n" +
                "        System.out.println(length);\n" +
                "        System.out.println(breadth);\n" +
                "    }\n" +
                "} \n" +
                "\n" +
                "class Drawing extends Room // extends keyword is used to inherit the properties of Room class.\n" +
                "{\n" +
                "    int height;\n" +
                "    Drawing()\n" +
                "    {\n" +
                "        height=10;\n" +
                "    }\n" +
                "\n" +
                "    Drawing(int x,int y,int z)\n" +
                "    {   // super keyword should be the first statement in constructor.\n" +
                "        super(x,y);\n" +
                "        //invoking the parameterised constructor of base class Room.\n" +
                "        //if super(x,y) is now written then automatically default constructor of base class will be invoked.\n" +
                "        height=z;\n" +
                "    }\n" +
                "\n" +
                "    int volume()\n" +
                "    {  \n" +
                "        int v = area()*height;//here we can access the area() function of Room class\n" +
                "        return v;\n" +
                "    }\n" +
                "\n" +
                "    void display()\n" +
                "    {\n" +
                "        super.display(); // to invoke the function of base class.\n" +
                "        System.out.println(height);\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        Drawing obj = new Drawing(6,8,10); // object of Drawing class is created which also creates the\n" +
                "        //object of Room class implicitly and can be referenced by using keyword super.\n" +
                "        obj.display();\n" +
                "        int v = obj.volume();\n" +
                "        System.out.println(\"volume is \"+v);\n" +
                "        int a =  obj.area(); \n" +
                "        //object of Drawing class can also access the functions & data members of Room class(if not private)\n" +
                "        System.out.println(\"area : \"+a);\n" +
                "    }  \n" +
                "} ");

        new PatternEditableBuilder().addPattern(Pattern.compile("\\* Demonstration program of Inheritance:\n" +
                        " \\* There are two classes, one is Room class \\(parent or super class\\) and another is drawing class\\(child or sub class\\)\n" +
                        "  \n" +
                        " \\* Room class is having:\n" +
                        " \\* data members: length & breadth.\n" +
                        " \\* constructors : default & parameterised.\n" +
                        " \\* functions :  area\\(\\) & display\\(\\)\n" +
                        "  \n" +
                        " \\* Drawing class is having:\n" +
                        " \\* data members: height\n" +
                        " \\* constructors : default & parameterised.\n" +
                        " \\* functions :  volume\\(\\) & display\\(\\)\n" +
                        " \\* "),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// default constructor"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// parameterised constructor"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// extends keyword is used to inherit the properties of Room class."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// super keyword should be the first statement in constructor."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//invoking the parameterised constructor of base class Room."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//if super\\(x,y\\) is now written then automatically default constructor of base class will be invoked."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//here we can access the area\\(\\) function of Room class"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// to invoke the function of base class."),
                Color.rgb(0, 0, 255)).into(text)
        ;new PatternEditableBuilder().addPattern(Pattern.compile("// object of Drawing class is created which also creates the"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//object of Room class implicitly and can be referenced by using keyword super."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//object of Drawing class can also access the functions & data members of Room class\\(if not private\\)"),
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