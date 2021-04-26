package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class TwentyThreeProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_three_program);
        text = findViewById(R.id.program23);
        text.setText("import java.util.*;\n" +
                "class Alpha10\n" +
                "{\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        int n,i,ev=0,od=0;\n" +
                "\n" +
                "        n= scan.nextInt();\n" +
                "        for(i=1;i<=n;i++)\n" +
                "        {\n" +
                "            if(i%2==0)\n" +
                "                ev = ev + i;\n" +
                "            else\n" +
                "                od= od + i;\n" +
                "        }\n" +
                "        System.out.println(\"sum of even numbers \"+ev);\n" +
                "        System.out.println(\"sum of odd numbers \"+od);\n" +
                "    }\n" +
                "}\n" +
                "/**\n" +
                "Output:\n" +
                "Enter a number \n" +
                "10\n" +
                "sum of even numbers 30\n" +
                "sum of odd numbers 25\n" +
                "\n" +
                " **/");
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Enter a number"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("10"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("sum of even numbers 30"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("sum of odd numbers 25"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output23);
        text2.setText("Enter a number \n" +
                "10\n" +
                "sum of even numbers 30\n" +
                "sum of odd numbers 25");
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