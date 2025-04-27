package testhacker;

import java.util.Scanner;

public class TestHacker {

    public static void main(String[] args) {

//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Number");
//        int number=s.nextInt();
//        System.out.println("Enter Double Value");
//        double d=s.nextDouble();
//        System.out.println("Enter Text");
//        String str=s.next();
//        
//        System.out.println(number);
//         System.out.println(d);
//          System.out.println(str);
//        
// Scanner scan = new Scanner(System.in);
//        Scanner scan = new Scanner(System.in);

//        int i = scan.nextInt();
//
//        double d = scan.nextDouble();
//
//        scan.nextLine();
//        String s = scan.nextLine();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

// Scanner sc=new Scanner(System.in);
//            System.out.println("================================");
//            for(int i=0;i<3;i++){
//                String s1=sc.next();
//                int x=sc.nextInt();
//                System.out.printf("%-15s%03d%n",s1,x);
//               
//            }
//            
//            System.out.println("================================");
//sc.close();

 Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
         
        in.close();
    }

}
