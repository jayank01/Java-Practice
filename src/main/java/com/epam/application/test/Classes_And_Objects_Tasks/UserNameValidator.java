package com.epam.application.test.Classes_And_Objects_Tasks;

public class UserNameValidator {
    public Boolean Validate(String username) {
        for( char ch : username.toCharArray() ) {
            if( !((int)ch >= 48 && (int)ch <= 57) && !((int)ch >= 97 && (int)ch <= 122) ) {
                System.out.println("Print a Valid Username");
                return false;
            }
        }
        if( username.length() != 6 ) {
            System.out.println("Print a Valid Username");
            return false;
        }else {
            try {
                Integer.parseInt(username);
            }catch (Exception e){
                for( char ch : username.toCharArray() ) {
                    if( (int)ch >= 48 && (int)ch <= 57 ) {
                        System.out.println("Print a Valid Username");
                        return false;
                    }
                }

            }
        }
        return true;
    }

}
