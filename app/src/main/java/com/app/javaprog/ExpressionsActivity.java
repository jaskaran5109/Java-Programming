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

public class ExpressionsActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expressions);
        text = findViewById(R.id.textView15);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Expressions :  An Expression in Java is any valid combination of operators, operands, constants or variables i.e. a legal combination of Java tokens.\n" +
                "\n•\t Pure expressions are those where on all operands are of same data type.\n" +
                "•\t Mixed expressions are those where in all operands are of different data type.\n" +
                "\nType conversion: The process of converting one predefined type into another is called TYPE CONVERSION.\n" +
                "\nTwo types of conversions:\n" +
                "\n1)\tImplicit type conversion: The implicit type conversion wherein data types are promoted is known as COERCION.\n" +
                "\nExample: int + float it will convert in to float.\n" +
                "Operation\tResult\t Remarks  (promote to the higher data type)\n" +
                "int/int\tint\tBoth are of same data type\n" +
                "int/float\tfloat\tfloat is considered as greater than integer\n" +
                "int/double\tdouble\tdouble is greater than integer\n" +
                "long/double\tdouble\tdouble is greater than long\n" +
                "\n" +
                "2)\tExplicit type conversion: The explicit type conversion is user-defined  that forces an expression to be of specific type.\n" +
                "\nExample : k =  (float)5/2\t, so (float) forces 5(int) to be convert in to float. result will be 2.5\n" +
                "\n" +
                "Example 1:\n" +
                "int a=5 , b=2;\n" +
                "float k;\n" +
                "k= a/b;   //   value of k will be 2.0  (because a and b for are integer)\n" +
                "\n" +
                "Example 2:\n" +
                "int a=5 , b=2;\n" +
                "float k;\n" +
                "k= (float)a/b;   //  value of k will be 2.5 , because (float) forces a to be convert into  float only \n" +
                "                              //   for this expression. \n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Expressions :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Type conversion:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Two types of conversions:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Implicit type conversion:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Explicit type conversion:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :"),
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