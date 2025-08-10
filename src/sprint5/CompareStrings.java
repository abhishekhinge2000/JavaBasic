package sprint5;

public class CompareStrings {
    public static void main(String[] args){
        String name1 = "Abhi";
        String name2 = "Abhi";
        String name3 = "Ravi";
        String name4 = "A";

        System.out.println(name1.compareTo(name2)); // 0 (both are equal)
        System.out.println(name1.compareTo(name3)); // -17 ("Abhi" < "Ravi")
        System.out.println(name1.compareTo(name4)); // 3 ("Abhi" > "A")
    }
}
