package io.theorem.albums.service;

import java.util.List;

import io.theorem.albums.entity.Song;

public interface SongService {

	List<Song> findAllSongs();

	List<Song>  updateSong(List<Song> songs);

	void delete(List<Song> songs);

	List<Song>  createSong(List<Song> songs);
	Song findSongById(String songId);
	
	
	
}
