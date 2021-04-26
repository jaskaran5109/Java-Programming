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

public class CallByReferenceActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_by_reference);
        text = findViewById(R.id.textView30);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Call by Reference means calling a method with a parameter as a reference.Through this, the argument reference is passed to the parameter.\n" +
                "\n" +
                "Example: Passing Objects & Arrays.\n" +
                "\n" +
                "In case of call by reference original value is changed if we made changes in the called method. \n" +
                "\n" +
                "If we pass object/arrays in place of any primitive value, original value will be changed. \n" +
                "\n" +
                "The modification done to the formal parameter also does reflect in the actual parameter.\n" +
                "\n" +
                "// Example of call by reference.\n" +
                "\n" +
                "class CallByReference\n" +
                "{\n" +
                "    int a,b; //a & b are called instance variables or data members\n" +
                "\n" +
                "    CallByReference(int x,int y)\n" +
                "    {\n" +
                "        a=x;\n" +
                "        b=y;\n" +
                "    }\n" +
                "\n" +
                "    static void compute(CallByReference ob)\n" +
                "    {\n" +
                "        ob.a+=100;\n" +
                "        ob.b+=100;\n" +
                "        System.out.println(ob.a+\"\\t\"+ob.b); // 115   116\n" +
                "" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        CallByReference obj = new CallByReference(15,16);\n" +
                "        System.out.println(obj.a+\"\\t\"+obj.b);// 15   16\n" +
                "        compute(obj);// passing object as a parameter \n" +
                "        System.out.println(obj.a+\"\\t\"+obj.b); // 115  116\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "Output:\n" +
                "15\t16\n" +
                "115\t116\n" +
                "115\t116\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("// 115  116"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// passing object as a parameter"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// 15   16"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//a & b are called instance variables or data members"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Example of call by reference."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Call by Reference"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// 115   116"),
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

