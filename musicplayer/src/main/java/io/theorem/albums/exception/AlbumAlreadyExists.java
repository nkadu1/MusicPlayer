package io.theorem.albums.exception;

public class AlbumAlreadyExists extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public AlbumAlreadyExists(String message) {
		super(message);
	}
	public AlbumAlreadyExists(String message, Throwable cause) {
		super(message,cause);
	}
	
}
