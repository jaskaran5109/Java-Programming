package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class VariablesActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variables);
        text = findViewById(R.id.textView7);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.Variable is a name of memory location. There are three types of variables in java: local, instance and static.\n" +
                "\n" +
                "There are two types of data types in Java :- primitive and non-primitive.\n" +
                "\n" +
                "Variable :- Variable is name of reserved area allocated in memory. In other words, it is a name of memory location. It is a combination of \"vary + able\" that means its value can be changed.\n" +
                "\n" +
                "int data=50;//Here data is variable \n" +
                " \n" +
                "Types of Variables\n" +
                "\n" +
                "There are three types of variables in Java :\n" +
                "\n" +
                "local variable\n" +
                "instance variable\n" +
                "static variable\n" +
                "\n" +
                "Types of variables in java :-\n" +
                "\n" +
                "1) Local Variable\n" +
                "A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.\n" +
                "\n" +
                "A local variable cannot be defined with \"static\" keyword.\n" +
                "\n" +
                "2) Instance Variable\n" +
                "A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.\n" +
                "\n" +
                "It is called instance variable because its value is instance specific and is not shared among instances.\n" +
                "\n" +
                "3) Static variable\n" +
                "A variable which is declared as static is called static variable. It cannot be local. You can create a single copy of static variable and share among all the instances of the class. Memory allocation for static variable happens only once when the class is loaded in the memory.\n" +
                "\n" +
                "Example to understand the types of variables in java :-\n" +
                "\n" +
                "class A{  \n" +
                "int data=50;//instance variable  \n" +
                "static int m=100;//static variable  \n" +
                "void method(){  \n" +
                "int n=90;//local variable  \n" +
                "}  \n" +
                "}//end of class  \n" +
                "\n" +
                " \n" +
                "Java Variable Example :- Add Two Numbers\n" +
                "\n" +
                "class Simple{  \n" +
                "public static void main(String[] args){  \n" +
                "int a=10;  \n" +
                "int b=10;  \n" +
                "int c=a+b;  \n" +
                "System.out.println(c);  \n" +
                "}}  \n" +
                "\n" +
                "Output : 20\n" +
                "\n" +
                "Java Variable Example :- Widening\n" +
                "\n" +
                "class Simple{  \n" +
                "public static void main(String[] args){  \n" +
                "int a=10;  \n" +
                "float f=a;  \n" +
                "System.out.println(a);  \n" +
                "System.out.println(f);  \n" +
                "}}  \n" +
                "\n" +
                "Output : 10\n" +
                "\t 10.0\n" +
                "\n" +
                "Java Variable Example :- Narrowing (Typecasting)\n" +
                "\n" +
                "class Simple{  \n" +
                "public static void main(String[] args){  \n" +
                "float f=10.5f;  \n" +
                "//int a=f;//Compile time error  \n" +
                "int a=(int)f;  \n" +
                "System.out.println(f);  \n" +
                "System.out.println(a);  \n" +
                "}}  \n" +
                "\n" +
                "Output : 10.5\n" +
                "\t 10\n" +
                "Java Variable Example:- Overflow\n" +
                "\n" +
                "class Simple{  \n" +
                "public static void main(String[] args){  \n" +
                "//Overflow  \n" +
                "int a=130;  \n" +
                "byte b=(byte)a;  \n" +
                "System.out.println(a);  \n" +
                "System.out.println(b);  \n" +
                "}} \n" +
                " \n" +
                "Output : 130\n" +
                "\t-126\n" +
                "\n" +
                "Java Variable Example:- Adding Lower Type\n" +
                "\n" +
                "class Simple{  \n" +
                "public static void main(String[] args){  \n" +
                "byte a=10;  \n" +
                "byte b=10;  \n" +
                "//byte c=a+b;//Compile Time Error: because a+b=20 will be int  \n" +
                "byte c=(byte)(a+b);  \n" +
                "System.out.println(c);  \n" +
                "}}  \n" +
                "\n" +
                "Output : 20");
        String[] para = text.getText().toString().split("\r\n\r\n");
        Toast.makeText(VariablesActivity.this, "" + para.length, Toast.LENGTH_LONG).show();


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