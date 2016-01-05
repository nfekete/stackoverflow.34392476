package moxy_jaxb;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.PrintWriter;

import model.eclipselink.*;
import model.eclipselink.export.Export;
import model.eclipselink.export.ExportInhalt;
import model.eclipselink.export.ExportKopf;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class MarshallerTest {

	@Test
	public void marshalDocument() {
		Document document = new Document();
		Export export = new Export();
		ExportKopf exportKopf = new ExportKopf();
		exportKopf.setQuelle("lokal");
		export.setExportKopf(exportKopf);
		ExportInhalt exportInhalt = new ExportInhalt();
		export.setExportInhalt(exportInhalt);
		export.setSchemaVersion("bec811a9807a8c8da403d70b9b5e22ad");
		document.setExport(export);
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
			jaxbContext.generateSchema(new SchemaOutputResolver() {
				
				@Override
				public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
					StreamResult streamResult = new StreamResult(new PrintWriter(System.err) {
						@Override
						public void close() {
						}
					});
					streamResult.setSystemId(suggestedFileName);
					return streamResult;
				}
			});
			System.out.println("Context class: " + jaxbContext.getClass());
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(document, System.out);
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
			fail();
		}	
	}
	
}
