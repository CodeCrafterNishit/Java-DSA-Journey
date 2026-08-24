package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapBasics {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        mapping.put("us", "United States");
        mapping.put("br", "Brazil");
        System.out.println(mapping);
        Map<String, String> table = new HashMap<>();
        table.put("en", "England");
        table.put("aus", "Australia");
        table.put("fr", "France");
        System.out.println(table);
        mapping.putAll(table);
        table.putIfAbsent("sl", "Sri Lanka");
        System.out.println(table);
        System.out.println(table.get("en"));
        System.out.println(table.getOrDefault("bs", "NONE"));
        System.out.println(table.containsKey("en"));
        System.out.println(table.containsValue("England"));
        System.out.println(mapping.replace("in", "Indonesia"));
        mapping.remove("us");
        System.out.println(mapping);
        Set<String> keyset = table.keySet();
        System.out.println(keyset);
        Collection<String> valueSet = table.values();
        System.out.println(valueSet);
        Set<Map.Entry<String, String>> st = table.entrySet();
        System.out.println(st);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value:" + entry.getValue());
        }

    }
}
