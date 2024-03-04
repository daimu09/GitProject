import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TransactionParty{
	String seller;
	String buyer;
	
	public TransactionParty(String seller, String buyer) {
		this.seller=seller;
		this.buyer=buyer;
	}
}
class Receipt{
	TransactionParty transactionParty; 
	String productsQR;
	
	public Receipt(TransactionParty transactionParty, String productsQR) {
		this.productsQR=productsQR;
		this.transactionParty=transactionParty;
	}
}
class GenerateReceipt{
	public int verifyParty(Receipt r) {
		String sellerName=r.transactionParty.seller;
		String buyerName=r.transactionParty.buyer;
		
		if(isValid(sellerName) && isValid(buyerName)) {
			return 2;
		}
		else if(isValid(sellerName) || isValid(buyerName)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	private boolean isValid(String name){
		Pattern pattern=Pattern.compile("^[A-Za-z\\s'-]+$");
		Matcher matcher=pattern.matcher(name);
		return matcher.matches();
	}
	
	public String calcGST(Receipt r) {
		String[] parts=r.productsQR.split("@");
		int total_GST=0;
		for(String product:parts) {
			String[] rateAndQuantity=product.split(",");
			
			int rate=Integer.parseInt(rateAndQuantity[0]);
			int quantity=Integer.parseInt(rateAndQuantity[1]);
			
			total_GST +=rate*quantity;
		}
		int GST_Rate=12;
		int GST=(total_GST * GST_Rate)/100;
		return Integer.toString(GST);
	}
	
}

public class Validation {
	public static void main(String[] args) {
		TransactionParty tp=new TransactionParty(" gghh","gghyj");
		Receipt receipt=new Receipt(tp,"250,10@100,3@50,7");
		GenerateReceipt gr=new GenerateReceipt();
		
		int verifyParty_result=gr.verifyParty(receipt);
		System.out.println(verifyParty_result);
		
		String calcGST_result=gr.calcGST(receipt);
		System.out.println(calcGST_result);
		
	}
}
