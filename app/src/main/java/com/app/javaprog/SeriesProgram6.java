package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class SeriesProgram6 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series_program6);
        text = findViewById(R.id.series6program);
        text.setText("import java.util.*;\n" +
                "class Series6\n" +
                "{\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        int n,i, d=0,t=1;\n" +
                "        System.out.println(\"Enter a number \");\n" +
                "\n" +
                "        n = scan.nextInt();\n" +
                "        for(i=1;i<=n;i++)\n" +
                "        {\n" +
                "            t = t + d;\n" +
                "            System.out.print(t+\"   \");\n" +
                "            d = d + 2;\n" +
                "        }\n" +
                "    }\n" +
                "}\n");

        text2 = findViewById(R.id.series6output);
        text2.setText("Enter a number \n" +
                "5\n" +
                "1   3   7   13   21  ");
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