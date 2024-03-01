create database database1;
use database1;
create table teacher(
teach_id  int not null auto_increment primary key,
teach_name varchar(30),
teach_contact bigint(15) unique,
teach_address varchar(30),
teach_gender varchar(10));
drop table teacher;
select * from teacher;
insert into teacher(teach_name,teach_contact,teach_address,teach_gender)
value("CSR",9876543210,"Bangalore","male");
create table student(stu_id int not null auto_increment primary key,
 stu_name varchar(30),
 stu_contact bigint(15) unique,
 stu_address varchar(30),
 stu_gender varchar(10),
 stu_email varchar(50));
 alter table student modify stu_email varchar(50);
 insert into student(stu_name,stu_contact,stu_address,stu_gender,stu_email)
 values("Lalu",7008252352,"Daringbadi","male","laluprasaddash23.sangamone@gmail.com");
  insert into student(stu_name,stu_contact,stu_address,stu_gender,stu_email)
 values("Shashank",8618724348,"Tarikare","male","shashanks.sangamone@gmail.com");
insert into student(stu_name,stu_contact,stu_address,stu_gender,stu_email)
 values("Sivashankar",8762467173,"Mallasandra","male","sivashankarchandrappa.sangamone@gmail.com");
 create table booking_slots(slot_id int not null auto_increment primary key, slot_timings DATETIME, slot_status boolean);
 insert into booking_slots(slot_timings,slot_status)
 values("2024-03-02 06:00:00",TRUE);
 insert into booking_slots(slot_timings,slot_status)
 values("2024-03-02 06:30:00",TRUE);
 insert into booking_slots(slot_timings,slot_status)
 values("2024-03-02 07:00:00",TRUE);
 insert into booking_slots(slot_timings,slot_status)
 values("2024-03-02 07:30:00",TRUE);
 insert into booking_slots(slot_timings,slot_status)
 values("2024-03-03 08:15:00",TRUE);
 insert into booking_slots(slot_timings,slot_status)
 values("2024-03-03 08:45:00",TRUE);
 
 select *from teacher;
select * from student;
select * from booking_slots;
select * from trans;
alter table teacher add column slots varchar(100);
update teacher set slots="253,254,255,256" where teach_id=1;
create table trans(trans_id bigint primary key auto_increment,
teach_id int,
foreign key(teach_id) references teacher(teach_id),
stu_id int,
foreign key(stu_id) references student(stu_id),
slot_id int,
foreign key(slot_id) references booking_slots(slot_id),
status int);
1,2,254,0;
2,2,256,1;