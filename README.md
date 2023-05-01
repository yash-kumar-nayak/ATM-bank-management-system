
# ATM-bank-management-system

Atm system using core concepts of core Java like inheritance etc 





1) use mysql




2) Database Queries for BANK MANAGEMENT SYSTEM Project
---------------------------------------------------

1 - Create database with name bankmanagementsystem in mysql

create database bankmanagementsystem;

2 - Select the database you just created

use bankmanagementsystem;

3 - Create our first Table in the selected database with name signup

create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20),email varchar(30), marital_status varchar(20), address varchar(40), city varchar(25), pincode varchar(20), state varchar(25));

4 - Create the second table to store more information of user

create table signuptwo(formno varchar(20), religion varchar(20), category varchar(20), income varchar(20), education varchar(20), occupation varchar(20), pan varchar(20), aadhar varchar(20), seniorcitizen varchar(20), existingaccount varchar(20));

5 - Create the third table to store the account information of user

create table signupthree(formno varchar(20), accountType varchar(40), cardnumber varchar(25), pin varchar(10), facility varchar(100)); 

6 - Create the Login table to store login information

create table login(formno varchar(20), cardnumber varchar(25), pin varchar(10));

7 - Now create bank table to store transactions related information 

create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));

![Screenshot (23)](https://user-images.githubusercontent.com/114598638/235504120-b8724269-6d31-46df-af6e-2f1735344852.png)
![Screenshot (24)](https://user-images.githubusercontent.com/114598638/235504842-07fb8003-11d8-4c42-bd09-e82120c0770b.png)
![Screenshot (25)](https://user-images.githubusercontent.com/114598638/235504852-673784d7-4169-491b-a898-6042c6b4e8bc.png)
![Screenshot (26)](https://user-images.githubusercontent.com/114598638/235504866-0a6c6481-4169-41e2-89b3-856e370a7e8d.png)
![Screenshot (27)](https://user-images.githubusercontent.com/114598638/235504878-dc12a68b-a562-42be-98e5-e8ec4267531e.png)
