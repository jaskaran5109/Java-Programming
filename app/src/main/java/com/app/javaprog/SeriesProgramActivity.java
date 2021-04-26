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

public class SeriesProgramActivity extends AppCompatActivity {
    ListView list;
    MyListAdapter adapter;

    String[] maintitle ={
            " 1+2+3+4+ - - - - --  n terms."," 1x2x3x4+ - - - - --  n terms.",
            " 1/2 + 2/3 + 3/4 + 4/5 + - - - - --  n terms."," 1/3 + 2/5 + 3/7 + 4/9 + - - - - --  n terms.",
            " 1/3 + 3/7 + 5/11 + 7/15 + - - - - -- n terms."," 1   3    7    13    21   - -- -   n terms.",
            " 2   5    10    17    26   - -- -   n terms.",
    };

    Integer[] imgid={
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
            R.drawable.dropdown,R.drawable.dropdown,R.drawable.dropdown,
    };
    private RewardedVideoAd AdMobrewardedVideoAd2;
    private String AdId="ca-app-pub-8940874631730281/3686784710";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series_program);
        adapter=new MyListAdapter(this, maintitle,imgid);
        list= findViewById(R.id.list4);
        list.setAdapter(adapter);
        loadRewardedVideoAd();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SeriesProgram1.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if(position == 1){
                    Intent appInfo = new Intent(getApplicationContext(), SeriesProgram2.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if(position == 2){
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SeriesProgram3.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 3) {
                    Intent appInfo = new Intent(getApplicationContext(), SeriesProgram4.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 4) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SeriesProgram5.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 5) {
                    Intent appInfo = new Intent(getApplicationContext(), SeriesProgram6.class);
                    startActivity(appInfo);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                } else if (position == 6) {
                    showRewardedVideoAd();
                    Intent appInfo = new Intent(getApplicationContext(), SeriesProgram7.class);
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
        mAdView = findViewById(R.id.adView6);
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