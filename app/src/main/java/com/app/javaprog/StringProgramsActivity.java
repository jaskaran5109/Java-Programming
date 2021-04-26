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

public class StringProgramsActivity extends AppCompatActivity {
    ListView list;
    MyListAdapter adapter;
    private RewardedVideoAd AdMobrewardedVideoAd;
    private String AdId2="ca-app-pub-8940874631730281/4217569077";

    String[] maintitle ={
            "1.To Input A String And Print Each Character In Separate Line.","2.To Input A String And Print Each Character In Separate Line In Reverse Order.",
            "3.To Input A String And Find Total Number Of Vowels And Consonants Present In The String.",
            "4.To Input The String And Change The Case Of Each Character Present In The String.","5.To Input A String And Find Total Number Of Capital Letters , Small Letters , Digits, Spaces And Special Characters.",
            "6.To Input A String And Encode Each character Of The String To Its Next Third Character",
            "7.To Input A String And Check Whether It Is Palindrome Or Not.","8.To Input A Sentence And Print Each Word In A Separate Line",
            "9.To Input A Name And Print The Initials Of The Name With Surname.",
            "10.String Pattern Program 1.","11.String Pattern Program 2.","12.String Pattern Program 3","13.String Pattern Program 4",
            "14.To Input A Word In Capital Letter And Print In Alphabetical Order.","15.To Input A Sentence And Count And Print The Palindromic Words From The Sentence.",
            "16.To Input A Sentence And Count And Print Those Words Whose First Character Is Vowel And Last Is Consonant.","17.To Count Total Number Of Words In The Sentence.",
            "18.To Reverse Each Word Of The Sentence.","19.To Reverse The Sentence.","20.To Find The Biggest Word From The Sentence.",
            "21.To Find The Smallest Word From The Sentence.",
    };

    Integer[] imgid={
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.stringpattern1,R.drawable.stringpattern2,R.drawable.stringpattern3,
            R.drawable.stringpattern4,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_programs);
        adapter = new MyListAdapter(this, maintitle, imgid);
        list = findViewById(R.id.list7);
        list.setAdapter(adapter);
        loadRewardedVideoAd();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if (position == 0) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram1.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 1) {
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram2.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }  else
                if (position == 2) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram3.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 3) {
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram4.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 4) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram5.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 5) {
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram6.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else

                if (position == 6) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram7.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 7) {
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram8.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 8) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram9.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 9) {
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram10.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 10) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram11.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 11) {
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram12.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 12) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram13.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 13) {
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram14.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 14) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram15.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 15) {
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram16.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 16) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram17.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 17) {
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram18.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 18) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram19.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 19) {
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram20.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else
                if (position == 20) {
                    showRewardedVideoAd2();
                    Intent appInfo = new Intent(getApplicationContext(), StringProgram21.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }
            }
        });
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                //Toast.makeText(ProgramsActivity.this, " successfull ", Toast.LENGTH_SHORT).show();
            }
        });
        AdView mAdView;
        mAdView = findViewById(R.id.adView7);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

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
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left,
                R.anim.slide_out_right);
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


