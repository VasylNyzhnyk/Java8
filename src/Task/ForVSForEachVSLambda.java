package Task;

import java.util.ArrayList;

public class ForVSForEachVSLambda {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.forEach(String -> System.out.println(String));

        System.out.println("---------------------------------");


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------------------------");
        for (String i : list
        ) {
            System.out.println(i);

        }

    }
}
