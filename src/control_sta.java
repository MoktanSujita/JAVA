//control Statements in JAVA
public class control_sta {
    public static void main(String[] args) {
        
       //if statement
       String str="good";
        if(str=="good")
        {
            System.out.println("It's good");
        }
        else {
            System.out.println("it's not good");
        }
         String role ="1";
        //if...else statement
        if(role=="1")
        {
            System.out.println("one");
        }
        else if (role =="2") {
            System.out.println("two");
        }
        else if (role =="3") {
            System.out.println("three");
        }
        else {
            System.out.println("enter 1 to 3");
        }
        
        //Switch Case
        int a=1;
        switch (a) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                 System.out.println("two");
                 break;
            case 3:
            System.out.println("three");
            break;
            default:
            System.out.println("Enter 1 to 3");
                break;
            
            //Loop Statements
            //while loop
            int i=3;
                while (i<5) {
                System.out.println(i);
                i++;   
                
            //do ... while loop
            /*int i=3;
            do {
                System.out.println(a);
                a++;   
            } while (i<5);
             
            //for loop
            for (int j = 0; j < 5; j++) {
                System.out.println(j);    
            }
            */
                //for each loop
                int[]intarr=new int[]{1,2,3,4,5};
                for (int i : intarr) {
                    System.out.println(i);
                    
                }
        }
 
    }
    

