package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SeriesProgram5 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series_program5);
        text = findViewById(R.id.series5program);
        text.setText("import java.util.*;\n" +
                "class Series5\n" +
                "{\n" +
                "    static void main()\n" +
                "    {\n" +
                "        int n,i,d=3,k=1;  /* here d is initialised by 3, because first denominator is 3 */\n" +
                "        /* and  k =1 for the numerator */\n" +
                "        float s=0; /* s is declared float because answer will be in decimal points.*/\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        n = scan.nextInt();\n" +
                "        for(i=1;i<=n;i++)\n" +
                "        {\n" +
                "            s = s + (float)k/d; /* here type casting is required because i is integer */\n" +
                "            k=k+2;   /*   here  k is increased by 2 in each iteration  k will become 3,5,7,â€¦ */\n" +
                "            d = d + 4; /* here d is increased by 4 in each iteration: round of the loop */\n" +
                "            /* d will become 7, then 11 , then 15 and so on.*/\n" +
                "        }\n" +
                "        System.out.println(\"sum is \"+s);\n" +
                "    }\n" +
                "}\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("here d is initialised by 3, because first denominator is 3"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("s is declared float because answer will be in decimal points."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("here type casting is required because i is integer"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile(" here  k is increased by 2 in each iteration  k will become 3,5,7,â€¦"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("here d is increased by 4 in each iteration: round of the loop"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("d will become 7, then 11 , then 15 and so on."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.series5output);
        text2.setText("Enter a number \n" +
                "5\n" +
                "sum is 2.1568012");
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