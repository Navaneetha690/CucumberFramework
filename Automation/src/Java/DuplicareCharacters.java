package Java;

import java.util.HashMap;
import java.util.Map;

public class DuplicareCharacters {

	public static void main(String[] args)
	{
		String str="Navaneetha";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			  char c = str.charAt(i);
			  if (map.containsKey(c)) {
			    int count = map.get(c);
			    map.put(c, ++count);
			  } else {
			    map.put(c, 1);
			  }
			}
		System.out.println(map);
	}

}
