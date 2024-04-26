package com.pedro.xml.parsers.dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DOMParserEventManagement {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();        
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document documento = documentBuilder.parse(ClassLoader.getSystemResourceAsStream("xml/evento.xml"));
        
        
    }

}
