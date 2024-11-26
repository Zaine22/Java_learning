public class CustomPair<K,V> implements Pair<K,V>{

    private K key;
    private V value;

    public CustomPair(K key, V Value) {
        setKey(key);
        setValue(Value);
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key =key;
    }

    @Override
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public V getValue() {
        return value;
    }
}
