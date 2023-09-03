package org.study;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addValue("AC");
        list.addValue("BA");
        list.addValue("CE");
        list.addValue("DF");

        list.removeValue("CE");
        list.removeValue("DF");
        list.removeValue("BA");
        list.removeValue("AC");

        System.out.println(list.getSize());

        for (int i = 0; i < list.getSize(); i++) {
           System.out.println(list.get((Integer) i).getValue());
        }
    }
}