create table macdo(

    mid number(6) constraint macdo_menuno_pk primary key,
    mname varchar(50),
    mprice integer ,
    mnum number(2),
    mtype varchar2(10)
    
);

create table users(

    id number(6) constraint users_id_pk primary key,
    userid varchar2(10),
    username varchar(50) ,
    password varchar2(10),
    address varchar2(60),
    phone varchar(30),
    email varchar(4)
    
);

select *
from users;

commit;

select *
from macdo;

insert into macdo
(mid,mname,mprice,mnum,mtype)
values(2,'사이다',1000,2,'음료수');

delete from macdo;
