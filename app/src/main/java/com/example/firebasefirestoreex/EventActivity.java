package com.example.firebasefirestoreex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class EventActivity extends AppCompatActivity {


    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_layout);

        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        tb.setSubtitle("Firestore");

        fm = getSupportFragmentManager();
        addEventFrgmt();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_event_m:
                addEventFrgmt();
                return true;
            case R.id.view_events_m:
                viewEventsFrgmt();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void addEventFrgmt(){
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.events_content, new AddEventFragment());
        ft.commit();
    }
    public void viewEventsFrgmt(){
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.events_content, new ViewEventsFragment());
        ft.commit();
    }

}
