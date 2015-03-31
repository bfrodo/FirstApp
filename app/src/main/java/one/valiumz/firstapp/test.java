package one.valiumz.firstapp;


import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class test extends Activity {

    @Override
    protected void onCreate(Bundle test) {
        super.onCreate(test);
        setContentView(R.layout.test);

        Button chkCmd = (Button) findViewById(R.id.buttonresults);
        final ToggleButton passTog = (ToggleButton) findViewById(R.id.tgButton);
        final EditText input = (EditText) findViewById(R.id.etCommands);
        TextView display = (TextView) findViewById(R.id.tvresults);

        passTog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (passTog.isChecked()) {
                    input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
                else{
                    input.setInputType(InputType.TYPE_CLASS_TEXT);
                }

                }
        });
    }
}