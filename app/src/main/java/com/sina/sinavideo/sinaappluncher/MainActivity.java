package com.sina.sinavideo.sinaappluncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.sina.sinavideo.sinaappluncherlib.SALDialogFragment;
import com.sina.sinavideo.sinaappluncherlib.SALEntryView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem item = menu.findItem(R.id.SAL_item);
        item.setActionView(new SALEntryView(this));
        return true;
    }
}
