package exporters;

import java.util.List;
import java.util.Scanner;
public class NewExport implements NumberExporter {


    @Override
    public void export(List<Integer> numbers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print: ");
        for (var i : numbers){
            System.out.print(i + " ");
        }


    }
}
