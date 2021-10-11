package ru.kpfu.itis.dictionary;

public interface IStringIntDictionary {
    void add(String key, Integer value);
    void set(String key, Integer value);
    Integer get(String key);
    StringIntDictionary merge(StringIntDictionary dictionary);
    String getKey(Integer value);
    void remove(String key);
    int size();
}
