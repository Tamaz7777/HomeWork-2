public class Solution {
    public static void main(String[] args) {
        Person johnSmitrh = new Person(true, "John Smith");
        Person sara = new Person(false, "Sara Konor");
        Person lena = new Person(false, "Lena");
        johnSmitrh.marry(sara);
        johnSmitrh.marry(lena);
        System.out.println(johnSmitrh.marry(sara));
    }
}
