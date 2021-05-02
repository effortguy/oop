package com.effortguy.oop.song;

public class PersonalPlayList extends PlayList {
    public void remove(Song song) {
        getTracks().remove(song);
        getSingers().remove(song.getSinger());
    }
}
