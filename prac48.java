/*
                A
             B C
          D E F
       G H I J
K L M N O
---------------------------
                 A
             A B
          A B C
      A B C D
  A B C D E
  */
class prac48 {
    public static void main(String[] args) {
        int space = 8; // Initial space to align the first letter
        char c = 'A';

        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            // Print characters with spaces between them
            for (int j = 1; j <= i; j++) {
                System.out.print(c++);
                if (j < i) {
                    System.out.print(" "); // Adding space between characters
                }
            }

            // Move to the next line and reduce leading spaces
            System.out.println();
            space -= 2;
        }
		System.out.println("---------------------------");
         int sp = 8; 
        char d = 'A';
        for (int i = 1; i <= 5; i++) { 
            for (int k = 1; k <= sp; k++) {
                System.out.print(" ");
            } 
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(d+j-1));
                if (j < i) {
                    System.out.print(" "); 
                }
            }   
            System.out.println();
            sp -= 2; 
        }
    }
}

