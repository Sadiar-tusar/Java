
package discountamount;

import java.util.Scanner;


public class DiscountAmount {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        
//        System.out.print("Enter product price: ");
//        float price = scan.nextFloat();
//        
//        final float discount = 0.05f;
//        float discountAmount;
//        float actualPrice;
//        
//        if(price>200){
//            discountAmount = price * discount;
//            actualPrice = price - discountAmount;
//        }
//        else{
//            discountAmount = 0;
//            actualPrice = price;
//        }
//        
//        System.out.println("Discount amount: " + discountAmount);
//        System.out.println("Actual price: " + actualPrice);
//        
      
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Price");
        float price=s.nextFloat();
        
        if(price > 200){
        float discount=price * 0.05f;
        float actual=price-discount;
        
            System.out.println("The Discount Price is "+discount);
            System.out.println("The Actual Price is "+actual);
        }
        
        else{
            System.out.println("The price is "+price);
        }
    }
    
}
