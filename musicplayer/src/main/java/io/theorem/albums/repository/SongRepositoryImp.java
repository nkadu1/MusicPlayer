package io.theorem.albums.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import io.theorem.albums.entity.Song;

public class SongRepositoryImp implements SongRepository {
	@PersistenceContext
	private EntityManager em;

	public List<Song> findAllSongs() {
		TypedQuery<Song> query = em.createNamedQuery("Song.findAll", Song.class);
		return query.getResultList();
	}

	public List<Song> updateSong(List<Song> song) {

		for (Song songs : song) {
			em.merge(songs);
		}
		return song;
	}

	public void delete(List<Song> song) {
		for (Song songs : song) {
			em.remove(songs);
		}
	}

	public List<Song> createSong(List<Song> song) {
		for (Song songs : song) {
			em.persist(songs);
		}
		return song;
	}

	public Song findSongById(String songId) {
		Song song = em.find(Song.class, songId);
		if (song != null)
			return song;
		else
			return null;
	}

}
