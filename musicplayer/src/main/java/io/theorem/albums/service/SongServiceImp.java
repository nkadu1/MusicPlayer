package io.theorem.albums.service;

import java.util.List;

import com.google.inject.Inject;

import io.theorem.albums.entity.Song;
import io.theorem.albums.repository.SongRepository;

public class SongServiceImp implements SongService{

	@Inject
	private SongRepository songrepository;
	
	public List<Song> findAllSongs() {
		
		return songrepository.findAllSongs();
	}

	public Song updateSong(String songId, Song mv) {
		return songrepository.updateSong(songId, mv);
	}

	public void delete(String songId) {
		Song song  =songrepository.findSongById(songId);
		songrepository.delete(song);
	}

	public Song createSong(Song mv) {
		return songrepository.createSong(mv);
	}

	public Song findSongById(String songId) {
		return songrepository.findSongById(songId);
	}

	



}
