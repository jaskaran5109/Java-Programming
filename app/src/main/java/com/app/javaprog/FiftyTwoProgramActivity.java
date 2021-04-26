package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FiftyTwoProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_two_program);
        text = findViewById(R.id.program52);
        text.setText("/**  \n" +
                "Program to store N values into an array, arrange them in ascending order\n" +
                "using Selection sort technique\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class SelectionSort\n" +
                "{\n" +
                "    int a[];\n" +
                "\n" +
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
                "    int lowest(int s)  //  function to select the lowest value from the starting index s\n" +
                "    {                  //  and returns the index of the lowest value. \n" +
                "        int low=a[s],pos=s;\n" +
                "        for(int i=s+1;i<a.length;i++)\n" +
                "        {\n" +
                "            if(a[i]<low)\n" +
                "            {\n" +
                "                low=a[i];\n" +
                "                pos=i;\n" +
                "            }\n" +
                "        }\n" +
                "        return pos;\n" +
                "    }\n" +
                "\n" +
                "    void selectionSort()\n" +
                "    {\n" +
                "        int i,j,t,len=a.length-1;\n" +
                "        for(i=0;i<len;i++)\n" +
                "        {\n" +
                "            int k = lowest(i); // calling the function lowest by passing starting index of the array.\n" +
                "            if(a[k]<a[i])\n" +
                "            {\n" +
                "                t=a[i];  // swapping the value with lowest value\n" +
                "                a[i]=a[k];\n" +
                "                a[k]=t;\n" +
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
                "        SelectionSort obj = new SelectionSort();\n" +
                "        obj.accept();\n" +
                "        obj.selectionSort();\n" +
                "        System.out.println(\"Sorted Array :-\");\n" +
                "        obj.display();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Program to store N values into an array, arrange them in ascending order\n" +
                        "using Selection sort technique"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// swapping the value with lowest value"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// calling the function lowest by passing starting index of the array."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  function to select the lowest value from the starting index s"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  and returns the index of the lowest value."),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.output52);
        text2.setText("Enter the size of the array\n" +
                "6\n" +
                "Enter the values \n" +
                "12\n" +
                "4\n" +
                "67\n" +
                "34\n" +
                "22\n" +
                "18\n" +
                "Sorted Array :-\n" +
                "4\n" +
                "12\n" +
                "18\n" +
                "22\n" +
                "34\n" +
                "67");



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