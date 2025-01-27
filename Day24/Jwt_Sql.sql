drop database if exists jwtex;

create database jwtex;

use jwtex;

create table userdata
( 
   uid int primary key auto_increment,
   name varchar(20),
   email varchar(20),
   password varchar(100),
   roles varchar(40)
)