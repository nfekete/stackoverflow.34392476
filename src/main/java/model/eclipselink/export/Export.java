package model.eclipselink.export;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Export")
@XmlType(name = "Export", propOrder = {
	    "exportInhalt",
	    "exportKopf",
	    "schemaVersion"
	})
public class Export {

	@XmlElement(name = "ExportKopf", required = true)
	private ExportKopf exportKopf;
	
	@XmlElement(name = "ExportInhalt", required = true)
	private ExportInhalt exportInhalt;
	
	@XmlElement(name = "SchemaVersion", required = true)
	private String schemaVersion;

	public ExportKopf getExportKopf() {
		return exportKopf;
	}

	public void setExportKopf(ExportKopf exportKopf) {
		this.exportKopf = exportKopf;
	}

	public ExportInhalt getExportInhalt() {
		return exportInhalt;
	}

	public void setExportInhalt(ExportInhalt exportInhalt) {
		this.exportInhalt = exportInhalt;
	}

	public String getSchemaVersion() {
		return schemaVersion;
	}

	public void setSchemaVersion(String schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

}
