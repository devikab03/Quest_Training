package com.quest.oops.librarymanagement;

public class LibraryMemberClass {

    private String member_id;
    private String member_name;
    private String address;
    private final String[] listBorrowedBooks=new String[10];


    public LibraryMemberClass(String member_id, String member_name, String address) {
        this.member_id = member_id;
        this.member_name = member_name;
        this.address = address;

    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMember_id() {
        return member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public String getAddress() {
        return address;
    }

    public String[] getListBorrowedBooks() {
        return listBorrowedBooks;
    }

    public void borrowBook(String bookNo) {
        for (int i = 0; i < listBorrowedBooks.length; i++) {
            if (listBorrowedBooks[i]==null) {
                listBorrowedBooks[i] = bookNo;
                return;
            }
        }

    }

    public void returnBook(String bookNo) {
        for (int i = 0; i < listBorrowedBooks.length; i++) {
            if (listBorrowedBooks[i].equals(bookNo)) {
                listBorrowedBooks[i] = null;
                return;
            }
        }


    }

}
