package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FiftyProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_program);
        text = findViewById(R.id.program50);
        text.setText("/**\n" +
                "Java program of binary search where we are going to search an element from an array\n" +
                " */\n" +
                "import java.util.Scanner;  \n" +
                "class BInaerrSearch  \n" +
                "{  \n" +
                "    public static void main(String args[])  \n" +
                "    {  \n" +
                "        int c, n, search, array[];  \n" +
                "        Scanner in = new Scanner(System.in);  \n" +
                "        System.out.println(\"Enter number of elements\");  \n" +
                "        n = in.nextInt();   \n" +
                "        array = new int[n];  \n" +
                "        System.out.println(\"Enter those \" + n + \" elements\");  \n" +
                "\n" +
                "        for (c = 0; c < n; c++)  \n" +
                "        {\n" +
                "            array[c] = in.nextInt();  \n" +
                "        }\n" +
                "\n" +
                "        System.out.println(\"Enter value to find\");  \n" +
                "        search = in.nextInt();  \n" +
                "        int first=0,last=array.length-1;\n" +
                "        int mid = (first + last)/2;  \n" +
                "        \n" +
                "        while( first <= last )\n" +
                "        {  \n" +
                "            if ( array[mid] < search )\n" +
                "            {  \n" +
                "                first = mid + 1;     \n" +
                "            }\n" +
                "            else\n" +
                "            if ( array[mid] == search )\n" +
                "            {  \n" +
                "                System.out.println(\"Element is found at index: \" + mid);  \n" +
                "                break;  \n" +
                "            }\n" +
                "            else\n" +
                "            {  \n" +
                "                last = mid - 1;  \n" +
                "            }  \n" +
                "            mid = (first + last)/2;  \n" +
                "        }  \n" +
                "        if ( first > last )\n" +
                "        {  \n" +
                "            System.out.println(\"Element is not found!\");  \n" +
                "        } \n" +
                "    }  \n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Java program of binary search where we are going to search an element from an array"),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output50);
        text2.setText("Enter number of elements\n" +
                "6\n" +
                "Enter those 6 elements\n" +
                "4\n" +
                "9\n" +
                "14\n" +
                "19\n" +
                "33\n" +
                "45\n" +
                "Enter value to find\n" +
                "19\n" +
                "Element is found at index: 3");
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