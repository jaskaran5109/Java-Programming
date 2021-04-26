package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FiftyOneProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_one_program);
        text = findViewById(R.id.program51);
        text.setText("// Program to store N values into an array, arrange them in ascending order using Bubble sort technique\n" +
                "import java.util.*;\n" +
                "class BubbleSorting\n" +
                "{\n" +
                "    int a[];\n" +
                "    void accept()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the size of the array\");\n" +
                "        int n = scan.nextInt();\n" +
                "        a = new int[n];\n" +
                "        System.out.println(\"Enter the values \");\n" +
                "        for(int i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            a[i] = scan.nextInt();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    void bubbleSort()\n" +
                "    {\n" +
                "        int i,j,t,len=a.length-1;\n" +
                "        for(i=0;i<len;i++)\n" +
                "        {\n" +
                "            for(j=0;j<len-i;j++)\n" +
                "            {\n" +
                "                if(a[j]>a[j+1])\n" +
                "                {\n" +
                "                    t=a[j];\n" +
                "                    a[j] = a[j+1];\n" +
                "                    a[j+1]=t;\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    void display()\n" +
                "    {   \n" +
                "        for(int i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            System.out.println(a[i]);\n" +
                "        }\n" +
                "    }     \n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        BubbleSorting obj = new BubbleSorting();\n" +
                "        obj.accept();\n" +
                "        obj.bubbleSort();\n" +
                "        System.out.println(\"Sorted Array :-\");\n" +
                "        obj.display();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Program to store N values into an array, arrange them in ascending order using Bubble sort technique"),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output51);
        text2.setText("Enter the size of the array\n" +
                "6\n" +
                "Enter the values \n" +
                "34\n" +
                "12\n" +
                "9\n" +
                "24\n" +
                "66\n" +
                "4\n" +
                "Sorted Array :-\n" +
                "4\n" +
                "9\n" +
                "12\n" +
                "24\n" +
                "34\n" +
                "66");
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