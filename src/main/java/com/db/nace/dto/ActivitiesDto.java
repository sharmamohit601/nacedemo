package com.db.nace.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nace_activities")
public class ActivitiesDto {
	
	public ActivitiesDto() {
		super();
	}

	@Id
	@Column(name = "act_order")
	private String order;
	
	@Column(name = "act_level")
	private String level;
	
	@Column(name = "act_code")
	private String code;
	
	@Column(name = "act_parent")
	private String parent;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "item_include")
	private String itemInclude;
	
	@Column(name = "item_also_include")
	private String itemAlsoInclude;
	
	@Column(name = "rulings")
	private String rulings;
	
	@Column(name = "item_exclude")
	private String itemExclude;
	
	@Column(name = "reference")
	private String reference;

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItemInclude() {
		return itemInclude;
	}

	public void setItemInclude(String itemInclude) {
		this.itemInclude = itemInclude;
	}

	public String getItemAlsoInclude() {
		return itemAlsoInclude;
	}

	public void setItemAlsoInclude(String itemAlsoInclude) {
		this.itemAlsoInclude = itemAlsoInclude;
	}

	public String getRulings() {
		return rulings;
	}

	public void setRulings(String rulings) {
		this.rulings = rulings;
	}

	public String getItemExclude() {
		return itemExclude;
	}

	public void setItemExclude(String itemExclude) {
		this.itemExclude = itemExclude;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

}
