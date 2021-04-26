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

public class ObjectReferenceActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_reference);
        text = findViewById(R.id.textView28);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("The objects are created in the heap area and, the reference obj just points out to the object of the Student class in the heap, i.e. it just holds the memory address of the object (in the heap).\n" +
                "\n" +
                "There are two objects i.e. obj1  &  obj2  having different set of values\n" +
                "\n" +
                "Obj1 --> [5a   6b]   (first object) \n" +
                "Obj1 --> [7a   8b]   (second object) \n" +
                "\n" +
                "After writing the statement :\n" +
                "\n" +
                "obj2 = obj1 , obj2 will be removed and 1st object is now having two names obj1 & obj2\n" +
                "\n" +
                "Obj1 & Obj2 --> [5a   6b] (first object) \n" +
                "\n" +
                "/**  Example program Object as a reference type.   */\n" +
                "\nclass Alpha\n" +
                "{\n" +
                "    int a,b;    //  here a,b are called data members\n" +
                "\n" +
                "    Alpha(int x,int y)\n" +
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
                "        Alpha obj1 = new Alpha(5,6);\n" +
                "        Alpha obj2 = new Alpha(7,8);\n" +
                "        obj2 = obj1 ;  // transferring the reference of obj1 to obj2\n" +
                "        // so, obj2 will be removed from the memory, only one object is now there having two names \n" +
                "        // i.e. obj1 & obj2\n" +
                "        obj2.a=100; //  or obj1.a=100;\n" +
                "        obj2.b=200; //  or obj2.b=200;\n" +
                "        obj1.display(); // it will print  100,200\n" +
                "        obj2.display(); // it will print 100,200\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "Output:\n" +
                "\n100\t200\n" +
                "100\t200\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// it will print 100,200"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// it will print  100,200"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  or obj2.b=200;"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  or obj1.a=100;"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// i.e. obj1 & obj2"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// so, obj2 will be removed from the memory, only one object is now there having two names"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// transferring the reference of obj1 to obj2"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  here a,b are called data members"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example program Object as a reference type."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("After writing the statement :"),
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

