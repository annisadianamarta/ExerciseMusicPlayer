package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;


public class SongAdapter extends BaseAdapter {
    @Override
    public int getCount(){
        return songs.size();
    }
    @Override
    public Object getItem(int arg0){
        return null;
    }
    @Override
    public long getItemId(int arg0){
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LinearLayout songLay = (LinearLayout)songInf.inflate(R.layout.activity_song, parent, false);

        TextView songView = (TextView)songLay.findViewById(R.id.song_title);
        TextView artisView = (TextView)songLay.findViewById(R.id.song_artist);

        Song currSong = songs.get(position);
        songView.setText(currSong.getTittle());
        artisView.setText(currSong.getArtist());
        songLay.setTag(position);
        return songLay;
    }

    private ArrayList<Song> songs;
    private LayoutInflater songInf;

    public SongAdapter(Context c, ArrayList<Song> theSongs){
        songs = theSongs;
        songInf = LayoutInflater.from(c);
    }
}