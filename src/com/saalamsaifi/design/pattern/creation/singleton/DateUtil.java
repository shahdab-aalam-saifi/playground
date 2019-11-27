package com.saalamsaifi.design.pattern.creation.singleton;

import java.io.Serializable;
import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Objects;

public class DateUtil implements Serializable, Cloneable {
	private static final long serialVersionUID = -1246597920317633830L;
	private static DateUtil instance;
	private LocalDateTime date;

	/**
	 * Private Constructor
	 */
	private DateUtil() {
		this.date = LocalDateTime.now(Clock.systemUTC());
	}

	/**
	 * Returns the shared/singleton instance of DateUtil
	 * 
	 * @return DateUtil
	 */
	public static DateUtil getInstance() {
		if (Objects.isNull(instance)) {
			synchronized (DateUtil.class) {
				// Double null check to avoid acquiring and releasing of lock multiple times
				// i.e. avoid lock when instance is not null
				if (Objects.isNull(instance)) {
					instance = new DateUtil();
				}
			}
		}
		return instance;
	}

	/**
	 * Returns the current instance of the class
	 * 
	 * @return Object
	 */
	protected Object readResolve() {
		return instance;
	}

	/**
	 * Cloning of the instance is not allowed
	 * 
	 * @throws {@link CloneNotSupportedException}
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	/**
	 * @return {@link LocalDateTime}
	 */
	public LocalDateTime getDate() {
		return this.date;
	}

	/**
	 * Returns the {@link DayOfWeek} as {@link String} in lower-case 
	 * 
	 * @return {@link String}
	 */
	public String getDay() {
		return this.date.getDayOfWeek().toString().toLowerCase();
	}
}
