package com.quest.oops.librarymanagement;


public class Operations extends LibraryClass {
    private Book[] books=new Book[10];
    private LibraryMemberClass[] members=new LibraryMemberClass[10];
   private int bookCount = 0;
   private int memberCount = 0;


    @Override
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added");
        } else {
            System.out.println("Not Added");
        }
    }

    @Override
    public void addMember(LibraryMemberClass member) {
        if (memberCount < members.length) {
            members[memberCount] =  member;
            memberCount++;
            System.out.println("Member added successfully.");
        } else {
            System.out.println("Member limit reached");
        }

    }


    @Override
    public Book searchBook(String bookNo) {
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.getBookNo().equals(bookNo)) {
                System.out.println("Book found: " +book.getBookNo() + " Title:" + book.getTitle());
                return book;
            }
            }

        System.out.println("Book not found");
        return null;
    }

        @Override
        public void displayAvailableBook () {
            for (int i = 0; i < bookCount; i++) {
                Book book = books[i];
                if (book.isAvailable()) {
                    System.out.println(book.getBookNo() + " " + book.getTitle());

                }
            }

        }

    @Override
    public void displayAllMembers() {
        System.out.println("Library Members:");
        for (int i = 0; i < memberCount; i++) {
            LibraryMemberClass member = members[i];
            System.out.println("ID: " + member.getMember_id() +
                    ", Name: " + member.getMember_name() +
                    ", Address: " + member.getAddress());
        }

    }

    @Override
    public void borrowBook(LibraryMemberClass member,Book book) {
        if (book.getBookNo().isEmpty()) {
            System.out.println("Invalid book details.");
            return;
        }

        if (member.getMember_id().isEmpty()) {
            System.out.println("Invalid member details.");
            return;
        }


        if (book.isAvailable()) {
            member.borrowBook(book.getBookNo());
            book.setAvailable(false);
            System.out.println(member.getMember_name() + " borrowed: " + book.getTitle());
         }else {
            System.out.println("The book is not available.");
        }


    }

        @Override
        public void returnBook (LibraryMemberClass member, Book book) {
            if (book.isAvailable()) {
                System.out.println("Invalid book return.Because it is available");
                return;
            }
            book.setAvailable(true);
            member.returnBook(book.getBookNo());
            System.out.println("Book returned.");
        }
    }


