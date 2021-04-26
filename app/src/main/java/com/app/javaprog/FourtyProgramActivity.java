package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class FourtyProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourty_program);
        text = findViewById(R.id.program40);
        text.setText("/**\n" +
                "A class Time has been defined to add any two accepted time.\n" +
                "Example: Time t1 - 5 hours 45 minutes\n" +
                "Time t2 - 7 hours 55 minutes\n" +
                "Their sum is - 13 hours 40 minutes (where 60 minutes = 1 hour)\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Time\n" +
                "{\n" +
                "    int hour,minute;\n" +
                "    Time()\n" +
                "    {\n" +
                "    }\n" +
                "\n" +
                "    Time(int x,int y)\n" +
                "    {\n" +
                "        hour=x;\n" +
                "        minute=y;\n" +
                "    }\n" +
                "\n" +
                "    void accept()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter time in hours and minutes \");\n" +
                "        hour = scan.nextInt();\n" +
                "        minute = scan.nextInt();\n" +
                "    }\n" +
                "\n" +
                "    void dispTime()\n" +
                "    {\n" +
                "        System.out.println(hour+\" : \" +minute);\n" +
                "    }\n" +
                "\n" +
                "    Time addTime(Time t)  \n" +
                "    {\n" +
                "        int m = minute + t.minute;\n" +
                "        int h = hour + t.hour + m/60;\n" +
                "        m=m%60;\n" +
                "        Time ob = new Time(h,m);\n" +
                "        return ob;\n" +
                "    }\n" +
                "\n" +
                "    /** In  addTime(Time t) function:\n" +
                "    variables hour,minute belongs to t1 object.\n" +
                "    variables t.hour, t.minute belongs to t2 object.\n" +
                "    h,m are local variables to store the sum of two time objects.\n" +
                "    ob is the object created in the object using parameterised constructor having values h,m\n" +
                "    finally returned object is ob, so return data type of  addTime() function is Time.\n" +
                "     */\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Time t1 = new Time();\n" +
                "        Time t2 = new Time();\n" +
                "        t1.accept();\n" +
                "        t2.accept();\n" +
                "        t1.dispTime();\n" +
                "        t2.dispTime();\n" +
                "        Time ob = t1.addTime(t2);\n" +
                "        System.out.println(\"sum of two time values \");\n" +
                "        ob.dispTime();\n" +
                "    }\n" +
                "}");

        new PatternEditableBuilder().addPattern(Pattern.compile("A class Time has been defined to add any two accepted time.\n" +
                        "Example: Time t1 - 5 hours 45 minutes\n" +
                        "Time t2 - 7 hours 55 minutes\n" +
                        "Their sum is - 13 hours 40 minutes \\(where 60 minutes = 1 hour\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("In  addTime\\(Time t\\) function:\n" +
                        "    variables hour,minute belongs to t1 object.\n" +
                        "    variables t.hour, t.minute belongs to t2 object.\n" +
                        "    h,m are local variables to store the sum of two time objects.\n" +
                        "    ob is the object created in the object using parameterised constructor having values h,m\n" +
                        "    finally returned object is ob, so return data type of  addTime\\(\\) function is Time."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output40);
        text2.setText( "Enter time in hours and minutes \n" +
                "5\n" +
                "45\n" +
                "Enter time in hours and minutes \n" +
                "7\n" +
                "55\n" +
                "5 : 45\n" +
                "7 : 55\n" +
                "sum of two time values \n" +
                "13 : 40");
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