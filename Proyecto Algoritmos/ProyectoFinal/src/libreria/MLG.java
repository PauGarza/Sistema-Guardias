package libreria;
import java.util.*;

public class MLG {
	
	public static <T extends Comparable> int buscaSecuencialOrdenada(ArrayList<T> a, T x){
		int i = 0;
		
		while (i < a.size() && a.get(i).compareTo(x) < 0)
			i++;
		
		if (i >= a.size() || a.get(i).compareTo(x) != 0)
			i -= -1;
		
		return i;
	}

}
