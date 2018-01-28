package com.wxxm.bean;

/**
 * IssuingairtrafficserviceunitAvailability entity. @author MyEclipse
 * Persistence Tools
 */

public class IssuingairtrafficserviceunitAvailability implements java.io.Serializable {

	// Fields

	private Integer id;
	private String timeReferenceValue;
	private String timeReferenceNilReason;
	private String startDateValue;
	private String startDateNilReason;
	private String endDateValue;
	private String endDateNilReason;
	private String dayValue;
	private String dayNilReason;
	private String dayTilValue;
	private String dayTilNilReason;
	private String startTimeValue;
	private String startTimeNilReason;
	private String startEventValue;
	private String startEventNilReason;
	private Double startTimeRelativeEventValue;
	private String startTimeRelativeEventUom;
	private String startTimeRelativeEventNilReason;
	private String startEventInterpretationValue;
	private String startEventInterpretationNilReason;
	private String endTimeValue;
	private String endTimeNilReason;
	private String endEventValue;
	private String endEventNilReason;
	private Double endTimeRelativeEventValue;
	private String endTimeRelativeEventUom;
	private String endTimeRelativeEventNilReason;
	private String endEventInterpretationValue;
	private String endEventInterpretationNilReason;
	private String daylightSavingAdjustValue;
	private String daylightSavingAdjustNilReason;
	private String excludedValue;
	private String excludedNilReason;
	private String oaptnilReason;
	private String oaptremoteSchema;
	private String oapttype;
	private String oapthref;
	private String oaptrole;
	private String oaptarcrole;
	private String oapttitle;
	private String oaptshow;
	private String oaptactuate;
	private String oaptowns;
	private String operationalStatusValue;
	private String operationalStatusNilReason;

	// Constructors

	/** default constructor */
	public IssuingairtrafficserviceunitAvailability() {
	}

	/** minimal constructor */
	public IssuingairtrafficserviceunitAvailability(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public IssuingairtrafficserviceunitAvailability(Integer id, String timeReferenceValue,
			String timeReferenceNilReason, String startDateValue, String startDateNilReason, String endDateValue,
			String endDateNilReason, String dayValue, String dayNilReason, String dayTilValue, String dayTilNilReason,
			String startTimeValue, String startTimeNilReason, String startEventValue, String startEventNilReason,
			Double startTimeRelativeEventValue, String startTimeRelativeEventUom,
			String startTimeRelativeEventNilReason, String startEventInterpretationValue,
			String startEventInterpretationNilReason, String endTimeValue, String endTimeNilReason,
			String endEventValue, String endEventNilReason, Double endTimeRelativeEventValue,
			String endTimeRelativeEventUom, String endTimeRelativeEventNilReason, String endEventInterpretationValue,
			String endEventInterpretationNilReason, String daylightSavingAdjustValue,
			String daylightSavingAdjustNilReason, String excludedValue, String excludedNilReason, String oaptnilReason,
			String oaptremoteSchema, String oapttype, String oapthref, String oaptrole, String oaptarcrole,
			String oapttitle, String oaptshow, String oaptactuate, String oaptowns, String operationalStatusValue,
			String operationalStatusNilReason) {
		this.id = id;
		this.timeReferenceValue = timeReferenceValue;
		this.timeReferenceNilReason = timeReferenceNilReason;
		this.startDateValue = startDateValue;
		this.startDateNilReason = startDateNilReason;
		this.endDateValue = endDateValue;
		this.endDateNilReason = endDateNilReason;
		this.dayValue = dayValue;
		this.dayNilReason = dayNilReason;
		this.dayTilValue = dayTilValue;
		this.dayTilNilReason = dayTilNilReason;
		this.startTimeValue = startTimeValue;
		this.startTimeNilReason = startTimeNilReason;
		this.startEventValue = startEventValue;
		this.startEventNilReason = startEventNilReason;
		this.startTimeRelativeEventValue = startTimeRelativeEventValue;
		this.startTimeRelativeEventUom = startTimeRelativeEventUom;
		this.startTimeRelativeEventNilReason = startTimeRelativeEventNilReason;
		this.startEventInterpretationValue = startEventInterpretationValue;
		this.startEventInterpretationNilReason = startEventInterpretationNilReason;
		this.endTimeValue = endTimeValue;
		this.endTimeNilReason = endTimeNilReason;
		this.endEventValue = endEventValue;
		this.endEventNilReason = endEventNilReason;
		this.endTimeRelativeEventValue = endTimeRelativeEventValue;
		this.endTimeRelativeEventUom = endTimeRelativeEventUom;
		this.endTimeRelativeEventNilReason = endTimeRelativeEventNilReason;
		this.endEventInterpretationValue = endEventInterpretationValue;
		this.endEventInterpretationNilReason = endEventInterpretationNilReason;
		this.daylightSavingAdjustValue = daylightSavingAdjustValue;
		this.daylightSavingAdjustNilReason = daylightSavingAdjustNilReason;
		this.excludedValue = excludedValue;
		this.excludedNilReason = excludedNilReason;
		this.oaptnilReason = oaptnilReason;
		this.oaptremoteSchema = oaptremoteSchema;
		this.oapttype = oapttype;
		this.oapthref = oapthref;
		this.oaptrole = oaptrole;
		this.oaptarcrole = oaptarcrole;
		this.oapttitle = oapttitle;
		this.oaptshow = oaptshow;
		this.oaptactuate = oaptactuate;
		this.oaptowns = oaptowns;
		this.operationalStatusValue = operationalStatusValue;
		this.operationalStatusNilReason = operationalStatusNilReason;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTimeReferenceValue() {
		return this.timeReferenceValue;
	}

	public void setTimeReferenceValue(String timeReferenceValue) {
		this.timeReferenceValue = timeReferenceValue;
	}

	public String getTimeReferenceNilReason() {
		return this.timeReferenceNilReason;
	}

	public void setTimeReferenceNilReason(String timeReferenceNilReason) {
		this.timeReferenceNilReason = timeReferenceNilReason;
	}

	public String getStartDateValue() {
		return this.startDateValue;
	}

	public void setStartDateValue(String startDateValue) {
		this.startDateValue = startDateValue;
	}

	public String getStartDateNilReason() {
		return this.startDateNilReason;
	}

	public void setStartDateNilReason(String startDateNilReason) {
		this.startDateNilReason = startDateNilReason;
	}

	public String getEndDateValue() {
		return this.endDateValue;
	}

	public void setEndDateValue(String endDateValue) {
		this.endDateValue = endDateValue;
	}

	public String getEndDateNilReason() {
		return this.endDateNilReason;
	}

	public void setEndDateNilReason(String endDateNilReason) {
		this.endDateNilReason = endDateNilReason;
	}

	public String getDayValue() {
		return this.dayValue;
	}

	public void setDayValue(String dayValue) {
		this.dayValue = dayValue;
	}

	public String getDayNilReason() {
		return this.dayNilReason;
	}

	public void setDayNilReason(String dayNilReason) {
		this.dayNilReason = dayNilReason;
	}

	public String getDayTilValue() {
		return this.dayTilValue;
	}

	public void setDayTilValue(String dayTilValue) {
		this.dayTilValue = dayTilValue;
	}

	public String getDayTilNilReason() {
		return this.dayTilNilReason;
	}

	public void setDayTilNilReason(String dayTilNilReason) {
		this.dayTilNilReason = dayTilNilReason;
	}

	public String getStartTimeValue() {
		return this.startTimeValue;
	}

	public void setStartTimeValue(String startTimeValue) {
		this.startTimeValue = startTimeValue;
	}

	public String getStartTimeNilReason() {
		return this.startTimeNilReason;
	}

	public void setStartTimeNilReason(String startTimeNilReason) {
		this.startTimeNilReason = startTimeNilReason;
	}

	public String getStartEventValue() {
		return this.startEventValue;
	}

	public void setStartEventValue(String startEventValue) {
		this.startEventValue = startEventValue;
	}

	public String getStartEventNilReason() {
		return this.startEventNilReason;
	}

	public void setStartEventNilReason(String startEventNilReason) {
		this.startEventNilReason = startEventNilReason;
	}

	public Double getStartTimeRelativeEventValue() {
		return this.startTimeRelativeEventValue;
	}

	public void setStartTimeRelativeEventValue(Double startTimeRelativeEventValue) {
		this.startTimeRelativeEventValue = startTimeRelativeEventValue;
	}

	public String getStartTimeRelativeEventUom() {
		return this.startTimeRelativeEventUom;
	}

	public void setStartTimeRelativeEventUom(String startTimeRelativeEventUom) {
		this.startTimeRelativeEventUom = startTimeRelativeEventUom;
	}

	public String getStartTimeRelativeEventNilReason() {
		return this.startTimeRelativeEventNilReason;
	}

	public void setStartTimeRelativeEventNilReason(String startTimeRelativeEventNilReason) {
		this.startTimeRelativeEventNilReason = startTimeRelativeEventNilReason;
	}

	public String getStartEventInterpretationValue() {
		return this.startEventInterpretationValue;
	}

	public void setStartEventInterpretationValue(String startEventInterpretationValue) {
		this.startEventInterpretationValue = startEventInterpretationValue;
	}

	public String getStartEventInterpretationNilReason() {
		return this.startEventInterpretationNilReason;
	}

	public void setStartEventInterpretationNilReason(String startEventInterpretationNilReason) {
		this.startEventInterpretationNilReason = startEventInterpretationNilReason;
	}

	public String getEndTimeValue() {
		return this.endTimeValue;
	}

	public void setEndTimeValue(String endTimeValue) {
		this.endTimeValue = endTimeValue;
	}

	public String getEndTimeNilReason() {
		return this.endTimeNilReason;
	}

	public void setEndTimeNilReason(String endTimeNilReason) {
		this.endTimeNilReason = endTimeNilReason;
	}

	public String getEndEventValue() {
		return this.endEventValue;
	}

	public void setEndEventValue(String endEventValue) {
		this.endEventValue = endEventValue;
	}

	public String getEndEventNilReason() {
		return this.endEventNilReason;
	}

	public void setEndEventNilReason(String endEventNilReason) {
		this.endEventNilReason = endEventNilReason;
	}

	public Double getEndTimeRelativeEventValue() {
		return this.endTimeRelativeEventValue;
	}

	public void setEndTimeRelativeEventValue(Double endTimeRelativeEventValue) {
		this.endTimeRelativeEventValue = endTimeRelativeEventValue;
	}

	public String getEndTimeRelativeEventUom() {
		return this.endTimeRelativeEventUom;
	}

	public void setEndTimeRelativeEventUom(String endTimeRelativeEventUom) {
		this.endTimeRelativeEventUom = endTimeRelativeEventUom;
	}

	public String getEndTimeRelativeEventNilReason() {
		return this.endTimeRelativeEventNilReason;
	}

	public void setEndTimeRelativeEventNilReason(String endTimeRelativeEventNilReason) {
		this.endTimeRelativeEventNilReason = endTimeRelativeEventNilReason;
	}

	public String getEndEventInterpretationValue() {
		return this.endEventInterpretationValue;
	}

	public void setEndEventInterpretationValue(String endEventInterpretationValue) {
		this.endEventInterpretationValue = endEventInterpretationValue;
	}

	public String getEndEventInterpretationNilReason() {
		return this.endEventInterpretationNilReason;
	}

	public void setEndEventInterpretationNilReason(String endEventInterpretationNilReason) {
		this.endEventInterpretationNilReason = endEventInterpretationNilReason;
	}

	public String getDaylightSavingAdjustValue() {
		return this.daylightSavingAdjustValue;
	}

	public void setDaylightSavingAdjustValue(String daylightSavingAdjustValue) {
		this.daylightSavingAdjustValue = daylightSavingAdjustValue;
	}

	public String getDaylightSavingAdjustNilReason() {
		return this.daylightSavingAdjustNilReason;
	}

	public void setDaylightSavingAdjustNilReason(String daylightSavingAdjustNilReason) {
		this.daylightSavingAdjustNilReason = daylightSavingAdjustNilReason;
	}

	public String getExcludedValue() {
		return this.excludedValue;
	}

	public void setExcludedValue(String excludedValue) {
		this.excludedValue = excludedValue;
	}

	public String getExcludedNilReason() {
		return this.excludedNilReason;
	}

	public void setExcludedNilReason(String excludedNilReason) {
		this.excludedNilReason = excludedNilReason;
	}

	public String getOaptnilReason() {
		return this.oaptnilReason;
	}

	public void setOaptnilReason(String oaptnilReason) {
		this.oaptnilReason = oaptnilReason;
	}

	public String getOaptremoteSchema() {
		return this.oaptremoteSchema;
	}

	public void setOaptremoteSchema(String oaptremoteSchema) {
		this.oaptremoteSchema = oaptremoteSchema;
	}

	public String getOapttype() {
		return this.oapttype;
	}

	public void setOapttype(String oapttype) {
		this.oapttype = oapttype;
	}

	public String getOapthref() {
		return this.oapthref;
	}

	public void setOapthref(String oapthref) {
		this.oapthref = oapthref;
	}

	public String getOaptrole() {
		return this.oaptrole;
	}

	public void setOaptrole(String oaptrole) {
		this.oaptrole = oaptrole;
	}

	public String getOaptarcrole() {
		return this.oaptarcrole;
	}

	public void setOaptarcrole(String oaptarcrole) {
		this.oaptarcrole = oaptarcrole;
	}

	public String getOapttitle() {
		return this.oapttitle;
	}

	public void setOapttitle(String oapttitle) {
		this.oapttitle = oapttitle;
	}

	public String getOaptshow() {
		return this.oaptshow;
	}

	public void setOaptshow(String oaptshow) {
		this.oaptshow = oaptshow;
	}

	public String getOaptactuate() {
		return this.oaptactuate;
	}

	public void setOaptactuate(String oaptactuate) {
		this.oaptactuate = oaptactuate;
	}

	public String getOaptowns() {
		return this.oaptowns;
	}

	public void setOaptowns(String oaptowns) {
		this.oaptowns = oaptowns;
	}

	public String getOperationalStatusValue() {
		return this.operationalStatusValue;
	}

	public void setOperationalStatusValue(String operationalStatusValue) {
		this.operationalStatusValue = operationalStatusValue;
	}

	public String getOperationalStatusNilReason() {
		return this.operationalStatusNilReason;
	}

	public void setOperationalStatusNilReason(String operationalStatusNilReason) {
		this.operationalStatusNilReason = operationalStatusNilReason;
	}

}