package io.github.gunkim.datastructure.tree.lsm.engine.storage.exception;

public class BackupFailedException extends RuntimeException {
    public BackupFailedException(String message) {
        super(message);
    }
}
