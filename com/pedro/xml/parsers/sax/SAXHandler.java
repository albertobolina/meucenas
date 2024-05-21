package com.pedro.xml.parsers.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


// O SAX lê o xml do primeiro elemento até ao ultimo. Por onde vai passando nessa leitura, 
// vai criando eventos
// Usar o SAX para ler um xml involve duas classes: um handler e um parser
// Aqui creamos o HANDLER
public class SAXHandler extends DefaultHandler{

    // trata o evento que é gerado de cada vez que o SAX atinge o inicio de um elemento
    @Override
    public void startElement (String uri, String localName, String qName, Attributes attributes) throws SAXException
    {
        
    }

    // trata o evento que é gerado de cada vez que o SAX atinge o final de um elemento
    @Override
    public void endElement (String uri, String localName, String qName) throws SAXException
    {
        // no op
    }

    // trata o evento que é gerado de cada vez que o SAX atinge o conteudo de um elemento
    @Override
    public void characters (char ch[], int start, int length) throws SAXException
    {
        // no op
    }



}
