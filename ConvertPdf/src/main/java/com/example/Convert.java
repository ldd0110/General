package com.example;

import org.artofsolving.jodconverter.OfficeDocumentConverter;
import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.artofsolving.jodconverter.office.OfficeManager;

import java.io.File;

public class Convert {

    public static void main(String[] args) {
        OfficeManager officeManager = null;
        try {
            officeManager = new DefaultOfficeManagerConfiguration()
                    .setOfficeHome(new File("F:\\libreOffice")).buildOfficeManager();

            OfficeDocumentConverter converter = new OfficeDocumentConverter(officeManager);
            officeManager.start();

            CreatePDF(converter);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (officeManager != null) {
                officeManager.stop();
            }
        }
    }

    private static void CreatePDF(OfficeDocumentConverter Converter) {
        try {
            Converter.convert(new File("F:\\test.docx"), new File("F:\\testhelloworld223.pdf"));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }


}
