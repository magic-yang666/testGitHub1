import java.util.ArrayList;
import java.util.Iterator;

public class Books implements Iterable<Book>{
      ArrayList<Book> aa=new ArrayList<Book>();
      
      public Iterator<Book> iterator(){
    	  return this.aa.iterator();
    	  
      }
}
