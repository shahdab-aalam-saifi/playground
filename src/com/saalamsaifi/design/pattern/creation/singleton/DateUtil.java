package com.saalamsaifi.design.pattern.creation.singleton;

import java.io.Serializable;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Objects;

public class DateUtil implements Serializable, Cloneable {
	private static final long serialVersionUID = -1246597920317633830L;
	private static DateUtil instance;
	private LocalDateTime date;

	/**
	 * 
	 */
	private DateUtil() {
		this.date = LocalDateTime.now(Clock.systemUTC());
	}

	/**
	 * @return
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
	 * @return
	 */
	protected Object readResolve() {
		return instance;
	}

	/**
	 *
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	/**
	 * @return
	 */
	public LocalDateTime getDate() {
		return this.date;
	}

	/**
	 * @return
	 */
	public String getDay() {
		return this.date.getDayOfWeek().toString().toLowerCase();
	}
}
