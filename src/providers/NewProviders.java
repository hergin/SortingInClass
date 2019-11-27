package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NewProviders implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {

        List<Integer> listOfNum = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter:");

        int num = sc.nextInt();
        for (int i=0;  i<num; i++){
            System.out.println("enter the number: ");
            int eachNum = sc.nextInt();
            listOfNum.add(eachNum);

        }
        return listOfNum;

    }
}
