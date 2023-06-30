import java.util.*;
class MaxMin{
  static void displayMaxMin(int a[]){
    int max=a[0];
    int min=a[0];
    for(int i=0; i<a.length; i++){
      if(max<a[i])
        max=a[i];
      else
        min=a[i];
    }
    System.out.println("max elemnts is " + max + "\n" + "min element is " + min);
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    int size=sc.nextInt();
    System.out.println("enter Array elements");
    int a[]=new int[size];
    for(int i=0; i<size; i++)
      a[i]=sc.nextInt();
    displayMaxMin(a);
  }
}