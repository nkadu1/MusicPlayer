package io.theorem.albums.service;

import java.util.List;

import io.theorem.albums.entity.Song;

public interface SongService {

	List<Song> findAllSongs();

	Song updateSong(String songId,Song song);

	void delete(String songId);

	Song createSong(Song mv);
	Song findSongById(String songId);
	
	
	
}
