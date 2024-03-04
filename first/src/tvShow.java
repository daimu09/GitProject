import java.util.ArrayList;

class Source{
	public String printIndex(ArrayList<String> list, int ind) {
		return "F";
		
	}
	public ArrayList<String> addAfter(ArrayList<String> a, String m, String n){
		int index=a.indexOf(m); //checking whether m string is present in
		//input array list a, and assigning its index number to index variable
		if(index== -1) //this means that m string is not present in input array list a
		{
			return a;// prints the input array list since m is not present in a
		}
		a.add(index+1,n);// n is added right after m, if it is present in a
		return a;// returns the input array list with new addition
	}
	public ArrayList<String> pickIndexAndAppend(ArrayList<String> p, int ind) {
		String picked=p.get(ind);
		p.remove(ind);
		p.add(picked);
		return p;
	}
}
	
public class tvShow {
	public static void main(String[] args) {
		Source source= new Source();
		
		ArrayList<String> myList=new ArrayList<>();
		myList.add("BB");
		myList.add("YS");
		myList.add("S");
		myList.add("ST");
		
		System.out.println(source.printIndex(myList,2));
		source.addAfter(myList,"YS","F");
		System.out.println(myList);
		source.pickIndexAndAppend(myList, 2);
		System.out.println(myList);
	}
}
