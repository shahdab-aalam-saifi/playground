package com.saalamsaifi.playground.design.pattern.creation.singleton;

public class SingletonApplication {
  public static void main(String[] args) {
    var util = DateUtil.getInstance();

    System.out.println("Day: " + util.getDay() + "/" + DateUtil.getInstance().getDay());
  }
}
