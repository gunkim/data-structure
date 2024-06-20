package io.github.gunkim.datastructure.tree.lsm.engine.storage.simple;

import io.github.gunkim.datasystems.engine.storage.Storage;
import io.github.gunkim.datasystems.engine.storage.StorageFactory;

public class SimpleStorageFactory<T> implements StorageFactory<T> {
    @Override
    public Storage<T> createSimpleStorage(String path) {
        return new SimpleStorage<>(path);
    }
}
