package ru.mail.krivonos.al.lesson.one.impl;

import ru.mail.krivonos.al.lesson.one.AlbumService;
import ru.mail.krivonos.al.lesson.one.model.Album;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AlbumServiceImpl implements AlbumService {

    private static AlbumService instance;

    private AlbumServiceImpl() {
    }

    public static AlbumService getInstance() {
        if (instance == null) {
            instance = new AlbumServiceImpl();
        }
        return instance;
    }

    @Override
    public List<String> getTracksWithBiggerLength(Collection<Album> albums, int lengthBorder) {
        return albums.stream()
                .map(album -> album.getTracks().stream()
                        .filter(track -> track.getDuration() > lengthBorder)
                        .map(track -> album.getName() + "-" + track.getName() + "-" + track.getDuration())
                        .collect(Collectors.toList()))
                .reduce((strings, strings2) -> {
                    strings.addAll(strings2);
                    return strings;
                })
                .orElse(Collections.emptyList());
    }
}
