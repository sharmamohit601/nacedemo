package com.db.nace.model;

import javax.validation.constraints.NotBlank;

public class Activities {
	
	@NotBlank(message = "Order is mandatory")
	private String order;
	private String level;
	private String code;
	private String parent;
	private String description;
	private String itemInclude;
	private String itemAlsoInclude;
	private String rulings;
	private String itemExclude;
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
