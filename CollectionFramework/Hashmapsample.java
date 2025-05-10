



package CollectionFramework;
import java.util.HashMap;
import java.util.Iterator;

// it is implemented class of Map Interface
// the underlying data stricture is hash table
// it allows only one null as key but value can have mutiple nulls
// it does not guarantee any specific order of key or values
// the default capacity is 16

// working
// Hashing is process of converting an Object into fixed size integer value using the hashCode() method
// HashMap is an array of buckets. Each bucket can hold one or more entry(key-value pairs).
// equals() method : this method is used to identify wheather 2 objects are equal or not

// Using below code it will find the index:
// index= hash(key) & (length-1)
// First it will calculate the hashcode of Key
// Second, it will calculate the index.
// Create the node.
// Then, insert that node to the calculated index
// IN CASE OF COLLISION 
// if element is found at given index - this is called collision
// in that case check via equal() method if both the keys are same
// if same replace the value
// if not same , add the node to next node of exisiting node

public class Hashmapsample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        for(Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        for(String val : map.values()) {
            System.out.println(val);
        }

        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            System.out.println(key + " : " + map.get(key));
        }

        map.forEach((k, v) -> System.out.println(k + " == " + v));
     }
}



