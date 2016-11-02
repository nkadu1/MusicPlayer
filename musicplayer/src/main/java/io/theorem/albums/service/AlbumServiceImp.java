package io.theorem.albums.service;

import java.util.List;

import com.google.inject.Inject;

import io.theorem.albums.entity.Album;
import io.theorem.albums.repository.AlbumRepository;

public class AlbumServiceImp implements AlbumService{

	@Inject
	AlbumRepository  albumRepository;

	public List<Album> findAllAlbums() {
		return albumRepository.findAllAlbums();
	}

	public Album update(String albumId, Album mv) {
		return albumRepository.update(albumId, mv);
	}

	public void delete(String albumId) {
		Album album  =  albumRepository.findById(albumId);
		albumRepository.delete(album);
	}

	public Album createAlbum(Album mv) {
		return albumRepository.createAlbum(mv);
	}

	public Album findById(String albumId) {
		return albumRepository.findById(albumId);
	}

	public List<Album> freeTextSearch(String freeText) {
		return albumRepository.freeTextSearch(freeText);
	}
}
