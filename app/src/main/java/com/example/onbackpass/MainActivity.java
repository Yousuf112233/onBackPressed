package com.example.onbackpass;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
       // super.onBackPressed();



        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Confirm Exit!!!")
                .setMessage("Do you really want to exit")
                .setIcon(R.drawable.app_1088029)
                .setCancelable(false)
                .setNegativeButton("No thanks", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveButton("Yes Exit!!!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finishAndRemoveTask();
                    }
                })
                .show();


    }
}