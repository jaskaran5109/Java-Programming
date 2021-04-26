package com.app.javaprog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class MainActivity extends AppCompatActivity {
    ImageView image,image2,image3,exit1,share1,youtube11,contact1;
    TextView text,text2,text3,exit2,share2,youtube22,contact2;
    AlertDialog.Builder builder;
    private RewardedVideoAd AdMobrewardedVideoAd;
    private String AdId2="ca-app-pub-8940874631730281/2907544760";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadRewardedVideoAd();
        image = (ImageView) findViewById(R.id.theoryImage1);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
        text = (TextView) findViewById(R.id.theoryImage2);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        image2 = (ImageView) findViewById(R.id.programImage1);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });
        text2 = (TextView) findViewById(R.id.programImage2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });


        image3 = (ImageView) findViewById(R.id.aboutImage11);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdActivity();
            }
        });
        text3 = (TextView) findViewById(R.id.aboutImage2);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdActivity();
            }
        });

        contact1 = (ImageView) findViewById(R.id.ContactImage1);
        contact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencontactActivity();
            }
        });
        contact2 = (TextView) findViewById(R.id.ContactImage2);
        contact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencontactActivity();
            }
        });
        share1 = (ImageView) findViewById(R.id.shareImage1);
        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
                final String appPackageName = BuildConfig.APPLICATION_ID;
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id="+ appPackageName);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });

        share2 = (TextView) findViewById(R.id.shareImage2);
        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
                final String appPackageName = BuildConfig.APPLICATION_ID;
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id="+ appPackageName);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });

        builder = new AlertDialog.Builder(this);
        exit1=findViewById(R.id.exitImage1);
        exit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                finish();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Java Programming");
                alert.show();


            }
        });

        builder = new AlertDialog.Builder(this);
        exit2=findViewById(R.id.exitImage2);
        exit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                finish();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Java Prog");
                alert.show();



            }
        });

        youtube11 = (ImageView) findViewById(R.id.youtube1);
        youtube11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/channel/UCSbCp8-7HdRA_TwUyso7Eeg/featured"));
                try {
                    showRewardedVideoAd2();
                    MainActivity.this.startActivity(webIntent);
                } catch (ActivityNotFoundException ex) {
                }
            }
        });
        youtube22 = (TextView) findViewById(R.id.youtube2);
        youtube22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/channel/UCSbCp8-7HdRA_TwUyso7Eeg/featured"));
                try {
                    showRewardedVideoAd2();
                    MainActivity.this.startActivity(webIntent);
                } catch (ActivityNotFoundException ex) {
                }
            }
        });
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                //Toast.makeText(MainActivity.this, " successfull ", Toast.LENGTH_SHORT).show();
            }
        });
        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



    }


    public void openNewActivity() {
        showRewardedVideoAd2();
        Intent intent = new Intent(this, TheoryActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,
                R.anim.slide_out_left);
    } public void openSecondActivity() {
        showRewardedVideoAd2();
        Intent intent = new Intent(this, ProgramsActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,
                R.anim.slide_out_left);
    }
    public void openThirdActivity() {
        showRewardedVideoAd2();
        Intent intent = new Intent(this, AboutAppActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,
                R.anim.slide_out_left);
    }
    public void opencontactActivity() {
//        showRewardedVideoAd2();
        Intent intent = new Intent(this, ContactUsActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,
                R.anim.slide_out_left);
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


}



