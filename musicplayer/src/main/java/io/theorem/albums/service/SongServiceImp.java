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

	public List<Song> updateSong(List<Song> songs) {
		return songrepository.updateSong(songs);
	}

	public void delete(List<Song> songs) {
		songrepository.delete(songs);
	}

	public List<Song>  createSong(List<Song> songs) {
		return songrepository.createSong(songs);
	}

	public Song findSongById(String songId) {
		return songrepository.findSongById(songId);
	}
}
