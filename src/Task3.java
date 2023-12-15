import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println("Array Length: " + colors.length);

        String[] clonedColors = colors.clone();
        System.out.println(Arrays.toString(clonedColors));
    }
}