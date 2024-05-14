package _exemplos.xml;

import java.io.FileOutputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Create1 {
    public static void main(String[] args) throws Exception  {
        
        // creates a file
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();
        
        // root
        Element root = doc.createElement( "root" );
        doc.appendChild(root);
        
        // elements
        Element element1 = doc.createElement( "parent" );
        element1.setAttribute("attribute1", "value");
        element1.setAttribute("attribute2", "value");
//        element1.setTextContent( "content" );
        
        Element element2 = doc.createElement( "child" );
        element2.setAttribute("attribute1", "value");
        element2.setAttribute("attribute2", "value");
        element2.setTextContent( "content" );
        
        element1.appendChild(element2);
        root.appendChild( element1 );
        
        // save
        FileOutputStream output = new FileOutputStream("file.xml");
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource( doc );
        StreamResult result = new StreamResult( output );
        
         transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
        transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
        transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
//        transformer.setOutputProperty(OutputKeys.ENCODING,"ISO-8859-1");
        transformer.transform( source, result );
        
    }
}