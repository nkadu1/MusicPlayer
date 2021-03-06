package io.theorem.albums.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table
@NamedQueries({ 
	@NamedQuery(name = "Song.getSongs", query = "SELECT e FROM Song e where e.album =:album")
})
public class Song {
	@Id
	@GenericGenerator(name = "customUUID", strategy = "uuid2")
	@GeneratedValue(generator = "customUUID")
	private String songId;
	private String songName;
	private String lengthOfTime;

	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToOne
	private Album album;
	
	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public String getLengthOfTime() {
		return lengthOfTime;
	}

	public void setLengthOfTime(String lengthOfTime) {
		this.lengthOfTime = lengthOfTime;
	}

	public String getSongId() {
		return songId;
	}

	public void setSongId(String songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}
}
