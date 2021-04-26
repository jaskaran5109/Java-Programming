package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.regex.Pattern;

public class ThirtyNineProgramActivity extends AppCompatActivity {
    TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirty_nine_program);
        text = findViewById(R.id.program39);
        text.setText("/**\n" +
                "Program to input roll number, name and marks in three subjects (Max marks:100)\n" +
                "and print total, percentage and grade obtained by the student as per following criteria.\n" +
                "if percentage is:\n" +
                "90 & above -  Grade A\n" +
                "70 & above but less than 90 - Grade B\n" +
                "50 & above but less than 70 - Grade C\n" +
                "less than 50 - Grade D\n" +
                " */\n" +
                "import java.util.*;\n" +
                "class Student\n" +
                "{\n" +
                "    int rno;\n" +
                "    String name;\n" +
                "    int eng,hindi,maths;\n" +
                "\n" +
                "    Student(int r,String nm,int x,int y,int z)\n" +
                "    {\n" +
                "        rno=r;\n" +
                "        name=nm;\n" +
                "        eng=x;\n" +
                "        hindi=y;\n" +
                "        maths=z;\n" +
                "    }\n" +
                "\n" +
                "    void accept()\n" +
                "    {\n" +
                "        Scanner scan = new Scanner(System.in);\n" +
                "        System.out.println(\"Enter the rno, name, and marks in three subjects \");\n" +
                "        rno = scan.nextInt();\n" +
                "        name = scan.next();\n" +
                "        eng = scan.nextInt();\n" +
                "        hindi = scan.nextInt();\n" +
                "        maths = scan.nextInt();\n" +
                "    }\n" +
                "\n" +
                "    int getTotal()\n" +
                "    {\n" +
                "        int t = eng+hindi+maths;\n" +
                "        return t;\n" +
                "    }\n" +
                "\n" +
                "    float getPercentage()\n" +
                "    {\n" +
                "        int total = getTotal();\n" +
                "        float per =  (float)total/300*100;\n" +
                "        return per;\n" +
                "    }\n" +
                "\n" +
                "    char getGrade()\n" +
                "    {\n" +
                "        float per = getPercentage();\n" +
                "        if(per >=90)\n" +
                "            return 'A';\n" +
                "        if(per >=70)\n" +
                "            return 'B';\n" +
                "        if(per >=50)\n" +
                "            return 'C';\n" +
                "        return 'D';\n" +
                "    }\n" +
                "\n" +
                "    void display()\n" +
                "    {\n" +
                "        int total = getTotal();\n" +
                "        float percent = getPercentage();  // calling function getPercentage\n" +
                "        char grade = getGrade();\n" +
                "\n" +
                "        System.out.println(\"Report of the student \");\n" +
                "        System.out.println(\"Roll number \"+rno);\n" +
                "        System.out.println(\"Name \"+name);\n" +
                "        System.out.println(\"Marks in English \"+eng);\n" +
                "        System.out.println(\"Marks in Hindi \"+hindi);\n" +
                "        System.out.println(\"Marks in Maths \"+maths);\n" +
                "        System.out.println(\"Total Marks obtained : \"+total);\n" +
                "        System.out.println(\"Percentage : \"+ percent);\n" +
                "        System.out.println(\"Grade  : \"+ grade);\n" +
                "    }\n" +
                "\n" +
                "    static void main()\n" +
                "    {\n" +
                "        Student s1 = new Student(101,\"Deepak\",70,80,85);\n" +
                "        //s1.accept();\n" +
                "        // not called, if we call the function accept(),data supplied in the parameterised constructor \n" +
                "        // will be removed and the new data values will be stored.\n" +
                "        s1.display();\n" +
                "    }\n" +
                "}");

        new PatternEditableBuilder().addPattern(Pattern.compile("Program to input roll number, name and marks in three subjects \\(Max marks:100\\)\n" +
                        "and print total, percentage and grade obtained by the student as per following criteria.\n" +
                        "if percentage is:\n" +
                        "90 & above -  Grade A\n" +
                        "70 & above but less than 90 - Grade B\n" +
                        "50 & above but less than 70 - Grade C\n" +
                        "less than 50 - Grade D"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// calling function getPercentage"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//s1.accept();"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// not called, if we call the function accept\\(\\),data supplied in the parameterised constructor"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("// will be removed and the new data values will be stored."),
                Color.rgb(0, 0, 255)).into(text);

        text2 = findViewById(R.id.output39);
        text2.setText("Report of the student \n" +
                "Roll number 101\n" +
                "Name Deepak\n" +
                "Marks in English 70\n" +
                "Marks in Hindi 80\n" +
                "Marks in Maths 85\n" +
                "Total Marks obtained : 235\n" +
                "Percentage : 78.333336\n" +
                "Grade  : B");
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