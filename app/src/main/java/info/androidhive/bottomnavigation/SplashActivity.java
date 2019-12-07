package info.androidhive.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;


public class SplashActivity extends AppCompatActivity {

    ImageView splash_img;
    Animation move;
    ProgressBar mProgressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splash_img = findViewById(R.id.splash_img);
        move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        splash_img.startAnimation(move);

        mProgressbar = findViewById(R.id.prog_lay2);

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
                finish();
            }
        });
        myThread.start();
    }

    private void doWork() {
        for (int progress = 0; progress <= 100;
             progress += 1) {

            try {
                Thread.sleep(30);
                mProgressbar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void startApp() {
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
