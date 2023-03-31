import java.util.Scanner;
class StrongNumber
{
  public static void main(String args[])
  {
    int n,i,fact,rem,num,sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    n = sc.nextInt();
    num = n;
    while(num!=0)
    {
      i = 1;
      fact= 1;
      rem = num % 10;
      while(i<=rem)
      {
        fact= fact*i;
        i++;
      }
    }
    if(sum == num)
      System.out.println("The no. is Strong Number");
    else
      System.out.println("The no. is not a Strong Number");
  }
}
