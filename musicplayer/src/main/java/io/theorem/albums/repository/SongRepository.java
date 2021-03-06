package io.theorem.albums.repository;
import java.util.List;

import io.theorem.albums.entity.Album;
import io.theorem.albums.entity.Song;


public interface SongRepository {

	List<Song>  findAllSongs(Album  album);
	Song updateSong(Song song);
	void delete(Song song);
	Song createSong(Song song);
	Song findSongById(String songId);
	Song findSongByAlbumId(String albumId);
}
