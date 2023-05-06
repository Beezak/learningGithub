package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    HashMap<String, String> hmap = new HashMap<>();
    public void addHshMaoValue(){
        hmap.put("IE","Internet Explorer");
        hmap.put("CB","Chrome Browser");
        hmap.put("FF","Mozilla firefox");
        hmap.put("SB","safari browser");
        System.out.println("browser name of SB: "+ hmap.get("FF"));
        for(Map.Entry mEntry : hmap.entrySet()){
            System.out.println("key= "+mEntry.getKey()+ " Value= "+ mEntry.getValue());
        }
        System.out.println("Size of the map is "+hmap.size());
        if(hmap.containsKey("FF")){
            String value = hmap.get("FF");
            System.out.println("the value of FF is: "+ value);
        }

    }
    public static void main(String[] args) {
        HashMapEx hmObj = new HashMapEx();
        hmObj.addHshMaoValue();
    }
}
