package com.ebglobalventures.horizontal_recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.HorizontalViewholder>{

    //DataStructures
    private ArrayList<String> adapterImages=new ArrayList<>();
    private ArrayList<String> adapterText=new ArrayList<>();
    Context mContext;

    public RecyclerViewAdapter(ArrayList<String> adapterImages, ArrayList<String> adapterText, Context mContext) {
        this.adapterImages = adapterImages;
        this.adapterText = adapterText;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public HorizontalViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_view,parent,false);
        HorizontalViewholder hvh=new HorizontalViewholder(view);
        return hvh;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewholder holder, final int position) {
        //Image
        Glide.with(mContext).asBitmap().load(adapterImages.get(position)).into(holder.viewholderImageView);
        //Text
        holder.viewholderTextView.setText(adapterText.get(position));
        //OnClickListner
        holder.viewholderImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,adapterText.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return adapterImages.size();
    }

    public class HorizontalViewholder extends RecyclerView.ViewHolder{
      CircleImageView viewholderImageView;
      TextView viewholderTextView;

    public HorizontalViewholder(View itemView) {
        super(itemView);
        viewholderImageView=itemView.findViewById(R.id.image);
        viewholderTextView=itemView.findViewById(R.id.text);
    }
}
}
