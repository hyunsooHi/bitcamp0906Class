--1105procedure

--데이터를받아서 데이터변경처리를 프로그램요소를 이용해서 실행

--create or replace  (프로시저이름 }(매개변수 )
--as 선언부
--begin 프로그램실행
--end;


--book테이블에 한개의 투플을 삽입하는 프로시저
desc book;

create or replace procedure  InsertBook(

    myBookid in number;
    myBookName in varchar2,
    myPublisher in varchar2,
    myPirce in number,
    
)

as
begin

    insert into book(bookid,bookname,publisher,price)
    values(myBookid,myBookName,myPublisher,myPirce);
    
end








