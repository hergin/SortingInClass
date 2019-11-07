package exporters;

import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TemporaryFileExporter implements NumberExporter{

    public static void main(String[] args)
    {
        File temp;
        try
        {
            temp = File.createTempFile("myTempFile", ".txt");

            //write data on temporary file
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
            bw.write("This is the temporary data written to temp file");
            bw.close();

            System.out.println("Written to Temp file : " + temp.getAbsolutePath());
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void export(List<Integer> numbers) {

    }
}

