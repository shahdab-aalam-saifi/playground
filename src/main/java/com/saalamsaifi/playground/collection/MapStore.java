package com.saalamsaifi.playground.collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class MapStore {
  private final Map<String, Object> store;

  public MapStore() {
    this.store = new TreeMap<>();
  }

  public void add(String key, Object value) {
    this.store.put(key, value);
  }

  public Object get(String key) {
    NavigableMap<String, Object> map = (NavigableMap<String, Object>) this.store;

    if (map.containsKey(key)) {
      return map.get(key);
    }

    if ((key = map.ceilingKey(key)) != null) {
      return map.get(map.ceilingKey(key));
    }

    return "NOT_FOUND";
  }

  public void print() {
    Set<String> keys = this.store.keySet();

    for (String key : keys) {
      System.out.println(key + ": " + this.store.get(key));
    }
  }
}
