
package discountprice;

import java.util.Scanner;


public class DiscountPrice {

   
    public static void main(String[] args) {
      
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Price");
        float price=s.nextInt();
        
        if(price>200){
       float price1=(price*5)/100;
       float discountPrice=price-price1;
        
            System.out.println("The Actual Amount is "+discountPrice);
            System.out.println("The Discount Amount is "+price1);
        }
        else{
            System.out.println("The Price is "+price);
        }
    }
    
}
