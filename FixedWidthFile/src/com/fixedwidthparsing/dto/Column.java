package com.fixedwidthparsing.dto;

import javax.xml.bind.annotation.XmlAttribute;

 public class Column {
  private String source;
  private String name;
  private String type;
  private String nullabele;
  private String precision;
  private String scale;
  
  @XmlAttribute(name="PRECISION")
public String getPrecision() {
	return precision;
}
public void setPrecision(String precision) {
	this.precision = precision;
}

@XmlAttribute(name="SCALE")
public String getScale() {
	return scale;
}
public void setScale(String scale) {
	this.scale = scale;
}

@XmlAttribute(name="SOURCE")
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}

@XmlAttribute(name="NAME")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@XmlAttribute(name="xsi:type")
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

@XmlAttribute(name="NULLABLE")
public String getNullabele() {
	return nullabele;
}
public void setNullabele(String nullabele) {
	this.nullabele = nullabele;
}
}
