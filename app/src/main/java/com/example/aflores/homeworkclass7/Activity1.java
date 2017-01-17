package com.example.aflores.homeworkclass7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity1 extends AppCompatActivity {

    ImageView iView1, iView2, iView3, iView4, iView5, iView6, iView7, iView8, iView9, iView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        iView1 = (ImageView) findViewById(R.id.imageView1);
        iView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Activity1.this, Activity2.class );
                startActivity(i);
            }
        });

        iView2 = (ImageView) findViewById(R.id.imageView2);
        iView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Activity1.this, Activity2.class );
                startActivity(i);
            }
        });

        iView3 = (ImageView) findViewById(R.id.imageView3);
        iView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Activity1.this, Activity2.class );
                startActivity(i);
            }
        });

        iView4 = (ImageView) findViewById(R.id.imageView4);
        iView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Activity1.this, Activity2.class );
                startActivity(i);
            }
        });

        iView5 = (ImageView) findViewById(R.id.imageView5);
        iView5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Activity1.this, Activity2.class );
                startActivity(i);
            }
        });

        iView6 = (ImageView) findViewById(R.id.imageView6);
        iView6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Activity1.this, Activity2.class );
                startActivity(i);
            }
        });

        iView7 = (ImageView) findViewById(R.id.imageView7);
        iView7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Activity1.this, Activity2.class );
                startActivity(i);
            }
        });

        iView8 = (ImageView) findViewById(R.id.imageView8);
        iView8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Activity1.this, Activity2.class );
                startActivity(i);
            }
        });

        iView9 = (ImageView) findViewById(R.id.imageView9);
        iView9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Activity1.this, Activity2.class );
                startActivity(i);
            }
        });

        iView10 = (ImageView) findViewById(R.id.imageView10);
        iView10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Activity1.this, Activity2.class );
                startActivity(i);
            }
        });
    }
}
