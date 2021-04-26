package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class TwentyOneProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_one_program);
        text = findViewById(R.id.program21);
        text.setText("/** using switch-case\n" +
                "  Program to input a number and print the corresponding day of the week.\n" +
                "  Example : 1 - Sunday\n" +
                "            2 - Monday\n" +
                "            3 - Tuesday\n" +
                "            and so on upto 7 - Saturday\n" +
                " **/\n" +
                "import java.util.*;\n" +
                "class F5\n" +
                "{\n" +
                "    static void dow(int n)\n" +
                "    {\n" +
                "        switch(n)\n" +
                "        {\n" +
                "            case 1: System.out.println(\"Sunday\");\n" +
                "            break;\n" +
                "            case 2: System.out.println(\"Monday\");\n" +
                "            break;\n" +
                "            case 3: System.out.println(\"Tuesday\");\n" +
                "            break;\n" +
                "            case 4: System.out.println(\"Wednesday\");\n" +
                "            break;\n" +
                "            case 5: System.out.println(\"Thursday\");\n" +
                "            break;\n" +
                "            case 6: System.out.println(\"Friday\");\n" +
                "            break;\n" +
                "            case 7: System.out.println(\"Saturday\");\n" +
                "            break;\n" +
                "            default : System.out.println(\"Invalid day number\");\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter a number \");\n" +
                "        int n = scan.nextInt();\n" +
                "        dow(n); // calling the function\n" +
                "    }\n" +
                "}");
        new PatternEditableBuilder().addPattern(Pattern.compile("using switch-case\n" +
                        "  Program to input a number and print the corresponding day of the week.\n" +
                        "  Example : 1 - Sunday\n" +
                        "            2 - Monday\n" +
                        "            3 - Tuesday\n" +
                        "            and so on upto 7 - Saturday"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output21);
        text2.setText("Enter a number \n" +
                "3\n" +
                "Tuesday");
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