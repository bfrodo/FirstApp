package one.valiumz.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

    MediaPlayer ourSong;

    protected void onCreate(Bundle Splashscreen) {
        super.onCreate(Splashscreen);
        setContentView(R.layout.splash);
        ourSong = MediaPlayer.create(Splash.this, R.mipmap.dragonbite);
        Thread t = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                    ourSong.start();
                    sleep(3000);

                } catch (InterruptedException e){
                        e.printStackTrace();
                }finally {
                    Intent openStartingPoint = new Intent("one.valiumz.firstapp.menu");
                    startActivity(openStartingPoint);
                }
                }
            };
            t.start();
        }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }
}

