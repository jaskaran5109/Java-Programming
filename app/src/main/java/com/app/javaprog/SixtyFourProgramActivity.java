package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SixtyFourProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixty_four_program);
        text = findViewById(R.id.program64);
        text.setText("/**\n" +
                "To create the Mirror Image of Matrix A into B.\n" +
                "Mirror image means:\n" +
                "first coloumn of Matrix A becomes the last coloumn of Matrix B,\n" +
                "second coloumn of Matrix A becomes the second last coloumn of Matrix B, and so on\n" +
                "\n" +
                "Example: If matrix A is :\n" +
                "2  4  5  6      Mirror Image    6  5  4  2    \n" +
                "10 11 12 13     of Matrix A     13 12 11 10 \n" +
                "9  8  7  9      into B is :     9  7  8  9  \n" +
                " */\n" +
                "import java.util.*;\n" +
                "class DD11\n" +
                "{\n" +
                "    int a[][] = {{2,4,5,6},{10,11,12,13},{9,8,7,9}}; // direct initialisation\n" +
                "    int b[][] = new int[a.length][a[0].length];\n" +
                "\n" +
                "    void display()  // displaying elements in matrix format\n" +
                "    {\n" +
                "        int i,j;\n" +
                "        System.out.println(\"Original matrix A \");\n" +
                "        for(i=0;i<a.length;i++)\n" +
                "        {\n" +
                "            for(j=0;j<a[0].length;j++)\n" +
                "            {\n" +
                "                System.out.print(a[i][j]+\"\\t\");\n" +
                "            }\n" +
                "            System.out.println();    \n" +
                "        } \n" +
                "        System.out.println(\"\\nMirror Image of Matrix A into B\\n\");\n" +
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
                "    void mirrorImg()// to interchnage elemements of row and coloumn\n" +
                "    {\n" +
                "        int i,j;\n" +
                "        for(i=0;i<a[0].length;i++)\n" +
                "        {\n" +
                "            int c=a[0].length-1-i;\n" +
                "            for(j=0;j<a.length;j++)\n" +
                "            {\n" +
                "                b[j][c] = a[j][i];\n" +
                "            }\n" +
                "        } \n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        DD11 obj = new DD11\t();\n" +
                "        obj.mirrorImg();\n" +
                "        obj.display();\n" +
                "    }\n" +
                "}");


        new PatternEditableBuilder().addPattern(Pattern.compile("To create the Mirror Image of Matrix A into B.\n" +
                        "Mirror image means:\n" +
                        "first coloumn of Matrix A becomes the last coloumn of Matrix B,\n" +
                        "second coloumn of Matrix A becomes the second last coloumn of Matrix B, and so on\n" +
                        "\n" +
                        "Example: If matrix A is :\n" +
                        "2  4  5  6      Mirror Image    6  5  4  2    \n" +
                        "10 11 12 13     of Matrix A     13 12 11 10 \n" +
                        "9  8  7  9      into B is :     9  7  8  9"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// direct initialisation"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// displaying elements in matrix format"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// to interchnage elemements of row and coloumn"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output64);
        text2.setText("Original matrix A \n" +
                "2    4    5    6\t\n" +
                "10   11   12   13\t\n" +
                "9    8    7    9\t\n" +
                "\n" +
                "Mirror Image of Matrix A into B\n" +
                "\n" +
                "6    5    4    2\t\n" +
                "13   12   11   10\t\n" +
                "9    7    8    9\t");
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