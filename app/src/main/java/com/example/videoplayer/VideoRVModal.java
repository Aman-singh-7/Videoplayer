package com.example.videoplayer;

import android.graphics.Bitmap;

public class VideoRVModal {
    private String videoName;
    private String videoPath;
    private Bitmap thumbNail;

    public VideoRVModal(String videoName, String videoPath, Bitmap thumbNail) {
        this.videoName = videoName;
        this.videoPath = videoPath;
        this.thumbNail = thumbNail;
    }

    public String getVideoName() {
        return videoName;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public Bitmap getThumbNail() {
        return thumbNail;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public void setThumbNail(Bitmap thumbNail) {
        this.thumbNail = thumbNail;
    }
}
