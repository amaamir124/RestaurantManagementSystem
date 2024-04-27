use restauraunt;
create table ManagerInfo
(
username_ varchar(40), 
password_ varchar(30) 
);
insert into ManagerInfo values("Manager1","1234");
select* from ManagerInfo;

create table EmployeeInfo
(
name_ varchar(30),
id_ varchar(30),
phoneno varchar(11),
address varchar(20),
username_ varchar(40), 
password_ varchar(30)
);

insert into EmployeeInfo values("Lish","1","03345637282","Bahria","Emp1","1234");
INSERT INTO EmployeeInfo (name_,id_,phoneno,address,username_,password_) VALUES (?,?,?,?,?,?);
select * from EmployeeInfo;
drop table EmployeeInfo;

create table Schedule 
( 
scheduledate varchar(30),
scheduletime varchar(30),
id_ varchar(30)
);
INSERT INTO Schedule (scheduledate,scheduletime,id_) VALUES (?,?,?);
insert into Schedule values("2022-04-02","7:00 pm ","1");
select * from Schedule;
/*SELECT EmployeeInfo.name_,EmployeeInfo.id_,EmployeeInfo.phoneno,EmployeeInfo.address,
EmployeeInfo.username_,EmployeeInfo.password_,Schedule.scheduledate,Schedule.scheduletime
FROM EmployeeInfo
LEFT JOIN Schedule 
ON  Schedule.id_ = EmployeeInfo.id_
ORDER BY EmployeeInfo.id_;*/
drop table Schedule;

Create table Reservation
(
date_ varchar(30),
id_ varchar(10),
time_ varchar(30),
custname varchar(30),
custphoneno varchar(15),
custid_ varchar(10)
);
INSERT INTO Reservation (date_,id_,time_,custname,custphoneno,custid_) VALUES (?,?,?,?,?,?);
select * from Reservation;
select * from Reservation where id_ = ?;
drop table Reservation;

Create table Item 
( 
  id_ varchar(30),
  itemName varchar(30),
  price double
);
INSERT INTO Item (id_,itemName,price) VALUES (?,?,?);
select * from Item;

Create table Menu
( 
  id_ varchar(30),
  itemName varchar(30),
  price double
);

INSERT INTO Menu (id_,itemName,price) VALUES (?,?,?);
select * from Menu;

Create table Ingredients(
itemid_ varchar(5) primary key ,
itemName_ varchar(30),
itemQuantity int
);
INSERT INTO Ingredients (itemid_,itemName_,itemQuantity) VALUES (?,?,?);
select * from Ingredients;
DROP TABLE Ingredients;
insert into Ingredients values ("I1","Flour",2);
UPDATE Ingredients
SET itemQuantity = 4
WHERE itemid_ = "I1";

Create table Order_(
Orderid_ varchar(5) ,
OrderItemId_ varchar(30),
itemQuantity int
);
INSERT INTO Order_ (Orderid_,OrderItemId_,itemQuantity) VALUES (?,?,?);
select * from Order_;