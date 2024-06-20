package io.github.gunkim.datastructure.tree.lsm.engine.storage.exception;

public class CompactionFailedException extends RuntimeException {
    public CompactionFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
