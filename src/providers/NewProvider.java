package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        System.out.println("How many numbers do you want to enter?");

        Scanner scanner = new Scanner(System.in);

        int ListLength = scanner.nextInt();

        System.out.println("Please enter your numbers with a space to separate numbers");

        List<Integer> numberList =  new ArrayList<>();
        try{
            String line = scanner.next();
            String []  list = line.split(",");
            //System.out.println(line);

            for (String i:list
            ) {
                numberList.add(Integer.valueOf(i));
            }
        }
        catch(NumberFormatException ex){
            System.out.println("please enter again");
        }


        scanner.close();

        return numberList;
    }

}
