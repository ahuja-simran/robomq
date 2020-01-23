import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

 

public class AuthorMap {

 

    public static void main(String[] args) {
        TreeMap<String,Author> author=new TreeMap<String,Author>();
        HashSet<String> set = new HashSet<String>();
        author.put("Book1", new Author(101,"Simran","KOta"));
        author.put("Book2", new Author(102,"Abhishek","Jaipur"));
        author.put("Book3", new Author(103,"Shubham","Kota"));
        author.put("Book4", new Author(102,"Harsh","Jaipur"));

 

        
        System.out.println(author);
        System.out.println();
        
        Set<String> keys=author.keySet();
        //Author a=author.get(keys);
        //String name1=a.getName();
        //System.out.println(name1);
        for(String i:keys)
        {
            Author a1=author.get(i);
            System.out.println(i+" written by "+a1.getName()+" residing at "+a1.getAddress());
        }
        
        System.out.println("Books written by: ");
        for(String i:keys) {
            Author a=author.get(i);
            
            if(set.add(a.getName())==false) {
                System.out.println("Book Name "+i+"AuthorName "+a.getName()+"Residing at "+a.getAddress());
            }
        }
        
        
    }

 

}