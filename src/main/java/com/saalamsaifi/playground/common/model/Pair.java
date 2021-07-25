package com.saalamsaifi.playground.common.model;

public final class Pair<K, V> {
  final K key;
  final V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public static <K, V> Pair<K, V> of(K key, V value) {
    return new Pair<>(key, value);
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  @Override
  public int hashCode() {
    return key.hashCode() ^ key.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Pair)) {
      return false;
    }

    Pair obj = (Pair) o;
    return this.key.equals(obj.key) && this.value.equals(obj.value);
  }
}
