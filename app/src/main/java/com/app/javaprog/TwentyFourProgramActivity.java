package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class TwentyFourProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_four_program);
        text = findViewById(R.id.program24);
        text.setText("import java.util.*;\n" +
                "class Factors\n" +
                "{\n" +
                "    static void factors(int n)   \n" +
                "    {   int c=0;\n" +
                "        for(int i=1;i<=n;i++)\n" +
                "        {\n" +
                "            if(n%i==0)\n" +
                "            {  System.out.println(i);\n" +
                "                c++;\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"Total factors are \"+c);\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        int n;  \n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        n = scan.nextInt();\n" +
                "        factors(n);\n" +
                "    }\n" +
                "}");

        text2 = findViewById(R.id.output24);
        text2.setText("Enter a number \n" +
                "28\n" +
                "1\n" +
                "2\n" +
                "4\n" +
                "7\n" +
                "14\n" +
                "28\n" +
                "Total factors are 6");
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