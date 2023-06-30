import java.util.*;
class MerageTwoArrays{
  static void displayMerageTwoArrays(int a1[], int a2[]){
    int len=a1.length+a2.length;
    int a[]=new int[len];
    int k=0;
    for(int i=0; i<a1.length; i++){
      a[k]=a1[i];
      k++;
    }
    for(int j=0; j<a2.length; j++){
      a[k]=a2[j];
      k++;
    }
    for(int i=0; i<len; i++){
      System.out.print(a[i] + " ");
    }
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    int size=sc.nextInt();
    System.out.println("Enter First Array elements");
    int a1[]=new int[size];
    for(int i=0; i<size; i++)
      a1[i]=sc.nextInt();
    System.out.println("Enter Second Array elements");
    int a2[]=new int[size];
    for(int j=0; j<size; j++)
      a2[j]=sc.nextInt();
    displayMerageTwoArrays(a1,a2);
  }
}