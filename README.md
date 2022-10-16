# Javaimport java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	ArrayList<Integer> List=new ArrayList<Integer>();  // fungtion for arrayList;
	
	
	
	List.add(0);
	List.add(2);  //declair array
	List.add(4);
	
	//Printing all elements
	System.out.println(List);
	
	//removing ArrayList
	List.remove(1);
	System.out.println(List);
	
	//Adding Element in ArrayList
	List.add(0,5);
    System.out.println(List);
    
    //Array size
    int size=List.size();
    System.out.println(List);
    
    //Array get
    int element= List.get(0);
    System.out.println(element);
    
    
    //Printing All the elements
	for(int i=0; i<List.size(); i++){
	    System.out.print(List.get(i));
	}
	
	}
}
