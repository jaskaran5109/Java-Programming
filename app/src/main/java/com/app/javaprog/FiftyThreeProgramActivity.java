package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FiftyThreeProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifty_three_program);
        text = findViewById(R.id.program53);
        text.setText("/**  \n" +
                "Program to store N values into an array, arrange them in ascending order\n" +
                "using Insertion sort technique\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class InsertionSort\n" +
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
                "    void insertionSort()\n" +
                "    {\n" +
                "        int i,j,t,k;\n" +
                "        for(i=1;i<a.length;i++)\n" +
                "        {\n" +
                "            k=i-1;\n" +
                "            t=a[i];\n" +
                "            while(k>=0 && t<a[k])\n" +
                "            {\n" +
                "                a[k+1] = a[k];\n" +
                "                k--;\n" +
                "            }\n" +
                "            a[k+1]=t;\n" +
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
                "        InsertionSort obj = new InsertionSort();\n" +
                "        obj.accept();\n" +
                "        obj.insertionSort();\n" +
                "        System.out.println(\"Sorted Array :-\");\n" +
                "        obj.display();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("Program to store N values into an array, arrange them in ascending order\n" +
                        "using Insertion sort technique"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output53);
        text2.setText("Enter the size of the array\n" +
                "6\n" +
                "Enter the values \n" +
                "34\n" +
                "2\n" +
                "45\n" +
                "77\n" +
                "9\n" +
                "18\n" +
                "Sorted Array :-\n" +
                "2\n" +
                "9\n" +
                "18\n" +
                "34\n" +
                "45\n" +
                "77");
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