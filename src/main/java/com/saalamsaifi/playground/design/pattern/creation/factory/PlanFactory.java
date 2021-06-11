package com.saalamsaifi.playground.design.pattern.creation.factory;

public class PlanFactory {
  /**
   * @param type
   * @return
   */
  public Plan getPlan(PlanType type) {
    switch (type) {
      case DOMESTIC:
        return new DomesticPlan();

      case COMMERCIAL:
        return new CommercialPlan();

      case INSTITUTIONAL:
        return new InstitutionalPlan();

      default:
        return null;
    }
  }
}
