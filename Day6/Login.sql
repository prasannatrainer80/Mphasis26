use mphasis26;

drop table if exists Login;

create table Login
(
   userName varchar(30) primary key,
   passCode varchar(30) 
);

Insert into Login(username,passcode)
values('shiva','pallavi'),('jeet','danial'),
('sridhar','reddy');