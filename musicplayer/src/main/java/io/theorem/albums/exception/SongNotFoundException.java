package io.theorem.albums.exception;


public class SongNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	public SongNotFoundException(String message) {
		super(message);
	}
	public SongNotFoundException(String message, Throwable cause) {
		super(message,cause);
	}
}
