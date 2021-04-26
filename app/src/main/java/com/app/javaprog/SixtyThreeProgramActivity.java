package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SixtyThreeProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixty_three_program);
        text = findViewById(R.id.program63);
        text.setText("/**\n" +
                "To create the transpose of Matrix A into B\n" +
                "Transpose means to interchange the elements of rows and columns.\n" +
                "if the size of matrix A is of a[3][4] then matrix B should be B[4][3]\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class DD10\n" +
                "{\n" +
                "    int a[][]; // declaration of Double Dimensional or 2D Array\n" +
                "    int b[][]; // to store the transpose of matrix a[][]\n" +
                "\n" +
                "    void accept()\n" +
                "    { \n" +
                "        int i,j,n;\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the row & column size \");\n" +
                "        n = scan.nextInt();\n" +
                "        a = new int[n][n];  // memory allocation to 2D array\n" +
                "        System.out.println(\"Enter the values \");\n" +
                "        for(i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                a[i][j] = scan.nextInt();\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "    } \n" +
                "\n" +
                "    void displayA()\n" +
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
                "    }\n" +
                "\n" +
                "    void displayB()\n" +
                "    {\n" +
                "        int i,j;\n" +
                "        for(i=0;i<b.length;i++)\n" +
                "        {\n" +
                "            for(j=0;j<b[0].length;j++)\n" +
                "            {\n" +
                "                System.out.print(b[i][j]+\"\\t\");\n" +
                "            }\n" +
                "            System.out.println();    \n" +
                "        } \n" +
                "    }\n" +
                "\n" +
                "    void transpose()// to interchange elements of row and column\n" +
                "    {\n" +
                "        b = new int[a.length][a[0].length];\n" +
                "        int i,j;\n" +
                "        for(i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                b[j][i] = a[i][j];\n" +
                "            }\n" +
                "        } \n" +
                "    }\n" +
                "\n" +
                "    public static void main(String arg[])\n" +
                "    {\n" +
                "        DD10 obj = new DD10();\n" +
                "        obj.accept();\n" +
                "        System.out.println(\"Original Matrix A\");\n" +
                "        obj.displayA();\n" +
                "        obj.transpose();\n" +
                "        System.out.println(\"Transpose of Matrix A\");\n" +
                "        obj.displayB();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("To create the transpose of Matrix A into B\n" +
                        "Transpose means to interchange the elements of rows and columns.\n" +
                        "if the size of matrix A is of a\\[3\\]\\[4\\] then matrix B should be B\\[4\\]\\[3\\]"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// declaration of Double Dimensional or 2D Array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// to store the transpose of matrix a\\[\\]\\[\\]"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// memory allocation to 2D array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// to interchange elements of row and column"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output63);
        text2.setText("Enter the row & column size \n" +
                "3\n" +
                "Enter the values \n" +
                "12\n" +
                "10\n" +
                "5\n" +
                "48\n" +
                "13\n" +
                "49\n" +
                "66\n" +
                "38\n" +
                "1\n" +
                "Original Matrix A\n" +
                "12   10   5\t\n" +
                "48   13   49\t\n" +
                "66   38   1\t\n" +
                "Transpose of Matrix A\n" +
                "12   48   66\t\n" +
                "10   13   38\t\n" +
                "5    49   1\t");
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