package com.android.priya.client;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    public void onClick(View view){
        if(view.getId()==R.id.button)
        {
            Intent i1=new Intent(StartActivity.this,MainActivity.class);
            startActivity(i1);
        }
        if(view.getId()==R.id.button2)
        {
            Intent i2=new Intent(StartActivity.this,PlayerActivity.class);
            startActivity(i2);
        }
       /* if(view.getId()==R.id.button3)
        {
            Intent i3=new Intent(StartActivity.this,Activity.class);
            startActivity(i3);
        }*/
    }
}
