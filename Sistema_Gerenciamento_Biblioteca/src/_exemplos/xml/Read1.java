package _exemplos.xml;

import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Read1 {
    public static void main(String[] args) throws Exception  {
        
        // loads a file
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();        
        Document doc = docBuilder.parse( new File("file.xml") );
        doc.getDocumentElement().normalize();
        
        // root
        Element root = doc.getDocumentElement();
        System.out.println( "root name '" + root.getNodeName() + "'" );
        
        
        if ( root.hasChildNodes() ) {
            
            NodeList list = root.getChildNodes();
            
            for( int i = 0; i < list.getLength(); i ++ ) {
                
                Node node = list.item(i);
                
                if( node.getNodeType() == Node.ELEMENT_NODE ) {
                    System.out.println( "node name '" + node.getNodeName() + "'" );
                }
            }
        }
        
        
        NodeList list = root.getElementsByTagName("child");
        System.out.println( "list.getLength() " + list.getLength() );
        
        Node node = list.item(0);
        System.out.println( "node attribute1 '" + node.getAttributes().getNamedItem("attribute1").getNodeValue() + "'" );
        System.out.println( "node attribute2 '" + node.getAttributes().getNamedItem("attribute2").getNodeValue() + "'" );
        System.out.println( "node content '" + node.getTextContent() + "'" );
        
    }
}