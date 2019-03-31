package ru.mail.krivonos.al.lesson.one.impl;

import ru.mail.krivonos.al.lesson.one.AlbumsGenerator;
import ru.mail.krivonos.al.lesson.one.model.Album;
import ru.mail.krivonos.al.lesson.one.model.Track;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlbumsGeneratorImpl implements AlbumsGenerator {

    private static final String ALBUM_TEST_NAME = "AlbumName";

    private static final String TRACK_TEST_NAME = "TrackName";

    private Random random = new Random();

    private static AlbumsGenerator instance;

    private AlbumsGeneratorImpl() {
    }

    public static AlbumsGenerator getInstance() {
        if (instance == null) {
            instance = new AlbumsGeneratorImpl();
        }
        return instance;
    }

    public List<Album> getAlbums(int albumsQuantity, int trackQuantity, int minTrackLength, int maxTrackLength) {
        if (isValidArguments(albumsQuantity, trackQuantity, minTrackLength, maxTrackLength)) {
            List<Album> albums = new ArrayList<>();
            for (int i = 0; i < albumsQuantity; i++) {
                List<Track> tracks = getTracks(trackQuantity, minTrackLength, maxTrackLength);
                Album album = new Album(ALBUM_TEST_NAME + i, tracks);
                albums.add(album);
            }
            return albums;
        } else {
            throw new IllegalArgumentException("One or more arguments have illegal value!");
        }
    }

    private List<Track> getTracks(int trackQuantity, int minTrackLength, int maxTrackLength) {
        List<Track> tracks = new ArrayList<>();
        for (int i = 0; i < trackQuantity; i++) {
            int duration = random.nextInt(maxTrackLength - minTrackLength + 1) + minTrackLength;
            Track track = new Track(TRACK_TEST_NAME + i, duration);
            tracks.add(track);
        }
        return tracks;
    }

    private boolean isValidArguments(int albumsQuantity, int trackQuantity, int minTrackLength, int maxTrackLength) {
        if (albumsQuantity < 0 || trackQuantity < 0 || minTrackLength < 0 || maxTrackLength < 0) {
            return false;
        }
        return minTrackLength <= maxTrackLength;
    }
}
