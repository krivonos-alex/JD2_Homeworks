package ru.mail.krivonos.al.lesson.one.app;

import ru.mail.krivonos.al.lesson.one.AlbumService;
import ru.mail.krivonos.al.lesson.one.AlbumsGenerator;
import ru.mail.krivonos.al.lesson.one.impl.AlbumServiceImpl;
import ru.mail.krivonos.al.lesson.one.impl.AlbumsGeneratorImpl;
import ru.mail.krivonos.al.lesson.one.model.Album;
import ru.mail.krivonos.al.lesson.one.model.Track;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        AlbumsGenerator albumsGenerator = AlbumsGeneratorImpl.getInstance();
        int albumsQuantity = 10;
        int trackQuantity = 5;
        int minTrackLength = 20;
        int maxTrackLength = 60;
        List<Album> albums = albumsGenerator.getAlbums(albumsQuantity, trackQuantity, minTrackLength, maxTrackLength);
        AlbumService albumService = AlbumServiceImpl.getInstance();
        int lengthBorder = 50;
        List<String> tracksWithBiggerLength = albumService.getTracksWithBiggerLength(albums, lengthBorder);
        System.out.println(tracksWithBiggerLength);
        System.out.println();

        Predicate<Track> predicate = track -> track.getLength() > lengthBorder;
        List<String> tracksByCondition = albumService.getTracksByCondition(albums, predicate);
        System.out.println(tracksByCondition);
    }
}
