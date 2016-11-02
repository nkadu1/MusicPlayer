package io.theorem.albums.exception;


public class ArtistNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	public ArtistNotFoundException(String message) {
		super(message);
	}
	public ArtistNotFoundException(String message, Throwable cause) {
		super(message,cause);
	}
}
