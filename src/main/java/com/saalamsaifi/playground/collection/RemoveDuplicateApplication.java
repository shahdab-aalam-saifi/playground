package com.saalamsaifi.playground.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateApplication {
  public static void main(String[] args) {
    var application = new RemoveDuplicateApplication();

    List<Integer> integers = new ArrayList<>();

    integers.add(10);
    integers.add(22);
    integers.add(12);
    integers.add(10);
    integers.add(21);
    integers.add(22);
    integers.add(30);

    System.out.println(application.removeDuplicates(integers));
  }

  private List<Integer> removeDuplicates(final List<Integer> list) {
    if (list == null) {
      return new ArrayList<>();
    }

    Set<Integer> set = new HashSet<>(list);

    list.clear();
    list.addAll(set);

    return list;
  }
}
