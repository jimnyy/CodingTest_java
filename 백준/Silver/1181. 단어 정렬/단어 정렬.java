import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<String> list = new ArrayList<>();
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<n; i++) 
			set.add(br.readLine());
		
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) 
			list.add(iter.next());
		
		
		//정렬 -> 단어길이 우선, 같으면 사전순
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int s1 = o1.length();
				int s2 = o2.length();
				if(s1>s2) return 1;
				else if(s1<s2) return -1;
				
				else {
					int headValue = o1.compareTo(o2);
					return headValue;
				}
			}
		});
		
		for(String s:list) 
			System.out.println(s);
	}
}