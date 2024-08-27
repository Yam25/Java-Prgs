public class prac37 
	{
    public static void main(String[] args) {
        int rows = 3; // You can change the number of rows as per your preference

        // Upper half of the Pascal Triangle
        for (int i = 1; i <= rows; i++) {
            // Print the left Pascal triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the Pascal Triangle (inverted)
        for (int i = rows - 1; i >= 1; i--) {
            // Print the left Pascal triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}