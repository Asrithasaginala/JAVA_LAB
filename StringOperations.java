import java.util.Scanner;

class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Reversed: " + new StringBuilder(str).reverse());
        System.out.print("Enter substring to search: ");
        String sub = sc.nextLine();

        if (str.contains(sub))
            System.out.println("Substring found at index " + str.indexOf(sub));
        else
            System.out.println("Substring not found!");
    }
}
