package javaProjects;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXmlFile {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document=builder.parse("/home/vanitha/Eclipse/Java/src/xmlFile/employees.xml");
        //extract root node from xml doc
		Element root= document.getDocumentElement();
		NodeList nodelist =root.getChildNodes();
		
		for(int i=0;i<nodelist.getLength();i++) {
			Node node = nodelist.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String tagName = element.getTagName();
				String textContent = element.getTextContent();
				System.out.println("Tag Name: " +tagName);
				System.out.println("Text Content:"+ " " +textContent);

			}
		}
		
	}

}
