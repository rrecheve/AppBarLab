package es.unex.giiis.asee.appbarlab;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //TODO Inflate the menu; this adds items to the action bar if it is present.
        // Inflate the menu; this adds items to the action bar if it is present.


        //TODO Set up ShareActionProvider


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        switch (item.getItemId()) {

            //TODO add action_new

            case R.id.action_refresh:
                openRefresh();
                return true;
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void openNew(){
        //TODO start ActivityNew

    }

    private void openRefresh(){
        CharSequence text = "Refreshing...";
        int duration = Snackbar.LENGTH_SHORT;

        Snackbar.make(mToolbar, text, duration)
                        .setAction("Action", null).show();
    }

    private void openSearch(){
        CharSequence text = "Searching...";
        int duration = Snackbar.LENGTH_SHORT;

        Snackbar.make(mToolbar, text, duration)
                .setAction("Action", null).show();
    }

    private void openSettings(){
        CharSequence text = "Settings...";
        int duration = Snackbar.LENGTH_SHORT;

        Snackbar.make(mToolbar, text, duration)
                .setAction("Action", null).show();
    }

    private Intent getDefaultIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("image/*");
        return intent;
    }
}
