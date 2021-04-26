package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FourtyNineProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourty_nine_program);
        text = findViewById(R.id.program49);
        text.setText("/**\n" +
                "Java program of linear search where we are going to search an element sequentially from an array.\n" +
                " */\n" +
                "import java.util.Scanner;  \n" +
                "class LinearSearch  \n" +
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
                "\n" +
                "        for (c = 0; c < n; c++)  \n" +
                "        {  \n" +
                "            if (array[c] == search)   // Searching element is present  \n" +
                "            {  \n" +
                "                System.out.println(search + \" is present at location \" + (c + 1) + \".\");  \n" +
                "                break;  \n" +
                "            }  \n" +
                "        }  \n" +
                "\n" +
                "        if (c == n)  // Element to search isn't present \n" +
                "            System.out.println(search + \" isn't present in array.\");  \n" +
                "    }  \n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Java program of linear search where we are going to search an element sequentially from an array."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Searching element is present"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// Element to search isn't present"),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output49);
        text2.setText("Enter number of elements\n" +
                "6\n" +
                "Enter those 6 elements\n" +
                "12\n" +
                "3\n" +
                "75\n" +
                "44\n" +
                "28\n" +
                "8\n" +
                "Enter value to find\n" +
                "28\n" +
                "28 is present at location 5.");
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