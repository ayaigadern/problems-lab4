package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int maxSale;
        int maxSalePersonPosition=0;
        int minSale;
        int minSalePersonPosition=0;
        Scanner scan3=new Scanner(System.in);
        System.out.print(" Enter the number of sales people :" );
        int newSize=scan3.nextInt();
        int[] newarray= new int[newSize];
        for(int i=0;i<newSize;i++){
            newarray[i]=sales[i];
        }
        sales=newarray;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        maxSale=sales[0];
        minSale=sales[0];
        for (int i=0; i<sales.length; i++)
        {
            if(sales[i]>maxSale){
                maxSale=sales[i]; //finding the max sale
                maxSalePersonPosition=i; //finding the max sale position

            }
            if(sales[i]<minSale){
                minSale=sales[i]; //finding the min sale
                minSalePersonPosition=i; //finding the min sale position

            }

            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);

        double average=(double) sum/SALESPEOPLE;
        System.out.println("\nAverage sale: " + average);
        System.out.println("\nSalesperson "+(maxSalePersonPosition+1)+" had the highest sale with "+maxSale+" .");
        System.out.println("\nSalesperson "+(minSalePersonPosition+1)+" had the less sale with "+minSale+" .");

        //Sales Person who exceeded the amount
        System.out.print("Enter a value : ");
        Scanner scan2 = new Scanner(System.in);
        int value=scan2.nextInt();
        sum=0;
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        for(int i=0;i<sales.length;i++){

            if(sales[i]>=value){
                sum+=1;
                System.out.println(" " + (i+1) + " " + sales[i]);
            }

        }
        System.out.println("\n total number of salespeople whose sales exceeded \n" +
                "the value entered: " + sum);




    }
}