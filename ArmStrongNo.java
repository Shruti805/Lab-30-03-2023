import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
	
		
		 int num , remainder ,actual , result =0;
         System.out.println("Enter a number:");
         Scanner sc = new Scanner(System.in);

         

         num = sc.nextInt();
         actual = num;

         
         while(num>0){
            remainder=num%10;
            result+= Math.pow(remainder, 3); ;
            num=num/10;
         }
         if (actual==result)
            System.out.println("The number is armstrong");
         else
            System.out.println("The number is not armstrong");       	
			
	}

}
