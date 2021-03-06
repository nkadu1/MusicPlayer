package io.theorem.albums.service;

import java.util.List;

import io.theorem.albums.entity.Song;

public interface SongService {

	List<Song> findAllSongs(String albumId);

	Song  updateSong(Song song);

	void delete(Song song);
	Song  createSong(Song song);
	Song findSongById(String songId);
	
}
