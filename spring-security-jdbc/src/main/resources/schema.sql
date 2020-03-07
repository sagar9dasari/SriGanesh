drop table  users;
create table users(id number(10), username varchar2(255), password varchar2(255), enabled char(1));
drop table authorities;
create table authorities(username  varchar2(255),authority  varchar2(255));