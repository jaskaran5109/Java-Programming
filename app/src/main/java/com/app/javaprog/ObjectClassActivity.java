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

public class ObjectClassActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_class);
        text = findViewById(R.id.textView27);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Class name as a user-defined data type.\n" +
                "\n" +
                "Class: The building block of java that leads to Object-Oriented programming is a Class.\n" +
                "\n" +
                "* It is a user defined data type.\n" +
                "* Class holds its own data members and member functions. which can be accessed and used by creating an instance(object) of that class.\n" +
                "* A class is like a blueprint for an object.\n" +
                "* A class is called object factory. \n" +
                "\n" +
                "Software Object :  A small memory block in the RAM having state, behavior and identity.\n" +
                "\n" +
                "State :  space(memory) occupied by the object variable.\n" +
                "Behavior :  non-static functions defined in the class.\n" +
                "Identity :   reference(address) of the object in the memory. \n" +
                "\n" +
                "As each cell in the memory is having unique number or address which is called reference.\n" +
                "\n" +
                "As we can declare any number of variables by using primitive data type like int, float etc. same way by using class name we can also declare any number of variables which are called objects.\n" +
                "\n" +
                "The size of the primitive data types is fixed e.g  int (4 bytes) , long(8 bytes), char(2 bytes), but the size of the objects depends on the data members declared in the body of the class.\n" +
                "\n" +
                "Example:\n" +
                "\n" +
                "class Alpha\n" +
                "{\n" +
                "    int a,b; //  here a,b & c are called data members\n" +
                "    double c;\n" +
                "\n" +
                "    void data()\n" +
                "    {\n" +
                "        a=5;\n" +
                "        b=6;\n" +
                "        c=6.5;\n" +
                "    }\n" +
                "\n" +
                "    void display()\n" +
                "    {\n" +
                "        System.out.println(a+”\\t”+b+”\\t”+c);\n" +
                "    }\n" +
                "\n" +
                "    public static void main()\n" +
                "    {\n" +
                "        Alpha  ob1 ,ob2,ob3 ;   // object declarations using class Alpha\n" +
                "        ob1 = new Alpha();   // memory allocation to object(ob1) using keyword new\n" +
                "        // memory occupied by ob1 is  16 bytes , depends on the total size of data members .      \n" +
                "        // (int a (4bytes) +  int b(4 bytes) +  double c(8 bytes)\n" +
                "        ob1.data();   //  calling the function data()\n" +
                "        ob1.display(); // calling the function display()\n" +
                "        ob2.display(); //  error, because memory is not allocated.\n" +
                "    }\n" +
                "}\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("user-defined data type"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Identity :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Behavior :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("State :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Software Object :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Class:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  here a,b & c are called data members"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// object declarations using class Alpha"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// memory allocation to object\\(ob1\\) using keyword new"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// memory occupied by ob1 is  16 bytes , depends on the total size of data members."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// \\(int a \\(4bytes\\) +  int b\\(4 bytes\\) +  double c\\(8 bytes\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  calling the function data\\(\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("/ calling the function display\\(\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  error, because memory is not allocated."),
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

