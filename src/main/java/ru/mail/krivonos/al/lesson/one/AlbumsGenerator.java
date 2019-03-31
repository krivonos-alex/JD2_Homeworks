package ru.mail.krivonos.al.lesson.one;

import ru.mail.krivonos.al.lesson.one.model.Album;

import java.util.List;

public interface AlbumsGenerator {

    List<Album> getAlbums(int albumsQuantity, int trackQuantity, int minTrackLength, int maxTrackLength);
}
