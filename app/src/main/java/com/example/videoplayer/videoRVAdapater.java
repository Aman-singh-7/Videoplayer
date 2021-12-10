package com.example.videoplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class videoRVAdapater extends RecyclerView.Adapter<videoRVAdapater.viewHolder> {
    public videoRVAdapater(@NonNull ArrayList<VideoRVModal> videoRVModalArrayList, Context context, VideoClickInterface videoClickInterface) {
        this.videoRVModalArrayList = videoRVModalArrayList;
        this.context = context;
        this.videoClickInterface = videoClickInterface;
    }

    @NonNull

    private ArrayList<VideoRVModal> videoRVModalArrayList;
    private Context context;
    private  VideoClickInterface videoClickInterface;
    @Override
    public viewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_rv_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  videoRVAdapater.viewHolder holder, int position) {
        VideoRVModal videoRVModal=videoRVModalArrayList.get(position);
        holder.thumbNailIV.setImageBitmap(videoRVModal.getThumbNail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoClickInterface.onVideoClick(position);

            }
        });


    }

    @Override
    public int getItemCount() {
        return videoRVModalArrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private ImageView thumbNailIV;
        public viewHolder(@NonNull  View itemView) {
            super(itemView);
            thumbNailIV=itemView.findViewById(R.id.id_IV_thumbNail);
        }
    }
    public interface VideoClickInterface{
        void onVideoClick(int position);

    }
}
