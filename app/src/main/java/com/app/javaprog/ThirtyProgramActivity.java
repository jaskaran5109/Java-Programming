package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ThirtyProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_program);
        text = findViewById(R.id.program30);
        text.setText("/**\n" +
                "  Program to print list of prime palindrome between 100 and 1000.\n" +
                "  Prime palindrome are those which are prime as well as palindrome.\n" +
                " */ \n" +
                "class PrimePalindrome\n" +
                "{\n" +
                "    static boolean checkPrime(int n)\n" +
                "    {   int c=0;\n" +
                "        for(int i=1;i<=n;i++)\n" +
                "        {\n" +
                "            if(n%i==0)\n" +
                "                c++;\n" +
                "        }\n" +
                "        if(c==2)\n" +
                "            return true;\n" +
                "        else\n" +
                "            return false;\n" +
                "    }\n" +
                "\n" +
                "    static int reverse(int n)  \n" +
                "    {\n" +
                "        int r,s=0,t=n;  \n" +
                "        do\n" +
                "        {             \n" +
                "            r=n%10;                  \n" +
                "            s=s*10 + r; \n" +
                "            n=n/10;     \n" +
                "        }while(n!=0);\n" +
                "\n" +
                "        return s;                 \n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        for(int i=100;i<=1000;i++)\n" +
                "        {\n" +
                "            int k = reverse(i);\n" +
                "            boolean p = checkPrime(i);\n" +
                "            if(k==i && p==true)\n" +
                "                System.out.println(i);\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "}\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program to print list of prime palindrome between 100 and 1000."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Prime palindrome are those which are prime as well as palindrome."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output30);
        text2.setText("101\n" +
                "131\n" +
                "151\n" +
                "181\n" +
                "191\n" +
                "313\n" +
                "353\n" +
                "373\n" +
                "383\n" +
                "727\n" +
                "757\n" +
                "787\n" +
                "797\n" +
                "919\n" +
                "929");
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