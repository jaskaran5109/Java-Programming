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

public class SortingActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting);
        text = findViewById(R.id.textView34);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());
        text.setText("Sorting: It means to arrange the elements of array either in ascending or descending order. \n" +
                "                \n" +
                "Types of sorting :- \n" +
                "                \n" +
                "1.Bubble sort \n" +
                "2.Selection sort  \n" +
                "3.Insertion sort \n" +
                "                \n" +
                "Bubble Sort in Java :- \n" +
                "                \n" +
                "We can create a java program to sort array elements using bubble sort. Bubble sort algorithm is known as the simplest sorting algorithm. \n" +
                "                \n" +
                "In bubble sort algorithm, array is traversed from first element to last element. Here, current element is compared with the next element. If current element is greater than the next element, it is swapped. \n" +
                "                \n" +
                "public class BubbleSortExample \n" +
                "{   \n" +
                "    static void bubbleSort(int[] arr)  \n" +
                "    {   \n" +
                "        int n = arr.length;   \n" +
                "        int temp = 0;   \n" +
                "        for(int i=0; i < n; i++) \n" +
                "        {   \n" +
                "            for(int j=1; j < (n-i); j++) \n" +
                "            {   \n" +
                "                if(arr[j-1] > arr[j]) \n" +
                "                {   \n" +
                "                    //swap elements  temp = arr[j-1];   \n" +
                "                    arr[j-1] = arr[j];   \n" +
                "                    arr[j] = temp;   \n" +
                "\n" +
                "                }   \n" +
                "            }   \n" +
                "        } \n" +
                "    } \n" +
                "\n" +
                "    public static void main(String[] args) \n" +
                "    {   \n" +
                "        int arr[] ={3,60,35,2,45,320,5};   \n" +
                "\n" +
                "        System.out.println(\"Array Before Bubble Sort);   \n" +
                "        for(int i=0; i < arr.length; i++)\n" +
                "\t{   \n" +
                "            System.out.print(arr[i]);   \n" +
                "        }   \n" +
                "        System.out.println();   \n" +
                "\n" +
                "        bubbleSort(arr);//sorting array elements using bubble sort   \n" +
                "\n" +
                "        System.out.println(\"Array After Bubble Sort\");   \n" +
                "        for(int i=0; i < arr.length; i++)\n" +
                "\t{   \n" +
                "            System.out.print(arr[i]);   \n" +
                "        }   \n" +
                "    }   \n" +
                "}   \n" +
                "                \n" +
                "Output: \n" +
                "                \n" +
                "Array Before Bubble Sort \n" +
                "3 60 35 2 45 320 5  \n" +
                "Array After Bubble Sort \n" +
                "2 3 5 35 45 60 320  \n" +
                "\n" +
                "Explanation of Bubble Sorting :\n" +
                "\t\t\t\t\t\t\n" +
                "In bubble sort technique, we have to compare adjacent values , if first value is greater than second then swap them.Then same way compare second with third, third with fourth and fourth with fifth.\n" +
                "\t\t\t\t\t\t\n" +
                "if an array contains five values.\t\t\t\t\t\t\n" +
                "\tindices :\t0\t1\t2\t3\t4\n" +
                "\tvalues :\t60\t40\t70\t12\t8\n" +
                "\n" +
                "check 60>40, true, so swap the values\t\t\n" +
                "after swapping :\t40\t60\t70\t12\t8\n\n" +
                "check 60>70, false, so do not swap the values :" +
                "40\t60\t70\t12\t8\n\n" +
                "check 70>12, true, so swap the values.\t\t\n" +
                "after swapping :\t40\t60\t12\t70\t8\n\n" +
                "check 70>8, true, so swap the values.\t\t\n" +
                "after swapping :\t40\t60\t12\t8\t70\n\n" +
                "This was first round, 70 is biggest value arranged at last index.\t\t\t\t\t\t\n" +
                "               (after first round values are)\n" +
                "\t\t\t\t\n" +
                "Now, values in the array are :\t\t\t\t\t\n" +
                "40\t60\t12\t8\t70\n\n" +
                "Repeat the same process second time. \t\t\t\t\t\t\n\n" +
                "check 40>60 , false, do not swap\t\t\t\t\n" +
                "40\t60\t12\t8\t70\n\n" +
                "check 60>12, true, so swap the values.\t\t\n" +
                "after swapping :\t40\t12\t60\t8\t70\n\n" +
                "check 60>8, true, so swap the values.\t\t\n" +
                "after swapping :\t40\t12\t8\t60\t70\n\n" +
                "no need to check 60>70, 70 is already arranged in the previous round\t\t\t\t\t\t\n" +
                "\nThis was second round:  60,70  are arranged\t\t\t\t\t\t\n" +
                "                (after second round values are)\t\n" +
                "\t\t\t\n" +
                "Now, values in the array are :\t\t\t\t\t\n" +
                "40\t12\t8\t60\t70\n" +
                "Repeat the same process third time. \t\t\t\t\t\t\n\n" +
                "check 40>12, true swap the values\t\t\t\n" +
                "after swapping :\t12\t40\t8\t60\t70\n\n" +
                "check 40>8, true , swap the values\t\t\t\n" +
                "after swapping :\t12\t8\t40\t60\t70\n\n" +
                "Now, no need to check 40> 60, as 60,70 are already arranged\t\t\t\t\t\t\n" +
                "               (after third round values are)\t\n" +
                "\t\t\t\n" +
                "Now, values in the array are :\t\t\t\t\t\n" +
                "12\t8\t40\t60\t70\n\n" +
                "Repeat the same process fourth time. \t\t\t\t\t\t\n\n" +
                "Now, no need to check 12>40, as 40,60,70 are already arranged\t\n" +
                "8\t12\t40\t60\t70\n" +
                "(after third round values are)\t\t\t\t\n" +
                "8\t12\t40\t60\t70\n\n" +
                "              \n" +
                "Selection Sort in Java :- \n" +
                "                \n" +
                "We can create a java program to sort array elements using selection sort. In selection sort algorithm, we search for the lowest element and arrange it to the proper location. We swap the current element with the next lowest number. \n" +
                "                \n" +
                "public class SelectionSortExample  \n" +
                "{   \n" +
                "    public static void selectionSort(int[] arr) \n" +
                "    {   \n" +
                "        for (int i = 0; i < arr.length - 1; i++)   \n" +
                "        {              \n" +
                "            int index = i;   \n" +
                "            for (int j = i+1; j < arr.length; j++) \n" +
                "            {   \n" +
                "                if (arr[j] < arr[index]) \n" +
                "                {   \n" +
                "                    index = j;//searching for lowest index   \n" +
                "                }   \n" +
                "            }   \n" +
                "            int smallerNumber = arr[index];    \n" +
                "            arr[index] = arr[i];   \n" +
                "            arr[i] = smallerNumber;   \n" +
                "        }   \n" +
                "    }   \n" +
                "\n" +
                "    public static void main(String a[]) \n" +
                "    {   \n" +
                "        int[] arr1 = {9,14,3,2,43,11,58,22};   \n" +
                "        System.out.println(\"Before Selection Sort\");   \n" +
                "        for(int i;i<arr1.length;i++) \n" +
                "        {   \n" +
                "            System.out.print(i);   \n" +
                "        }   \n" +
                "        System.out.println();   \n" +
                "        selectionSort(arr1);//sorting array using selection sort   \n" +
                "        System.out.println(\"After Selection Sort\");   \n" +
                "        for(int i;i<arr1.length;i++)\n" +
                "\t{   \n" +
                "            System.out.print(i);   \n" +
                "        }   \n" +
                "    }   \n" +
                "}                \n" +
                "                   \n" +
                "Output: \n" +
                "                \n" +
                "Before Selection Sort \n" +
                "9 14 3 2 43 11 58 22  \n" +
                "After Selection Sort \n" +
                "2 3 9 11 14 22 43 58  \n" +
                "\n" +
                "Explanation of Selection Sorting :\n" +
                "\t\t\t\t\t\t\n" +
                "In Selection sorting,  the smallest element is selected from the unsorted array and swapped with the left most element (i.e. element at index 0). Then repeat the same process, the smallest element is selected from rest of the array (i.e from index 1 onwards) and swapped with the element at index 1. Then repeat the same process, the smallest element is selected from rest of the array (i.e from index 2 onwards) and swapped with the element at index 2 and so on .\t\t\n" +
                "\t\t\t\t\n" +
                "if an array contains five values.\t\t\n" +
                "indices :\t0\t1\t2\t3\t4\n" +
                "values :\t40\t60\t70\t8\t12\n" +
                "\n\n" +
                "Select the lowest value from the whole array [0 ... 4] i.e. 8 at index 3, swap it with 40 at index 0\t\t\t\t\t\t\n" +
                "after swapping :\t8\t60\t70\t40\t12\n" +
                "\t\t\t\t\t\t\n" +
                "Select the lowest value from the array [1... 4] i.e. 12 at index 4, swap it with 60 at index 1\t\t\t\t\t\t\n" +
                "after swapping :\t8\t12\t70\t40\t60\n" +
                "\t\t\t\t\t\t\n" +
                "Select the lowest value from the array [2... 4] i.e. 40 at index 3, swap it with 70 at index 2\t\t\t\t\t\t\n" +
                "after swapping :\t8\t12\t40\t70\t60\n" +
                "\t\t\t\t\t\t\n" +
                "Select the lowest value from the array [3... 4] i.e. 60 at index 43, swap it with 70 at index 3\t\t\t\t\t\t\n" +
                "after swapping :\t8\t12\t40\t60\t70\n" +
                 "             \n" +
                "Insertion Sort in Java :- \n" +
                "                \n" +
                "We can create a java program to sort array elements using insertion sort. Insertion is good for small elements only because it requires more time for sorting large number of elements. \n" +
                "                \n" +
                "public class InsertionSortExample \n" +
                "{   \n" +
                "    public static void insertionSort(int array[])  \n" +
                "    {   \n" +
                "        int n = array.length;   \n" +
                "        for (int j = 1; j < n; j++)  \n" +
                "        {   \n" +
                "            int key = array[j];   \n" +
                "            int i = j-1;   \n" +
                "            while ( (i > -1) && ( array [i] > key ) )  \n" +
                "            {   \n" +
                "                array [i+1] = array [i];   \n" +
                "                i--;   \n" +
                "            }   \n" +
                "            array[i+1] = key;   \n" +
                "        }   \n" +
                "    }   \n" +
                "\n" +
                "    public static void main(String a[]) \n" +
                "    {     \n" +
                "        int[] arr1 = {9,14,3,2,43,11,58,22};     \n" +
                "        System.out.println(\"Before Insertion Sort\");     \n" +
                "        for(int i=0;i<arr1.length;i++) \n" +
                "        {     \n" +
                "            System.out.print(i);     \n" +
                "        }     \n" +
                "        System.out.println();     \n" +
                "\n" +
                "        insertionSort(arr1);//sorting array using insertion sort     \n" +
                "\n" +
                "        System.out.println(\"After Insertion Sort\");     \n" +
                "        for(int i=0;i<arr1.length;i++) \n" +
                "        {     \n" +
                "            System.out.print(i);     \n" +
                "        }     \n" +
                "    }     \n" +
                "}   \n" +
                "                \n" +
                "Output: \n" +
                "                \n" +
                "Before Insertion Sort \n" +
                "9 14 3 2 43 11 58 22  \n" +
                "After Insertion Sort \n" +
                "2 3 9 11 14 22 43 58\n" +
                "\n" +
                "Explanation of Insertion Sorting :\t\t\t\n" +
                "\t\t\t\t\n" +
                "If it is the first element, it is already sorted.\n" +
                "\t\t\t\t\n" +
                "Pick the next element.\t\t\n" +
                "\t\t\n" +
                "Compare with all the predecessor elements in the array\t\n" +
                "\t\t\t\n" +
                "Shift all the the elements one step ahead if  greater than the value to be sorted.\n" +
                "\t\t\t\t\n" +
                "If not greater than the compared value, then insert the value one step ahead\t\n" +
                "\t\t\t\n" +
                "Repeat until list is sorted.\n" +
                "\t\t\t\t\t\t\t\t\t\t\t \n" +
                "if an array contains four values from index 0 to 3 are : \n" +
                "indices :\t0\t1\t2\t3\n" +
                "values :\t40\t20\t5\t8\n" +
                "Start from index 1, pick value 20 at index 1, compare with the predecessor i.e. 40.\n     \n" +
                "\n" +
                "20 is smaller than 40, shift 40 at index 1 and insert 20 at index 0, now the values are\n" +
                "indices :\t0\t1\t2\t3\n" +
                "values\t:\t20\t40\t5\t8\n" +
                "\t\t\t\t\t\t\t \n\n" +
                "Now pick value 5 at index 2, compare with the predecessor i.e. 40.  \n" +
                "5 is smaller than 40, shift 40 at index 2 , compare 5 with 20, again \n" +
                "5 is smaller, shift 20 at index 1 and insert 5 at index 0, now the values are : \n" +
                "indices :\t0\t1\t2\t3\n" +
                "values :\t5\t20\t40\t8\n" +
                "\n" +
                "Now pick value 8 at index 3, compare with the predecessor i.e. 40.\n  \n" +
                "8 is smaller than 40, shift 40 at index 3 , compare 8 with 20, again \n" +
                "8 is smaller, shift 20 at index 2, compare 8 with 5, and 8 is not smaller than 5, \n" +
                "now insert 8 at index 1, and the values are now : \n" +
                "values :\t5\t8\t20\t40\n");

        new PatternEditableBuilder().addPattern(Pattern.compile("Explanation of Selection Sorting :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Sorting:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Types of sorting :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Bubble Sort in Java :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//sorting array elements using bubble sort"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Output:"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Explanation of Bubble Sorting :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Repeat the same process second time."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Repeat the same process third time."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Repeat the same process fourth time."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Selection Sort in Java :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//searching for lowest index"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//sorting array using selection sort"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Explanation of Selection Sorting :"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Repeat until list is sorted."),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Insertion Sort in Java :-"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("//sorting array using insertion sort"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("InsertionSortExample"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("SelectionSortExample"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("BubbleSortExample"),
                Color.rgb(0, 0, 255)).into(text);
        new PatternEditableBuilder().addPattern(Pattern.compile("Explanation of Insertion Sorting :"),
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

