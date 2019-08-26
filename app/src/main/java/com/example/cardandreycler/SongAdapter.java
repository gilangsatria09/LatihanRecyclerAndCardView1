package com.example.cardandreycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {
    private List<Song> songList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvRank, tvSongName, tvSinger, tvYear;
        public ImageView ivAlbumCover;

        public ViewHolder(View v) {
            super(v);
            tvRank = (TextView) v.findViewById(R.id.tv_rank);
            tvSinger = (TextView) v.findViewById(R.id.tv_singer);
            tvSongName = (TextView) v.findViewById(R.id.tv_song_name);
            tvYear = (TextView) v.findViewById(R.id.tv_year);
            ivAlbumCover = (ImageView) v.findViewById(R.id.iv_album_cover);
        }

    }

    public SongAdapter(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_song_list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(SongAdapter.ViewHolder viewHolder, int position) {
        Song song = songList.get(position);
        viewHolder.tvRank.setText(String.valueOf(song.getRank()));
        viewHolder.tvSongName.setText(String.valueOf(song.getName()));
        viewHolder.tvSinger.setText(String.valueOf(song.getSinger()));
        viewHolder.tvYear.setText(String.valueOf(song.getYear()));
        viewHolder.ivAlbumCover.setImageResource(song.getPic());
        viewHolder.tvYear.setText("2016");
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

}
