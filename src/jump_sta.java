public class jump_sta {
    public static void main(String[] args) {
       /*  for (int i = 0; i < 10; i++) {
            System.out.println("The value of index is "+i);
            if (i==3) {
                break;
                
            }  */
            System.out.println("The odd numbers between 1 to 10 are:");
            for (int number = 1; number <=10; number++) {
                if (number%2==0) {
                    continue;
                    
                }
                System.out.println("n=" +number);
                
            }
        }
    }

