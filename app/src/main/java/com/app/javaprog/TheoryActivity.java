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

public class TheoryActivity extends AppCompatActivity {
    ListView list;
    MyListAdapter adapter;
    private RewardedVideoAd AdMobrewardedVideoAd;
    private String AdId2="ca-app-pub-8940874631730281/6640139742";

    String[] maintitle ={
            "1.Computer Languages.","2.Object Oriented Programming.","3.Introduction To Java.",
            "4.Data Types.","5.Tokens.","6.Expressions",
            "7.Functions.","8.Library Functions.","9.User-Defined Functions.",
            "10.Scanner Class.","11.Looping.","12.ASCII Code.",
            "13.Wrapper Classes.","14.Character Wrapper Classes.","15.String Class.",
            "16.Objects And Classes.","17.Object As Reference Type.","18.Constructors.",
            "19.Call By Value.","20.Call By Reference.","21.Keywords.",
            "22.Arrays.","23.Searching.","24.Sorting.","25.Inheritance.","26.Packages.",
            "27.Visibility Modes.",
    };

    Integer[] imgid={
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,
    };
    private String TAG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);
        adapter = new MyListAdapter(this, maintitle, imgid);
        list = findViewById(R.id.list);
        list.setAdapter(adapter);
        loadRewardedVideoAd();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if (position == 0) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), TypesOfComputerActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 1) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), ObjectOrientedActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 2) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), IntroductionActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 3) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), DataTypesActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 4) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), TokensInJava.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 5) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), ExpressionsActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 6) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), FunctionInJavaActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 7) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), LibraryActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 8) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), UserDefinedActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 9) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), ScannerClassActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 10) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), LoopingActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 11) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), ASCIICodeActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 12) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), WrapperClassActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 13) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), CharWrapperClassActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 14) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringClassActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 15) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), ObjectClassActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 16) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), ObjectReferenceActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 17) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), ConstructorClassActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 18) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), CallByValueActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 19) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), CallByReferenceActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 20) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), KeywordsTheoryActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 21) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), ArraysActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 22) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), SearchingActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 23) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), SortingActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 24) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), InheritanceActivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 25) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), PackagesAcitivity.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 26) {
//                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), VisibilityModesActivity.class);
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
                //Toast.makeText(TheoryActivity.this, " successfull ", Toast.LENGTH_SHORT).show();
            }
        });
        AdView mAdView;
        mAdView = findViewById(R.id.adView2);
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
         AdMobrewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
          AdMobrewardedVideoAd.setRewardedVideoAdListener(
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
        AdMobrewardedVideoAd.loadAd(AdId2, new AdRequest.Builder().build());
    }

    public void showRewardedVideoAd2()
    {
        if(AdMobrewardedVideoAd.isLoaded())//Checking If Ad is Loaded or Not
        {
            AdMobrewardedVideoAd.show();
        }
        else
        {
            AdMobrewardedVideoAd.loadAd(AdId2, new AdRequest.Builder().build());
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


