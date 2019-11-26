package providers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUser implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {

        List<Integer> theList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of inputs");
        var inputCount = input.nextInt();

        for (int i = 1; i <= inputCount; i++)
        {
            if (i==1)
            System.out.println("Please input the " + i + "st number to be sorted:");
            if (i==2)
                System.out.println("Please input the " + i + "nd number to be sorted:");
            if (i==3)
                System.out.println("Please input the " + i + "rd number to be sorted:");
            if (i>3)
                System.out.println("Please input the " + i + "th number to be sorted:");

            theList.add(input.nextInt());
        }

        return theList;
    }
}
