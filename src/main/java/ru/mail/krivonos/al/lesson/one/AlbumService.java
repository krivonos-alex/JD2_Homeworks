package ru.mail.krivonos.al.lesson.one;

import ru.mail.krivonos.al.lesson.one.model.Album;
import ru.mail.krivonos.al.lesson.one.model.Track;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public interface AlbumService {

    List<String> getTracksWithBiggerLength(Collection<Album> albums, int lengthBorder);

    List<String> getTracksByCondition(Collection<Album> albums, Predicate<Track> predicate);
}
