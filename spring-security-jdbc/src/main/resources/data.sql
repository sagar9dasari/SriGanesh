insert into users(id,username,password,enabled) values(1,'user1','123','Y');
insert into users(id,username,password,enabled) values(2,'user2','123','Y');
insert into authorities(username,authority) values('user1','ADMIN');
insert into authorities(username,authority) values('user2','USER');