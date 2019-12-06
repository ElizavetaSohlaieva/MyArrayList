package com.epam.com;

import java.util.Arrays;

public class MyArrayList {
    private int capacity = 10;
    private int[] arr = new int[capacity];
    private int size = 0;

    private void changeSize() {
        int[] newArr = new int[capacity];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public void add(int elem) {
        arr[size] = elem;
        size++;
        if((int)(capacity * 0.75) <= size) {
            capacity = (int) (capacity * 1.2);
            changeSize();
        }
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("arr = [");
        for(int i = 0; i < size; i++) {
            builder.append(arr[i]);
            if(i < size-1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
    public void clear() {
        capacity = 10;
        size = 0;
        arr = new int[capacity];
    }
    public int size() {
        return size;
    }
    public void remove(int index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException("The index doesn't exist");
        }
        size--;
        int newArr[] = new int[capacity];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1, newArr, index, size - index);
        arr = newArr;
    }
    public int[] toArray() {
        return Arrays.copyOf(arr, size);
    }
    public boolean contains(int elem) {
        for(int i = 0; i < size; i++) {
            if(elem == arr[i]) {
                return true;
            }
        }
        return false;
    }
}

