package model.eclipselink;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import model.eclipselink.export.Export;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "document", namespace = "urn:stackoverflow:documentnamespace")
public class Document {

	@XmlElement(name = "Export", namespace = "urn:stackoverflow:exportnamespace")
	private Export export;

	public Export getExport() {
		return export;
	}

	public void setExport(Export export) {
		this.export = export;
	}

}
