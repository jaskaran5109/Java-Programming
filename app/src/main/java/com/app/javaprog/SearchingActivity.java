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

public class SearchingActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);
        text = findViewById(R.id.textView33);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Searching : It means finding an element within an array.\n" +
                "\n" +
                "Types of Searching:\n" +
                "\n" +
                "1.Linear Searching\n" +
                "2.Binary Searching\n" +
                "\n" +
                "Linear search or Sequential search is a method for finding an element within a list (array). It sequentially checks each element of the list until a match is found or the whole list has been searched.\n" +
                "\n" +
                "Explanation of Linear Search :-\n" +
                "\n" +
                "Linear search is used to search a key element from multiple elements. Linear search is less used today because it is slower than binary search and hashing.\n" +
                "\n" +
                "Algorithm:\n" +
                "\n" +
                "•Step 1: Traverse the array\n" +
                "•Step 2: Match the key element with array element\n" +
                "•Step 3: If key element is found, return the index position of the array element\n" +
                "•Step 4: If key element is not found, return -1\n" +
                "\n" +
                "Let's see an example of linear search in java where we are going to search an element sequentially from an array.\n" +
                "\n" +
                "public class LinearSearchExample\n" +
                "{    \n" +
                "    public static int linearSearch(int[] arr, int key)\n" +
                "    {    \n" +
                "        for(int i=0;i<arr.length;i++)\n" +
                "        {    \n" +
                "            if(arr[i] == key)\n" +
                "            {    \n" +
                "                return i;    \n" +
                "            }    \n" +
                "        }    \n" +
                "        return -1;    \n" +
                "    }    \n" +
                "\n" +
                "    public static void main(String a[])\n" +
                "    {    \n" +
                "        int[] a1= {10,20,30,50,70,90};    \n" +
                "        int key = 50;    \n" +
                "        System.out.println(key+\" is found at index: \"+linearSearch(a1, key));    \n" +
                "    }    \n" +
                "}    \n" +
                "\n" +
                "Output:\n" +
                "\n50 is found at index: 3\n" +
                "\n" +
                "Binary search, also known as half-interval search, is a search algorithm that finds the position of a target value within a sorted array (either in ascending or descending order). Binary search compares the target value to the middle element of the array.\n" +
                "\n" +
                "Binary search follows divide and conquer approach in which, the array is divided into two halves and the value is compared with the middle element of the array. If the match is found then, the location of middle element is returned otherwise, we search into either of the halves depending upon the value is greater or smaller than the middle value.\n" +
                "\n" +
                "Explanation of Binary Search :-\n" +
                "\n" +
                "Let's see an example of binary search in java.\n" +
                "\n" +
                "class BinarySearchExample\n" +
                "{  \n" +
                "    public static void binarySearch(int arr[], int first, int last, int key)\n" +
                "    {  \n" +
                "        int mid = (first + last)/2;  \n" +
                "        while( first <= last )\n" +
                "        {  \n" +
                "            if ( arr[mid] < key )\n" +
                "            {  \n" +
                "                first = mid + 1;     \n" +
                "            }\n" +
                "            else \n" +
                "            if ( arr[mid] == key )\n" +
                "            {  \n" +
                "                System.out.println(\"Element is found at index: \" + mid);  \n" +
                "                break;  \n" +
                "            }\n" +
                "            else\n" +
                "            {  \n" +
                "                last = mid - 1;  \n" +
                "            }  \n" +
                "            mid = (first + last)/2;  \n" +
                "        }  \n" +
                "        if ( first > last )\n" +
                "        {  \n" +
                "            System.out.println(\"Element is not found!\");  \n" +
                "        }  \n" +
                "    }  \n" +
                "\n" +
                "    public static void main(String args[])\n" +
                "    {  \n" +
                "        int arr[] = {10,20,30,40,50};  \n" +
                "        int key = 30;  \n" +
                "        int last=arr.length-1;  \n" +
                "        binarySearch(arr,0,last,key);     \n" +
                "    }  \n" +
                "}\n" +
                "\n" +
                "Output:\n" +
                "\nElement is found at index: 2\n" +
                "\nAn Array of size 10 contain values in ascending order.\n" +
                "\t\t\t\n" +
                "indices:0\t1\t2\t3\t4\t5\t6\t7\t8\t9\t\t\t\n" +
                "values:\t4\t10\t15\t20\t28\t30\t40\t48\t55\t60\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\tIf we have to search a value, suppose 40.\n" +
                "\t\n" +
                "Step 1 :first get the mid index i.e. mid = (0+9)/2, which is 4 (take integer)\t\n" +
                "\n" +
                "Step 2 :Now, compare 40 with the mid element, which is 28\t\n" +
                "\n" +
                "Step 3 :if 40 matches with the mid element, then return the mid index.\t\n" +
                "\tif 40 not matches with the mid element then it can be either greater or smaller than the mid element\t\t\n" +
                "\n" +
                "Step 4:\tif 40 is greater than the mid element, then 40 can only lie in the right side (from  index 5 to 9)\t\n" +
                "\n" +
                "Step 5:\tif 40 is smaller than the mid element, then 40 can only lie in the left side (from index 0 to 3)\t\n" +
                "\tBut, here 40 is greater than mid element, now repeat the same process for the right segment of the array i.e. from 5 to 9\t\n" +
                " \t\t\n" +
                "\t" +
                "Right segment of Array.\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "indices:5\t6\t7\t8\t9\t\t\t\t\t\t\t\t\n" +
                "values:\t30\t40\t48\t55\t60\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "Repeat Step 1 to 5\n" +
                "\n" +
                "Again get the mid index i.e. mid =(5+9)/2, which is 7\n" +
                "\n" +
                "Now, compare 40 with the mid element, which is 48\n" +
                "\n" +
                "if 40 matches with the mid element, then return the mid index.\n" +
                "\n" +
                "if 40 is greater than the mid element, then 40 can only lie in the right side (from index 8 to 9)\n" +
                "\n" +
                "if 40 is smaller than the mid element, then 40 can only lie in the left side (from index 5 to 6)\n" +
                "\n" +
                "But, here 40 is smaller than mid element, now repeat the same process for the left segment of the array i.e. from 5 to 6\t\t\n" +
                " \t \t \t \t \t \t \t \t \t \t \t \t \t\n" +
                "Left segment of the Array.\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "indices: 5\t6\t\t\t\t\t\t\t\t\t\t\t\n" +
                "values:\t30\t40\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "Repeat Step 1 to 5\n" +
                "\n" +
                "Again get the mid index i.e. mid =(5+6)/2, which is 5 (integer)\n" +
                "\n" +
                "Now, compare 40 with the mid element, which is 30\n" +
                "\n" +
                "if 40 matches with the mid element, then return the mid index.\n" +
                "\n" +
                "But, here 40 is greater than mid element, now repeat the same process for the right segment of the array i.e. only index 6\t \t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "Right segment of the Array\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "indices:6\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "values:\t40\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\n" +
                "Repeat the Step 1 to 5\n" +
                "\t\t\t\t\n" +
                "Again get the mid index i.e. mid =(6+6)/2, which is 6 (integer)\t\n" +
                "\t\t\t\n" +
                "Now, compare 40 with the mid element, which is also 40\t\t\n" +
                "\t\t\n" +
                "It is matched, then return the mid index i.e. 6\t\t\n" +
                "\t\t\n" +
                "(Search complete)");

        new PatternEditableBuilder().addPattern(Pattern.compile("Searching :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Types of Searching:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Linear search"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Sequential search"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Explanation of Linear Search :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Algorithm:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("LinearSearchExample"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Binary search"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Explanation of Binary Search :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("BinarySearchExample"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Right segment of Array."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Repeat Step 1 to 5"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Right segment of the Array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Left segment of the Array"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("\\(Search complete\\)"),
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

