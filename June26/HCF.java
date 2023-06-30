import java.util.*;
class HCF{
  static void displayHCf(int div, int di){
    int rem=0;
    int hcf=0;
    do{
      rem=div%di;
      if(rem==0){
      hcf=di;
     }
     else {
      div=di;
      di=rem;
     }
    }while(rem!=0);
    System.out.println("HCF: "+ hcf);
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter dividend number");
    int dividend=sc.nextInt();
    System.out.println("Enter divisor number");
    int divisor=sc.nextInt();
    displayHCf(dividend,divisor);
  }
}