package Doubts;

import java.util.List;

public class StreamsImpl {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Jack","joe" ,"Jill", "Jasmine", "Jasper", "Jade", "Jerry", "Juno");


        names.stream().filter(name -> name.startsWith("J") || name.startsWith("j"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
