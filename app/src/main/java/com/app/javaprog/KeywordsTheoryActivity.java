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

public class KeywordsTheoryActivity extends AppCompatActivity {
    TextView text,text1,text2,text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keywords_theory);
        text = findViewById(R.id.textView31);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Java static keyword :\n" +
                "\n" +
                "The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.\n" +
                "\n" +
                "Example of static variable :-\n" +
                "\n" +
                "//Java Program to demonstrate the use of static variable  \n" +
                "class Student\n" +
                "{  \n" +
                "    int rollno;//instance variable  \n" +
                "    String name;  \n" +
                "    static String college =\"ITS\";//static variable  \n" +
                "    //constructor  \n" +
                "    Student(int r, String n)\n" +
                "    {  \n" +
                "        rollno = r;  \n" +
                "        name = n;  \n" +
                "    }  \n" +
                "    //method to display the values  \n" +
                "    void display()\n" +
                "    {\n" +
                "        System.out.println(rollno+\" \"+name+\" \"+college);\n" +
                "    }  \n" +
                "}  \n" +
                "//Test class to show the values of objects  \n" +
                "public class TestStaticVariable1\n" +
                "{  \n" +
                "    public static void main(String args[])\n" +
                "    {  \n" +
                "        Student s1 = new Student(111,\"Karan\");  \n" +
                "        Student s2 = new Student(222,\"Aryan\");  \n" +
                "        //we can change the college of all objects by the single line of code  \n" +
                "        //Student.college=\"BBDIT\";  \n" +
                "        s1.display();  \n" +
                "        s2.display();  \n" +
                "    }  \n" +
                "}  \n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "111 Karan ITS\n" +
                "222 Aryan ITS");
        text1 = findViewById(R.id.textView311);
        text1.setMovementMethod(ScrollingMovementMethod.getInstance());
        text1.setText("Java this keyword :\n" +
                "\n" +
                "In java, this is a reference variable that refers to the current object.The this keyword can be used to refer current class instance variable. \n" +
                "If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.\n" +
                "\n" +
                "Example of this Keyword :-\n" +
                "\n" +
                "class Student\n" +
                "{  \n" +
                "    int rollno;  \n" +
                "    String name;  \n" +
                "    float fee;  \n" +
                "    Student(int rollno,String name,float fee)\n" +
                "    {  \n" +
                "        this.rollno=rollno;  \n" +
                "        this.name=name;  \n" +
                "        this.fee=fee;  \n" +
                "    }  \n" +
                "\n" +
                "    void display()\n" +
                "    {\n" +
                "        System.out.println(rollno+\" \"+name+\" \"+fee);\n" +
                "    }  \n" +
                "}  \n" +
                "\n" +
                "class TestThis2\n" +
                "{  \n" +
                "    public static void main(String args[])\n" +
                "    {  \n" +
                "        Student s1=new Student(111,\"ankit\",5000f);  \n" +
                "        Student s2=new Student(112,\"sumit\",6000f);  \n" +
                "        s1.display();  \n" +
                "        s2.display();  \n" +
                "    }\n" +
                "} \n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "111 ankit 5000\n" +
                "112 sumit 6000");

        text2 = findViewById(R.id.textView312);
        text2.setMovementMethod(ScrollingMovementMethod.getInstance());
        text2.setText("Java Super Keyword :\n" +
                "\n" +
                "The super keyword in Java is a reference variable which is used to refer immediate parent class object.\n" +
                "Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.\n" +
                "\n" +
                "Example of super Keyword :-\n" +
                "\n" +
                "class Animal\n" +
                "{  \n" +
                "    Animal()\n" +
                "    {\n" +
                "        System.out.println(\"animal is created\");}  \n" +
                "}  \n" +
                "class Dog extends Animal\n" +
                "{  \n" +
                "    Dog()\n" +
                "    {  \n" +
                "        super();  \n" +
                "        System.out.println(\"dog is created\");  \n" +
                "    }  \n" +
                "}  \n" +
                "class TestSuper3\n" +
                "{  \n" +
                "    public static void main(String args[])\n" +
                "    {  \n" +
                "        Dog d=new Dog();  \n" +
                "    }\n" +
                "}  \n" +
                "\n" +
                "Output:\n" +
                "\n" +
                "animal is created\n" +
                "dog is created");

        text3 = findViewById(R.id.textView313);
        text3.setMovementMethod(ScrollingMovementMethod.getInstance());
        text3.setText("Java final Keyword :\n" +
                "\n" +
                "The final keyword in java is used to restrict the user. The java final keyword can be used in many context.\n" +
                "\n" +
                "Example of final variable :-\n" +
                "\n" +
                "There is a final variable speedlimit, we are going to change the value of this variable, but It can't be changed because final variable once assigned a value can never be changed.\n" +
                "\n" +
                "class Bike\n" +
                "{  \n" +
                "    final int speedlimit;//blank final variable  \n" +
                "    Bike10()\n" +
                "    {  \n" +
                "        speedlimit=70;  \n" +
                "        System.out.println(speedlimit);  \n" +
                "    }  \n" +
                "    public static void main(String args[])\n" +
                "    {  \n" +
                "        new Bike();  \n" +
                "    }  \n" +
                "}  \n" +
                "\n" +
                "Output: \n" +
                "\n" +
                "70");

        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text1);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text2);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text3);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example of final variable :-"),
                Color.rgb(0, 0, 255)).into(text3);
        new PatternEditableBuilder().addPattern(Pattern.compile("Java final Keyword :"),
                Color.rgb(0, 0, 255)).into(text3);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example of super Keyword :-"),
                Color.rgb(0, 0, 255)).into(text2);
        new PatternEditableBuilder().addPattern(Pattern.compile("Java Super Keyword :"),
                Color.rgb(0, 0, 255)).into(text2);
        new PatternEditableBuilder().addPattern(Pattern.compile("Java static keyword :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example of static variable :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Java this keyword :"),
                Color.rgb(0, 0, 255)).into(text1);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example of this Keyword :-"),
                Color.rgb(0, 0, 255)).into(text1);
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

