/*
               Z
           Y X
      W V U
    T S R Q
P O N M L
---------------------------
                Z
            Z Y
        Z Y X
    Z Y X W
Z Y X W V
*/
class prac49 
{
	public static void main(String[] args) 
	{
		int sp = 8; 
        char d = 'Z';
        for (int i = 1; i <= 5; i++) { 
            for (int k = 1; k <= sp; k++) {
                System.out.print(" ");
            } 
            for (int j = 1; j <= i; j++) {
                System.out.print(d--);
                if (j < i) {
                    System.out.print(" "); 
                }
            }   
            System.out.println();
            sp -= 2; 
        }
		System.out.println("---------------------------");
         int space = 8; 
        char c = 'Z';
        for (int i = 1; i <= 5; i++) { 
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            } 
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(c-j+1));
                if (j < i) {
                    System.out.print(" "); 
                }
            }   
            System.out.println();
            space -= 2; 
        }
	}
}
