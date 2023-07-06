package com.annadroid.playingwithtoolbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        //ActionBar actionBar = getSupportActionBar();
        // actionBar != null;
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.dog_house);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.cat)
            Toast.makeText(getApplicationContext(), "Cat", Toast.LENGTH_SHORT).show();
        if (item.getItemId() == R.id.dog)
            Toast.makeText(getApplicationContext(), "Dog", Toast.LENGTH_SHORT).show();
        return true;
    }
}
