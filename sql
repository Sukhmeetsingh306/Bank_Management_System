create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20), email varchar(30), marital varchar(20), address varchar(50), city varchar(20), state varchar(20), pin varchar(20) );

desc signup;
select * from signup order by formno;

create table signuptwo(formno varchar(20), religion varchar(20), category varchar(20), income varchar(20), education varchar(20), occuption varchar(20), pan varchar(20), aadhar varchar(20), senior varchar(10), existingacc varchar(10));
desc signuptwo;

create table signupthree(formno varchar(20), accountType varchar(20), cardnumber varchar(25), pinnumber varchar(20), facility varchar(100));
desc signupthree;
select * from signupthree order by formno;

create table login(formno varchar(20), cardnumber varchar(25), pinnumber varchar(20));
select * from login order by formno;
desc login;

create table bank(pinnumber varchar(10), date varchar(50), type varchar(20), amount varchar(20)); 
desc bank;
select pinnumber from bank;
