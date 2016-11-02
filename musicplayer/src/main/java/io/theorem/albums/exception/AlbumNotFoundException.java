package io.theorem.albums.exception;

public class AlbumNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 405802649322364762L;

	public AlbumNotFoundException(String message) {
		super(message);
	}
	public AlbumNotFoundException(String message, Throwable cause) {
		super(message,cause);
	}
	
}
