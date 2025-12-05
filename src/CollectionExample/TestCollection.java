package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {
    static void main(String[] args) {
        List <Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(7);
        numList.add(6);
        numList.add(-2);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);

        Collections.sort(numList);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);

        Collections.shuffle(numList);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);

        //Now no one can modify the list
        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
        //unmodifiable.add(5); //Thrown exception

    }
}
