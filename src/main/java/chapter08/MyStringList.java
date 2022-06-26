package chapter08;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {
    private final String[] myList;

    public MyStringList(String[] strings) {
        myList = strings;
    }

    // 추상 메소드
    @Override
    public int size() {
        return myList.length;
    }

    // 추상 메소드
    @Override
    public String get(int index) {
        return myList[index];
    }

    // 후크
    @Override
    public String set(int index, String element) {
        String old = myList[index];
        myList[index] = element;
        return old;
    }
}
