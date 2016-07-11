package com.fixedwidthparsing.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Field {
private int ID;
private String xsi_type;
private int LENGTH;
private String TERMINATOR;

@XmlAttribute(name="ID")
public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

@XmlAttribute(name="xsi:type")
public String getXsi_type() {
	return xsi_type;
}
public void setXsi_type(String xsi_type) {
	this.xsi_type = xsi_type;
}
@XmlAttribute(name="LENGTH")
public int getLENGTH() {
	return LENGTH;
}
public void setLENGTH(int lENGTH) {
	LENGTH = lENGTH;
}

@XmlAttribute(name="TERMINATOR")
public String getTERMINATOR() {
	return TERMINATOR;
}
public void setTERMINATOR(String tERMINATOR) {
	TERMINATOR = tERMINATOR;
}

}
