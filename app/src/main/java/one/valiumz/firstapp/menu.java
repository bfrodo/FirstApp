package one.valiumz.firstapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class menu extends ListActivity{
    String classes[] = {"FumbleRoller", "test", "example2","example3", };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(menu.this,android.R.layout.simple_list_item_1,classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String choice = classes [position];
        try {
            Class ourClass = Class.forName("one.valiumz.firstapp." + choice);
            Intent ourIntent = new Intent(menu.this, ourClass);
            startActivity(ourIntent);
        } catch (ClassNotFoundException e){
            e.printStackTrace();}

    }
}
