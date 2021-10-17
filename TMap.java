import java.util.*;
class TMap{
	public static void main (String [] args){
		TreeMap hm = new TreeMap();
		hm.put(150, "Java Full Stack");
		hm.put(150,"Python Full Stack");
		hm.put(80,"U Full Stack");
		for( Object object:hm.entrySet()){
			Map.Entry m=(Map.Entry) object;
			System.out.println(m.getKey()+ " = "+m.getValue());
		}
	}
}