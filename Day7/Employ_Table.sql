use brillio;

Create Table Employ
(
    Empno int AUTO_INCREMENT,
    Name varchar(50), 
    Dept varchar(30),
    Desig varchar(30),
    Basic INT,
    primary key(Empno)
);


Insert into Employ(Name,Dept,Desig,Basic) values
('kiran kumar kailasam','java','developer',42233),
('Vishnu Vardhan Reddy','dotnet','programmer',42133),
('Ram Kishan','java','developer',82233),
('Kareem','dotnet','programmer',52234),
('Karthik','dotnet','developer',42555),
('Suhaas','dotnet','developer',90033),
('Suhaas Vaibhav','dotnet','developer',90033);

