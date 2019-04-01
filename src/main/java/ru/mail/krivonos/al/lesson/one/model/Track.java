package ru.mail.krivonos.al.lesson.one.model;

public class Track {

    private String name;

    private Integer length;

    public Track(String name, Integer length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public Integer getLength() {
        return length;
    }
}
