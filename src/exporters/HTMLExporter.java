package exporters;

import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class HTMLExporter implements NumberExporter {

    private String fileName;

    public HTMLExporter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void export(List<Integer> numbers) {
        var htmlContent = new StringBuilder();
        htmlContent.append("<h1>MY NUMBERS</h1>");
        htmlContent.append("<ul>");
        for (var number : numbers) {
            htmlContent.append("<li>").append(number).append("</li>");
        }
        htmlContent.append("</ul>");
        try {
            FileWriter fileWriter = new FileWriter(fileName + ".html");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write(htmlContent.toString());
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Numbers are exported to " + fileName + ".html");

        try {
            URI fileURI = new URI(fileName + ".html");
            Desktop.getDesktop().browse(fileURI);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }
}
