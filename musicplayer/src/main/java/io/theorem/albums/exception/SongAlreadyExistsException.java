package io.theorem.albums.exception;

public class SongAlreadyExistsException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public SongAlreadyExistsException(String message) {
		super(message);
	}
	public SongAlreadyExistsException(String message, Throwable cause) {
		super(message,cause);
	}
}
