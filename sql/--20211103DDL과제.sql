--20211103DDL과제
create table phoneInfo_basic(
    idx number(6) constraint phoneInfo_basic_pk  PRIMARY key ,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate DATE default sysdate
);



create table phoneInfo_univ(
    idx number(6) constraint phoneInfo_univ_pk PRIMARY KEY,
    fr_u_major varchar2(20) default 'N',
    fr_u_year number(1) default 1 constraint phoneInfo_univ_ck  check ( fr_u_year between 0 and 5 ) ,
    fr_ref number(7) constraint phoneInfo_univ_fk REFERENCES phoneInfo_basic(idx)
)
;

drop table phoneInfo_univ;

select *
from phoneInfo_univ;


create table phoneInfo_com(
    idx number(6) constraint phoneInfo_com_pk primary key ,
    fr_c_company varchar2(20) default 'N',
    fr_ref number(6) constraint phoneInfo_com_fk references phoneInfo_basic(idx)
    
);
