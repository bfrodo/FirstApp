package one.valiumz.firstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FumbleRoller extends ActionBarActivity {

    Random counter = new Random();
    Button melee,ranged,magic;
    TextView displaytype, displayeffect, displayroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_point);

        melee = (Button) findViewById(R.id.button1);
        ranged = (Button) findViewById(R.id.button2);
        magic = (Button) findViewById(R.id.button3);

        displaytype = (TextView) findViewById(R.id.tvtype);
        displayeffect = (TextView) findViewById(R.id.tveffect);
        displayroll = (TextView) findViewById(R.id.tvroll);


        melee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = counter.nextInt(100);
                displayroll.setText("You Roll is:"+n);

                if (n>=1 & n<=5){
                    String type = getResources().getString(R.string.MR1);
                    String effect = getResources().getString(R.string.ME1);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=6 & n<=10){
                    String type = getResources().getString(R.string.MR2);
                    String effect = getResources().getString(R.string.ME2);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=11 & n<=15){
                    String type = getResources().getString(R.string.MR3);
                    String effect = getResources().getString(R.string.ME3);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=16 & n<=20){
                    String type = getResources().getString(R.string.MR4);
                    String effect = getResources().getString(R.string.ME4);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=21 & n<=25){
                    String type = getResources().getString(R.string.MR5);
                    String effect = getResources().getString(R.string.ME5);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=26 & n<=29){
                    String type = getResources().getString(R.string.MR6);
                    String effect = getResources().getString(R.string.ME6);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=30 & n<=33){
                    String type = getResources().getString(R.string.MR7);
                    String effect = getResources().getString(R.string.ME7);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=34 & n<=37){
                    String type = getResources().getString(R.string.MR8);
                    String effect = getResources().getString(R.string.ME8);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=38 & n<=42){
                    String type = getResources().getString(R.string.MR9);
                    String effect = getResources().getString(R.string.ME9);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=43 & n<=47){
                    String type = getResources().getString(R.string.MR10);
                    String effect = getResources().getString(R.string.ME10);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=48 & n<=52){
                    String type = getResources().getString(R.string.MR11);
                    String effect = getResources().getString(R.string.ME11);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=53 & n<=57){
                    String type = getResources().getString(R.string.MR12);
                    String effect = getResources().getString(R.string.ME12);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=58 & n<=62){
                    String type = getResources().getString(R.string.MR13);
                    String effect = getResources().getString(R.string.ME13);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=63 & n<=66){
                    String type = getResources().getString(R.string.MR14);
                    String effect = getResources().getString(R.string.ME14);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=67 & n<=70){
                    String type = getResources().getString(R.string.MR15);
                    String effect = getResources().getString(R.string.ME15);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=71 & n<=72){
                    String type = getResources().getString(R.string.MR16);
                    String effect = getResources().getString(R.string.ME16);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=73 & n<=76){
                    String type = getResources().getString(R.string.MR17);
                    String effect = getResources().getString(R.string.ME17);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=77 & n<=80){
                    String type = getResources().getString(R.string.MR18);
                    String effect = getResources().getString(R.string.ME18);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=81 & n<=84){
                    String type = getResources().getString(R.string.MR19);
                    String effect = getResources().getString(R.string.ME19);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=85 & n<=87){
                    String type = getResources().getString(R.string.MR20);
                    String effect = getResources().getString(R.string.ME20);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=88 & n<=91){
                    String type = getResources().getString(R.string.MR21);
                    String effect = getResources().getString(R.string.ME21);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=92 & n<=95){
                    String type = getResources().getString(R.string.MR22);
                    String effect = getResources().getString(R.string.ME22);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=96 & n<=99){
                    String type = getResources().getString(R.string.MR23);
                    String effect = getResources().getString(R.string.ME23);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n == 0){
                    String type = getResources().getString(R.string.MR24);
                    String effect = getResources().getString(R.string.ME24);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}


            }
        });
        ranged.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = counter.nextInt(100);
                displayroll.setText("You Roll is:"+n);
                if (n>=1 & n<=5){
                    String type = getResources().getString(R.string.RR1);
                    String effect = getResources().getString(R.string.RE1);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=6 & n<=10){
                    String type = getResources().getString(R.string.RR2);
                    String effect = getResources().getString(R.string.RE2);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=11 & n<=15){
                    String type = getResources().getString(R.string.RR3);
                    String effect = getResources().getString(R.string.RE3);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=16 & n<=20){
                    String type = getResources().getString(R.string.RR4);
                    String effect = getResources().getString(R.string.RE4);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=21 & n<=25){
                    String type = getResources().getString(R.string.RR5);
                    String effect = getResources().getString(R.string.RE5);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=26 & n<=31){
                    String type = getResources().getString(R.string.RR6);
                    String effect = getResources().getString(R.string.RE6);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=32 & n<=37){
                    String type = getResources().getString(R.string.RR7);
                    String effect = getResources().getString(R.string.RE7);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=38 & n<=43){
                    String type = getResources().getString(R.string.RR8);
                    String effect = getResources().getString(R.string.RE8);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=44 & n<=49){
                    String type = getResources().getString(R.string.RR9);
                    String effect = getResources().getString(R.string.RE9);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=50 & n<=54){
                    String type = getResources().getString(R.string.RR10);
                    String effect = getResources().getString(R.string.RE10);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=55 & n<=60){
                    String type = getResources().getString(R.string.RR11);
                    String effect = getResources().getString(R.string.RE11);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=61 & n<=66){
                    String type = getResources().getString(R.string.RR12);
                    String effect = getResources().getString(R.string.RE12);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=67 & n<=70){
                    String type = getResources().getString(R.string.RR13);
                    String effect = getResources().getString(R.string.RE13);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=71 & n<=74){
                    String type = getResources().getString(R.string.RR14);
                    String effect = getResources().getString(R.string.RE14);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=75 & n<=76){
                    String type = getResources().getString(R.string.RR15);
                    String effect = getResources().getString(R.string.RE15);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=77 & n<=80){
                    String type = getResources().getString(R.string.RR16);
                    String effect = getResources().getString(R.string.RE16);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=81 & n<=84){
                    String type = getResources().getString(R.string.RR17);
                    String effect = getResources().getString(R.string.RE17);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=85 & n<=87){
                    String type = getResources().getString(R.string.RR18);
                    String effect = getResources().getString(R.string.RE18);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=88 & n<=91){
                    String type = getResources().getString(R.string.RR19);
                    String effect = getResources().getString(R.string.RE19);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=92 & n<=95){
                    String type = getResources().getString(R.string.RR20);
                    String effect = getResources().getString(R.string.RE20);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=96 & n<=99){
                    String type = getResources().getString(R.string.RR21);
                    String effect = getResources().getString(R.string.RE21);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n==0){
                    String type = getResources().getString(R.string.RR22);
                    String effect = getResources().getString(R.string.RE22);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
            }
        });
        magic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = counter.nextInt(100);
                displayroll.setText("You Roll is:"+n);
                if (n>=1 & n<=5){
                    String type = getResources().getString(R.string.SR1);
                    String effect = getResources().getString(R.string.SE1);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=6 & n<=10){
                    String type = getResources().getString(R.string.SR2);
                    String effect = getResources().getString(R.string.SE2);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=11 & n<=14){
                    String type = getResources().getString(R.string.SR3);
                    String effect = getResources().getString(R.string.SE3);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=15 & n<=19){
                    String type = getResources().getString(R.string.SR4);
                    String effect = getResources().getString(R.string.SE4);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=20 & n<=24){
                    String type = getResources().getString(R.string.SR5);
                    String effect = getResources().getString(R.string.SE5);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=25 & n<=28){
                    String type = getResources().getString(R.string.SR6);
                    String effect = getResources().getString(R.string.SE6);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=29 & n<=33){
                    String type = getResources().getString(R.string.SR7);
                    String effect = getResources().getString(R.string.SE7);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=34 & n<=37){
                    String type = getResources().getString(R.string.SR8);
                    String effect = getResources().getString(R.string.SE8);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=38 & n<=41){
                    String type = getResources().getString(R.string.SR9);
                    String effect = getResources().getString(R.string.SE9);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=42 & n<=45){
                    String type = getResources().getString(R.string.SR10);
                    String effect = getResources().getString(R.string.SE10);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=46 & n<=50){
                    String type = getResources().getString(R.string.SR11);
                    String effect = getResources().getString(R.string.SE11);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=51 & n<=55){
                    String type = getResources().getString(R.string.SR12);
                    String effect = getResources().getString(R.string.SE12);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=56 & n<=60){
                    String type = getResources().getString(R.string.SR13);
                    String effect = getResources().getString(R.string.SE13);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=61 & n<=65){
                    String type = getResources().getString(R.string.SR14);
                    String effect = getResources().getString(R.string.SE14);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=66 & n<=70){
                    String type = getResources().getString(R.string.SR15);
                    String effect = getResources().getString(R.string.SE15);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=71 & n<=75){
                    String type = getResources().getString(R.string.SR16);
                    String effect = getResources().getString(R.string.SE16);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=76 & n<=77){
                    String type = getResources().getString(R.string.SR17);
                    String effect = getResources().getString(R.string.SE17);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=78 & n<=82){
                    String type = getResources().getString(R.string.SR18);
                    String effect = getResources().getString(R.string.SE18);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=83 & n<=87){
                    String type = getResources().getString(R.string.SR19);
                    String effect = getResources().getString(R.string.SE19);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=88 & n<=91){
                    String type = getResources().getString(R.string.SR20);
                    String effect = getResources().getString(R.string.SE20);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=92 & n<=95){
                    String type = getResources().getString(R.string.SR21);
                    String effect = getResources().getString(R.string.SE21);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n>=96 & n<=99){
                    String type = getResources().getString(R.string.SR22);
                    String effect = getResources().getString(R.string.SE22);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
                if (n==0){
                    String type = getResources().getString(R.string.SR23);
                    String effect = getResources().getString(R.string.SE23);
                    displaytype.setText(type);
                    displayeffect.setText(effect);}
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_starting_point, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
