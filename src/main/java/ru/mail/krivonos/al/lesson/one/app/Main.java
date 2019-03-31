package ru.mail.krivonos.al.lesson.one.app;

import ru.mail.krivonos.al.lesson.one.AlbumService;
import ru.mail.krivonos.al.lesson.one.AlbumsGenerator;
import ru.mail.krivonos.al.lesson.one.impl.AlbumServiceImpl;
import ru.mail.krivonos.al.lesson.one.impl.AlbumsGeneratorImpl;
import ru.mail.krivonos.al.lesson.one.model.Album;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AlbumsGenerator albumsGenerator = AlbumsGeneratorImpl.getInstance();
        List<Album> albums = albumsGenerator.getAlbums(10, 5, 20, 60);
        AlbumService albumService = AlbumServiceImpl.getInstance();
        List<String> tracksWithBiggerLength = albumService.getTracksWithBiggerLength(albums, 50);
        System.out.println(tracksWithBiggerLength);
    }
}
