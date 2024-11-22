package com.quest.oops.lms;

public class PremiumMember extends Member {

    public PremiumMember(String name, String id, String memberType) {
        super(name, id, memberType);
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("PremiumMember have privileges");
        super.borrowBook(book);
    }

}
