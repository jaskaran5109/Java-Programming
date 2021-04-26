package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ScannerClassActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner_class);
        text = findViewById(R.id.textView19);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Scanner class is present in util package in java. It contains many functions, which are used to input data during the execution of program.\n" +
                "\nHere is the list of functions of Scanner class. \nAll the functions are non-static.\n" +
                "Non-static functions belongs to object. \n\nSo before using the functions, must create the object of Scanner class using the following statement.\n" +
                "\nScanner scan = new Scanner(System.in);\n" +
                "\n(here scan is the name of the object, you can provide any other name also).\n" +
                "\nAfter creation of the object, functions can be called like this:  \n" +
                "\nData Types                 Functions of Scanner class\n" +
                "\nbyte                                         nextByte()\n" +
                "short                                       nextShort()\n" +
                "int                                            nextInt()\n" +
                "long                                         nextLong()\n" +
                "float                                        nextFloat()\n" +
                "double                                    nextDouble()\n" +
                "String(single word)            next()\n" +
                "String(sentence)                  nextLine()\n");

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
