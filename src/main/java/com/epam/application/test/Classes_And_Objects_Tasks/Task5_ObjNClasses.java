package com.epam.application.test.Classes_And_Objects_Tasks;

public class Task5_ObjNClasses {
    public void fun(String sentences, String oldWord, String newWord ) {
        String[] arr = sentences.split(" ");
        int cnt = 0;
        for( int i = 0 ; i < arr.length ; i++ ) {
            if( arr[i].equals(oldWord) ) {
                arr[i] = newWord;
            }
            cnt++;
        }
        StringBuilder sb = new StringBuilder();
        for( String a : arr ) {
            sb.append( a );
            sb.append(" ");
        }
        System.out.println( sb.toString() );
        System.out.println("Number of words in sentences are: " + cnt );
    }
}
