package com.sodanicejune.testsnap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void scanSnap(View view){
        Button snap = (Button) this.findViewById ( R.id.snap );
        Intent intent = new Intent(MainActivity.this,FullScreenViewActivity.class);

        startActivityForResult(intent,1);

    }
}
