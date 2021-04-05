package com.example.mainactivity1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends Activity {

    TextView txtResult;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView)findViewById(R.id.txtResult);
    }

    public void mOnPopupClick(View v){
        Intent intent = new Intent(this, sub1.class);
        intent.putExtra("data", "Test Popup");
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("result");
                txtResult.setText(result);

                EditText editText = (EditText) findViewById(R.id.editText) ;
                String strText = editText.getText().toString() ;
            }
        }
    }
}

