package com.ebglobalventures.horizontal_recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> imageUrls=new ArrayList<>();
    private ArrayList<String> text=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImages();

    }
    private void initImages(){
        imageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        text.add("Havasu Falls");

        imageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        text.add("Trondheim");

        imageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        text.add("Portugal");

        imageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        text.add("Rocky Mountain National Park");


        imageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        text.add("Mahahual");

        imageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        text.add("Frozen Lake");


        imageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        text.add("White Sands Desert");

        imageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        text.add("Austrailia");

        imageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        text.add("Washington");
        initRecyclerView();
        }

        private void initRecyclerView(){

           //LinearLayout
            LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
            RecyclerView recyclerView=findViewById(R.id.recyclerview);
            recyclerView.setLayoutManager(linearLayoutManager);
            //RecyclerViewAdapter Class
            RecyclerViewAdapter adp=new RecyclerViewAdapter(imageUrls,text,this);
            recyclerView.setAdapter(adp);
        }



}
