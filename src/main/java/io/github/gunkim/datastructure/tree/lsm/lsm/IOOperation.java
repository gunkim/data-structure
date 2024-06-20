package io.github.gunkim.datastructure.tree.lsm.engine.storage.lsm;

import java.io.IOException;

@FunctionalInterface
public interface IOOperation<T> {
    T run() throws IOException;
}
