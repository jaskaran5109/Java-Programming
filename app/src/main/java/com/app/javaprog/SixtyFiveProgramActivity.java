package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SixtyFiveProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixty_five_program);
        text = findViewById(R.id.program65);
        text.setText("/** " +
                "\nTo shift the elements of each row one step downwards and last row will become first row.\n" +
                "Example: If matrix A is :\n" +
                "2  4  5  6      After shifting              9  8  7  9    \n" +
                "10 11 12 13     the elements                2  4  5  6 \n" +
                "9  8  7  9      of matrix A into B is :     10 11 12 13 \n" +
                " */\n" +
                "import java.util.*;\n" +
                "class DD12\n" +
                "{\n" +
                "    int a[][] = {{2,4,5,6},{10,11,12,13},{9,8,7,9}};\n" +
                "    int b[][] = new int[a.length][a[0].length]; // size of Matrix B will remain same.\n" +
                "\n" +
                "    void display()  // displaying elements in matrix format\n" +
                "    {\n" +
                "        int i,j;\n" +
                "        for(i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                System.out.print(a[i][j]+\"\\t\");\n" +
                "            }\n" +
                "            System.out.println();    \n" +
                "        } \n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    void shiftRows()// to interchnage elemements of row and coloumn\n" +
                "    {\n" +
                "        int i,j;\n" +
                "        for(i=a.length-1;i>0;i--)\n" +
                "        {\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                int t = a[i][j];\n" +
                "                a[i][j]= a[i-1][j];\n" +
                "                a[i-1][j] = t;\n" +
                "            }\n" +
                "        } \n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        DD12 obj = new DD12();\n" +
                "        System.out.println(\"Original matrix A \");\n" +
                "        obj.display();\n" +
                "        obj.shiftRows();\n" +
                "        System.out.println(\"After shifting \");\n" +
                "        obj.display();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("To shift the elements of each row one step downwards and last row will become first row.\n" +
                        "Example: If matrix A is :\n" +
                        "2  4  5  6      After shifting              9  8  7  9    \n" +
                        "10 11 12 13     the elements                2  4  5  6 \n" +
                        "9  8  7  9      of matrix A into B is :     10 11 12 13 "),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// size of Matrix B will remain same."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// displaying elements in matrix format"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// to interchnage elemements of row and coloumn"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output65);
        text2.setText("Original matrix A \n" +
                "2    4    5    6\t\n" +
                "10   11   12   13\t\n" +
                "9    8    7    9\t\n" +
                "After shifting \n" +
                "9    8   7    9\t\n" +
                "2    4   5    6\t\n" +
                "10   11  12   13\t");
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