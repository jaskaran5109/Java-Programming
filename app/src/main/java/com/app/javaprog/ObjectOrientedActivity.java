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

public class ObjectOrientedActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_oriented);
        text = findViewById(R.id.textView8);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());

        text.setText("Object Oriented Programming  is used to define a programming approach based on objects and classes. The object-oriented model allows us to organize software as a collection of objects that consist of both data and behavior/functions. This is in contrast to conventional functional programming practice that only loosely connects data and functions, where more emphasis is only writing the procedures/instructions not on data.\n" +
                "\nWhat is an Object ?\n" +
                "Real world objects have state , behaviour and identity.\n" +
                "State :  the space occupied by an object.\n" +
                "Behaviour :  the properties or functions of the object.\n" +
                "Identity :    It reference or name by which object can be identified uniquely.\n" +
                "\nExample : A Bike\n" +
                "\nFor Example: Consider the Class of Bikes. There may be person Bikes with different names and brand but all of them will share some common properties like all of them will have 2 wheels, Speed Limit, brakes, gear, Mileage range etc. So here, Bike is the class and wheels, speed limits, mileage, brakes, gears are their properties.\n" +
                "In the above example of class Bike, the data member will be speed limit, fuel, mileage etc. and member functions can apply brakes, gears, accelerator etc.\n" +
                "\nTo create a real world object, we need to setup a factory consists of raw material, different kinds of machines to process the raw material to create the object. Once the factory is setup then we can create any number of objects.\n" +
                "\nWhat is Software Object?\n" +
                "\nA memory block in the RAM (Random access memory), having state, behavior and identity.\n" +
                "•\tA class is a user-defined data-type which has data members and member functions.\n" +
                "•\tData members are the data variables and member functions are the functions (set of instructions) , these data members and member functions define the properties and behaviour of the objects in a Class.\n" +
                "•\tOnce the class is defined, then we can create any number of objects. That’s why class is also called object factory.\n" +
                "\n" +
                "Features/Principles of Object Oriented Programming\n" +
                "\n1.Encapsulation\n" +
                "2.Abstraction\n" +
                "3.Data Hiding\n" +
                "4.Polymorphism\n" +
                "5.Inheritance\n" +
                "\n" +
                "Encapsulation : \n" +
                "\nEncapsulation is defined as wrapping up (binding) of data and information under a single unit.\n" +
                " In Object-Oriented Programming, Encapsulation is defined as binding together the data and the functions that manipulate them.\n" +
                "\nExample :\n" +
                "class Alpha\n" +
                "{\n" +
                "  int a, b, c;    //   a,b,c   are the data members\n" +
                " \n" +
                "   void f1()    //    function 1\n" +
                "   {\n" +
                "    a=5;\n" +
                "    b=6;\n" +
                "   }\n" +
                "\n" +
                " void f2()   //  function 2\n" +
                "  {\n" +
                "   System.out.println(a+”\\t”+b);\n" +
                "  }\n" +
                "\n" +
                "  public static void main(String arg[])\n" +
                " {\n" +
                "      Alpha  ob1;    //  here  Alpha is the class and variable ob1 is the object or\n" +
                "                                    instance of the class (we can create any number of objects)\n" +
                "      ob1.f1();     //   calling the function f1 using object   ob1.\n" +
                "      ob1.f2();     //   calling the function f2 using object   ob1.\n" +
                "\n" +
                "  }  // end of main function\n" +
                "}  // end of class\n" +
                "\n" +
                "In the above example data members ( a,b,c )  and functions (f1 , f2)  are bind  together in a class Alpha  as a single unit.\n" +
                "\n" +
                "Abstraction : \n" +
                "\nAct of representing the essential features without including the background detail.\n" +
                "\n" +
                "Consider a real-life example of a person driving a Bike. The person only knows that pressing the accelerator will increase the speed of the Bike or applying brakes will stop the Bike but he does not know about how on pressing accelerator the speed is actually increasing, he does not know about the inner mechanism of the Bike or the implementation of accelerator, brakes etc. in the Bike. This is what abstraction is.\n" +
                "\n" +
                "Data Hiding : \n" +
                "\n" +
                "It means data is not accessible outside the encapsulated body (i.e. class). Another class cannot access the data of one class.\n" +
                "\n" +
                "Polymorphism:\n" +
                "\nThe word polymorphism means having many forms. We can define polymorphism as the ability of a message to be displayed in more than one form.\n" +
                "\nA man at the same time can have different characteristic. Like a man at the same time is a, brother, father, a husband, manager, an employee. So the same person possess different behaviour in different situations. This is called polymorphism. \n" +
                "\nIn java, we can implement it through  :\n" +
                "1.\t Function Overloading  \n" +
                "2.\t Constructor Overloading\n" +
                "3.\t Interface\n" +
                "\n" +
                "Inheritance :  \n\nTo acquire the properties of  one class by another class.\n" +
                "\nThe main advantages of Inheritance is : \n1.Reusability \n2.Less Coding \n3.Time Saving.\n" +
                "\nIf functions are written in one class then another class can also access the same functions through the concept of Inheritance. So re-writing of the functions is not required. \t\n" );
        new PatternEditableBuilder().addPattern(Pattern.compile("What is an Object ?"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Object Oriented Programming"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("State :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Behaviour :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Identity :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("What is Software Object?"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Features/Principles of Object Oriented Programming"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Encapsulation :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Abstraction :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Data Hiding :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Polymorphism:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Inheritance :"),
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

