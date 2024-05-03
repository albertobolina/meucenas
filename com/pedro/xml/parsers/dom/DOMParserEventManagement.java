package com.pedro.xml.parsers.dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.pedro.xml.parsers.dto.*;

public class DOMParserEventManagement {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();        
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document documento = documentBuilder.parse(ClassLoader.getSystemResourceAsStream("xml/evento.xml"));
        
        Evento novoEvento = new Evento();

        // a lista vai conter todos os elementos cujo nome de tag seja nome, que estejam no nivel inicial
        NodeList nomeEventoList = documento.getElementsByTagName("tns:nome");        
        Node nomeEvento = nomeEventoList.item(0);        
        novoEvento.setNome(nomeEvento.getTextContent());
        //
        NodeList precoEventoList = documento.getElementsByTagName("tns:precoBilhete");        
        Node precoEvento = precoEventoList.item(0);        
        novoEvento.setPrecoBilhete(Double.parseDouble(precoEvento.getTextContent()));


        System.out.println("Nome evento : " + novoEvento.getNome());
        System.out.println("Preço evento : " + novoEvento.getPrecoBilhete() + "€");
        
    }

}
