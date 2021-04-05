package com.example.mainactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sub1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

            }



    public void mOnPopupClick(View v){
        Intent intent = new Intent(this, popupactivity.class);
        intent.putExtra("data", "Test Popup");
        startActivity(intent);


    }
}