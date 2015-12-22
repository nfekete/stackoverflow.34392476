package model.eclipselink.export;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ExportKopf")
@XmlType(name = "ExportKopf", propOrder = {
	    "mandant",
	    "quelle",
	})
public class ExportKopf {

	@XmlElement(name = "Mandant", required = true)
	protected String mandant;

	@XmlElement(name = "Quelle", required = true)
	private String quelle;

	public String getQuelle() {
		return quelle;
	}

	public void setQuelle(String quelle) {
		this.quelle = quelle;
	}

	public String getMandant() {
		return mandant;
	}

	public void setMandant(String mandant) {
		this.mandant = mandant;
	}

}
