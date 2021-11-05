--1105procedure

--book테이블 도서의 평균가격 반환

create or replace procedure avgPrice ( 
    avgVal out number
    
)
as
begin
    select avg(price) into avgVal from book where price is not null;
    
end
;
set serveroutput on;
















