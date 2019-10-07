import java.util.*;

public class BSTMap<K extends Comparable<K>, V > implements  Map<K, V>  {

    BinarySearchTree<K,V> start;

    public BSTMap () {
        start = new BinarySearchTree<>();
    }

    public boolean containsKey(K key) {
        try {
            start.find(key);
            return true;
        } catch (KeyNotFoundException e){
            return false;
        }
    }

    public V get (K key) throws KeyNotFoundException {
        return start.find(key);
    }

    public List<Entry<K,V> >	entryList() {
        return start.entryList();
    }

    public void put (K key, V value) {
        start.insert(key,value);
    }

    public int size() {
        return start.size();
    }

    public void clear() {
        start.clear();
    }

    public int getGetLoopCount() {
        return start.getFindLoopCount();
    }

    public int getPutLoopCount() {
        return start.getInsertLoopCount();
    }

    public void resetGetLoops() {
        start.resetFindLoops();
    }

    public void resetPutLoops() {
        start.resetInsertLoops();
    }
}