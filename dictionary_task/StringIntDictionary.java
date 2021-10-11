package ru.kpfu.itis.dictionary;

import java.util.Arrays;
import java.util.Objects;

public class StringIntDictionary implements IStringIntDictionary{
    final int DICTIONARY_CAPACITY = 1000;
    String[] keys = new String[DICTIONARY_CAPACITY];
    int[] values = new int[DICTIONARY_CAPACITY];
    int counter = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringIntDictionary dictionary = (StringIntDictionary) o;
        return counter == dictionary.counter &&
                Arrays.equals(keys, dictionary.keys) &&
                Arrays.equals(values, dictionary.values);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(DICTIONARY_CAPACITY, counter);
        result = 31 * result + Arrays.hashCode(keys);
        result = 31 * result + Arrays.hashCode(values);
        return result;
    }

    @Override
    public String toString() {
        return "Dictionary {" +
                "Keys = " + Arrays.toString(keys) +
                ", Values = " + Arrays.toString(values) + "}";
    }

    @Override
    public void add(String key, Integer value) {
        keys[counter] = key;
        values[counter] = value;
        counter++;
    }

    @Override
    public void set(String key, Integer value) {
        for (int i = 0; i <= counter; i++) {
            if (key.equals(keys[i])) {
                keys[i] = key;
                values[i] = value;
            }
        }
    }

    @Override
    public Integer get(String key) {
        int result = 0;
        for (int i = 0; i <= counter; i++) {
            if (key.equals(keys[i])) {
                result = values[i];
            }
        }
        return result;
    }

    @Override
    public StringIntDictionary merge(StringIntDictionary dictionary) {
        StringIntDictionary newDictionary = new StringIntDictionary();
        newDictionary.counter = counter + dictionary.counter;
        newDictionary.keys = keys;
        newDictionary.values = values;
        int j = 0;
        for (int i = counter; i < newDictionary.counter; i++) {
            newDictionary.keys[i] = dictionary.keys[j];
            newDictionary.values[i] = dictionary.values[j];
            if (j <= dictionary.counter) {
                j++;
            }
        }
        return newDictionary;
    }

    @Override
    public String getKey(Integer value) {
        String result = "Key not found";
        for (int i = 0; i <= counter; i++) {
            if (value == values[i]) {
                result = keys[i];
            }
        }
        return result;
    }

    @Override
    public void remove(String key){
        int index = -1;
        for (int i = 0; i <= counter; i++) {
            if (key.equals(keys[i])) {
                index = i;
            }
        }
        try {
            for (int i = index; i < counter; i++) {
                keys[i] = keys[i+1];
                values[i] = values[i+1];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Entered key doesn't exist in the dictionary");
        }
    }

    @Override
    public int size() {
        return counter;
    }
}
