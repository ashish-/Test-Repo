package com.fixedwidthparsing.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class RECORD {
	private List<Field> items;

	@XmlElement(name="FIELD")
	public List<Field> getItems() {
		return items;
	}

	public void setItems(List<Field> items) {
		this.items = items;
	}
}
