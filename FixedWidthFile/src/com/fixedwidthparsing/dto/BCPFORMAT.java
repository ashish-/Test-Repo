package com.fixedwidthparsing.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="BCPFORMAT",namespace="http://schemas.microsoft.com/sqlserver/2004/bulkload/format")
public class BCPFORMAT {
private RECORD record;
private ROW row;

@XmlElement(name="RECORD")
public RECORD getRecord() {
	return record;
}

public void setRecord(RECORD record) {
	this.record = record;
}

@XmlElement(name="ROW")
public ROW getRow() {
	return row;
}

public void setRow(ROW row) {
	this.row = row;
}


}
