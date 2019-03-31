package ru.mail.krivonos.al.lesson.one.model;

import java.util.Collection;

public class Album {

    private String name;

    private Collection<Track> tracks;

    public Album(String name, Collection<Track> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public Collection<Track> getTracks() {
        return tracks;
    }
}
