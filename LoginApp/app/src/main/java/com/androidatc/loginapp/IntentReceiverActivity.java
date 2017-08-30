package com.androidatc.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;


public class IntentReceiverActivity extends Activity {
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_receiver);

        Bundle bundle = getIntent().getExtras();
        String result1 = bundle.getString("Username");
        String result2 = bundle.getString("Password");
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t1.setText("Username:" + result1);
        t2.setText("Password:" + result2);
        Log.d("Username", result1);
        Log.d("Password", result2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.intent_receiver, menu);
        return true;
    }
}
