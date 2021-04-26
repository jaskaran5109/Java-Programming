package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class IntroductionActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        text = findViewById(R.id.textView5);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText( "What is Java ?\n" +
                "\n" +
                " Java is a programming language and a platform. Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the Oak name to Java.\n" +
                "\n" +
                "Characteristics/Features of Java\n" +
                "\n" +
                "* It is a high level language,\n" +
                "* It is object-oriented , robust and secure programming language.\n" +
                "* Java is a portable and machine-independent.\n" +
                "* Java is a multithreaded language.\n" +
                "* It is open-source and free.\n" +
                "* A need for platform architecture of the system and can be used in any electronic device like T.V, Oven, Washing machines, mobiles etc. motivated the software engineers to develop it, Hence, programs built in this language could also be used for internet programming.\n" +
                "* Java programs are both compiled (from source codes to byte codes) and byte codes are interpreted by JVM(Java Virtual Machine) to machine codes and to get the output.\n" +
                "\n" +
                "Uses of Java\n" +
                "\n" +
                "* Mobile applications (specially Android applications)\n" +
                "* Desktop applications (Application software)\n" +
                "* Web applications\n" +
                "* Web servers and application servers\n" +
                "* Database connection (with MS-Access, SQL, Oracle etc).\n" +
                "* Games Development\n" +
                "\n" +
                "Development & Versions of Java\n" +
                "\n" +
                "* JDK 1.0 (1996) (JDK – Java Development Kit)\n" +
                "* JDK 1.1 (1996)\n" +
                "* J2SE 1.2 (1998)\n" +
                "* J2SE 1.3 (2000)\n" +
                "* J2SE 1.4 (2002)\n" +
                "* J2SE 5.0 (2004)\n" +
                "* Java SE 6 (2006) (SE – Standard Edition)\n" +
                "* Java SE 7 (2011)\n" +
                "* Java SE 8 (2014)\n" +
                "* Java SE 9 (2017)\n" +
                "* Java SE 10 (2018)\n" +
                "* Java SE 11 (2018)\n" +
                "* Java SE 12 (2019)\n" +
                "* Java SE 13 (2019)\n" +
                "* Java SE 14 (2020)\n");
        new PatternEditableBuilder().addPattern(Pattern.compile("What is Java ?"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Characteristics/Features of Java"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Uses of Java"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Development & Versions of Java"),
                Color.rgb(0, 0, 255)).into(text);



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

