package parsers;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseNumbersFromXML implements NumberParser {
    @Override
    public List<Integer> parseNumbers(List<String> content) {
        List<Integer> result = new ArrayList<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new ByteArrayInputStream(String.join(" ", content).getBytes()));
            document.getDocumentElement().normalize();
            NodeList elements = document.getElementsByTagName("number");
            for (int i = 0; i < elements.getLength(); i++) {
                var node = elements.item(i);
                result.add(Integer.parseInt(node.getFirstChild().getNodeValue()));
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
