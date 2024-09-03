package com.epam.basics.java8.java8.Design_Patterns.Singleton_Pattern;

public class BillPugh {

    private BillPugh(){
    }

    public static class BillPughHelper{
        private static final BillPugh INSTANCE = new BillPugh();
    }

    public static BillPugh getInstance(){
        return BillPughHelper.INSTANCE;
    }
}
