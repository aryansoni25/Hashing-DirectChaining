package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        DirectChaining dc=new DirectChaining(13);
        dc.insertHashTable("The");
        dc.insertHashTable("quick");
        dc.insertHashTable("browny");
        dc.insertHashTable("fox");
        dc.insertHashTable("over");
        dc.displayHashTable();
        dc.searchHashTable("fox");
        dc.deleteKeyHashTable("over");
    }
}