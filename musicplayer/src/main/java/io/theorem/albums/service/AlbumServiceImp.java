package io.theorem.albums.service;

import java.util.List;

import com.google.inject.Inject;

import io.theorem.albums.entity.Album;
import io.theorem.albums.exception.AlbumAlreadyExists;
import io.theorem.albums.exception.AlbumNotFoundException;
import io.theorem.albums.repository.AlbumRepository;

public class AlbumServiceImp implements AlbumService{

	@Inject
	AlbumRepository  albumRepository;

	public List<Album> findAllAlbums() {
		return albumRepository.findAllAlbums();
	}

	public Album update(String albumId, Album mv) throws AlbumNotFoundException{
		Album existing = albumRepository.findById(albumId);
		if(existing==null){
			throw new AlbumNotFoundException("Album with id:" + albumId + " not found");
		}
		return albumRepository.update(albumId, mv);
	}

	public void delete(String albumId) throws AlbumNotFoundException{
		Album existing  =  albumRepository.findById(albumId);
		if(existing==null){
			throw new AlbumNotFoundException("Album with id:" + albumId + " not found");
		}
		albumRepository.delete(existing);
	}

	public Album createAlbum(Album mv) throws AlbumAlreadyExists{
		
		Album existing = albumRepository.findByImdbId(mv.getImdbId());
		if (existing != null) {
			throw new AlbumAlreadyExists("Album already exists: " + mv.getImdbId());
		}
		return albumRepository.createAlbum(mv);
		
	}

	public Album findById(String albumId) throws AlbumNotFoundException{
		Album album  = albumRepository.findById(albumId);
		if(album!=null)
			return album;
		else
			throw new AlbumNotFoundException("Album with id:" + albumId + " not found");
	}

	public List<Album> freeTextSearch(String freeText) {
		return albumRepository.freeTextSearch(freeText);
	}

}
