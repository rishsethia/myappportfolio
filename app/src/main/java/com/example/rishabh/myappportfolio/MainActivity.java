package com.example.rishabh.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void toastDisplay(View view){
        String toastMessage;
        switch(view.getId()){
            case R.id.button1 :
                toastMessage = "This button will launch  spotify streamer app";
                break;
            case R.id.button2 :
                toastMessage = "This button will launch  Scores app";
                break;
            case R.id.button3 :
                toastMessage = "This button will launch  Library app";
                break;
            case R.id.button4 :
                toastMessage = "This button will launch  build it bigger app";
                break;
            case R.id.button5 :
                toastMessage = "This button will launch  XYZ reader app";
                break;
            case R.id.button6 :
                toastMessage = "This button will launch my own capstone app";
                break;
            default:
                toastMessage = "Oops something went wrong!";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,toastMessage,duration);
        toast.show();
    }
}
