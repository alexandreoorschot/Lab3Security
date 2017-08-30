package com.androidatc.hackapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String message = "Username: " + this.getIntent().getStringExtra("Username") + "\nPassword: " + this.getIntent().getStringExtra("Password");
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Sensitive data was accessed!").setMessage(message).setCancelable(false).setNegativeButton("OK", new DialogInterface.OnClickListener(){
           public void onClick(DialogInterface dialog, int id){
               dialog.cancel();
           }
        });
        alertDialogBuilder.create().show();
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
