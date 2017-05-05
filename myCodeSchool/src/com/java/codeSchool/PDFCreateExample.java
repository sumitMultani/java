package com.corejavaB;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class PDFCreateExample {

	public static void main(String[] args) {

		try {
			
			// Create Document instance.
			Document document = new Document();

			// Create OutputStream instance.
			OutputStream outputStream = new FileOutputStream(new File(
					"D:\\TestFile.pdf"));

			// Create PDFWriter instance.
			PdfWriter.getInstance(document, outputStream);

			// Open the document.
			document.open();
			
			//Create Image object 
			Image image = Image.getInstance("D:\\java.jpg"); 
			document.add(image);
			
			// Add content to the document.
			document.add(new Paragraph("Hello world, " + "this is Gagan deep  "));

			// Close document and outputStream.
			document.close();
			outputStream.close();

			System.out.println("Pdf created successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
