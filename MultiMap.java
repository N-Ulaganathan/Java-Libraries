import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MultiMap 
{
	Map<String, Set<String>> multiMap;
	
	public MultiMap() {
		multiMap = new HashMap<String, Set<String>>();
	}
	
	void add(String key, final String value) throws Exception{
		if(multiMap.containsKey(key))
			multiMap.get(key).add(value);
		else
			multiMap.put(key, new HashSet<String>(){{add(value);}});
	}
	
	HashSet<String> get(String key) throws Exception{
		if(multiMap.containsKey(key)){
			multiMap.get(key);
		}
		return null;
	}
	
	void remove(String key) throws Exception{
		if(multiMap.containsKey(key)){
			multiMap.remove(key);
		}
	}
	
	void removeItem(String key, final String value) throws Exception{
		if(multiMap.containsKey(key)){
			multiMap.get(key).remove(value);
		}
	}
	
	int length() throws Exception{
		return multiMap.size();
	}
}
