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

public class PackagesAcitivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packages_acitivity);
        text = findViewById(R.id.textView36);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Package : It is a collection of classes, interfaces  and sub- packages. \n" +
                "\n" +
                "In general term we can say that it a kind of folder which contain class files and sub-folders.\n" +
                "\n" +
                "Two types of packages:\n" +
                "\n" +
                "1.Built-in package :- There are many built-in packages such as java, lang, util, io,  awt, javax, swing, net, sql etc.\n" +
                "\n" +
                "*lang package of java contain classes like System, String, Math, Wrapper classes (like Integer, Character, Double etc).\n" +
                "\n" +
                "*util package of java contain classes like  Scanner, Vector, StringTokenizer , ArrayList etc.\n" +
                "\n" +
                "*io package of java contain classes like InputStreamReader, BufferedReader etc.\n" +
                "\n" +
                "*default package of java is lang package.\n" +
                "\n" +
                "import  keyword : It is used import classes from other packages.\n" +
                "\n" +
                "Example :-  If write the statement -\n" +
                "\n" +
                "*import java.util.Scanner;  :  It imports only Scanner class from util package, then only we can use the functions of Scanner class.\n" +
                "\n" +
                "*import java.util.*;   :  It(*) imports all the classes from util package of java.\n" +
                "\n" +
                "lang is the default package of java.\n" +
                "\n" +
                "2.User-defined package :- We can also create our own package using the keyword package at the top of the program.\n" +
                "\n" +
                "Example :-  package  utility;  \n" +
                "\n" +
                "In the above statement  utility is the name of the package, which can contain one or more classes.\n" +
                "\n" +
                "Explanation of package :-\n" +
                "\n" +
                "Suppose package X contain classes A,B and package Y contain classes P,Q. If we have to use the functions of class P in class A, then we have to write the following statement before class A\n" +
                "\n" +
                "import Y.P;  or  import Y.*;\n" +
                "class A\n" +
                "{\n" +
                "    void method ()\n" +
                "    {\n" +
                "        //  here you can use the functions of class P \n" +
                "        //  if function is static call with the help of class name e.g.  P.<function-name>\n" +
                "        //  if function is non-static call with the help of object of class P\n" +
                "        //  e.g.  P obj = new P();\n" +
                "        //  obj.<function-name>\n" +
                "    }\n" +
                "}\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("Explanation of package :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("2.User-defined package :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Two types of packages:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("1.Built-in package :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Package :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("import  keyword :"),
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

