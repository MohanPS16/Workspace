package returnType;

public class A3_ReturnTypeTest {
	public static int price=100;
	
public static void main(String[] args) {
	int offerPrice= price-offer();
	System.out.println(offerPrice);
}
public static void fixedPrice(){
	System.out.println(price);
	
}
public static int offer(){
	int offer =10;
	return offer;
	
}
}
