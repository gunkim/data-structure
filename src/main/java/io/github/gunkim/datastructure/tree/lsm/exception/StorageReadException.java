package io.github.gunkim.datastructure.tree.lsm.engine.storage.exception;

public class StorageReadException extends RuntimeException {
    public StorageReadException(String message) {
        super(message);
    }
}
