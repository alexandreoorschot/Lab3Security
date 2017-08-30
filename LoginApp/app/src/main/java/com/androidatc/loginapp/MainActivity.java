package com.androidatc.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void submitInfo (View v) {
        Intent intent = new Intent();
        intent.putExtra("Username", e1.getText().toString());
        intent.putExtra("Password", e2.getText().toString());
        intent.setAction("testlogin");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);

    }
}
