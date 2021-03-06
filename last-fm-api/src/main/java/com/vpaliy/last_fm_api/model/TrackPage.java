package com.vpaliy.last_fm_api.model;

import com.google.gson.annotations.SerializedName;
import com.vpaliy.last_fm_api.Adapter;

import java.util.List;

public class TrackPage implements Adapter.PostProcessable{

    public List<Track> track;

    @SerializedName("@attr")
    private PageInfo info;

    public int page;
    public int perPage;
    public int totalPages;
    public int total;
    public String country;
    public String artist;
    public String user;

    public class PageInfo {
        public int page;
        public int perPage;
        public int totalPages;
        public int total;
        public String country;
        public String artist;
        public String user;
    }

    @Override
    public void postProcess() {
        if(info!=null){
            this.page=info.page;
            this.perPage=info.perPage;
            this.totalPages=info.totalPages;
            this.total=info.total;
            this.country=info.country;
            this.artist=info.artist;
            this.user=info.user;
        }
    }
}
