package com.app.javaprog;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {
    private ImageView logo;
    private TextView text,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashfile);
        getSupportActionBar().hide();
        logo=(ImageView)findViewById(R.id.logo_id);
        text=(TextView)findViewById(R.id.text_id);
        text2=(TextView)findViewById(R.id.text_id2);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Thread td = new Thread() {
            public void run() {
                try {
                    sleep(3000);

                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    Intent intent2 = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent2);
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                     finish();
                }
            }
        };
        td.start();
        Animation myanimm = AnimationUtils.loadAnimation(this,R.anim.mysplashanimation);
        logo.startAnimation(myanimm);
        text.startAnimation(myanimm);
        text2.startAnimation(myanimm);
    }
}