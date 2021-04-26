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

public class ConstructorClassActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructor_class);
        text = findViewById(R.id.textView28);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.\n" +
                "\n" +
                "Rules for creating Java constructor :\n" +
                "\n" +
                "* Constructors are the methods having same name as the class. \n" +
                "* It invokes automatically, when objects  gets created . \n" +
                "* It does not have any return type, not even void.\n" +
                "* They are used to initialize data members.\n" +
                "\n" +
                "Types of constructors :\n" +
                "\n" +
                "i) Default constructor\n" +
                "ii) Parameterised constructor\n" +
                "iii) Copy constructor\t\n" +
                "\n" +
                "Java Default Constructor :\n" +
                "\n" +
                "A constructor is called \"Default Constructor\" when it doesn't have any parameter.\n" +
                "\n" +
                "Example:\n" +
                " \n" +
                "//Java Program to create and call a default constructor  \n" +
                "class Bike1\n" +
                "{  \n" +
                "    //creating a default constructor  \n" +
                "    Bike1()\n" +
                "    {\n" +
                "        System.out.println(\"Bike is created\");\n" +
                "    }  \n" +
                "    //main method  \n" +
                "    public static void main(String args[])\n" +
                "    {  \n" +
                "        //calling a default constructor  \n" +
                "        Bike1 b=new Bike1();  \n" +
                "    }  \n" +
                "}  \n" +
                "\n" +
                "Output:\n" +
                "Bike is created\n" +
                "\n" +
                "Java Parameterized Constructor :\n" +
                "\n" +
                "A constructor which has a specific number of parameters is called a parameterized constructor.\n" +
                "\n" +
                "The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.\n" +
                "\n" +
                "Example:\n" +
                " \n" +
                "//Java Program to demonstrate the use of the parameterized constructor.  \n" +
                "class Student4\n" +
                "{  \n" +
                "    int id;  \n" +
                "    String name;  \n" +
                "    //creating a parameterized constructor  \n" +
                "    Student4(int i,String n)\n" +
                "    {  \n" +
                "        id = i;  \n" +
                "        name = n;  \n" +
                "    }  \n" +
                "    //method to display the values  \n" +
                "    void display()\n" +
                "    {\n" +
                "        System.out.println(id+\" \"+name);\n" +
                "    }  \n" +
                "\n" +
                "    public static void main(String args[])\n" +
                "    {  \n" +
                "        //creating objects and passing values  \n" +
                "        Student4 s1 = new Student4(111,\"Karan\");  \n" +
                "        Student4 s2 = new Student4(222,\"Aryan\");  \n" +
                "        //calling method to display the values of object  \n" +
                "        s1.display();  \n" +
                "        s2.display();  \n" +
                "    }  \n" +
                "}  \n" +
                "\n" +
                "Output:\n" +
                "111 Karan\n" +
                "222 Aryan\n" +
                "\n" +
                "Java Copy Constructor :\n" +
                "\n" +
                "There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.\n" +
                "\n" +
                "There are many ways to copy the values of one object into another in Java. \n" +
                "\n" +
                "They are:\n" +
                "* By constructor\n" +
                "* By assigning the values of one object into another\n" +
                "* By clone() method of Object class\n" +
                "\n" +
                "Example:\n" +
                "\n" +
                "//Java program to initialize the values from one object to another object.  \n" +
                "class Student6\n" +
                "{  \n" +
                "    int id;  \n" +
                "    String name;  \n" +
                "    //constructor to initialize integer and string  \n" +
                "    Student6(int i,String n)\n" +
                "    {  \n" +
                "        id = i;  \n" +
                "        name = n;  \n" +
                "    }  \n" +
                "    //constructor to initialize another object  \n" +
                "    Student6(Student6 s)\n" +
                "    {  \n" +
                "        id = s.id;  \n" +
                "        name =s.name;  \n" +
                "    }  \n" +
                "\n" +
                "    void display()\n" +
                "    {\n" +
                "        System.out.println(id+\" \"+name);\n" +
                "    }  \n" +
                "\n" +
                "    public static void main(String args[])\n" +
                "    {  \n" +
                "        Student6 s1 = new Student6(111,\"Karan\");  \n" +
                "        Student6 s2 = new Student6(s1);  \n" +
                "        s1.display();  \n" +
                "        s2.display();  \n" +
                "    }  \n" +
                "}  \n" +
                "\n" +
                "Output:\n" +
                "111 Karan\n" +
                "111 Karan\n" +
                "\n" +
                "Default values of the data members :\n" +
                "\n" +
                "data types           default value\n" +
                "\n" +
                "byte                       0\n" +
                "short                     0\n" +
                "int                          0\n" +
                "long                       0L\n" +
                "float                       0.0f\n" +
                "double                   0.0d\n" +
                "char                     '\\u0000'\n" +
                "String(any object)  null\n" +
                "boolean                 false\n" +
                "\t\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("Rules for creating Java constructor :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Types of constructors :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Java Default Constructor :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//Java Program to create and call a default constructor"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//creating a default constructor "),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//main method"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//calling a default constructor"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Java Parameterized Constructor :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//Java Program to demonstrate the use of the parameterized constructor."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//creating a parameterized constructor"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//method to display the values"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//creating objects and passing values"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//calling method to display the values of object"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Java Copy Constructor :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("They are:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//Java program to initialize the values from one object to another object."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//constructor to initialize integer and string"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//constructor to initialize another object"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Default values of the data members :"),
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

