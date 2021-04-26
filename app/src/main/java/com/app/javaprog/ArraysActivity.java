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

public class ArraysActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrays);
        text = findViewById(R.id.textView32);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Array is an object which contains set of elements of a similar data type.  \n" +
                "\n" +
                "The elements of an array are stored in a contiguous memory location.We can store only a fixed set of elements in an array from 0 to size-1.\n" +
                " \n" +
                "Advantages:-\n" +
                "\n" +
                "* Sorting & Searching : We can retrieve, search or sort the data efficiently.\n" +
                "* Random access: We can get any data located at any index position.\n" +
                "\n" +
                "Disadvantages:-\n" +
                "\n" +
                "* Size Limit: We can store only the fixed size of elements in the array. It doesn't grow or shrink its size at runtime.\n" +
                "\n" +
                "Type of arrays:\n" +
                "\n" +
                "1. Single dimensional arrays\n" +
                "2. Two dimensional arrays\n" +
                "3. Multidimensional array.\n" +
                "\n" +
                "Syntax to declare of Array variable:\n" +
                "\n" +
                "1.dataType[] ar ;  (or)  \n" +
                "2.dataType []ar ;  (or)  \n" +
                "3.dataType ar[] ;  \n" +
                "\n" +
                "Memory allocation:\n" +
                "\n" +
                "int a[] = new int[5];\n" +
                "\n" +
                "In this statement array variable a[] is declared which can store maximum five values having index from 0 to 4.\n" +
                "\n" +
                "Example :\n" +
                "\n" +
                "a[0] = 45;\n" +
                "a[1] = 26;\n" +
                "a[2] = 100;\n" +
                "a[3] = 50;\n" +
                "a[4] = 60;\n" +
                "\n" +
                "Direct initialization :  method to declare array with default initial values is :\n" +
                "\n" +
                "int a[ ] = {45,25,65,100,35,40,60,70,80,85};\n" +
                "\n" +
                "In this statement, size of array will be 10, depends on the number of values stored having index from 0 to 9.\n" +
                "\n" +
                "Single Dimensional Array :\n" +
                "\n" +
                "Example :\n" +
                "\n" +
                "//Java Program to illustrate how to declare, instantiate, initialize  \n" +
                "//and traverse the Java array.  \n" +
                "class SingleDArray\n" +
                "{  \n" +
                "    public static void main(String args[])\n" +
                "    {  \n" +
                "        int a[]=new int[5];//declaration and instantiation  \n" +
                "        a[0]=10;//initialization  \n" +
                "        a[1]=20;  \n" +
                "        a[2]=70;  \n" +
                "        a[3]=40;  \n" +
                "        a[4]=50;  \n" +
                "        //traversing array  \n" +
                "        for(int i=0;i<a.length;i++)\n" +
                "        {   //length is the property of array  \n" +
                "            System.out.println(a[i]);  \n" +
                "        }\n" +
                "    }\n" +
                "}  \n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "10\n" +
                "20\n" +
                "70\n" +
                "40\n" +
                "50\n" +
                "\n" +
                "Two Dimensional Array :\n" +
                "\n" +
                "Example :\n" +
                "\n" +
                "// This program demonstrates a two-dimensional array.\n" +
                "public class TwoDArray\n" +
                "{\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "        // Array of size 4x3 to hold integers.\n" +
                "        int[][] values =\n" +
                "            {\n" +
                "                { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 },\n" +
                "                { 11, 21, 31 }\n" +
                "            };\n" +
                "        // Nested loops to print the array in tabular form.\n" +
                "        for (int row = 0; row < 4; row++)\n" +
                "        {\n" +
                "            for (int col = 0; col < 3; col++)\n" +
                "            {\n" +
                "                System.out.print(values[row][col] + \" \");\n" +
                "            }\n" +
                "\n" +
                "            System.out.println();    // Print new line.\n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "10 20 30\n" +
                "40 50 60\n" +
                "70 80 90\n" +
                "11 21 31\n" +
                "\n" +
                "Multi Dimensional Array :\n" +
                "\n" +
                "Example :\n" +
                "\n" +
                "//Java Program to illustrate the use of multidimensional array  \n" +
                "class doubleDarray\n" +
                "{  \n" +
                "    public static void main(String args[])\n" +
                "    {  \n" +
                "        //declaring and initializing 2D array  \n" +
                "        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  \n" +
                "        //printing 2D array  \n" +
                "        for(int i=0;i<3;i++)\n" +
                "        {  \n" +
                "            for(int j=0;j<3;j++)\n" +
                "            {  \n" +
                "                System.out.print(arr[i][j]+\" \");  \n" +
                "            }  \n" +
                "            System.out.println();  \n" +
                "        }  \n" +
                "    }\n" +
                "}  \n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "1 2 3\n" +
                "2 4 5\n" +
                "4 4 5\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("Array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Multi Dimensional Array :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Two Dimensional Array :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Single Dimensional Array :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Direct initialization :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Memory allocation:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Advantages:-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Disadvantages:-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Type of arrays:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Syntax to declare of Array variable:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Java Program to illustrate how to declare, instantiate, initialize"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("and traverse the Java array."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//declaration and instantiation"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//initialization"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//traversing array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//length is the property of array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// This program demonstrates a two-dimensional array."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Array of size 4x3 to hold integers."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Nested loops to print the array in tabular form."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Print new line."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//Java Program to illustrate the use of multidimensional array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//declaring and initializing 2D array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//printing 2D array"),
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

