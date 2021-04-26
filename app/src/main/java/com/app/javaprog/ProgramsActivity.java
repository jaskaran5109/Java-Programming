package com.app.javaprog;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import java.util.ArrayList;

public class ProgramsActivity extends AppCompatActivity {
    ListView list;
    MyListAdapter adapter;
    private CustomeAdapter customeAdapter;
    private ArrayList<ListItem> listItemArrayList;
    private RewardedVideoAd AdMobrewardedVideoAd2;
    private String AdId="ca-app-pub-8940874631730281/6496475998";

    String[] vehicleTypes = new String[]{"Basic Programs", "General Utility Programs",
            "String Programs","OOPS Programs","Array Programs","Matrix Programs"};

    String[] maintitle ={
            "1.To Find The Sum And Average Of Two Numbers.","2.To Find The Sum And Average Of Two Input Numbers.",
            "3.To Find Quotient And Remainder Of Two Numbers.","4.To Input The Amount In Rs. And Print The Denominations Of The Indian Currency From Higher To Lower.",
            "5.To Find Greatest Out Of Two Input Numbers.","6.IF without else","7.To Execute Multiple Statements With If and Else.",
            "8.To Find Greatest Out Of Two Numbers Using Ternary Operator.","9.To Find Greatest Out Of Three Numbers Using Ternary Operator.",
            "10.To Find Greatest Out Of Five Numbers Using Ternary Operator.","11.To Find Greatest Out Of Three Input Numbers Using 'If Else If' Ladder.",
            "12.To Find Biggest Out Of Five Input Numbers Using 'If' Condition.","13.To Check And Print Whether Triangle Is Possible Or Not.",
            "14.To Check The Input Year Is Leap Year Or Not.","15.Input Marks In Five Subjects And Print The Total, Percentage And Grades.",
            "16.Input Number Of Units Consumed In A Month And Calculate Electricity Bill.","17.To Find Sum Of Two Numbers Using User-Defined Function add().",
            "18.To Find Sum Of Two Numbers Using User-Defined Function add(int,int).","19.To Find Sum Of Two Input Numbers Using Scanner Class.",
            "20.Leap Year.","21.To Input A Number And Print The Corresponding Day Of The Week.","22.To Input A Number And Print In The Form Of Words.",
            "23.To Find Sum Of N Odd And Even Values.","24.Series Programs.","25.Pattern Programs.","26.To Tnput A Number And Print Its Factors(divisors) And Count Them.",
            "27.To Find Prime Numbers Between 1 To N.","28.To Print The List Of Prime Numbers Between 1 And 50.","29.To Print The Prime Factors Of A Number.",
            "30.To Input A Number And Print The Sum Of Its Digits.","31.To Check The Input Number Is Palindrome Or Not.","32.To Print The List Of Prime Palindrome Between 100 and 1000.",
            "33.To Check The Input Number Is Magical Or Not.","34.To Check The Input Number Is Armstrong Or Not.","35.To Print The List Of Armstrong Numbers Between 100 and 999.",
            "36.To Check The Input Number Is Automorphic Or Not.","37.To Check The Given Character Is Alphabet Or Digit.","38.String Programs","39.OOPS Concept.",
            "40.To Input Roll Number, Name And Marks In Three Subjects.","41.Constructors.","42.To Input Roll Number, Name And Marks In Three Subjects Using Constructors.",
            "43.To Add Any Two Input Time.","44.To Store N Values Into An Array And Find The Sum Of Values Stored In The Array.","45.To Input An Array As A Data Member And Print And Find The Sum Of Values Stored In The Array.",
            "46.To Input An Array And Count And Find The Sum Of Odd & Even Values Present In The Array.","47.To Store N Values Into An Array Count Positive & Negative Values Present In The Array.",
            "48.To Generate First N Terms Of Fibonacii Series, Using Arrays( 1 1 2 3 5 8 13 - - - - n terms).","49.To Input An Array And Find Biggest And Smallest Value In The Array AlongWith Its Index.",
            "50.To Input An Array And Exchange First Half Of The Array With The Second Half.","51.To Input An Array And Reverse The Order Of The Values Within The Array.",
            "52.Linear Search.","53.Binary Search.","54.Bubble Sort.","55.Selection Sort.","56.Insertion Sort.","57.To Create Double Dimensional Array Of Size Rows x Columns And Print The Elements In Matrix Format And Find The Sum Of All The Elements.",
            "58.To Create Double Dimensional Array Of Size Rows x Columns And Print The Elements In Matrix Format And Find The Sum Of Each Row Of The Matrix.","59.To Create Double Dimensional Array Of Size Rows x Columns And Print The Elements In Matrix Format And Find The Sum Of Each Column Of The Matrix.",
            "60.To Find The Biggest Element From The Matrix Alongwith Its Row & Column Index.","61.To Find The Biggest Element From Each Row Of The Matrix.","62.To Find The Biggest Element From Each Column Of The Matrix.",
            "63.Print The Elements In Matrix Format And Find The Sum Of Only Boundary Elements.","64.To Find The Sum Of Each Diagonal Elements Separately.","65.Find The Sum Of All The Elements Belongs To Diagonal.","66.To Create The Transpose Of Matrix A Into B.",
            "67.To Create The Mirror Image Of Matrix A Into B.","68.To Shift The Elements Of Each Row One Step Downwards And Last Row Will Become First Row.","69.Demonstration Program Of Inheritance.",
    };

    Integer[] imgid={
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        adapter=new MyListAdapter(this, maintitle,imgid);
        list= findViewById(R.id.list2);
        listItemArrayList = new ArrayList<>();
        populateList();

        customeAdapter = new CustomeAdapter(this,listItemArrayList,imgid);
        list.setAdapter(customeAdapter);
        //list.setAdapter(adapter);
        loadRewardedVideoAd();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 1) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FirstProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if(position == 2){
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SecondProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if(position == 3){
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirdProogramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 4) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourthProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 5) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FifthProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 6) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SixthProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }else if (position == 7) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SeventhProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 8) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), EigthProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 9) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), NinthProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }else if (position == 10) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TenthProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 11) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), EleventhProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 12) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TwelfthProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 13) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirteenProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 14) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourteenProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 15) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FifteenProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 16) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SixteenProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 17) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SeventeenProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 18) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), EighteenProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 19) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), NineteenProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 20) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TwenthProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 21) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TwentyOneProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 22) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TwentyTwoProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 23) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TwentyThreeProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 24) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SeriesProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 25) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgramsActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 27) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TwentyFourProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 28) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TwentyFiveProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 29) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TwentySixProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 30) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TwentySevenProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 31) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TwentyEightProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 32) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), TwentyNineProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 33) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirtyProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 34) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirtyOneProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 35) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirtyTwoProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 36) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirtyThreeProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 37) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirtyFourProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 38) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirtyFiveProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 40) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgramsActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 42) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirtySixProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 43) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirtySevenProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 44) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirtyEightProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 45) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), ThirtyNineProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 46) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourtyProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 48) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourtyOneProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 49) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourtyTwoProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 50) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourtyThreeProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 51) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourtyFourProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 52) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourtyFiveProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 53) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourtySixProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 54) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourtySevenProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 55) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourtyEightProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 56) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FourtyNineProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 57) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FiftyProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 58) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FiftyOneProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 59) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FiftyTwoProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 60) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FiftyThreeProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 62) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FiftyFourProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 63) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FiftyFiveProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 64) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FiftySixProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 65) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FiftySevenProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 66) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FiftyEightProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 67) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), FiftyNineProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 68) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SixtyProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 69) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SixtyOneProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 70) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SixtyTwoProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 71) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SixtyThreeProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 72) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SixtyFourProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 73) {
//                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SixtyFiveProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }  else if (position == 74) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SixtySixProgramActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }
            }
        });


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                //Toast.makeText(ProgramsActivity.this, " successfull ", Toast.LENGTH_SHORT).show();
            }
        });
        AdView mAdView;
        mAdView = findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left,
                R.anim.slide_out_right);
    }
    void loadRewardedVideoAd()
    {
        AdMobrewardedVideoAd2 = MobileAds.getRewardedVideoAdInstance(this);
        AdMobrewardedVideoAd2.setRewardedVideoAdListener(
                new RewardedVideoAdListener() {
                    @Override
                    public void onRewardedVideoAdLoaded() {}

                    @Override
                    public void onRewardedVideoAdOpened() {}

                    @Override
                    public void onRewardedVideoStarted() {}

                    @Override
                    public void onRewardedVideoAdClosed() {}

                    @Override
                    public void onRewarded(RewardItem rewardItem) {}

                    @Override
                    public void
                    onRewardedVideoAdLeftApplication() {}

                    @Override
                    public void onRewardedVideoAdFailedToLoad(int i) { }

                    @Override
                    public void onRewardedVideoCompleted() { }
                });
        AdMobrewardedVideoAd2.loadAd(AdId, new AdRequest.Builder().build());
    }
    public void showRewardedVideoAd()
    {
        if(AdMobrewardedVideoAd2.isLoaded())//Checking If Ad is Loaded or Not
        {
            AdMobrewardedVideoAd2.show();
        }
        else
        {
            AdMobrewardedVideoAd2.loadAd(AdId, new AdRequest.Builder().build());
        }
    }
    public interface ListItem {
        boolean isHeader();
        boolean isChild();
        String getName();
    }

    private void populateList(){

        int headerdone = 0, childdone = 0;

        for(int i = 0; i <=74; i++){

            if(i == 0 || i == 26 | i == 39 | i == 41 | i == 47 | i == 61){
                HeaderModel vehicleModel = new HeaderModel();
                vehicleModel.setheader(vehicleTypes[headerdone]);
                listItemArrayList.add(vehicleModel);
                headerdone = headerdone + 1;
            }else {
                ChildModel childModel = new ChildModel();
                childModel.setChild(maintitle[childdone]);
                listItemArrayList.add(childModel);
                childdone = childdone + 1;
            }

        }

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
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
}