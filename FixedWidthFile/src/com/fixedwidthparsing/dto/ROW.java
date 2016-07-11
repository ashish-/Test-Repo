package com.fixedwidthparsing.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class ROW {
	private List<Column> items;

	@XmlElement(name="COLUMN")
	public List<Column> getItems() {
		return items;
	}

	public void setItems(List<Column> items) {
		this.items = items;
	}
}
