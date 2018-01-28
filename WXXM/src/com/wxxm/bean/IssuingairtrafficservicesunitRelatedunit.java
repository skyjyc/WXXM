package com.wxxm.bean;

import java.math.BigDecimal;

/**
 * IssuingairtrafficservicesunitRelatedunit entity. @author MyEclipse
 * Persistence Tools
 */

public class IssuingairtrafficservicesunitRelatedunit implements java.io.Serializable {

	// Fields

	private Integer id;
	private String typeValue;
	private String typenilReason;
	private String nilReason;
	private String remoteSchema;
	private String type;
	private String href;
	private String role;
	private String arcrole;
	private BigDecimal title;
	private String show;
	private Short owns;

	// Constructors

	/** default constructor */
	public IssuingairtrafficservicesunitRelatedunit() {
	}

	/** minimal constructor */
	public IssuingairtrafficservicesunitRelatedunit(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public IssuingairtrafficservicesunitRelatedunit(Integer id, String typeValue, String typenilReason,
			String nilReason, String remoteSchema, String type, String href, String role, String arcrole,
			BigDecimal title, String show, Short owns) {
		this.id = id;
		this.typeValue = typeValue;
		this.typenilReason = typenilReason;
		this.nilReason = nilReason;
		this.remoteSchema = remoteSchema;
		this.type = type;
		this.href = href;
		this.role = role;
		this.arcrole = arcrole;
		this.title = title;
		this.show = show;
		this.owns = owns;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeValue() {
		return this.typeValue;
	}

	public void setTypeValue(String typeValue) {
		this.typeValue = typeValue;
	}

	public String getTypenilReason() {
		return this.typenilReason;
	}

	public void setTypenilReason(String typenilReason) {
		this.typenilReason = typenilReason;
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

	public BigDecimal getTitle() {
		return this.title;
	}

	public void setTitle(BigDecimal title) {
		this.title = title;
	}

	public String getShow() {
		return this.show;
	}

	public void setShow(String show) {
		this.show = show;
	}

	public Short getOwns() {
		return this.owns;
	}

	public void setOwns(Short owns) {
		this.owns = owns;
	}

}