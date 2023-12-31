package com.fasterxml.jackson.databind.util;

public interface LookupCache<K, V> {
    void clear();

    V get(Object obj);

    V put(K k, V v);

    V putIfAbsent(K k, V v);

    int size();
}
