SELECT * FROM jwtex.userdata;

create table users
(
   userId int primary key auto_increment,
   name varchar(30),
   username varchar(30) UNIQUE,
   password varchar(100),
   email varchar(30),
   roles varchar(100)
);