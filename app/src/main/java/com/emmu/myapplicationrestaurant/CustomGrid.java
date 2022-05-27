package com.emmu.myapplicationrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomGrid extends AppCompatActivity {

    GridView simplelist;
    ArrayList iconList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid);
        simplelist=(GridView) findViewById(R.id.simplegrid);
        iconList.add(new Item("Burger",R.drawable.burger_icon));
        iconList.add(new Item("CocaCola",R.drawable.cocacola_icon));
        iconList.add(new Item("Coffee",R.drawable.coffe_icon));
        iconList.add(new Item("Donut",R.drawable.donut_icon));
        iconList.add(new Item("Steak",R.drawable.steak));
        iconList.add(new Item("Drinks",R.drawable.drinks_icon));


        MyAdapter myAdapter=new MyAdapter(this,R.layout.grid_view_items,iconList);
        simplelist.setAdapter(myAdapter);

    simplelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            int imageicon;
            Intent intent =new Intent(getApplicationContext(),ThirdPage.class);
            intent.putExtra("id",i);

            startActivity(intent);
        }
    });
    }
    public static class ImageAdapter extends BaseAdapter{
        private Context mContext;

        public int[] iconList ={R.drawable.burger_icon,R.drawable.cocacola_icon,R.drawable.coffe_icon,R.drawable.donut_icon,R.drawable.steak,R.drawable.drinks_icon};


        public  ImageAdapter(Context c) {
            mContext=c;
        }

        @Override
        public int getCount() {
            return iconList.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView;
            if(view==null){

                imageView=new ImageView(mContext);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(130,130));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(16,16,16,16);


            }else{
                imageView=(ImageView) view;
            }
            imageView.setImageResource((Integer) iconList[i]);
            return imageView;
        }
    }
}