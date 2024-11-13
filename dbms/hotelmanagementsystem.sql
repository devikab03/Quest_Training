create table Customers(
customer_id int primary key,
first_name varchar(25),
last_name varchar(25),
email varchar(25),
phone_number varchar(25),
address varchar(25)
);

create table Rooms(
room_id int primary key,
room_type varchar(25),
price_per_night varchar(25),
room_status varchar(25),
floor_number int 
);

create table Reservations(
reservation_id int primary key,
customer_id int,
room_id int,
reservation_date date,
check_in_date date,
check_out_date date,
reservation_status varchar(25),
foreign key (customer_id) references Customers(customer_id),
foreign key (room_id) references Rooms(room_id)
);

create table Payments(
payment_id int primary key,
reservation_id int,
payment_date date,
amount_paid int,
payment_method varchar(25),
foreign key (reservation_id ) references Reservations(reservation_id) on delete cascade
);

create table Staff(
staff_id int primary key,
first_name varchar(25),
last_name varchar(25),
staff_role varchar(25),
hire_date date
);

create table RoomAssignments(
assignment_id int primary key,
staff_id int,
room_id int,
assignment_date date,
task_description varchar(25),
foreign key (staff_id ) references Staff(staff_id ),
foreign key (room_id ) references Rooms(room_id)
);

insert into Customers(customer_id, first_name, last_name, email, phone_number, address) values
(1,"Aby","John","abyjohn@gmail.com","9458221177","Aby House"),
(2,"Advik","Lal","adviklal@gmail.com","9458263441","Lal House"),
(3,"Vinu","k","vinu123@gmail.com","7485961236","Vinu House"),
(4,"Sharan","Thomas","sharan@gmail.com","9985961236","Sharan House"),
(5,"Riya","Sanal","riya@gmail.com","9924561236","Riya House");

insert into Rooms (room_id, room_type, price_per_night, room_status, floor_number) values
(1,"single",100,"available",1),
(2,"double",150,"occupied",2),
(3,"suite",200,"under maintenance",3),
(4,"single",100,"under maintenance",1),
(5,"double",150,"available",3);

insert into Reservations (reservation_id, customer_id, room_id, reservation_date, check_in_date, check_out_date, reservation_status) values
(1,1,5,"2024-08-01","2024-08-06","2024-08-12","confirmed"),
(2,2,4,"2024-09-02","2024-09-07","2024-09-09","completed"),
(3,3,1,"2024-10-03","2024-10-10","2024-10-12","cancelled"),
(4,4,3,"2024-11-06","2024-11-08","2024-11-14","confirmed"),
(5,5,2,"2024-12-15","2024-12-16","2024-12-21","completed");

insert into Payments (payment_id, reservation_id, payment_date, amount_paid, payment_method) values
(1,1,"2024-08-01",250,'cash'),
(2,2,"2024-09-08",500,'credit card'),
(3,3,"2024-10-04",300,'cash'),
(4,4,"2024-11-06",700,'credit card'),
(5,5,"2024-12-16",200,'cash');

insert into Staff(staff_id, first_name, last_name, staff_role, hire_date) values
(1,"Leena","das","receptionist","2022-02-02"),
(2,"Manu","Shankar","Manager","2021-11-05"),
(3,"Ravi","Prakash","HouseKeeper","2023-04-13"),
(4,"Smitha","R","receptionist","2022-06-11"),
(5,"Kailas","S","HouseKeeper","2021-07-01");

insert into RoomAssignments (assignment_id, staff_id, room_id, assignment_date, task_description)values
(1,1,1,"2024-01-01","Check the Accounts"),
(2,2,3,"2024-02-10","Assigns task "),
(3,3,4,"2024-01-06","Clean the room"), 
(4,5,2,"2024-08-11","Deep Cleaning"),
(5,4,5,"2024-06-07","Check Reservation details");

select * from Rooms
where floor_number=3
and room_status="available";

select r.*,c.first_name,c.last_name,c.email
from reservations r
join customers c
on r.customer_id=c.customer_id
order by check_in_date;

select c.*
from customers c
join reservations r
on c.customer_id=r.customer_id
where datediff(check_out_date,check_in_date)>5;

select r.reservation_id,sum(p.amount_paid) as total_amount
from payments p
join reservations r
on p.reservation_id=r.reservation_id
group by r.reservation_id;

select r.room_type,avg(r.price_per_night) as avg
from rooms r
group by r.room_type;

select sum(p.amount_paid) as total
from payments p
join reservations r
on p.reservation_id=r.reservation_id
where p.payment_date >= CURDATE() - INTERVAL 1 MONTH;

select s.*,count(r.room_id) as total_assignments
from staff s
join roomassignments r
on r.staff_id=s.staff_id
where r.assignment_date>=CURDATE() - INTERVAL 1 MONTH
group by s.staff_id;

select c.*, max(r.reservation_date) as recent_reservation
from customers c
join reservations r
on c.customer_id=r.customer_id
group by c.customer_id
order by recent_reservation desc;

delete from reservations where reservation_id=1;












