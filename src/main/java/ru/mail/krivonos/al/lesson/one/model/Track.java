package ru.mail.krivonos.al.lesson.one.model;

public class Track {

    private String name;

    private Integer duration;

    public Track(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }
}
