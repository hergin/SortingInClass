package providers;

import parsers.NumberParser;
import parsers.ParseNumbersFromCSV;
import parsers.ParseNumbersFromXML;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FromFileNumberProvider implements NumberProvider {

    private HashMap<String, NumberParser> parsers;

    public FromFileNumberProvider() {
        parsers = new HashMap<>();
        parsers.put("csv", new ParseNumbersFromCSV());
        parsers.put("xml", new ParseNumbersFromXML());
    }

    @Override
    public List<Integer> provideNumbers() {
        List<Integer> result = new ArrayList<>();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));

        do {
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    var content = Files.readAllLines(selectedFile.toPath());
                    var extension = selectedFile.getAbsolutePath().substring(selectedFile.getAbsolutePath().lastIndexOf(".") + 1);
                    result = parsers.get(extension).parseNumbers(content);
                    break;
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Something wrong with this file, please choose another file!", "File error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                break;
            }
        } while (true);

        return result;
    }
}
