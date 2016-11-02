package io.theorem.albums.entity;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.NamedQueries;

@Entity
@Table
@NamedQueries({ 
	@NamedQuery(name = "Album.findAll", query = "SELECT e FROM Album e"),
	@NamedQuery(name = "Album.freeTextSearch", query = "SELECT e FROM Album e where concat(Genre,Type,Title) like :freeText")
})
public class Album {

	@Id
	@GenericGenerator(name = "customUUID", strategy = "uuid2")
	@GeneratedValue(generator = "customUUID")
	private String albumId;
	private String albumName;
	private String artistId;
	private List<Song> songs;
	public String getAlbumId() {
		return albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getArtistId() {
		return artistId;
	}
	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
}
