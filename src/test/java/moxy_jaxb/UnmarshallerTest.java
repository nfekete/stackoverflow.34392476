package moxy_jaxb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import model.eclipselink.Document;

public class UnmarshallerTest {

	@Test
	public void unmarshalDocument() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
			System.out.println("Context class: " + jaxbContext.getClass());
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			InputStream is = this.getClass().getResourceAsStream("/document.xml");
			Document document = (Document) unmarshaller.unmarshal(is);
			assertEquals("lokal", document.getExport().getExportKopf().getQuelle());
		} catch (JAXBException e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void unmarshalPrefixedDocument() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
			System.out.println("Context class: " + jaxbContext.getClass());
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			InputStream is = this.getClass().getResourceAsStream("/document_prefix.xml");
			Document document = (Document) unmarshaller.unmarshal(is);
			assertEquals("lokal", document.getExport().getExportKopf().getQuelle());
		} catch (JAXBException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void unmarshalRealNamespaceDocument() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
			System.out.println("Context class: " + jaxbContext.getClass());
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			InputStream is = this.getClass().getResourceAsStream("/document_realnamespace.xml");
			Document document = (Document) unmarshaller.unmarshal(is);
			assertEquals("lokal", document.getExport().getExportKopf().getQuelle());
		} catch (JAXBException e) {
			e.printStackTrace();
			fail();
		}
	}
}
