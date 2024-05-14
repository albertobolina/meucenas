package com.pedro.xml.parsers.dom;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import com.pedro.xml.parsers.dto.*;

// programa que lê um xml criado com base no "event.xsd", cria uma instancia de uma classe evento (DTO definida 
// com a mesma estrutura do event.xsd) e faz display dos seus valores no ecran
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
        
        
        // preço do bilhete
        NodeList precoEventoList = documento.getElementsByTagName("tns:precoBilhete");        
        Node precoEvento = precoEventoList.item(0);        
        novoEvento.setPrecoBilhete(Double.parseDouble(precoEvento.getTextContent()));

        // data inicio do evento
        NodeList dataIniEventoList = documento.getElementsByTagName("tns:dataInicio");        
        Node dataIniEvento = dataIniEventoList.item(0);    
        novoEvento.setDataInicio(LocalDateTime.parse(dataIniEvento.getTextContent()));

        // dados do organizador do evento
        NodeList organizerEventoList = documento.getElementsByTagName("tns:organizador");        
        Node organizerEvento = organizerEventoList.item(0);   
        NodeList dadosOrganizer = organizerEvento.getChildNodes(); // o elemento organizador tem sub elementos, que são os seus dados
        Pessoa organizador = new Pessoa();  // instancia que vai conter os dados do organizador

        /// esta é uma forma de obter os atributos
        NamedNodeMap atribOrganizador =  organizerEvento.getAttributes(); // recolhe os atributos do organizador
        organizador.setId(atribOrganizador.getNamedItem("id").getTextContent());


        for (int i = 0; i < dadosOrganizer.getLength(); i++){ // recolhe os dados do organizador
            Node elementoDados = dadosOrganizer.item(i);
            switch (elementoDados.getNodeName()) {
                case "tns:nome":
                    organizador.setNome(elementoDados.getTextContent());
                    break;
                
                case "tns:email":
                    organizador.setEmail(elementoDados.getTextContent());
                    break;

                case "tns:telefone":
                    organizador.setTelefone(elementoDados.getTextContent());
                    break;    

                default:
                    break;
            }
        }
        novoEvento.setOrganizador(organizador);

        // obtem os dados do local do evento        
        NodeList localEventoList = documento.getElementsByTagName("tns:local");
        Node localEvento = localEventoList.item(0);
        localEvento.getAttributes()
        

        

        // display dos valores
        System.out.println("daata inicio : " + novoEvento.getDataInicio());
        System.out.println("Nome evento : " + novoEvento.getNome());
        System.out.println("Preço evento : " + novoEvento.getPrecoBilhete() + "€");
        System.out.println("Organizador : " + novoEvento.getOrganizador().toString());
    }

}
