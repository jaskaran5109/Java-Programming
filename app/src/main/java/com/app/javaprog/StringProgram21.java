package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class StringProgram21 extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_program21);
        text = findViewById(R.id.string21program);
        text.setText("/** \n" +
                "Program To Find The Smallest Word From The Sentence.\n" +
                "Example : COMPUTER IS ELECTRONIC DEVICE\n" +
                "output : Smallest word is : IS\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Str19\n" +
                "{ \n" +
                "    static void smallest()\n" +
                "    {\n" +
                "         Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the sentence \");\n" +
                "        String st = scan.nextLine();\n" +
                "        String b=\"\",small=st;// small=st,to store the complete sentence in st variable\n" +
                "        st=st+\" \";\n" +
                "        for(int i=0;i<st.length();i++)\n" +
                "        {\n" +
                "            char k = st.charAt(i);\n" +
                "            if(k!=' ')\n" +
                "                b=b+k;\n" +
                "            else\n" +
                "            {\n" +
                "                if(b.length()<small.length())\n" +
                "                    small=b;\n" +
                "                b=\"\";\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"Smallest word :\"+small);\n" +
                "    }\n" +
                "}\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("Program To Find The Smallest Word From The Sentence.\n" +
                        "Example : COMPUTER IS ELECTRONIC DEVICE\n" +
                        "output : Smallest word is : IS"),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.string21output);
        text2.setText("Enter the sentence \n" +
                "COMPUTER IS ELECTRONIC DEVICE\n" +
                "Smallest word :IS");
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

