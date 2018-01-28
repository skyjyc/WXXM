package com.wxxm.bean;

/**
 * IssuingairtrafficservicesunitContact entity. @author MyEclipse Persistence
 * Tools
 */

public class IssuingairtrafficservicesunitContact implements java.io.Serializable {

	// Fields

	private Integer id;
	private String contactInformationNameValue;
	private String contactInformationNameNilReason;
	private String titleValue;
	private String titleNilReason;

	// Constructors

	/** default constructor */
	public IssuingairtrafficservicesunitContact() {
	}

	/** minimal constructor */
	public IssuingairtrafficservicesunitContact(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public IssuingairtrafficservicesunitContact(Integer id, String contactInformationNameValue,
			String contactInformationNameNilReason, String titleValue, String titleNilReason) {
		this.id = id;
		this.contactInformationNameValue = contactInformationNameValue;
		this.contactInformationNameNilReason = contactInformationNameNilReason;
		this.titleValue = titleValue;
		this.titleNilReason = titleNilReason;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContactInformationNameValue() {
		return this.contactInformationNameValue;
	}

	public void setContactInformationNameValue(String contactInformationNameValue) {
		this.contactInformationNameValue = contactInformationNameValue;
	}

	public String getContactInformationNameNilReason() {
		return this.contactInformationNameNilReason;
	}

	public void setContactInformationNameNilReason(String contactInformationNameNilReason) {
		this.contactInformationNameNilReason = contactInformationNameNilReason;
	}

	public String getTitleValue() {
		return this.titleValue;
	}

	public void setTitleValue(String titleValue) {
		this.titleValue = titleValue;
	}

	public String getTitleNilReason() {
		return this.titleNilReason;
	}

	public void setTitleNilReason(String titleNilReason) {
		this.titleNilReason = titleNilReason;
	}

}