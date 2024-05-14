package _exemplos.xml;

import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LerXML1 {
    public static void main(String[] args) throws Exception {
        
        // carrega o arquivo
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();        
        Document doc = docBuilder.parse( new File("exemplo-xml.xml") );
        doc.getDocumentElement().normalize();
        
        
        // elemento rais
        Element root = doc.getDocumentElement();
        System.out.println( "root name '" + root.getNodeName() + "'" );
        
        Node projeto0 = root.getElementsByTagName("projeto").item(0);
        System.out.println( projeto0.getAttributes().getNamedItem("nome").getNodeValue() );
        
       Node sobrenome1 = root.getElementsByTagName("sobrenome").item(1);
        System.out.println( sobrenome1.getTextContent() );
        
    }
}
