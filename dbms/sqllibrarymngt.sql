create table Books(
book_id int primary key Auto_Increment,
title varchar(30),
author_id int,
publication_year int,
price decimal,
foreign key(author_id) references Author(author_id)
);

create table Author(
author_id int primary key Auto_Increment,
book_id int,
first_name varchar(25),
last_name varchar(25)
);

create table Borrowers(
borrower_id int primary key Auto_Increment,
first_name varchar(25),
last_name varchar(25),
email varchar(25) unique,
dob date
);

create table Loans(
loan_id int primary key Auto_Increment,
borrower_id int,
book_id int,
loan_date date,
return_date date,
foreign key(borrower_id) references Borrowers(borrower_id),
foreign key(book_id) references Books(book_id)
);

insert into Books(book_id,title,author_id,publication_year,price)values
(1,'Moby Dick',1,1897,25.00),
(2,'Great Expectations',2,1990,15.00),
(3,'The Great Gatsby',3,1991,22.00),
(4,'Pride and Prejudice',4,1885,30.00),
(5,'The Palace of Illusions',5,1993,18.00);
insert into Author(author_id,book_id,first_name,last_name)values
(1,1,'Bram','Stoker'),
(2,2,'Charles','Dicken'),
(3,3,'Scott','Fitzgerald'),
(4,4,'Jane','Austen'),
(5,5,'Chitra','Banerjee');
insert into Borrowers(first_name,last_name,email,dob) values
('Ram','S','rams@gmail.com','1880-01-03'),
('Jay','Mol','jaymol@gmail.com','1881-02-21'),
('Anu','Priya','anupriya@gmail.com','1882-12-05'),
('Daya','Prakash','dayaprakashaa2gmail.com','1883-11-04'),
('Aparna','R','aparnar@gmail.com','1884-04-11');

insert into Loans(loan_id,borrower_id,book_id,loan_date,return_date)values 
(101,1,1,'2024-02-02','2024-04-13'),
(102,2,2,'2024-06-01','2024-08-15'),
(103,3,3,'2024-01-01','2024-02-02'),
(104,4,4,'2023-12-12','2024-01-28'),
(105,5,5,'2023-10-05','2023-12-03');

select * from books;

select title,price,publication_year from books where price >20;

select first_name,last_name,email from borrowers
where borrower_id in (select borrower_id from Loans where loan_date>'2024-01-01'); 

update books
set price=25.00
where title='The Great Gatsby';

DELETE FROM Loans WHERE book_id = (SELECT book_id FROM Books WHERE title = "Moby Dick");
delete from Books
where title='Moby Dick';

alter table Books add genre varchar(20); 

select count(borrower_id) from borrowers;

select sum(price)
from books;

select avg(price)
from books;

select * from Books where book_id in (
	select book_id from Loans where borrower_id in(
		select borrower_id from Borrowers where timestampdiff(year,dob,curdate())>30));



