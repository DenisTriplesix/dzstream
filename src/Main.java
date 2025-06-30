import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> count = new ArrayList<>() ;
        
        count.add(222);
        count.add(333);
        count.add(444);
        count.add(222);
        count.add(555);

        List<Integer> collect = count.stream()

                .filter(n -> n % 2 == 0)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);

        }
    }
