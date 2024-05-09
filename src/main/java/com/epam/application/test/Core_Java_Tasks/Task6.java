package com.epam.application.test.Core_Java_Tasks;


public class Task6 {
    String s;

    public Task6(String s) {
        this.s = s;
    }

    public void findDuplicateChars(){
        s = s.toLowerCase();
        int[] arr = new int[26];
        for( char ch : s.toCharArray() ) {
            if( ch == ' ' ) continue;
            if( arr[(int)(ch-'a')] == 1 ) System.out.println( ch );
            arr[(int)(ch-'a')]++;
        }
    }
}
