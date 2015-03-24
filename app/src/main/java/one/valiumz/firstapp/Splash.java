package one.valiumz.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

    protected void onCreate(Bundle Splashscreen) {
        super.onCreate(Splashscreen);
        setContentView(R.layout.splash);
        Thread t = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                } catch (InterruptedException e){
                        e.printStackTrace();
                }finally {
                    Intent openStartingPoint = new Intent("one.valiumz.firstapp.STARTINGPOINT");
                    startActivity(openStartingPoint);
                }
                }
            };
            t.start();
        }
        }

