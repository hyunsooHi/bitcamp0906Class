--1105-trigger


create table book_log(
    bookid_l number,
    bookname_l varchar2(40),
    publisher_l varchar2(40),
    price_l number);

create or replace trigger afterinsertbook
after insert on book for each row
declare
    average number;
    begin
        insert into book_log
            values(:new.bookid, :new.bookname, :new.publisher, :new.price);
            dbms_output.put_line('삽입투플을 book_log테이블에백업');
    end;        















