package ru.mail.krivonos.al.lesson.one;

import ru.mail.krivonos.al.lesson.one.model.Album;

import java.util.Collection;
import java.util.List;

public interface AlbumService {

    List<String> getTracksWithBiggerLength(Collection<Album> albums, int lengthBorder);
}
