import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Books books=new Books();
    	Scanner in = new Scanner (System.in);
    	
    	while(in.hasNextLine()) {
    	String a=in.nextLine();
    	if(a.equals("")) {break;}
    	String[] split=a.split("-");
    	Book book=new Book();
    	
    	int j=0;
    	for(String ad:split) {
    		if(j==0) {book.type=ad;}
    		if(j==1) {book.name=ad;}
    		if(j==2) {book.year=ad;}
    		if(j==3) {book.aditor=ad;}
    		if(j==4) {book.b=ad;}
    		
    		j++;
    	}
    //	if(book.type.equals("B")) {
    //	System.out.println(book.type+'-'+book.name+"-"+book.year+"-"+book.aditor+"-"+book.b);
    //	}
    	books.aa.add(book);
    	
    	
    	}
    	int u=0;
    	for(Book book1:books) {
    		if(book1.type.equals("B")) {
    			u++;
    		System.out.println(book1.type+"00"+u+'-'+book1.name+"-"+book1.year+"-"+"available-"+book1.aditor+"-"+book1.b);
    	}
    	}
    	u=0;
    	for(Book book1:books) {
    		if(book1.type.equals("R")) {
    			u++;
    		System.out.println(book1.type+"00"+u+'-'+book1.name+"-"+book1.year+"-available-"+book1.aditor+"-"+book1.b);
    	}
    	}
    	in.close();
    }
    
}
