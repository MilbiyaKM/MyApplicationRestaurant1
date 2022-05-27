package com.emmu.myapplicationrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ThirdPage<i> extends AppCompatActivity {
     Button b1,b2;
     Intent intent;
     int iconList[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);

        intent=getIntent();
        int i=intent.getExtras().getInt("id");
        CustomGrid.ImageAdapter imageAdapter=new CustomGrid.ImageAdapter(this);
        ImageView imageView=(ImageView)findViewById(R.id.imageView2);

        imageView.setImageResource(imageAdapter.iconList[i]);

    }

    public void gotoswiggy(View view) {

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.swiggy.com"));
        startActivity(intent);
    }

    public void gotozomzto(View view) {

        Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.zomato.com"));
        startActivity(i);
    }
}