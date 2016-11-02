package io.theorem.albums.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import io.theorem.albums.entity.Album;
import io.theorem.albums.entity.Song;

public class SongRepositoryImp implements SongRepository {
	@PersistenceContext
	private EntityManager em;

	public List<Song> findAllSongs(Album album) {

		TypedQuery<Song> query = em.createNamedQuery("Song.getSongs", Song.class);
		query.setParameter("album", album);
		List<Song> songs = query.getResultList();
		if (songs != null)
			return songs;
		else
			return null;
	}

	public Song updateSong(Song song) {
		
		em.merge(song);
		return song;
	}

	public void delete(Song song) {
		em.remove(song);

	}

	public Song createSong(Song song) {
		em.persist(song);
		return song;
	}

	public Song findSongById(String songId) {
		Song song = em.find(Song.class, songId);
		if (song != null)
			return song;
		else
			return null;
	}

	public Song findSongByAlbumId(String albumId) {
		Song song = em.find(Song.class, albumId);
		if (song != null)
			return song;
		else
			return null;
	}

}
