package CollectionExample;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(7);
        numList.add(6);
        numList.add(8);
        Utility.print(numList);
    }
}
