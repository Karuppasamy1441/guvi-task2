import java.util.*;
public class ProductMain {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Product[] products=new Product[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter PId:");
            int pid=in.nextInt();
            System.out.println("Quantity.. ");
            int quantity=in.nextInt();
            System.out.println("price Rs ");
            double price=in.nextDouble();
            products[i]=new Product(pid,quantity,price);
        }
        int maxpid=products[0].pid;
          double  totalprice=0;

        double maxprice=products[0].price;
        for(Product prod:products){
            if(prod.price>maxprice){
                maxpid=prod.pid;
                maxprice= prod.price;
            }
            totalprice =totalprice+ prod.price;
        }System.out.println("pid amount spent hightest price :"+maxpid);
        System.out.println("Total amount :"+totalprice);






    }

}
