import java.util.*;

public class product{
int ItemNo;
String ItemName;
int Price;

product(int ItemNo,String ItemName,int Price){
this.ItemNo = ItemNo;
this.ItemName = ItemName;
this.Price = Price;
}

@Override
    public String toString() {
        return "ItemNo: " + ItemNo + ", ItemName: " + ItemName + ", Price: " + Price;
    }

public static void retrival(String str,HashMap<String,product> arr){

for(Map.Entry<String,product> en : arr.entrySet()){
if(en.getKey().equals(str)){
System.out.println(en.getValue());
}
}
}



    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear newline character

        HashMap<String, product> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Product " + (i + 1) + " ---");
            
            System.out.print("Enter Key String: ");
            String str = sc.nextLine();

            System.out.print("Enter Item Number: ");
            int ItemNo = sc.nextInt();
            sc.nextLine(); // Clear newline character

            System.out.print("Enter Item Name: ");
            String ItemName = sc.nextLine();

            System.out.print("Enter Price: ");
            int Price = sc.nextInt();
            sc.nextLine(); // Clear newline character

            product p = new product(ItemNo, ItemName, Price);
            hm.put(str, p);
        }

        System.out.print("\nEnter the Key String to search for: ");
        String searchstr = sc.nextLine();
        
        retrival(searchstr,hm);
}
}