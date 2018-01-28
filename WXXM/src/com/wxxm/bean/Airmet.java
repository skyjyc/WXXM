package com.wxxm.bean;

/**
 * Airmet entity. @author MyEclipse Persistence Tools
 */

public class Airmet implements java.io.Serializable {

	// Fields

	private Integer id;
	private Boolean owns;
	private String nilReason;
	private String remoteSchema;
	private String type;
	private String href;
	private String role;
	private String arcrole;
	private String title;
	private String show;
	private String actuate;
	private String sequenceNumber;
	private String cancelledSequenceNumber;
	private Double surfaceVisibilityvalue;
	private String surfaceVisibilityuom;
	private Double surfaceWindSpeedValue;
	private String surfaceWindSpeeduom;
	private String airmetreportStatusType;

	// Constructors

	/** default constructor */
	public Airmet() {
	}

	/** minimal constructor */
	public Airmet(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Airmet(Integer id, Boolean owns, String nilReason, String remoteSchema, String type, String href,
			String role, String arcrole, String title, String show, String actuate, String sequenceNumber,
			String cancelledSequenceNumber, Double surfaceVisibilityvalue, String surfaceVisibilityuom,
			Double surfaceWindSpeedValue, String surfaceWindSpeeduom, String airmetreportStatusType) {
		this.id = id;
		this.owns = owns;
		this.nilReason = nilReason;
		this.remoteSchema = remoteSchema;
		this.type = type;
		this.href = href;
		this.role = role;
		this.arcrole = arcrole;
		this.title = title;
		this.show = show;
		this.actuate = actuate;
		this.sequenceNumber = sequenceNumber;
		this.cancelledSequenceNumber = cancelledSequenceNumber;
		this.surfaceVisibilityvalue = surfaceVisibilityvalue;
		this.surfaceVisibilityuom = surfaceVisibilityuom;
		this.surfaceWindSpeedValue = surfaceWindSpeedValue;
		this.surfaceWindSpeeduom = surfaceWindSpeeduom;
		this.airmetreportStatusType = airmetreportStatusType;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getOwns() {
		return this.owns;
	}

	public void setOwns(Boolean owns) {
		this.owns = owns;
	}

	public String getNilReason() {
		return this.nilReason;
	}

	public void setNilReason(String nilReason) {
		this.nilReason = nilReason;
	}

	public String getRemoteSchema() {
		return this.remoteSchema;
	}

	public void setRemoteSchema(String remoteSchema) {
		this.remoteSchema = remoteSchema;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHref() {
		return this.href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getArcrole() {
		return this.arcrole;
	}

	public void setArcrole(String arcrole) {
		this.arcrole = arcrole;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShow() {
		return this.show;
	}

	public void setShow(String show) {
		this.show = show;
	}

	public String getActuate() {
		return this.actuate;
	}

	public void setActuate(String actuate) {
		this.actuate = actuate;
	}

	public String getSequenceNumber() {
		return this.sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getCancelledSequenceNumber() {
		return this.cancelledSequenceNumber;
	}

	public void setCancelledSequenceNumber(String cancelledSequenceNumber) {
		this.cancelledSequenceNumber = cancelledSequenceNumber;
	}

	public Double getSurfaceVisibilityvalue() {
		return this.surfaceVisibilityvalue;
	}

	public void setSurfaceVisibilityvalue(Double surfaceVisibilityvalue) {
		this.surfaceVisibilityvalue = surfaceVisibilityvalue;
	}

	public String getSurfaceVisibilityuom() {
		return this.surfaceVisibilityuom;
	}

	public void setSurfaceVisibilityuom(String surfaceVisibilityuom) {
		this.surfaceVisibilityuom = surfaceVisibilityuom;
	}

	public Double getSurfaceWindSpeedValue() {
		return this.surfaceWindSpeedValue;
	}

	public void setSurfaceWindSpeedValue(Double surfaceWindSpeedValue) {
		this.surfaceWindSpeedValue = surfaceWindSpeedValue;
	}

	public String getSurfaceWindSpeeduom() {
		return this.surfaceWindSpeeduom;
	}

	public void setSurfaceWindSpeeduom(String surfaceWindSpeeduom) {
		this.surfaceWindSpeeduom = surfaceWindSpeeduom;
	}

	public String getAirmetreportStatusType() {
		return this.airmetreportStatusType;
	}

	public void setAirmetreportStatusType(String airmetreportStatusType) {
		this.airmetreportStatusType = airmetreportStatusType;
	}

}