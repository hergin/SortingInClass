package providers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        List<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("Enter a number: ") ;
            result.add(sc.nextInt());
        }
        return result;
    }
}
