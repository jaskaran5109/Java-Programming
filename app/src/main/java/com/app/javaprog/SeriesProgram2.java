package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SeriesProgram2 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series_program2);
        text = findViewById(R.id.series2program);
        text.setText("import java.util.*;\n" +
                "class Series2\n" +
                "{\n" +
                "    static void main()\n" +
                "    {\n" +
                "        int n,i,s=1;   // initialise s=1\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        n = scan.nextInt();\n" +
                "        for(i=1;i<=n;i++)\n" +
                "        {\n" +
                "            s=s*i; //  in place of + , multiplicatiion sign is used\n" +
                "        }\n" +
                "        System.out.println(\"product is \"+s);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "/**  Working\n" +
                "    if n = 5\n" +
                "    loop will execute five times\n" +
                "    in first round  s will remain  1 i.e.  s = 1*1 = 1 ,  because i is 1 here\n" +
                "    in second round  s will become 3 i.e.  s = 1*2 = 2 ,  because i is 2 here\n" +
                "    in third round   s will become 6  i.e. s = 2*3 = 6 ,  because i is 3 here\n" +
                "    in fourth round  s will become 10 i.e. s = 6*4 = 24,  because i is 4 here\n" +
                "    in fifth round  s will become 15  i.e. s = 24*5 = 120, because i is 5 here\n" +
                "    when i become 6, loop will be terminated.\n" +
                "    finally output will be  product is 120\n" +
                "    \n" +
                "    product of first N numbers is also called factorial\n" +
                " **/");
        new PatternEditableBuilder().addPattern(Pattern.compile("Working\n" +
                        "    if n = 5\n" +
                        "    loop will execute five times\n" +
                        "    in first round  s will remain  1 i.e.  s = 1\\*1 = 1 ,  because i is 1 here\n" +
                        "    in second round  s will become 3 i.e.  s = 1\\*2 = 2 ,  because i is 2 here\n" +
                        "    in third round   s will become 6  i.e. s = 2\\*3 = 6 ,  because i is 3 here\n" +
                        "    in fourth round  s will become 10 i.e. s = 6\\*4 = 24,  because i is 4 here\n" +
                        "    in fifth round  s will become 15  i.e. s = 24\\*5 = 120, because i is 5 here\n" +
                        "    when i become 6, loop will be terminated.\n" +
                        "    finally output will be  product is 120\n" +
                        "    \n" +
                        "    product of first N numbers is also called factorial"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// initialise s=1"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//  in place of \\+ , multiplicatiion sign is used"),
                Color.rgb(0, 0, 255)).into(text);


        text2 = findViewById(R.id.series2output);
        text2.setText("Enter a number \n" +
                "5\n" +
                "product is 120");
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