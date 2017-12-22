import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int beg=bubSort(num,1);
        int end=bubSort(num,2);
        for(int i=beg;i<=end;i++)
        {
            int temp=bubSort(i,1);
            if(temp==beg)
            System.out.println(i);
        }
        
     }
     static int len(int num)
     {
         int cnt=0;
         while(num!=0)
         {
             cnt++;
             num/=10;
         }
         return cnt;
     }
     static int bubSort(int num,int choice)
     {
         int cnum=num;
         int snum=num;
         int size=len(cnum);
         int arr[]=new int[size];
         for(int i=0;i<size;i++)
         {
             arr[i]=snum%10;
             snum/=10;
         }
         int temp=0;
         for(int i=0;i<size;i++)
         {
             for(int j=1;j<(size-i);j++)
             {
                 if(arr[j-1]>arr[j])
                 {
                     temp=arr[j-1];
                     arr[j-1]=arr[j];
                     arr[j]=temp;
                 }
             }
         }
         String s="";
         for(int i=0;i<size;i++)
         {
             s=s+Integer.toString(arr[i]);
         }
         
         if(choice!=1)
         {
             s="";
             for(int i=size-1;i>=0;i--)
             {
              s=s+Integer.toString(arr[i]);
             }
             
         }
         return(Integer.parseInt(s));
     }
}
