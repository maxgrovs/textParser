package by.grovs.task.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(3);
        a.add(5);

        b.add(2);
        b.add(4);
        b.add(8);


        int n = a.size();

        for (int i = 0; i < b.size(); i++) {

            for (int j = 0; j < n; j++) {

                if (a.get(j) < b.get(i)) {

                    a.add(j+1, b.get(i));
                    n++;
                }
                break;

            }
        }


        System.out.println(a);

    }


}
