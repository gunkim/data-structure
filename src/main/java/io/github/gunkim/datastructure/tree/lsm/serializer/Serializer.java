package io.github.gunkim.datastructure.tree.lsm.engine.storage.serializer;

public interface Serializer {
    String serialize(Object object);

    <T> T deserialize(String json);
}
