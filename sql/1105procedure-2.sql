--1105procedure

--데이터를받아서 데이터변경처리를 프로그램요소를 이용해서 실행

--create or replace  (프로시저이름 }(매개변수 )
--as 선언부
--begin 프로그램실행
--end;


--book테이블에 한개의 투플을 삽입하는 프로시저
desc book;

create or replace procedure BookInsertOrUpdate(
    myBookId number,
    myBookName varchar2,
    myPublisher varchar2,
    myPrice number
    --매개변수
)

as
    -- 변수선언
    mycount number;
begin

    -- 입력받은 책 이름으로 같은이름의 책을 보유하는지 확인
    select count(*) into mycount from book where bookname like mybookname;
    --책의 개수로 분기 : 수정 입력
    if mycount != 0 then
    --가격수정
        update book set price = myPrice
        where bookname like mybookname;
    else 

    --입력
        insert into book(bookid,bookname,publisher,price)
         values (mybookid,mybookname,mypublisher,mypirce);

    end if;

end

;







