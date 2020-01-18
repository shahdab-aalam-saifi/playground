package com.saalamsaifi.backtracking.core;

import java.time.LocalDateTime;
import java.util.Objects;

public class GoodClass {
	private int intValue;
	private String stringValue;
	private LocalDateTime timeValue;

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public LocalDateTime getTimeValue() {
		return timeValue;
	}

	public void setTimeValue(LocalDateTime timeValue) {
		this.timeValue = timeValue;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoodClass [intValue=").append(intValue).append(", ");
		if (stringValue != null)
			builder.append("stringValue=").append(stringValue).append(", ");
		if (timeValue != null)
			builder.append("timeValue=").append(timeValue);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(intValue, stringValue, timeValue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof GoodClass)) {
			return false;
		}
		GoodClass other = (GoodClass) obj;
		return intValue == other.intValue && Objects.equals(stringValue, other.stringValue)
				&& Objects.equals(timeValue, other.timeValue);
	}

}
