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

public class StringClassActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_class);
        text = findViewById(R.id.textView26);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("String class belongs to the java.lang package.\n" +
                "\n" +
                "String class also contain many functions, some are static and some are non-static. Maximum functions are non-static. To execute non-static functions, It is required to create the object of String class.\n" +
                "\n" +
                "Different ways to create the String variable or object.\n" +
                "\n" +
                "I Method\n" +
                "String a = new String(“MODINAGAR”);\n" +
                "System.out.println(a); //  It will print MODINAGAR\n" +
                "\n" +
                "II Method\n" +
                "String b=”MODINAGAR”;\n" +
                "System.out.println(a); //  It will print MODINAGAR\n" +
                "\n" +
                "Functions of String class with examples.\n" +
                "\n" +
                "String st = “COMPUTER”;  // each character is having unique \n" +
                "                        //   index starts from 0.\n" +
                "1.charAt() function.\n" +
                "\n" +
                "String st = “COMPUTER”;\n" +
                "char k =  st.charAt(3); // extract 4th  character having index 3\n" +
                "System.out.println(k); // It will print   P\n" +
                "\n" +
                "2.length()  function.\n" +
                "String st = “COMPUTER”;\n" +
                "int n = st.length();  //  count total number of characters present in the string.\n" +
                "System.out.println(n); //   It will print  8\n" +
                "\n" +
                "String concatenation using  function  concat()\n" +
                "\n" +
                "3.concat() function\n" +
                "\n" +
                "Example 1:\n" +
                "String a = “MODINAGAR”;\n" +
                "String b =”CITY”;\n" +
                "String c = a.concat(b);// it will work same as  a+b\n" +
                "System.out.println(c); //  output : MODINAGARCITY\n" +
                "\n" +
                "4.toLowerCase() function.  // to convert into small letters\n" +
                "String a = “MODINAGR”;\n" +
                "String b =  a.toLowerCase(); \n" +
                "System.out.println(b);  // output :  modinagar (in small letters)\n" +
                "\n" +
                "5.toUpperCase() function.  // to convert into capital letters\n" +
                "String a = “modinagar”;\n" +
                "String b =  a.toUpperCase(); \n" +
                "System.out.println(b);  // output :  MODINAGR (in capital letters)\n" +
                "\n" +
                "6.charAt() function.\n" +
                "String st = “COMPUTER”;\n" +
                "char k =  st.charAt(3); // extract 4th  character having index 3\n" +
                "System.out.println(k);   // It will print   P\n" +
                "\n" +
                "7.length()  function.\n" +
                "String st = “COMPUTER”;\n" +
                "int n = st.length();  //  count total number of characters\n" +
                "                                  //  present in the string.\n" +
                "System.out.println(n); //   It will print  8\n" +
                "\n" +
                "String concatenation : It means joining of two or more strings.\n" +
                "\n" +
                "Example 1:\n" +
                "String a = “MODINAGAR”;\n" +
                "String b =”CITY”;\n" +
                "String c = a+b;   // both the strings are joined and converted into \n" +
                "                            //  a single string.\n" +
                "System.out.println(c);  // It will print:  MODINGARCITY\n" +
                "\n" +
                "Example 2:\n" +
                "String a = “MODINAGAR”;\n" +
                "String b =”CITY”;\n" +
                "String c = a+b +”UP”+5+6 ; \n" +
                " // everthing will be joined and conveted into  a single string.\n" +
                "System.out.println(c);  // It will print:  MODINGARCITYUP56\n" +
                " //  here 5 & 6 will not be added, it will be joined as a string of characters.\n" +
                "\n" +
                "String concatenation using  function  concat()\n" +
                "\n" +
                "8.concat() function.\n" +
                "Example 1:\n" +
                "String a = “MODINAGAR”;\n" +
                "String b =”CITY”;\n" +
                "String c = a.concat(b);// it will work same as  a+b\n" +
                "System.out.println(c); //  output : MODINAGARCITY\n" +
                "\n" +
                "9.toLowerCase() function.  // to convert into small letters\n" +
                "String a = “MODINAGAR”;\n" +
                "String b =  a.toLowerCase(); \n" +
                "System.out.println(b);  // output :  modinagar (in small letters)\n" +
                "\n" +
                "10.toUpperCase() function.  // to convert into capital letters\n" +
                "String a = “modinagar”;\n" +
                "String b =  a.toUpperCase(); \n" +
                "System.out.println(b);  // output :  MODINAGR (in capital letters)\n" +
                "\n" +
                "11.indexOf()  function.  //   to get the index number of a character.\n" +
                "String a = ”COMPUTER SOFTWARE”;\n" +
                "int n =  a.indexOf(‘T’); //  it will return the index number of first\n" +
                " \t\t\t    //  occurance of ‘T’\n" +
                "System.out.println(n); // output :  5\n" +
                "\n" +
                "String a = ”COMPUTER SOFTWARE”;\n" +
                "int n =  a.indexOf(‘T’,7); //  it will return the index number of ‘T’, but\n" +
                " \t\t\t    //  starts searching after  index 7.\n" +
                "System.out.println(n); // output :  12\n" +
                "\n" +
                "12.lastIndexOf()  function.  //   to get the index number of a character,\n" +
                "// starts searching from right side.\n" +
                "String a = ”COMPUTER SOFTWARE”;\n" +
                "int n =  a.lastIndexOf(‘T’); //  it will return the index number of first\n" +
                " \t\t\t    //  occurance of ‘T’ from right side to left side.\n" +
                "System.out.println(n); // output :  12\n" +
                "\n" +
                "\n" +
                "int n =  a.lastIndexOf(‘T’,11); //  it will return the index number of first\n" +
                "//  occurance of ‘T’ from right side to left side.\n" +
                "//  but start from 11 to 0 \n" +
                "System.out.println(n); // output :  5\n" +
                "\n" +
                "13.startsWith() function. //  return boolean value true or false, if string starts\n" +
                "  //   with the given string in the parameter.\n" +
                "String a =”COMPUTER SOFTWARE”;\n" +
                "boolean k =  a.startsWith(“COMP”);\n" +
                "System.out.pritnln(k); //  print  true, because string is started with “COMP”.\n" +
                "\n" +
                "14.endsWith() function. //  return boolean value true or false, if string ends\n" +
                "  //   with the given string in the parameter.\n" +
                "String a =”COMPUTER SOFTWARE”;\n" +
                "boolean k =  a.startsWith(“WARE”);\n" +
                "System.out.pritnln(k); //  print  true, because string is ends with “WARE”.\n" +
                "\n" +
                "15.trim() function. // remove extra spaces from both the ends of the string.\n" +
                "String a = “      COMPUTER  SOFTWARE    “;\n" +
                "// here string contains extra spaces left and right side.\n" +
                "String b = a.trim();\n" +
                "System.out.println(b); // output  :  COMPUTER SOFTWARE\n" +
                "   //  without any extra spaces at the both the ends.\n" +
                "\n" +
                "16.replace() function. \n" +
                "String a =”COMPUTER SOFTWARE”;\n" +
                "String b = a.replace(‘T’,’X’); // replaces all the occurance of ‘T’ with ‘X’\n" +
                "System.out.println(b); //   output :  COMPUXER SOFXWARE \n" +
                "\n" +
                "17.valueOf() function.// it is static function, converts any given value into String.\n" +
                "int a= 45;\n" +
                "String b = String.valueOf(a);\n" +
                "System.out.println(b) //  output : it will print  45 ,but it is a String value.\n" +
                "\n" +
                "String comparison functions, which is used to compare two string whether they are equal or not. Four comparison functions are available in String class.\n" +
                "Strings cannot be compared with  == operator.\n" +
                "\n" +
                "18.equals() function.//  return Boolean value if strings are equal.\n" +
                "\n" +
                "Example 1: \n" +
                "String a = “AMAN”;\n" +
                "String b =”DEEPANSHU”;\n" +
                "boolean k = a.equals(b);\n" +
                "System.out.println(k) //   output : false\n" +
                "\n" +
                "Example 2:  (we can also use function like this as given in the example)\n" +
                "String a = “AMAN”;\n" +
                "String b =”DEEPANSHU”;\n" +
                "if(a.equals(b))\n" +
                "\tSystem.out.println(“equal”);  \n" +
                " else\n" +
                "   \tSystem.out.println(“not equal”);\n" +
                "// output : not equal\n" +
                "\n" +
                "Example 3:  (we can also use function like this as given in the example)\n" +
                "String a = “AMAN”;\n" +
                "String b =”aman”;\n" +
                "if(a.equals(b))\n" +
                "\tSystem.out.println(“equal”);\n" +
                " else\n" +
                "   \tSystem.out.println(“not equal”);\n" +
                "// output : not equal, because one string is capital and other is in small\n" +
                "\n" +
                "19.equalsIgnoreCase() function.//  return Boolean value if strings are equal.\n" +
                "\n" +
                "Example 1: \n" +
                "String a = “AMAN”;\n" +
                "String b =”AMAN”;\n" +
                "boolean k = a.equals(b);\n" +
                "System.out.println(k) //   output : true\n" +
                "\n" +
                "Example 2:  \n" +
                "String a = “AMAN”;\n" +
                "String b =”aman”;\n" +
                "if(a.equalsIgnoreCase(b))\n" +
                "\tSystem.out.println(“equal”);\n" +
                " else\n" +
                "   \tSystem.out.println(“not equal”);\n" +
                "\n" +
                "20.compareTo() function.    //  returns integer value, may be 0 or negative \n" +
                "     // or positive value.\n" +
                "Example 1: \n" +
                "String a = “AMAN”;\n" +
                "String b =”DEEPANSHU”;\n" +
                "int n = a.compareTo(b);\n" +
                "System.out.println(n) //   output : -3\n" +
                "// ASCII code difference of first character of both the string i.e. A & D\n" +
                "// code of A is 65 & D is 68,  so  65-68=3\n" +
                "\n" +
                "Example 2: \n" +
                "String a = “AMAN”;\n" +
                "String b =”AMRITJOT”;\n" +
                "int n = a.compareTo(b);\n" +
                "System.out.println(n) //   output : -17\n" +
                "// ASCII code difference of first character & second character is 0, but\n" +
                "// code difference between third character is : -17\n" +
                "// i.e.  code difference of  ‘A’ & ‘R’  i.e.  65-82  = -17\n" +
                "// if string a =”AMAN”  & b =”AMAN” , then there is no difference between any\n" +
                "// character , so difference is  0.\n" +
                "// we can also check the strings like this:\n" +
                "if(a.compareTo(b)==0)\n" +
                "     System.out.println(“same”);\n" +
                "else\n" +
                "     System.out.println(“different”);\n" +
                "// output : equal. // because it is not case-sensitive function.\n" +
                "// uppercase and lowercase letters are treated same.\n" +
                "\n" +
                "\n" +
                "21.compareToIgnoreCase() function. // it is not case-sensitive function\n" +
                "// returns integer value, may be 0 or negative or positive value, without \n" +
                "// checking the cases (capital or small)\n" +
                "// if string a =”AMAN”  & b =”aman” , then there is no difference between any\n" +
                "// character , so difference is  0.\n" +
                "// we can also check the strings like this:\n" +
                "if(a.compareToIgnoreCase(b)==0)\n" +
                "     System.out.println(“same”);\n" +
                "else\n" +
                "     System.out.println(“different”);\n" +
                "// output : same\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("Different ways to create the String variable or object."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Functions of String class with examples."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("1.charAt\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("2.length\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("String concatenation using  function  concat\\(\\)"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("3.concat\\(\\) function"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("4.toLowerCase\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("5.toUpperCase\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("6.charAt\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("7.length\\(\\)  function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("8.concat\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("9.toLowerCase\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("10.toUpperCase\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("11.indexOf\\(\\)  function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("12.lastIndexOf\\(\\)  function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("13.startsWith\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("14.endsWith\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("15.trim\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("16.replace\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("17.valueOf\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("18.equals\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("19.equalsIgnoreCase\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("String concatenation : It means joining of two or more strings."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("20.compareTo\\(\\) function."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("21.compareToIgnoreCase\\(\\) function"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example 1:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example 2:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Example 3:"),
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

