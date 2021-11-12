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

create table orderdeli(

    oid number(6) constraint order_id_pk primary key,
    oprice integer,
    odate timestamp ,
    payment varchar2(2),
    otype varchar2(3),
    id number(6),
    mid number(6),
    addressnum number(6)
    
);

insert into orderdeli
(oid,oprice,odate,payment,otype,id,mid,addressnum)
values(1,'user2','수현',1,'서울',321,231);


select *
from orderdeli;

select *
from users;

insert into users
(id,userid,username,password,address,phone,email)
values(2,'user2','수현',1,'서울',321,231);



commit;

select *
from macdo;

insert into macdo
(mid,mname,mprice,mnum,mtype)
values(2,'사이다',1000,2,'음료수');

delete from macdo;
