package io.theorem.albums.repository;

import java.util.List;

import io.theorem.albums.entity.Album;

public interface AlbumRepository {

	List<Album> findAllAlbums();

	Album update(String albumId, Album mv);

	void delete(Album albumId);

	Album createAlbum(Album mv);
	Album findById(String albumId);
	List<Album> freeTextSearch(String freeText);
	public Album findByImdbId(String imdbId) ;

}
