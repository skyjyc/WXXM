package com.wxxm.bean;

/**
 * ValidperiodDurationandtimeinterval entity. @author MyEclipse Persistence
 * Tools
 */

public class ValidperiodDurationandtimeinterval implements java.io.Serializable {

	// Fields

	private Integer id;
	private Long duration;
	private Long timeIntervalValue;
	private String timeIntervalUnit;
	private Long timeIntervalValueRadix;
	private Long timeIntervalFactor;

	// Constructors

	/** default constructor */
	public ValidperiodDurationandtimeinterval() {
	}

	/** minimal constructor */
	public ValidperiodDurationandtimeinterval(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public ValidperiodDurationandtimeinterval(Integer id, Long duration, Long timeIntervalValue,
			String timeIntervalUnit, Long timeIntervalValueRadix, Long timeIntervalFactor) {
		this.id = id;
		this.duration = duration;
		this.timeIntervalValue = timeIntervalValue;
		this.timeIntervalUnit = timeIntervalUnit;
		this.timeIntervalValueRadix = timeIntervalValueRadix;
		this.timeIntervalFactor = timeIntervalFactor;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getTimeIntervalValue() {
		return this.timeIntervalValue;
	}

	public void setTimeIntervalValue(Long timeIntervalValue) {
		this.timeIntervalValue = timeIntervalValue;
	}

	public String getTimeIntervalUnit() {
		return this.timeIntervalUnit;
	}

	public void setTimeIntervalUnit(String timeIntervalUnit) {
		this.timeIntervalUnit = timeIntervalUnit;
	}

	public Long getTimeIntervalValueRadix() {
		return this.timeIntervalValueRadix;
	}

	public void setTimeIntervalValueRadix(Long timeIntervalValueRadix) {
		this.timeIntervalValueRadix = timeIntervalValueRadix;
	}

	public Long getTimeIntervalFactor() {
		return this.timeIntervalFactor;
	}

	public void setTimeIntervalFactor(Long timeIntervalFactor) {
		this.timeIntervalFactor = timeIntervalFactor;
	}

}