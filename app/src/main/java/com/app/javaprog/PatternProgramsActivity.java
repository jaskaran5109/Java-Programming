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

public class PatternProgramsActivity extends AppCompatActivity {
    ListView list;
    MyListAdapter adapter;

    String[] maintitle ={
            "Pattern Program 1.","Pattern Program 2.","Pattern Program 3.",
            "Pattern Program 4.","Pattern Program 5.","Pattern Program 6.",
            "Pattern Program 7.","Pattern Program 8.","Pattern Program 9.",
            "Pattern Program 10.","Pattern Program 11.",

    };

    Integer[] imgid={
            R.drawable.patternprog1,R.drawable.patternprog2,R.drawable.patternprog3,
            R.drawable.patternprog4,R.drawable.patternprog5,R.drawable.patternprog6,
            R.drawable.patternprog7,R.drawable.patternprog8,R.drawable.patternprog9,
            R.drawable.patternprog10,R.drawable.patternprog11,
    };
    private RewardedVideoAd AdMobrewardedVideoAd2;
    private String AdId="ca-app-pub-8940874631730281/3189420250";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern_programs);
        adapter = new MyListAdapter(this, maintitle, imgid);
        list = findViewById(R.id.list6);
        list.setAdapter(adapter);
        loadRewardedVideoAd();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if (position == 0) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgram1.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 1) {
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgram2.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 2) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgram3.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 3) {
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgram4.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }else if (position == 4) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgram5.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }else if (position == 5) {
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgram6.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }else if (position == 6) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgram7.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }else if (position == 7) {
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgram8.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }else if (position == 8) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgram9.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }else if (position == 9) {
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgram10.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                }else if (position == 10) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), PatternProgram11.class);
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
        mAdView = findViewById(R.id.adView5);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

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


