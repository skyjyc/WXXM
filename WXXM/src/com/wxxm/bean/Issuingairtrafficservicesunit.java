package com.wxxm.bean;

/**
 * Issuingairtrafficservicesunit entity. @author MyEclipse Persistence Tools
 */

public class Issuingairtrafficservicesunit implements java.io.Serializable {

	// Fields

	private Integer id;
	private String unitNamevalue;
	private String unitNamenilReason;
	private String typevalue;
	private String typenilReason;
	private String compliantIcaovalue;
	private String compliantIcaonilReason;
	private String designatorvalue;
	private String designatornilReason;
	private String militaryvalue;
	private String militarynilReason;
	private Short owns;
	private String nilReason;
	private String remoteSchema;
	private String type;
	private String href;
	private String role;
	private String arcrole;
	private String title;
	private String show;
	private String actuate;
	private Short unitTypeowns;

	// Constructors

	/** default constructor */
	public Issuingairtrafficservicesunit() {
	}

	/** minimal constructor */
	public Issuingairtrafficservicesunit(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Issuingairtrafficservicesunit(Integer id, String unitNamevalue, String unitNamenilReason, String typevalue,
			String typenilReason, String compliantIcaovalue, String compliantIcaonilReason, String designatorvalue,
			String designatornilReason, String militaryvalue, String militarynilReason, Short owns, String nilReason,
			String remoteSchema, String type, String href, String role, String arcrole, String title, String show,
			String actuate, Short unitTypeowns) {
		this.id = id;
		this.unitNamevalue = unitNamevalue;
		this.unitNamenilReason = unitNamenilReason;
		this.typevalue = typevalue;
		this.typenilReason = typenilReason;
		this.compliantIcaovalue = compliantIcaovalue;
		this.compliantIcaonilReason = compliantIcaonilReason;
		this.designatorvalue = designatorvalue;
		this.designatornilReason = designatornilReason;
		this.militaryvalue = militaryvalue;
		this.militarynilReason = militarynilReason;
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
		this.unitTypeowns = unitTypeowns;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUnitNamevalue() {
		return this.unitNamevalue;
	}

	public void setUnitNamevalue(String unitNamevalue) {
		this.unitNamevalue = unitNamevalue;
	}

	public String getUnitNamenilReason() {
		return this.unitNamenilReason;
	}

	public void setUnitNamenilReason(String unitNamenilReason) {
		this.unitNamenilReason = unitNamenilReason;
	}

	public String getTypevalue() {
		return this.typevalue;
	}

	public void setTypevalue(String typevalue) {
		this.typevalue = typevalue;
	}

	public String getTypenilReason() {
		return this.typenilReason;
	}

	public void setTypenilReason(String typenilReason) {
		this.typenilReason = typenilReason;
	}

	public String getCompliantIcaovalue() {
		return this.compliantIcaovalue;
	}

	public void setCompliantIcaovalue(String compliantIcaovalue) {
		this.compliantIcaovalue = compliantIcaovalue;
	}

	public String getCompliantIcaonilReason() {
		return this.compliantIcaonilReason;
	}

	public void setCompliantIcaonilReason(String compliantIcaonilReason) {
		this.compliantIcaonilReason = compliantIcaonilReason;
	}

	public String getDesignatorvalue() {
		return this.designatorvalue;
	}

	public void setDesignatorvalue(String designatorvalue) {
		this.designatorvalue = designatorvalue;
	}

	public String getDesignatornilReason() {
		return this.designatornilReason;
	}

	public void setDesignatornilReason(String designatornilReason) {
		this.designatornilReason = designatornilReason;
	}

	public String getMilitaryvalue() {
		return this.militaryvalue;
	}

	public void setMilitaryvalue(String militaryvalue) {
		this.militaryvalue = militaryvalue;
	}

	public String getMilitarynilReason() {
		return this.militarynilReason;
	}

	public void setMilitarynilReason(String militarynilReason) {
		this.militarynilReason = militarynilReason;
	}

	public Short getOwns() {
		return this.owns;
	}

	public void setOwns(Short owns) {
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

	public Short getUnitTypeowns() {
		return this.unitTypeowns;
	}

	public void setUnitTypeowns(Short unitTypeowns) {
		this.unitTypeowns = unitTypeowns;
	}

}