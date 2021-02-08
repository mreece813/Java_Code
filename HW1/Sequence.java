import java.util.ArrayList;
/**
 * HW1
 * Michael Reece
 * 177000762
 */
public class Sequence
{
    private ArrayList<Integer> values;
    
    public Sequence() 
    {
	values = new ArrayList<Integer>();
    }
	
    public void add(int n) 
    {
        values.add(n);   
    }
	
    public String toString() 
    {
		return values.toString();
    }

    private int size() 
    { 
		return values.size(); 
    }
    private int get(int n) 
    { 
		return values.get(n); 
    }
    public Sequence merge(Sequence other) 
    { 
            Sequence output = new Sequence();
            if(this.size() > other.size()){
                    for(int i = 0; i < other.size(); i++) {
                            output.add(this.get(i));
                            output.add(other.get(i));
                    }
                    for(int j = other.size(); j < this.size(); j++) {
                            output.add(this.get(j));
                    }
			
            }
            else if(this.size() < other.size()){
                    for(int i = 0; i < this.size(); i++) {
                            output.add(this.get(i));
                            output.add(other.get(i));
                    }
                    for(int j = this.size(); j < other.size(); j++) {
                            output.add(other.get(j));
                    }
		}
            else{
                    for(int i = 0; i < this.size(); i++) {
                            output.add(this.get(i));
                            output.add(other.get(i));
                    }
                }
                
                
		return output;
    }
    public static void main(String args[]) 
    { 
        // This has the arrays that are given
	Sequence array1 = new Sequence();
	Sequence array2 = new Sequence();
	array1.add(3);
	array1.add(4);
	array1.add(1);
	array1.add(8);
	array2.add(2);
	array2.add(6);
	array2.add(10);
	array2.add(9);
	System.out.println(array1);
	System.out.println(array2);
	System.out.println(array1.merge(array2));
    }
}
