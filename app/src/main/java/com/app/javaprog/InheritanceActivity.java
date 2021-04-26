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

public class InheritanceActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inheritance);
        text = findViewById(R.id.textView35);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Inheritance :- It can be defined as the process in which class acquires the properties (data members and methods) of another class. \n" +
                "\n" +
                "The class which inherits the properties of other class is known as subclass (derived class, child class) and the class whose properties are inherited is known as  base class (super class, parent class).\n" +
                "\n" +
                "Advantages of Inheritance :-\n" +
                "\n" +
                "1.Reusability\n" +
                "2.Less coding\n" +
                "3.Time saving\n" +
                "\n" +
                "Types of Inheritance :-\n" +
                "\n" +
                "1.Single Inheritance \n" +
                "2.Multilevel Inheritance\n" +
                "3.Multiple Inheritance\n" +
                "4.Hierarchical Inheritance\n" +
                "5.Hybrid Inheritance\n" +
                "\n" +
                "Explanation : Suppose, there are classes having names  A,B,C,D,E\n" +
                "\n" +
                "1.Single Inheritance  : if class A acquires the property of class B.\n" +
                "2.Multilevel Inheritance : if class B acquires the property of class A , C acquires the property of class B, D acquires the property of class C and so on.\n" +
                "3.Multiple Inheritance :  if class  C acquires the property of class A,B,D and may be more.\n" +
                "4.Hierarchical Inheritance :   if class D acquires the properties from many classes like A,B,C etc.\n" +
                "5.Hybrid Inheritance :  if class B and C acquires the properties from class A , class D acquires the properties from class B , C and E. \n" +
                "\n" +
                "We can say mixtures of other types of inheritance.\n" +
                "\n" +
                "Use of keywords extends and super in inheritance :-\n" +
                "\n" +
                "The 'extends' keyword is used during class creation that derives properties from an existing class. The meaning of \"extends\" is to increase or add the functionality of previous class into new class.\n" +
                "\n" +
                "The 'super' keyword is similar to “this” keyword and used to invoke the constructors and functions of base class.  \n" +
                "Super keyword is used to access the data members and functions of parent class, if parent class and child class (data members & functions) have same.\n" +
                "Whenever we create the instance of subclass, an instance of parent class is created implicitly which is referred by super keyword.\n" +
                "\n" +
                "extends keyword is only used to implement Single and Multilevel inheritance.\n" +
                "\n" +
                "interface keyword is used to implement  Multiple & Hybrid inheritance in java.\n" +
                "\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("Inheritance :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Advantages of Inheritance :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Types of Inheritance :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Explanation :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("1.Single Inheritance  :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("2.Multilevel Inheritance :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("3.Multiple Inheritance :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("4.Hierarchical Inheritance :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("5.Hybrid Inheritance :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Use of keywords extends and super in inheritance :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("'super'"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("'extends'"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("extends keyword"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("interface keyword"),
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

